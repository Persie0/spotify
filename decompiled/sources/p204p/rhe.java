package p204p;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class rhe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x1v f199207b;

    public /* synthetic */ rhe(x1v x1vVar, int i) {
        this.f199206a = i;
        this.f199207b = x1vVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m75513a(TextInputLayout textInputLayout) {
        int i = this.f199206a;
        x1v x1vVar = this.f199207b;
        switch (i) {
            case 0:
                EditText editText = textInputLayout.getEditText();
                vhe vheVar = (vhe) x1vVar;
                textInputLayout.setEndIconVisible(vhe.m85523d(vheVar));
                textInputLayout.setEndIconCheckable(false);
                y28 y28Var = vheVar.f241497f;
                editText.setOnFocusChangeListener(y28Var);
                vheVar.f257281c.setOnFocusChangeListener(y28Var);
                wo5 wo5Var = vheVar.f241496e;
                editText.removeTextChangedListener(wo5Var);
                editText.addTextChangedListener(wo5Var);
                return;
            case 1:
                EditText editText2 = textInputLayout.getEditText();
                if (!(editText2 instanceof AutoCompleteTextView)) {
                    throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText2;
                kis kisVar = (kis) x1vVar;
                his hisVar = kisVar.f123078e;
                TextInputLayout textInputLayout2 = kisVar.f257279a;
                int boxBackgroundMode = textInputLayout2.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(kisVar.f123087n);
                } else if (boxBackgroundMode == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(kisVar.f123086m);
                }
                if (autoCompleteTextView.getKeyListener() == null) {
                    int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                    n3d0 boxBackground = textInputLayout2.getBoxBackground();
                    int iM86387n = vtg1.m86387n(autoCompleteTextView, R.attr.colorControlHighlight);
                    int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int iM86387n2 = vtg1.m86387n(autoCompleteTextView, R.attr.colorSurface);
                        n3d0 n3d0Var = new n3d0(boxBackground.f150021a.f139593a);
                        int iM86393t = vtg1.m86393t(iM86387n, iM86387n2, 0.1f);
                        n3d0Var.m63601l(new ColorStateList(iArr, new int[]{iM86393t, 0}));
                        n3d0Var.setTint(iM86387n2);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM86393t, iM86387n2});
                        n3d0 n3d0Var2 = new n3d0(boxBackground.f150021a.f139593a);
                        n3d0Var2.setTint(-1);
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, n3d0Var, n3d0Var2), boxBackground});
                        WeakHashMap weakHashMap = mec1.f142677a;
                        autoCompleteTextView.setBackground(layerDrawable);
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{vtg1.m86393t(iM86387n, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        autoCompleteTextView.setBackground(rippleDrawable);
                    }
                }
                autoCompleteTextView.setOnTouchListener(new f87(kisVar, autoCompleteTextView));
                autoCompleteTextView.setOnFocusChangeListener(kisVar.f123079f);
                autoCompleteTextView.setOnDismissListener(new jis(kisVar));
                autoCompleteTextView.setThreshold(0);
                autoCompleteTextView.removeTextChangedListener(hisVar);
                autoCompleteTextView.addTextChangedListener(hisVar);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() == null) {
                    CheckableImageButton checkableImageButton = kisVar.f257281c;
                    WeakHashMap weakHashMap3 = mec1.f142677a;
                    checkableImageButton.setImportantForAccessibility(2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(kisVar.f123080g);
                textInputLayout.setEndIconVisible(true);
                return;
            default:
                EditText editText3 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                x9n0 x9n0Var = (x9n0) x1vVar;
                x9n0Var.f257281c.setChecked(!x9n0.m90263d(x9n0Var));
                his hisVar2 = x9n0Var.f259408e;
                editText3.removeTextChangedListener(hisVar2);
                editText3.addTextChangedListener(hisVar2);
                return;
        }
    }
}
