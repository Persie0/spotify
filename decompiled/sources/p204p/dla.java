package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dla extends l7j {

    /* JADX INFO: renamed from: f */
    public final o4a f50162f;

    public dla(Context context, o0e1 o0e1Var) {
        super(context, o0e1Var);
        this.f50162f = new o4a(this, 5);
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: c */
    public final void mo36123c() {
        gaz gazVarM44190b = gaz.m44190b();
        int i = ela.f60669a;
        gazVarM44190b.getClass();
        this.f130662b.registerReceiver(this.f50162f, mo36350e());
    }

    @Override // p204p.l7j
    /* JADX INFO: renamed from: d */
    public final void mo36124d() {
        gaz gazVarM44190b = gaz.m44190b();
        int i = ela.f60669a;
        gazVarM44190b.getClass();
        this.f130662b.unregisterReceiver(this.f50162f);
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo36350e();

    /* JADX INFO: renamed from: f */
    public abstract void mo36351f(Intent intent);
}
