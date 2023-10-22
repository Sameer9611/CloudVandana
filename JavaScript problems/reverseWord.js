function reverseWords(senten) {

    const words = senten.split(' ');
  
    const reversedWords = words.map(function(word) {
      
        return word.split('').reverse().join('');
    });
  
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  const inputSent = "This is a sunny day";
  const reversedSentence = reverseWords(inputSent);
  console.log(reversedSentence); 
  