console.log('Pokemon API');
const URL = 'https://pokeapi.co/api/v2/pokemon';
const pokemonContainer = document.getElementById('pokemon-container');



async function fetchPokemons(pokemonUrl){
    const response = await fetch(pokemonUrl)
    const fetchedData = await response.json();
    const result = fetchedData.results;

    for(let i = 0; i < result.length; i++){
        const pokemonDetailsUrl = result[i].url;
        const pokemonDetailResponse = await fetch(pokemonDetailsUrl);
        const pokemonDetailData = await pokemonDetailResponse.json();
        console.log(pokemonDetailData);
        renderPokemon(pokemonDetailData);

    }


}

fetchPokemons(URL);

function renderPokemon(pokemon){
    const pokemonCard = document.createElement('div');
    pokemonCard.className = 'pokemon-card';

    const pokemonTitle = document.createElement('h3');
    pokemonTitle.className = 'pokemon-title';
    pokemonTitle.textContent = pokemon.name;

    const pokemonImage = document.createElement('img');
    pokemonImage.className = 'pokemon-image';
    pokemonImage.src= pokemon.sprites.other['official-artwork'].front_shiny;
;


    pokemonCard.appendChild(pokemonTitle);
    pokemonCard.appendChild(pokemonImage);
    pokemonContainer.appendChild(pokemonCard);
}

