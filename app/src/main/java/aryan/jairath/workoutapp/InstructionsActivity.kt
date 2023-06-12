package aryan.jairath.workoutapp

import android.R
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import aryan.jairath.workoutapp.databinding.AcitivityInstructionBinding
import aryan.jairath.workoutapp.R.style.AlertDialogThemes


class InstructionsActivity: AppCompatActivity() {
    private var binding: AcitivityInstructionBinding?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AcitivityInstructionBinding.inflate(layoutInflater)
        binding?.instructs?.visibility = View.VISIBLE
        setContentView(binding?.root)
        binding?.pushup?.setOnClickListener{
            showPopupMessage(this, "Pushup Tips", "To do pushups, there are two ways to effectively target certain muscles. If you want to target triceps and get a forearm pump, keep your arms close and lock out your elbows to isolate the arm muscles. Keeping a wide grip during pushups will target more chest. With a wide grip, keep your hands low to target lower chest and keep your hands high if you want to target upper chest.")
        }
        binding?.wallsits?.setOnClickListener{
            showPopupMessage(this, "Wallsit Tips", "To do a proper wall sit, keep your back completely flat against any wall. Ensure to feel a burn by lowering your butt to a level where you feel a stretch.")
        }
        binding?.crunch?.setOnClickListener{
            showPopupMessage(this, "Abdominal Crunch Tips", "For the best results, keep heavy books or have another individual stand on your feet so you have less leeway and for maximal burn. Take 2-3 seconds per rep to really target the oblique muscles and lean slightly left on one rep and slightly right on the next to get those gills.")
        }
        binding?.plank?.setOnClickListener{
            showPopupMessage(this, "Plank Tips", "Start off by laying flat with your arms to your sides. Then bring you arms to your chest as this will be the optimal way to feel the exercise in your abs. Try to get through the 30 seconds without moving. If the exercise gets too easy to complete, add a dumbbell to yor back to progressively overload")
        }
        binding?.squat?.setOnClickListener{
            showPopupMessage(this, "Squat Tips", "Begin the squat by positioning yourself properly. This involves keeping your legs around 2 feet apart but your mileage may vary depending on your hips. While keeping your back leaning slightly forward, lower your butt to as low as you can go. Again, to increase the intensity you can add weight to your hands and make it a goblet squat.")
        }



    }
    fun showPopupMessage(context: Context, title: String, message: String) {
        val alertDialog = AlertDialog.Builder(context, AlertDialogThemes).create()
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)
        alertDialog.setCancelable(true)
        alertDialog.setButton(
            AlertDialog.BUTTON_POSITIVE,
            "OK"
        ) { dialog, _ -> dialog.dismiss() }

        alertDialog.show()

    }
}