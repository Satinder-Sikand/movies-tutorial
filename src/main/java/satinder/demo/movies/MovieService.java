package satinder.demo.movies;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

//	@Autowired
//	private MovieRepository movieRepository;
	private final MovieRepository movieRepository;

    public MovieService(MovieRepository repository) {
        this.movieRepository = repository;
    }
    
	public List<Movie> allMovies() {
		System.out.println(Arrays.toString(movieRepository.findAll().toArray()));
		return movieRepository.findAll();
	}
	
	public Optional<Movie> singleMovie(String id) {
		return movieRepository.findMovieByImdbId(id);
	}
}
