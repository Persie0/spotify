package p204p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textview.MaterialTextView;
import com.spotify.legacyglue.icons.SpotifyIconView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nbn0 {

    /* JADX INFO: renamed from: a */
    public final Class f152326a;

    /* JADX INFO: Fake field, exist only in values array */
    nbn0 EF7;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ nbn0[] f152325c = {new ebn0(0, AutoCompleteTextView.class, "AUTOCOMPLETETEXTVIEW"), new fbn0(1, Button.class, "BUTTON"), new gbn0(2, ImageView.class, "IMAGEVIEW"), new hbn0(3, ImageButton.class, "IMAGEBUTTON"), new ibn0(4, ToggleButton.class, "TOGGLEBUTTON"), new jbn0(5, CheckBox.class, "CHECKBOX"), new kbn0(6, CheckedTextView.class, "CHECKEDTEXTVIEW"), new lbn0(7, EditText.class, "EDITTEXT"), new mbn0(8, RadioButton.class, "RADIOBUTTON"), new uan0(9, TextView.class, "TEXTVIEW"), new van0(10, AppCompatTextView.class, "APPCOMPAT_TEXTVIEW"), new wan0(11, MaterialTextView.class, "MATERIAL_TEXTVIEW"), new xan0(12, SwitchCompat.class, "SWITCHCOMPAT_VIEW"), new yan0(13, SpotifyIconView.class, "SPOTIFY_ICON_VIEW"), new zan0(14, LinearLayout.class, "LINEAR_LAYOUT"), new abn0(15, FrameLayout.class, "FRAME_LAYOUT"), new bbn0(16, RelativeLayout.class, "RELATIVE_LAYOUT"), new cbn0(17, ConstraintLayout.class, "CONSTRAINT_LAYOUT"), new dbn0(18, CoordinatorLayout.class, "COORDINATOR_LAYOUT")};

    /* JADX INFO: renamed from: b */
    public static final nbn0[] f152324b = values();

    public nbn0(int i, Class cls, String str) {
        super(str, i);
        this.f152326a = cls;
    }

    public static nbn0 valueOf(String str) {
        return (nbn0) Enum.valueOf(nbn0.class, str);
    }

    public static nbn0[] values() {
        return (nbn0[]) f152325c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo25370a(Context context, AttributeSet attributeSet, int i);

    /* JADX INFO: renamed from: b */
    public int mo35572b() {
        return 0;
    }
}
