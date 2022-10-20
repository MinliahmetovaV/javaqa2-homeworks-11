package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    Movie one = new Movie("Love");
    Movie two = new Movie("Two");
    Movie three = new Movie("One + one");
    Movie four = new Movie("It");
    Movie five = new Movie("The green mile");
    Movie six = new Movie("Coco");
    Movie seven = new Movie("Gladiator");
    Movie eight = new Movie("Walle");
    Movie nine = new Movie("The Help");
    Movie ten = new Movie("Titanic");
    Movie eleven = new Movie("Leon");


    @Test
    public void ShouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(five);
        Movie[] actual = manager.findALL();
        Movie[] expected = new Movie[]{one, two, five};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        manager.findLast();
        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three,two,one};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldFindAll() {
        MovieManager manager = new MovieManager();
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        manager.findALL();
        Movie[] actual = manager.findALL();
        Movie[] expected = new Movie[]{one,two,three,four,five,six,seven,eight,nine,ten,eleven};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastIfOtherLimit() {
        MovieManager manager = new MovieManager(5);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        manager.findLast();
        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }


}


