package src.main.resources;


@Entity
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private Long areaSqKm;
    private Long population;
    @ElementCollection
    private List<String> lines;
    private Integer countries;
    @ElementCollection
    private List<String> oceans;
    @ElementCollection
    private List<String> developedCountries;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAreaSqKm() {
		return areaSqKm;
	}
	public void setAreaSqKm(Long areaSqKm) {
		this.areaSqKm = areaSqKm;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public List<String> getLines() {
		return lines;
	}
	public void setLines(List<String> lines) {
		this.lines = lines;
	}
	public Integer getCountries() {
		return countries;
	}
	public void setCountries(Integer countries) {
		this.countries = countries;
	}
	public List<String> getOceans() {
		return oceans;
	}
	public void setOceans(List<String> oceans) {
		this.oceans = oceans;
	}
	public List<String> getDevelopedCountries() {
		return developedCountries;
	}
	public void setDevelopedCountries(List<String> developedCountries) {
		this.developedCountries = developedCountries;
	}

    
    
}

