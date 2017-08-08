package ru.abashlykov.start;

import ru.abashlykov.models.*;
import java.util.*;

public class Tracker {
	private Item[] items = new Item[10];
	private int position = 0;
	private static final Random RN = new Random();
	public Item findByName(String key){
		Item result = null;
        for(Item byName : this.items){
            if(byName.getName().indexOf(key) != -1){
            	result = byName;
            	break;
            }
        }
        return result;
    }
	public void delete(String id) {
		for (Item searchElementForDelete : this.items) {
			if (searchElementForDelete != null && searchElementForDelete.getId().equals(id)) {
				searchElementForDelete.name = null;
				searchElementForDelete.description = null;
			}
		}
	}
	public void edit(Item fresh){
		for(int index = 0; index != items.length;++index){
			Item item = items[index];
			if(item != null && item.getId().equals(fresh.getId())){
				items[index] = fresh;
				break;
			}
		}
	}
	public Item add(Item item) {
			item.setId(this.generateId());
			this.items[position++] = item;
			return item;
	}

	protected Item findById(String id){
		Item result = null;
		for(Item item : items){
			if(item != null && item.getId().equals(id)){
				result = item;
				break;
				}
			}
			return result;
		}
	String generateId(){
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
			}
	public Item[] getAll(){
		Item[] result = new Item[position];
		for(int index = 0; index != this.position; index++){
			result[index] = this.items[index];
			}
			return result;
		}
}
