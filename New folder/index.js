async function one() {
  return new Promise((res, req) => {
    setTimeout(() => {
      res("1");
    }, 100);
  });
}

async function two() {
  return new Promise((res, req) => {
    setTimeout(() => {
      res("two");
    }, 100);
  });
}

const myFinal = async () => {
  const [data1, data2] = await Promise.all([one(), two()]);
  return ` ${data1} ${data2}`;
};

const res = myFinal();

async function myFunction() {
  const obj = await two();
  const obj2 = await one();
  console.log(`data from function one ${obj}, data from function two${obj2}`);
}
myFunction();
console.log(res);
