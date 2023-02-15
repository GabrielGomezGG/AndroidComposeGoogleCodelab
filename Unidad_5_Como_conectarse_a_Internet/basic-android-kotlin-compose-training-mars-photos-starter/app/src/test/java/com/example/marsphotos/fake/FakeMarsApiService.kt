package com.example.marsphotos.fake

import com.example.marsphotos.network.service.MarsApiService
import com.example.marsphotos.data.model.MarsPhoto

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}