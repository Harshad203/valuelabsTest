import { Component, OnInit } from '@angular/core';
import { Stock } from './stock';
import { StockService } from './stock.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  
   title:string = 'rp';
   msg:string="default";
   x:number=3;
   stockItems:Stock[]=[];
   stock:Stock =new Stock();  //already created
   


  ngOnInit()
  {
    this.stockItems= this.service.getStockItems(); 

  }
 

  constructor(private service:StockService)
  {
    
  }


  eventhandlingfunction()
  {
    this.msg ="does it work";
   
  }

  contactserver()
  {
    this.service.getStockItemsFromServer().subscribe(
      (sitems:Stock[]) => {  this.stockItems=sitems},
      (error:any) => { console.log(error); this.msg="look at console";}
    );
  }

  getByProductID(){
    this.service.getStockItemByProdID(this.stock.product_id).subscribe((stock : Stock) => {
      if(stock == null){
        this.msg = "Product details not found";
        this.stock.price=0;
        this.stock.qty=0;
      }else{
        this.msg = "Product details found";
        this.stock = stock;
      }
     
    },(error: any) => {console.log(error); this.msg="Product details not found !!";});
  }

  updateStock(){
    
    this.service.updateStockByProductID(this.stock).subscribe((stock : Stock) => {
      if(stock == null){
        this.msg = "Update Failed";
        
      }else{
        this.msg = "Updated successfully";
        this.stock = stock;
        this.contactserver();
      }
     
    },(error: any) => {console.log(error); this.msg="Update Failed !!";});


  }


}
