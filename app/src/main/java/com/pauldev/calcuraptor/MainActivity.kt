package com.pauldev.calcuraptor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pauldev.calcuraptor.ui.theme.CalcuraptorTheme
import com.pauldev.calcuraptor.ui.theme.Pink40
import com.pauldev.calcuraptor.ui.theme.Pink80
import com.pauldev.calcuraptor.ui.theme.Purple40
import com.pauldev.calcuraptor.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcuraptorTheme {
                val viewModel = CalculatorViewModel()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                // Estructura de la calculadora
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 80.sp,
                            color = Color.White,
                            maxLines = 2
                        )
                        /*--------------------------------------------------------Acciones*/
                        // --------------- Primera columna de acciones
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ){
                            // Seno
                            CalculatorButtons(
                                symbol = "sen",
                                modifier = Modifier
                                    .background(Purple80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Sen))
                            }
                            // Coseno
                            CalculatorButtons(
                                symbol = "cos",
                                modifier = Modifier
                                    .background(Purple80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Delete)
                            }
                            // Tangente
                            CalculatorButtons(
                                symbol = "tan",
                                modifier = Modifier
                                    .background(Purple80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Divide))
                            }
                            // Delete
                            CalculatorButtons(
                                symbol = "DEL",
                                modifier = Modifier
                                    .background(Purple40)
                                    .aspectRatio(1f)
                                    .weight(1f),
                            ){
                                viewModel.onAction(CalculatorActions.Delete)
                            }
                            // Clear
                            CalculatorButtons(
                                symbol = "AC",
                                modifier = Modifier
                                    .background(Purple40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Clear)
                            }
                        }
                        // -------------- Segunda columna de acciones
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ){
                            // Number 7
                            CalculatorButtons(
                                symbol = "7",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 7))
                            }
                            // Number 8
                            CalculatorButtons(
                                symbol = "8",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 8))
                            }
                            // Number 9
                            CalculatorButtons(
                                symbol = "9",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 9))
                            }
                            // Potenciacion
                            CalculatorButtons(
                                symbol = "^",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Potency))
                            }
                            // Division
                            CalculatorButtons(
                                symbol = "÷",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Divide))
                            }
                        }
                        // ------------------ Tercera columna de acciones
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ){
                            // Number 4
                            CalculatorButtons(
                                symbol = "4",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(9))
                            }

                            // Number 5
                            CalculatorButtons(
                                symbol = "5",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 5))
                            }
                            // Number 6
                            CalculatorButtons(
                                symbol = "6",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 6))
                            }
                            // Producto
                            CalculatorButtons(
                                symbol = "✕",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Multiply))
                            }
                            // Resta
                            CalculatorButtons(
                                symbol = "÷",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Subtract))
                            }
                        }
                        // ------------------ Cuarta columna de acciones
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ){
                            // Number 1
                            CalculatorButtons(
                                symbol = "1",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 1))
                            }
                            // Number 2
                            CalculatorButtons(
                                symbol = "2",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 2))
                            }
                            // Number 3
                            CalculatorButtons(
                                symbol = "3",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 3))
                            }
                            // Suma
                            CalculatorButtons(
                                symbol = "+",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Add))
                            }
                            // Porcentaje
                            CalculatorButtons(
                                symbol = "%",
                                modifier = Modifier
                                    .background(Pink40)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Operation(CalculatorOperations.Percent))
                            }
                        }
                        // ------------------ Quinta columna de acciones
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ){
                            // Number 7
                            CalculatorButtons(
                                symbol = "0",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Number(number = 0))
                            }
                            // Decimal divider
                            CalculatorButtons(
                                symbol = ".",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ){
                                viewModel.onAction(CalculatorActions.Decimal)
                            }
                            // Equals
                            CalculatorButtons(
                                symbol = "=",
                                modifier = Modifier
                                    .background(Pink80)
                                    .aspectRatio(2f)
                                    .weight(2f)
                            ){
                                viewModel.onAction(CalculatorActions.Calculate)
                            }
                        }
                        /*--------------------------------------------------------Acciones*/
                    }
                }
            }
        }
    }
}