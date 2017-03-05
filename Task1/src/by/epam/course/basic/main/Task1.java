package by.epam.course.basic.main;


/**
 * @author Kiryl_Miatlitski
 *
 * date: 5 March 2017
 * 
 * Task: Сборник литературных произведений. Реализовать приложение, позволяющее создавать сборники 
 * произведений (объект, представляющий собой сборник). Составляющими сборника являются литературные 
 * произведения(стихи, проза и т.д.) и форма сборника(журнал, книга и т.д.). Реализуйте возможность определения, есть ли 
 * конкретное произведение в сборнике.
 * Реализуйте минимум три компаратора, для сортировки списка произведений, и добавьте в код возможность такой сортировки.
 */
public class Task1 {

	public static void main(String[] args) {
		
		LiteratureСollection collection1 = new LiteratureСollection("Журнал");
		LiteratureСollection collection2 = new LiteratureСollection("Книга");
		
		// collection 1
		collection1.addWork(new Poem("Руслан и Людмила", 1820, "Пушкни А.С.", "Сказочная поэма"));
		collection1.addWork(new Poem("Два брата", 1829, "Михаил Лермонтов", "Романтическая поэма"));
		collection1.addWork(new Story("Мастер и Маргарита", 1940, "Михаил Афанасьевич Булгаков", 32));

	    // collection 2
		collection2.addWork(new Story("Анна Каренина", 1877, "Лев Толстой", 249));
		collection2.addWork(new Novel("Отверженные", 1862, "Виктор Гюго.", "Драма"));
		collection2.addWork(new Novel("Война миров", 1897, "Герберт Уэллс.", "Постапокалипсис"));
		
		LiteratureWork testWork=new Story("Анна Каренина", 1877, "Лев Толстой", 249);
		if (collection1.existInCollection(testWork)){
			System.out.println(collection1.getType()+ " содержит "+testWork.show());
		} else {
			System.out.println(collection1.getType()+ " не содержит "+testWork.show());
		}
		
		if (collection2.existInCollection(testWork)){
			System.out.println(collection2.getType()+ " содержит "+testWork.show());
		} else {
			System.out.println(collection2.getType()+ " не содержит "+testWork.show());
		}
		
		System.out.println();
		LiteratureWork testWork1=new Story("Анна Каренина", 1878, "Лев Толстой", 250);
		if (collection1.existInCollection(testWork1)){
			System.out.println(collection1.getType()+ " содержит "+testWork1.show());
		} else {
			System.out.println(collection1.getType()+ " не содержит "+testWork1.show());
		}
		
		if (collection2.existInCollection(testWork1)){
			System.out.println(collection2.getType()+ " содержит "+testWork1.show());
		} else {
			System.out.println(collection2.getType()+ " не содержит "+testWork1.show());
		}
		
		System.out.println();
		System.out.println("Вывод созданного сборника#1 (интерфейс Comparable по имени произведения)");
		collection1.show();
		
		System.out.println();
		System.out.println("Сортировка сборника#1 по трём Comparator");
		collection1.sortByName();
		collection1.sortByAuthorName();
		collection1.sortByYear();
		System.out.println();
		System.out.println("Сортировка сборника#2 по трём Comparator");
		collection2.sortByName();
		collection2.sortByAuthorName();
		collection2.sortByYear();
		
		


	}

}
