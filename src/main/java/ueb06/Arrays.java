package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array, int i)
	{
		if(i == array.length -1)
		{return array[i].toString();}
		else
		{

			return array[i].toString()+ ", "+ toString(array, i+1);
		}
	}
	static <T> String toString(T[] array) {

		if(array.length == 0)
		{return "[]";}
		else
		{
			return "["+ toString(array, 0) +"]";
		}

	}

	/**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object)
	{
		if(array.length == 0)
			return false;
		else
			return contains(array, object, 0);
	}
	static <T> boolean contains(T[] array, T object, int i)
	{
		if(i == array.length)
			return false;
		if(object.equals(array[i]))
			return true;
		else
			return contains(array, object, i+1);
	}



}
