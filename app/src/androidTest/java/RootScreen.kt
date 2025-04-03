import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.mylibrary.R as Lib1R
import com.example.mylibrary2.R as Lib2R
import com.kaspersky.kaspresso.screens.KScreen

internal object RootScreen : KScreen<RootScreen>() {

    override val layoutId: Int = R.layout.root
    override val viewClass: Class<*> = MainActivity::class.java

    val rootId = R.id.root
    val lastChildId = R.id.lastChild
    val lastChildText = Lib1R.string.testLib131827
    val lastChildText2 = Lib2R.string.testLib231827
}
