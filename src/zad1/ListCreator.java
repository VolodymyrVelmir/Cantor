package zad1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ListCreator<T, S> {
	 List<T> BuferLista;

	 ListCreator(){
		 BuferLista= new ArrayList<>();
	 }

	public static  <T, S> ListCreator<T, S> collectFrom(List<T> ImputLista){
		ListCreator<T, S> DablBufer = new ListCreator<>();
		DablBufer.imporeLista(ImputLista);
	return DablBufer;		
	}
	
	 void imporeLista(List<T> ImputLista){
		  BuferLista=ImputLista;
	 }
	 
	public ListCreator<T, S> when(Predicate<T> P){
		ListCreator<T, S> DablBufer = new ListCreator<>();
		for(T e : BuferLista){
			if(P.test(e)){
			  DablBufer.BuferLista.add(e);
			}
		}
	return DablBufer;
	}
	
		public List<T> mapEvery(Function<T, S> f) {
			List<T> DablBufer = new ArrayList<>();
			for(T e : BuferLista){
				DablBufer.add( (T) f.apply(e));
			}
		return DablBufer;
        }
}
