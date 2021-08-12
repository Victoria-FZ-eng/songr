package com.songr.songr;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,String> {
    Iterable<Song> findByTitle(String title);
    Iterable<Song> findByAlbum(Album album);
}
