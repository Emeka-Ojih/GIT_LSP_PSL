// Chukwuemeka Ojih

package org.howard.edu.lsp.oopfinal.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<>();

    /* Adds a song title to a genre */
    public void addSong(String genre, String songTitle) {
        map.putIfAbsent(genre, new HashSet<>());
        map.get(genre).add(songTitle);
    }

    /* Returns genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        for (String genre : map.keySet()) {
            Set<String> songs = map.get(genre);
            if (songs.contains(songTitle)) {
                return genre;
            }
        }
        return null; // or throws an exception if preferred
    }

    /* Returns the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        return map.getOrDefault(genre, new HashSet<>());
    }
}
