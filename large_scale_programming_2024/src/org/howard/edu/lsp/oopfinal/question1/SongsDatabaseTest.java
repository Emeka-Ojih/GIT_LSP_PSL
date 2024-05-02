// Chukwuemeka Ojih

package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.Assert.*;

import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @Before
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        Set<String> songs = db.getSongs("Rap");
        assertTrue("Songs should contain 'Savage'", songs.contains("Savage"));
        assertTrue("Songs should contain 'Gin and Juice'", songs.contains("Gin and Juice"));
        assertEquals("Number of songs in Rap should be 2", 2, songs.size());
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Genre of 'Savage' should be Rap", "Rap", db.getGenreOfSong("Savage"));
        assertEquals("Genre of 'Always There' should be Jazz", "Jazz", db.getGenreOfSong("Always There"));
        assertNull("Genre of non-existing song should be null", db.getGenreOfSong("Non-Existing Song"));
    }

    @Test
    public void testGetSongs() {
        Set<String> jazzSongs = db.getSongs("Jazz");
        assertTrue("Jazz songs should contain 'Always There'", jazzSongs.contains("Always There"));
        assertEquals("Number of Jazz songs should be 1", 1, jazzSongs.size());
    }
}

