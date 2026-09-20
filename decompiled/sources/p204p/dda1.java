package p204p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: classes9.dex */
public final class dda1 implements Consumer, onp {

    /* JADX INFO: renamed from: a */
    public final ryq0 f47757a;

    /* JADX INFO: renamed from: b */
    public final lwr f47758b = new lwr();

    public dda1(ryq0 ryq0Var, hc80 hc80Var) {
        this.f47757a = ryq0Var;
        hc80Var.getLifecycle().mo31986a(new e16(this, 12));
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ttq0 ttq0Var = (ttq0) obj;
        this.f47758b.m60127a(this.f47757a.m76740d(ttq0Var.f223663d, ttq0Var.f223664e).m23299p(Functions.f7232h).subscribe());
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f47758b.m60129c();
    }
}
