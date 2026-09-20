package p204p;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class dij0 extends l7j {

    /* JADX INFO: renamed from: f */
    public final ConnectivityManager f49381f;

    /* JADX INFO: renamed from: g */
    public final pi4 f49382g;

    public dij0(Context context, o0e1 o0e1Var) {
        super(context, o0e1Var);
        this.f49381f = (ConnectivityManager) this.f130662b.getSystemService("connectivity");
        this.f49382g = new pi4(this, 3);
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: a */
    public final Object mo36122a() {
        return eij0.m39105a(this.f49381f);
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: c */
    public final void mo36123c() {
        try {
            gaz gazVarM44190b = gaz.m44190b();
            int i = eij0.f59895a;
            gazVarM44190b.getClass();
            hkg1.m47838x(this.f49381f, this.f49382g);
        } catch (IllegalArgumentException unused) {
            gaz gazVarM44190b2 = gaz.m44190b();
            int i2 = eij0.f59895a;
            gazVarM44190b2.getClass();
        } catch (SecurityException unused2) {
            gaz gazVarM44190b3 = gaz.m44190b();
            int i3 = eij0.f59895a;
            gazVarM44190b3.getClass();
        }
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: d */
    public final void mo36124d() {
        try {
            gaz gazVarM44190b = gaz.m44190b();
            int i = eij0.f59895a;
            gazVarM44190b.getClass();
            bkg1.m29682B(this.f49381f, this.f49382g);
        } catch (IllegalArgumentException unused) {
            gaz gazVarM44190b2 = gaz.m44190b();
            int i2 = eij0.f59895a;
            gazVarM44190b2.getClass();
        } catch (SecurityException unused2) {
            gaz gazVarM44190b3 = gaz.m44190b();
            int i3 = eij0.f59895a;
            gazVarM44190b3.getClass();
        }
    }
}
