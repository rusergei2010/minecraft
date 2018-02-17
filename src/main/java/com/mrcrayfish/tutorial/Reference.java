package com.mrcrayfish.tutorial;

public class Reference {
	public static final String MOD_ID = "ctm";
	public static final String NAME = "Mr. Sergey's tutorial mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSION = "[1.9.4]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mrcrayfish.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrcrayfish.tutorial.proxy.ServerProxy";
	
	
	public static enum TutorialItems {
		CHEESE("cheese", "ItemCheese"),
		CRACKER("cracker", "ItemCracker"),
		FIRE("fire", "ItemFire"),
		TNT("tnt", "ItemTNT");		
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	

	public static enum TutorialBlocks {
		CHEESE("cheese", "BlockCheese"),
		TNT("tnt", "BlockTNT");
		
		private String unlocalizedName;
		private String registryName;
		
		TutorialBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
