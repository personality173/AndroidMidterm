package com.example.aviatickets.model.entity

/**
 * think about json deserialization considering its snake_case format
 */
import com.google.gson.annotations.SerializedName

data class Flight(
  @SerializedName("departure_location")
  val departureLocation: Location,
  @SerializedName("arrival_location")
  val arrivalLocation: Location,
  @SerializedName("departure_time_info")
  val departureTimeInfo: String,
  @SerializedName("arrival_time_info")
  val arrivalTimeInfo: String,
  @SerializedName("flight_number")
  val flightNumber: String,
  val airline: Airline,
  val duration: Int
)
