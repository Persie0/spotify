package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class sn70 implements kj30 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f210838a;

    /* JADX INFO: renamed from: b */
    public final kv91 f210839b;

    /* JADX INFO: renamed from: c */
    public final jyx0 f210840c;

    /* JADX INFO: renamed from: d */
    public final bii0 f210841d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f210842e;

    /* JADX INFO: renamed from: f */
    public final lwr f210843f = new lwr();

    public sn70(hc80 hc80Var, z9j0 z9j0Var, kv91 kv91Var, jyx0 jyx0Var, bii0 bii0Var, Scheduler scheduler) {
        this.f210838a = z9j0Var;
        this.f210839b = kv91Var;
        this.f210840c = jyx0Var;
        this.f210841d = bii0Var;
        this.f210842e = scheduler;
        hc80Var.getLifecycle().mo31986a(new rn70(this, hc80Var));
    }

    @Override // p204p.kj30
    /* JADX INFO: renamed from: a */
    public final void mo44172a(mj30 mj30Var, zj30 zj30Var) {
        String strString = mj30Var.data().string("uri");
        if (strString == null) {
            return;
        }
        this.f210843f.m60127a(this.f210840c.m54823b(Uri.parse(strString)).map(gaz.f78153i).observeOn(this.f210842e).doOnSuccess(new wk6((Object) this, (Object) zj30Var, strString, 14)).subscribe(frz.f72693U0, frz.f72694V0));
    }
}
