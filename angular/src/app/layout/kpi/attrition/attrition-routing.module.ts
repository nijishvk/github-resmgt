import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AttritionComponent } from './attrition.component';


const routes: Routes = [
    {
        path: '', 
        component: AttritionComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class AttritionRoutingModule {
}
