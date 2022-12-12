import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Stock } from './stock';

@Injectable({
  providedIn: 'root'
})
export class StockService {


  
  private url = 'http://localhost:7777';

  constructor(private httpclient:HttpClient) { 


  }

  getStockItemsFromServer():Observable<Stock[]> {

    let url:string="http://localhost:7777/stocks";
    return this.httpclient.get<Stock[]>(url);

  }

  getStockItemByProdID(productID:number):Observable<Stock>{

    let url:string="http://localhost:7777/stock-by-product-id?productID="+productID;
    return this.httpclient.get<Stock>(url);

  }

updateStockByProductID(stock:Stock):Observable<Stock>{
  let url:string="http://localhost:7777/update-product";
  return this.httpclient.post<Stock>(url,stock);
}

  getStockItems(): Stock[] {

    let stocks:Stock[]=[];
    //stocks.push(new Stock(11,12,13));
    //stocks.push(new Stock(14,15,16));
    return stocks; 
  }

  
  
}
