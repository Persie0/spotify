package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class gis extends LinearLayout {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ qr60[] f80246i = {new spi0(gis.class, "state", "getState()Lcom/spotify/address/addressimpl/view/FieldViewState$Dropdown;", 0)};

    /* JADX INFO: renamed from: a */
    public final a531 f80247a;

    /* JADX INFO: renamed from: b */
    public final g251 f80248b;

    /* JADX INFO: renamed from: c */
    public gh00 f80249c;

    /* JADX INFO: renamed from: d */
    public gh00 f80250d;

    /* JADX INFO: renamed from: e */
    public eh00 f80251e;

    /* JADX INFO: renamed from: f */
    public eh00 f80252f;

    /* JADX INFO: renamed from: g */
    public final dy71 f80253g;

    /* JADX INFO: renamed from: h */
    public final dy71 f80254h;

    public gis(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(R.layout.view_dropdown_field, this);
        int i = R.id.label;
        TextView textView = (TextView) vie1.m85629k(this, R.id.label);
        if (textView != null) {
            i = R.id.layout;
            TextInputLayout textInputLayout = (TextInputLayout) vie1.m85629k(this, R.id.layout);
            if (textInputLayout != null) {
                i = R.id.textView;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) vie1.m85629k(this, R.id.textView);
                if (autoCompleteTextView != null) {
                    this.f80247a = new a531(this, textView, textInputLayout, autoCompleteTextView, 18);
                    this.f80248b = new g251(this, context, 2);
                    this.f80253g = new dy71();
                    this.f80254h = new dy71();
                    setOrientation(1);
                    autoCompleteTextView.addTextChangedListener(new wo5(this, 7));
                    autoCompleteTextView.setOnItemClickListener(new h75(this, 1));
                    autoCompleteTextView.setOnFocusChangeListener(new y28(this, 6));
                    autoCompleteTextView.setOnEditorActionListener(new z28(this, 1));
                    getViewTreeObserver().addOnPreDrawListener(new c38(this, new int[2], new int[2], new rlv0(), 1));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: b */
    public static final void m44851b(gis gisVar, String str) {
        String str2;
        Object next;
        a531 a531Var = gisVar.f80247a;
        jvy state = gisVar.getState();
        if (state != null) {
            Iterator it = state.f116545e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((ivy) next).f106299a, str));
            ivy ivyVar = (ivy) next;
            if (ivyVar != null) {
                str2 = ivyVar.f106300b;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        ((AutoCompleteTextView) a531Var.f12417e).setText((CharSequence) null, true);
        ((AutoCompleteTextView) a531Var.f12417e).setText((CharSequence) str2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSelectedKey() {
        Object next;
        String string = wl51.m88491o1(((AutoCompleteTextView) this.f80247a.f12417e).getText().toString()).toString();
        jvy state = getState();
        if (state != null) {
            Iterator it = state.f116545e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!bm51.m29797h0(((ivy) next).f106300b, string, true));
            ivy ivyVar = (ivy) next;
            if (ivyVar != null) {
                return ivyVar.f106299a;
            }
        }
        return null;
    }

    public final int getImeOptions() {
        return ((AutoCompleteTextView) this.f80247a.f12417e).getImeOptions();
    }

    public final eh00 getOnFocused() {
        return this.f80251e;
    }

    public final gh00 getOnOptionSelected() {
        return this.f80250d;
    }

    public final gh00 getOnTextChanged() {
        return this.f80249c;
    }

    public final eh00 getOnUserInput() {
        return this.f80252f;
    }

    public final jvy getState() {
        qr60 qr60Var = f80246i[0];
        return (jvy) this.f80248b.f61172a;
    }

    public final void setImeOptions(int i) {
        ((AutoCompleteTextView) this.f80247a.f12417e).setImeOptions(i);
    }

    public final void setOnFocused(eh00 eh00Var) {
        this.f80251e = eh00Var;
    }

    public final void setOnOptionSelected(gh00 gh00Var) {
        this.f80250d = gh00Var;
    }

    public final void setOnTextChanged(gh00 gh00Var) {
        this.f80249c = gh00Var;
    }

    public final void setOnUserInput(eh00 eh00Var) {
        this.f80252f = eh00Var;
    }

    public final void setState(jvy jvyVar) {
        this.f80248b.m39516c(f80246i[0], this, jvyVar);
    }
}
