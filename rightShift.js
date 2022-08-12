function shiftingRightYeahRight(shifted, shifter) {
    return Math.floor(shifted / Math.pow(2, shifter));
}

console.log(shiftingRightYeahRight(-512, 10));
console.log(shiftingRightYeahRight(3777, 6));
console.log(shiftingRightYeahRight(4666, 6));
console.log(shiftingRightYeahRight(-5, 1));
console.log(shiftingRightYeahRight(-24, 2));
console.log(shiftingRightYeahRight(80, 3));