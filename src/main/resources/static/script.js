const cities = ["Hail", "Riyadh", "Dammam"];

const restaurantCategories = [
  "italian restaurant",
  "american restaurant",
  "japanese restaurant",
  "saudi restaurant",
  "shawarma restaurant"
];

const coffeeCategories = [
  "specialty coffee",
  "roastery coffee"
];

function getStarRating(rating) {
  const percentage = (rating / 5) * 100;

  return `
    <div class="stars-outer">
      <div class="stars-inner" style="width:${percentage}%"></div>
    </div>
  `;
}

function getImage(type, category) {
  if (type === "coffee") {
    return "https://images.unsplash.com/photo-1509042239860-f550ce710b93?w=600";
  }

  if (category.includes("italian")) {
    return "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=600";
  }

  if (category.includes("japanese")) {
    return "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=600";
  }

  if (category.includes("shawarma")) {
    return "https://images.unsplash.com/photo-1529006557810-274b9b2fc783?w=600";
  }

  if (category.includes("saudi")) {
    return "https://images.unsplash.com/photo-1543353071-10c8ba85a904?w=600";
  }

  return "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=600";
}

function fillCities() {
  const citySelect = document.getElementById("city");

  cities.forEach(city => {
    const option = document.createElement("option");
    option.value = city;
    option.textContent = city;
    citySelect.appendChild(option);
  });
}

function fillTypes() {
  const typeSelect = document.getElementById("type");

  ["restaurant", "coffee"].forEach(t => {
    const option = document.createElement("option");
    option.value = t;
    option.textContent = t;
    typeSelect.appendChild(option);
  });
}

function updateCategoryOptions() {
  const type = document.getElementById("type").value;
  const category = document.getElementById("category");

  category.innerHTML = "";

  const list = type === "restaurant" ? restaurantCategories : coffeeCategories;

  list.forEach(item => {
    const option = document.createElement("option");
    option.value = item;
    option.textContent = item;
    category.appendChild(option);
  });
}

function recommend() {
  const data = {
    city: document.getElementById("city").value,
    type: document.getElementById("type").value,
    category: document.getElementById("category").value
  };

  fetch("/api/recommend", {
    method: "POST",
    headers: {"Content-Type": "application/json"},
    body: JSON.stringify(data)
  })
  .then(res => res.json())
  .then(showResults)
  .catch(() => {
    document.getElementById("result").innerHTML = "Error loading data";
  });
}

function showResults(data) {
  const container = document.getElementById("result");
  container.innerHTML = "";

  const places = data.places || [];

  places.forEach((p, index) => {
    let badge = "";

    if (index === 0) {
      badge = "<p class='badge1'>🥇 Best Match</p>";
    } else if (index === 1) {
      badge = "<p class='badge2'>🥈 Second Best</p>";
    } else if (index === 2) {
      badge = "<p class='badge3'>🥉 Third Best</p>";
    }

    const city = document.getElementById("city").value;
const searchText = p.searchName ? p.searchName : (p.name + " " + city);

const mapLink = p.mapUrl
  ? p.mapUrl
  : "https://www.google.com/maps/search/" +
    encodeURIComponent(searchText + " Saudi Arabia");
    const score = (p.rating + Math.min(p.reviews / 1000, 1)).toFixed(2);

    container.innerHTML += `
      <div class="card">

        <img src="${getImage(
          document.getElementById("type").value,
          document.getElementById("category").value
        )}" />

        ${badge}

        <h3>${p.name}</h3>

        <div class="rating-row">
          ${getStarRating(p.rating)}
          <span class="rating-number">${p.rating}</span>
        </div>

        <p>⭐ ${p.rating} • ${p.reviews} reviews</p>

        <p>📊 Score: ${score}</p>

        <div class="verified">Verified Data</div>

        <a href="${mapLink}" target="_blank">
          <button class="mapBtn">Open in Google Maps</button>
        </a>

      </div>
    `;
  });
}

fillCities();
fillTypes();
updateCategoryOptions();