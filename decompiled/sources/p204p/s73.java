package p204p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class s73 extends n65 implements DialogInterface {

    /* JADX INFO: renamed from: f */
    public final q73 f206265f;

    public s73(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m77357f(contextThemeWrapper, i));
        this.f206265f = new q73(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: f */
    public static int m77357f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p204p.n65, p204p.mwf, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f206265f.m72279b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f206265f.m72280c(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f206265f.m72281d(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p204p.n65, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f206265f.m72283g(charSequence);
    }
}
