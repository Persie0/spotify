package p204p;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class cc80 extends r55 implements ua80 {

    /* JADX INFO: renamed from: Y0 */
    public boolean f36341Y0;

    /* JADX INFO: renamed from: Z0 */
    public final eb80 f36342Z0 = new eb80();

    @Override // p204p.m500, p204p.cwf, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        eb80 eb80Var = this.f36342Z0;
        eb80Var.getClass();
        eb80Var.m38361a(new wa80(i, i2, intent));
    }

    @Override // p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public void onCreate(Bundle bundle) {
        m32227q0(bundle);
        this.f42739c.m59038f(new bc80(this), this);
    }

    @Override // p204p.cwf, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (this.f36341Y0) {
            return false;
        }
        super.onCreatePanelMenu(i, menu);
        return true;
    }

    @Override // p204p.r55, p204p.m500, android.app.Activity
    public void onDestroy() {
        m32228r0();
        this.f36342Z0.m38361a(db80.f47242e);
    }

    @Override // p204p.m500, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f36342Z0.m38361a(db80.f47241d);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f36342Z0.m38361a(new cb80(bundle, 2));
    }

    @Override // p204p.m500, android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(this, true);
                } catch (ReflectiveOperationException unused) {
                    throw e;
                }
            }
        } else {
            super.onResume();
        }
        this.f36342Z0.m38361a(db80.f47240c);
    }

    @Override // p204p.cwf, p204p.bwf, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f36342Z0.m38361a(new cb80(bundle, 1));
    }

    @Override // p204p.r55, p204p.m500, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f36342Z0.m38361a(db80.f47238a);
    }

    @Override // p204p.r55, p204p.m500, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f36342Z0.m38361a(db80.f47239b);
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: q */
    public final boolean mo32226q(va80 va80Var) {
        return this.f36342Z0.mo32226q(va80Var);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m32227q0(Bundle bundle) {
        this.f36341Y0 = false;
        pag1.m69463B(new lk00(4, this, bundle));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m32228r0() {
        super.onDestroy();
        this.f36341Y0 = true;
    }

    @Override // p204p.ua80
    /* JADX INFO: renamed from: z */
    public final boolean mo32229z(va80 va80Var) {
        return this.f36342Z0.mo32229z(va80Var);
    }
}
