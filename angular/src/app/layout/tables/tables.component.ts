import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';
import { TableService } from './tables.service';

@Component({
    selector: 'app-tables',
    //providers: [TableService],
    templateUrl: './tables.component.html',
    styleUrls: ['./tables.component.scss'],
    animations: [routerTransition()]
})
export class TablesComponent implements OnInit {

    pullDatas:any;
    constructor(private service: TableService) {}

    ngOnInit() {
        this.getAllHexPull();
    }

    getAllHexPull(){
        this.service.getAllHexPull().subscribe(res => {
            this.pullDatas = res;});
    }
}
