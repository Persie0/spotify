package p204p;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class x9n0 extends x1v {

    /* JADX INFO: renamed from: e */
    public final his f259408e;

    /* JADX INFO: renamed from: f */
    public final rhe f259409f;

    /* JADX INFO: renamed from: g */
    public final she f259410g;

    public x9n0(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f259408e = new his(this, 1);
        this.f259409f = new rhe(this, 2);
        this.f259410g = new she(this, 2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m90263d(x9n0 x9n0Var) {
        EditText editText = x9n0Var.f257279a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // p204p.x1v
    /* JADX INFO: renamed from: a */
    public final void mo25262a() {
        int i = this.f257282d;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        TextInputLayout textInputLayout = this.f257279a;
        textInputLayout.setEndIconDrawable(i);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new hta0(this, 9));
        LinkedHashSet linkedHashSet = textInputLayout.f2211D1;
        rhe rheVar = this.f259409f;
        linkedHashSet.add(rheVar);
        if (textInputLayout.f2261e != null) {
            rheVar.m75513a(textInputLayout);
        }
        textInputLayout.f2215H1.add(this.f259410g);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}
