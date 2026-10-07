/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    init_cpy = init;
    return{
    
    decrement : function(){
        init_cpy -= 1;
        return init_cpy;
    },
    increment : function(){
        init_cpy += 1;
        return init_cpy;
    },
    reset : function(){
        init_cpy = init;
        return init_cpy;
    }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */