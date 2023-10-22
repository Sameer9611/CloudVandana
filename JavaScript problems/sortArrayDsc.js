const numbers = [1, 4, 5, 3, 75, 6];

function compareDescending(a, b) {
  return b - a;
}

numbers.sort(compareDescending);

console.log(numbers); // Output: [75, 6, 5, 4, 3, 2]
