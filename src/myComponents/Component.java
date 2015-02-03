package myComponents;

public class Component<T> {
	T ogg;

	public Component(T ogg) {
		this.ogg = ogg;
	}

	public T getOgg() {
		return ogg;
	}

	public void setOgg(T ogg) {
		this.ogg = ogg;
	}

}
