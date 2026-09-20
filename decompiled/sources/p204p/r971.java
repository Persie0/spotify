package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class r971 extends LinearLayout {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ qr60[] f196940h = {new spi0(r971.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Text;", 0)};

    /* JADX INFO: renamed from: a */
    public final be41 f196941a;

    /* JADX INFO: renamed from: b */
    public final oc0 f196942b;

    /* JADX INFO: renamed from: c */
    public gh00 f196943c;

    /* JADX INFO: renamed from: d */
    public gh00 f196944d;

    /* JADX INFO: renamed from: e */
    public eh00 f196945e;

    /* JADX INFO: renamed from: f */
    public final dy71 f196946f;

    /* JADX INFO: renamed from: g */
    public final dy71 f196947g;

    public r971(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.view_text_field, this);
        int i = R.id.editText;
        TextInputEditText textInputEditText = (TextInputEditText) vie1.m85629k(this, R.id.editText);
        if (textInputEditText != null) {
            i = R.id.label;
            TextView textView = (TextView) vie1.m85629k(this, R.id.label);
            if (textView != null) {
                i = R.id.layout;
                TextInputLayout textInputLayout = (TextInputLayout) vie1.m85629k(this, R.id.layout);
                if (textInputLayout != null) {
                    this.f196941a = new be41(this, textInputEditText, textView, textInputLayout, 17);
                    this.f196942b = new oc0(this, 4);
                    this.f196946f = new dy71();
                    this.f196947g = new dy71();
                    setOrientation(1);
                    int i2 = 13;
                    textInputEditText.addTextChangedListener(new wo5(this, i2));
                    textInputEditText.setOnFocusChangeListener(new y28(this, i2));
                    textInputEditText.setOnEditorActionListener(new z28(this, 5));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final int getImeOptions() {
        return ((TextInputEditText) this.f196941a.f26280c).getImeOptions();
    }

    public final gh00 getOnFocusLost() {
        return this.f196944d;
    }

    public final eh00 getOnFocused() {
        return this.f196945e;
    }

    public final gh00 getOnTextChanged() {
        return this.f196943c;
    }

    public final kvy getState() {
        qr60 qr60Var = f196940h[0];
        return (kvy) this.f196942b.f61172a;
    }

    public final void setImeOptions(int i) {
        ((TextInputEditText) this.f196941a.f26280c).setImeOptions(i);
    }

    public final void setOnFocusLost(gh00 gh00Var) {
        this.f196944d = gh00Var;
    }

    public final void setOnFocused(eh00 eh00Var) {
        this.f196945e = eh00Var;
    }

    public final void setOnTextChanged(gh00 gh00Var) {
        this.f196943c = gh00Var;
    }

    public final void setState(kvy kvyVar) {
        this.f196942b.m39516c(f196940h[0], this, kvyVar);
    }
}
