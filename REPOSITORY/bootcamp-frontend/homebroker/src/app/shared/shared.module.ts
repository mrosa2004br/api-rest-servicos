import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HearderComponent } from './layout/hearder/hearder.component';
import { FooterComponent } from './layout/footer/footer.component';


@NgModule({
  declarations: [HearderComponent, FooterComponent],
  imports: [
    CommonModule
  ],
  exports: [HearderComponent, FooterComponent]
})
export class SharedModule { }
