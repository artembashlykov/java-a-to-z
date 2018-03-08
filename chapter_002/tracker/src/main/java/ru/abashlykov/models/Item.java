package ru.abashlykov.models;

public class Item {
	private String id;
	
	public String name;
	
	public String description;
	
	public Item(){
		}
	
	public Item(String name, String description, String id) {
		this.name = name;
		this.description = description;
		this.id = id;
		}
	public Item(String name, String description){
		this.name = name;
		this.description = description;
	}
		
		public String getName(){
			return this.name;
			}
		public String getDescription(){
			return this.description;
			}
		public String getId(){
				return this.id;
			}
		public void setId(String id){
				this.id = id;
			}
	}
