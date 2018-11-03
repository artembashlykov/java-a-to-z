package ru.abashlykov.start;

import ru.abashlykov.models.*;
import java.util.*;

public class Tracker {
	private ArrayList<Item> items = new ArrayList<>();
	private static final Random RN = new Random();
	public Item findByName(String key){
		Item result = null;
        for(Item byName : this.items){
            if(byName.getName().equals(key)){
            	result = byName;
            	break;
            }
        }
        return result;
    }
	public void delete(String id) {
		List<Item> toRemove = new ArrayList<>();
		for(Item it : items){
			if(it.getId().equals(id)){
				toRemove.add(it);
			}
		}
		items.removeAll(toRemove);
	}

	public void edit(String id, Item newItem){
		for(int index = 0; index != items.size();++index){
			Item item = items.get(index);
			if(item != null && id.equals(newItem.getId())){
				items.set(index, newItem);
				break;
			}
		}
	}

	public Item add(Item item) {
			item.setId(this.generateId());
			this.items.add(item);
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
	public ArrayList<Item> getAll(){
		ArrayList<Item> result = new ArrayList<>();
		result.addAll(items);
			return result;
		}
}
