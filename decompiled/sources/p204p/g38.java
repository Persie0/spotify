package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.address.addressimpl.view.NonCompletingAutoCompleteTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class g38 extends LinearLayout {

    /* JADX INFO: renamed from: M0 */
    public static final /* synthetic */ qr60[] f76130M0 = {new spi0(g38.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Autocomplete;", 0)};

    /* JADX INFO: renamed from: L0 */
    public final dy71 f76131L0;

    /* JADX INFO: renamed from: a */
    public final dc31 f76132a;

    /* JADX INFO: renamed from: b */
    public final b38 f76133b;

    /* JADX INFO: renamed from: c */
    public final pc0 f76134c;

    /* JADX INFO: renamed from: d */
    public boolean f76135d;

    /* JADX INFO: renamed from: e */
    public gh00 f76136e;

    /* JADX INFO: renamed from: f */
    public gh00 f76137f;

    /* JADX INFO: renamed from: g */
    public eh00 f76138g;

    /* JADX INFO: renamed from: h */
    public gh00 f76139h;

    /* JADX INFO: renamed from: i */
    public eh00 f76140i;

    /* JADX INFO: renamed from: t */
    public final dy71 f76141t;

    public g38(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.view_autocomplete_field, this);
        int i = R.id.label;
        TextView textView = (TextView) vie1.m85629k(this, R.id.label);
        if (textView != null) {
            i = R.id.layout;
            TextInputLayout textInputLayout = (TextInputLayout) vie1.m85629k(this, R.id.layout);
            if (textInputLayout != null) {
                i = R.id.textView;
                NonCompletingAutoCompleteTextView nonCompletingAutoCompleteTextView = (NonCompletingAutoCompleteTextView) vie1.m85629k(this, R.id.textView);
                if (nonCompletingAutoCompleteTextView != null) {
                    this.f76132a = new dc31(this, textView, textInputLayout, nonCompletingAutoCompleteTextView, 17);
                    b38 b38Var = new b38(context);
                    this.f76133b = b38Var;
                    this.f76134c = new pc0(this, 3);
                    this.f76141t = new dy71();
                    this.f76131L0 = new dy71();
                    setOrientation(1);
                    nonCompletingAutoCompleteTextView.setAdapter(b38Var);
                    nonCompletingAutoCompleteTextView.addTextChangedListener(new wo5(this, 1));
                    nonCompletingAutoCompleteTextView.setOnFocusChangeListener(new y28(this, 0));
                    nonCompletingAutoCompleteTextView.setOnClickListener(new y10(this, 7));
                    nonCompletingAutoCompleteTextView.setOnItemClickListener(new m73(this, context));
                    nonCompletingAutoCompleteTextView.setOnEditorActionListener(new z28(this, 0));
                    getViewTreeObserver().addOnPreDrawListener(new c38(this, new int[2], new int[2], new rlv0(), 0));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final int getImeOptions() {
        return ((NonCompletingAutoCompleteTextView) this.f76132a.f47418e).getImeOptions();
    }

    public final gh00 getOnFocusLost() {
        return this.f76137f;
    }

    public final eh00 getOnFocused() {
        return this.f76138g;
    }

    public final eh00 getOnManualEntrySelected() {
        return this.f76140i;
    }

    public final gh00 getOnSuggestionSelected() {
        return this.f76139h;
    }

    public final gh00 getOnTextChanged() {
        return this.f76136e;
    }

    public final hvy getState() {
        qr60 qr60Var = f76130M0[0];
        return (hvy) this.f76134c.f61172a;
    }

    public final void setImeOptions(int i) {
        ((NonCompletingAutoCompleteTextView) this.f76132a.f47418e).setImeOptions(i);
    }

    public final void setOnFocusLost(gh00 gh00Var) {
        this.f76137f = gh00Var;
    }

    public final void setOnFocused(eh00 eh00Var) {
        this.f76138g = eh00Var;
    }

    public final void setOnManualEntrySelected(eh00 eh00Var) {
        this.f76140i = eh00Var;
    }

    public final void setOnSuggestionSelected(gh00 gh00Var) {
        this.f76139h = gh00Var;
    }

    public final void setOnTextChanged(gh00 gh00Var) {
        this.f76136e = gh00Var;
    }

    public final void setState(hvy hvyVar) {
        this.f76134c.m39516c(f76130M0[0], this, hvyVar);
    }
}
