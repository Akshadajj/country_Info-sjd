package src.main.resources;



	@Service
	public class ContinentService {
	    @Autowired
	    private RestTemplate restTemplate;

	    @Autowired
	    private ContinentRepository continentRepository;

	    public void consumeApiData() {
	        ResponseEntity<Continent[]> response = restTemplate.getForEntity("https://example.com/continents", Continent[].class);
	        Continent[] continents = response.getBody();
	        continentRepository.saveAll(Arrays.asList(continents));
	    }
	}

