package paket;

public enum Boja {
	
	Crvena(200), Zelena(150), Plava(100), Crna(250), Bela(89), Zuta(124);
	
	private int udeo;
	
	Boja(int u){
		udeo = u;
	}
	
	public int getUdeo() {
		return udeo;
	}

}
