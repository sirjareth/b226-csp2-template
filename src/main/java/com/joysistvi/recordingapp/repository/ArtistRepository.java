package com.joysistvi.recordingapp.repository;

import com.joysistvi.recordingapp.model.Artist;

import java.util.List;

public interface ArtistRepository {

    List<Artist> getAllArtists();

    List<Artist> searchArtist(String keyword);

    boolean createArtist(Artist artist);

    boolean updateArtist(Artist artist);

    boolean deleteArtist(int id);
}