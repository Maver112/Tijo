package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieListMapper implements Converter<List<MovieDto>, List<Movie>> {

    @Override
    public List<MovieDto> convert(List<Movie> movies) {
        List<MovieDto> moviesDto = new ArrayList<>();

        /*for(Movie movie: movies) {
            MovieDto movieDto = new MovieDto.Builder()
                    .movieId(movie.getMovieId())
                    .title(movie.getTitle())
                    .image(movie.getImage())
                    .year(movie.getYear())
                    .build();

            moviesDto.add(movieDto);
        } */

        moviesDto = movies.stream().map(movie ->
                new MovieDto.Builder()
                .MovieDto.getMovieId()
                .MovieDto.getTitle()
                .MovieDto.getImage()
                .MovieDto.getYear()
        )

        return moviesDto;
    }
}
