package p204p;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class yic0 extends WeakReference implements xic0 {

    /* JADX INFO: renamed from: a */
    public final dic0 f273077a;

    public yic0(ReferenceQueue referenceQueue, Object obj, dic0 dic0Var) {
        super(obj, referenceQueue);
        this.f273077a = dic0Var;
    }

    @Override // p204p.xic0
    /* JADX INFO: renamed from: a */
    public final dic0 mo91116a() {
        return this.f273077a;
    }

    @Override // p204p.xic0
    /* JADX INFO: renamed from: b */
    public final xic0 mo91117b(ReferenceQueue referenceQueue, wic0 wic0Var) {
        return new yic0(referenceQueue, get(), wic0Var);
    }
}
