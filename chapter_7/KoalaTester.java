class KoalaTester {
	public static void main(String args[]) {
		Koala k = new Koala();
		System.out.println(k.count);
		Koala k1 = null;
		System.out.println(k1.count);
		Koala.main(new String[0]);
	}
}
