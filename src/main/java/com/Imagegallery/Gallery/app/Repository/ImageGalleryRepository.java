package com.Imagegallery.Gallery.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Imagegallery.Gallery.app.Entity.ImageGallery;



@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}