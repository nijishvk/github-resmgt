import {Injectable,Inject} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import 'rxjs/add/operator/map';

@Injectable()
export class AttritionService{

    constructor(private http:HttpClient){};
    getAttritionChatData(){
       const uri=  "http://localhost:8080/resmgt/api/attrition";
       return this
                .http
                .get(uri)
                .map(res => {
                    return res;});

    }

}