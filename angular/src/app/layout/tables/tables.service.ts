import {Injectable, Inject} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import 'rxjs/add/operator/map';


@Injectable()
export class TableService {

    constructor (private http:HttpClient){};
    getAllHexPull(){
        const uri ="http://localhost:8080/resmgt/api/user/";
        return this
                .http
                .get(uri)
                .map(res => {
                    return res;
                });
    }
}