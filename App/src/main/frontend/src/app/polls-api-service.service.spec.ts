import { TestBed, inject } from '@angular/core/testing';

import { PollsApiServiceService } from './polls-api-service.service';

describe('PollsApiServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PollsApiServiceService]
    });
  });

  it('should be created', inject([PollsApiServiceService], (service: PollsApiServiceService) => {
    expect(service).toBeTruthy();
  }));
});
