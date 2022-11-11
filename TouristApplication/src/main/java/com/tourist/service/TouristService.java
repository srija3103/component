package com.tourist.service;

import java.util.List;

import com.tourist.entity.Tourist;

public interface TouristService {
List<Tourist> getTourist();
Tourist getTourist(int tid);
void setTourist(Tourist tourist);
}