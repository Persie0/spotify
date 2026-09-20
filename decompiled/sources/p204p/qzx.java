package p204p;

import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: classes2.dex */
public final class qzx {

    /* JADX INFO: renamed from: a */
    public final jdp0 f194326a;

    /* JADX INFO: renamed from: b */
    public final PublishProcessor f194327b = new PublishProcessor();

    public qzx(jdp0 jdp0Var) {
        this.f194326a = jdp0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m74357a(jps jpsVar) {
        this.f194327b.onNext(jpsVar);
    }
}
