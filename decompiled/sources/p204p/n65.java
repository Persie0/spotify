package p204p;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public class n65 extends mwf implements v55 {

    /* JADX INFO: renamed from: d */
    public l65 f150698d;

    /* JADX INFO: renamed from: e */
    public final m65 f150699e;

    /* JADX WARN: Type inference failed for: r2v2, types: [p.m65] */
    public n65(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f150699e = new fu60() { // from class: p.m65
            @Override // p204p.fu60
            /* JADX INFO: renamed from: B */
            public final boolean mo30683B(KeyEvent keyEvent) {
                return this.f140389a.m63758e(keyEvent);
            }
        };
        c65 c65VarM63757d = m63757d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((l65) c65VarM63757d).f130223r1 = i;
        c65VarM63757d.mo31528c();
    }

    @Override // p204p.mwf, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l65 l65Var = (l65) m63757d();
        l65Var.m58305v();
        ((ViewGroup) l65Var.f130203Y0.findViewById(android.R.id.content)).addView(view, layoutParams);
        l65Var.f130204Z.m46705a(l65Var.f130202Y.getCallback());
    }

    /* JADX INFO: renamed from: d */
    public final c65 m63757d() {
        if (this.f150698d == null) {
            fc5 fc5Var = c65.f34381a;
            this.f150698d = new l65(getContext(), getWindow(), this, this);
        }
        return this.f150698d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m63757d().mo31529d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return arg1.m26942j(this.f150699e, getWindow().getDecorView(), this, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m63758e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        l65 l65Var = (l65) m63757d();
        l65Var.m58305v();
        return l65Var.f130202Y.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m63757d().mo31527a();
    }

    @Override // p204p.mwf, android.app.Dialog
    public void onCreate(Bundle bundle) {
        l65 l65Var = (l65) m63757d();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(l65Var.f130200X);
        if (layoutInflaterFrom.getFactory() == null) {
            twg1.m81757y(layoutInflaterFrom, l65Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        super.onCreate(bundle);
        m63757d().mo31528c();
    }

    @Override // p204p.mwf, android.app.Dialog
    public final void onStop() {
        super.onStop();
        l65 l65Var = (l65) m63757d();
        l65Var.m58308y();
        wj50 wj50Var = l65Var.f130189M0;
        if (wj50Var != null) {
            wj50Var.mo48814W(false);
        }
    }

    @Override // p204p.mwf, android.app.Dialog
    public void setContentView(int i) {
        m63757d().mo31531g(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m63757d().mo31534j(charSequence);
    }

    @Override // p204p.mwf, android.app.Dialog
    public void setContentView(View view) {
        m63757d().mo31532h(view);
    }

    @Override // p204p.mwf, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m63757d().mo31533i(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m63757d().mo31534j(getContext().getString(i));
    }
}
