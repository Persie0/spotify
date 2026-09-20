package p204p;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bwf extends Activity implements hc80, fu60 {

    /* JADX INFO: renamed from: a */
    public final oc80 f31643a = new oc80(this, true);

    @Override // p204p.fu60
    /* JADX INFO: renamed from: B */
    public final boolean mo30683B(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (arg1.m26941i(decorView, keyEvent)) {
            return true;
        }
        return arg1.m26942j(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (arg1.m26941i(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX INFO: renamed from: h */
    public int m30684h() {
        return getRequestedOrientation();
    }

    public void onCancel() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = xrw0.f265430b;
        vrw0.m86301b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f31643a.m66678i(fb80.f67752c);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: renamed from: u */
    public void mo15686u(int i) {
        setRequestedOrientation(i);
    }
}
