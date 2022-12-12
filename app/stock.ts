export class Stock {

    product_id:number=0;
    price:number=0;
    qty:number=0;

    constructor(pid:number=0,pr:number=0,qty:number=0)
    {
        this.product_id=pid;
        this.price=pr;
        this.qty=qty;

    }

}
