package com.mrdino.unitconverter
//code submitted by student #219136915 for SIT708 Task 2.1P

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.math.BigDecimal
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {

    //global variables
    var fromSpinner: Spinner? = null
    var toSpinner: Spinner? = null
    var getInputField: EditText? = null
    var outputField: TextView? = null
    var errorField: TextView? = null

    //global constants to be use in formula
    //constant
    val inchToFoot = 0.083333
    val inchToYard = 0.027778
    val inchToMile = 0.000015783

    val footToInch = 12
    val footToYard = 0.333333
    val footToMile = 0.000189

    val yardToInch = 36
    val yardToFoot = 3
    val yardToMile = 0.000568

    val mileToInch = 63360
    val mileToFoot = 5280
    val mileToYard = 1760

    val poundToOunce = 16
    val poundToTon = 0.0005

    val ounceToPound = 0.0625
    val ounceToTon = 0.00003125

    val tonToPound = 2000
    val tonToOunce = 32000

    val celsiusToFahrenheit = 33.8
    val celsiusToKelvin = 274.15

    val fahrenheitToCelsius = -17.222222
    val fahrenheitToKelvin = 255.927778

    val kelvinToCelsius = -272.594444
    val kelvinToFahrenheit = -457.87

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declare local variables
        fromSpinner = findViewById(R.id.spinner)
        toSpinner = findViewById(R.id.spinner2)
        getInputField = findViewById(R.id.inputField)
        outputField = findViewById(R.id.outputField)
        errorField = findViewById(R.id.error_field)

        val convertButton: Button = findViewById(R.id.convert_button)

        // set up Spinner From and Spinner To
        val convertFromAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.unit_list,
            android.R.layout.simple_spinner_item
        )
        val convertToAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.unit_list,
            android.R.layout.simple_spinner_item
        )
        convertFromAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        convertToAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        fromSpinner?.adapter = convertFromAdapter
        toSpinner?.adapter = convertToAdapter
        fromSpinner?.setSelection(0)
        toSpinner?.setSelection(0)

        // configure setOnClickListener
        convertButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val result: Double
                val fromUnit: String = fromSpinner?.selectedItem.toString()
                val toUnit: String = toSpinner?.selectedItem.toString()
                val inputToString: String = getInputField?.text.toString()
                val userInput: Double = inputToString.toDouble()


                //conversion logic
                if (fromUnit == "Inch" && toUnit == "Foot") {
                    result = (userInput * inchToFoot)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Inch" && toUnit == "Yard") {
                    result = (userInput * inchToYard)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Inch" && toUnit == "Mile") {
                    result = (userInput * inchToMile)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Foot" && toUnit == "Inch") {
                    result = (userInput * footToInch)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Foot" && toUnit == "Yard") {
                    result = (userInput * footToYard)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Foot" && toUnit == "Mile") {
                    result = (userInput * footToMile)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Yard" && toUnit == "Inch") {
                    result = (userInput * yardToInch)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Yard" && toUnit == "Foot") {
                    result = (userInput * yardToFoot)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Yard" && toUnit == "Mile") {
                    result = (userInput * yardToMile)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Mile" && toUnit == "Inch") {
                    result = (userInput * mileToInch)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Mile" && toUnit == "Foot") {
                    result = (userInput * mileToFoot)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Mile" && toUnit == "Yard") {
                    result = (userInput * mileToYard)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Pound" && toUnit == "Ounce") {
                    result = (userInput * poundToOunce)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Pound" && toUnit == "Ton") {
                    result = (userInput * poundToTon)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Ounce" && toUnit == "Pound") {
                    result = (userInput * ounceToPound)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Ounce" && toUnit == "Ton") {
                    result = (userInput * ounceToTon)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Ton" && toUnit == "Pound") {
                    result = (userInput * tonToPound)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Ton" && toUnit == "Ounce") {
                    result = (userInput * tonToOunce)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Celsius" && toUnit == "Fahrenheit") {
                    result = (userInput * celsiusToFahrenheit)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Celsius" && toUnit == "Kelvin") {
                    result = (userInput * celsiusToKelvin)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Fahrenheit" && toUnit == "Celsius") {
                    result = (userInput * fahrenheitToCelsius)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Fahrenheit" && toUnit == "Kelvin") {
                    result = (userInput * fahrenheitToKelvin)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Kelvin" && toUnit == "Celsius") {
                    result = (userInput * kelvinToCelsius)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else if (fromUnit == "Kelvin" && toUnit == "Fahrenheit") {
                    result = (userInput * kelvinToFahrenheit)
                    val roundResult = BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN)
                    val resultToString = roundResult.toString()
                    outputField?.setText("$resultToString $toUnit")
                    errorField?.setText("")

                } else {
                    val errorMessage = "Error. Please check your input."
                    errorField?.setText(errorMessage)
                    outputField?.setText("")

                }
            }

    })
}}