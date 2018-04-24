import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../../router.animations';
import { NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';

@Component({
    selector: 'app-attrition',
    templateUrl: './attrition.component.html',
    styleUrls: ['./attrition.component.scss'],
    animations: [routerTransition()]
})
export class AttritionComponent implements OnInit {

    constructor() { }
  
    ngOnInit() {
    }
  
  }