import { Pipe, PipeTransform } from "@angular/core"
import Stock from "src/app/shared/models/stock-models";

@Pipe({name : 'filterBySymbol'})
export class FilterBySymbol implements PipeTransform{

  transform(stocks: Stock[], descriptionQuery: string ){

       descriptionQuery = descriptionQuery
      .trim()
      .toLowerCase();

      if(descriptionQuery){
        return stocks.filter(stock => stock.name.toLowerCase().includes(descriptionQuery));
      }else{
        return stocks;
      }
  }

}
