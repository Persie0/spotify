package p204p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public class uic0 extends aic0 implements wic0 {

    /* JADX INFO: renamed from: b */
    public volatile xic0 f230656b;

    public uic0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.f230656b = ajc0.f16230t;
    }

    @Override // p204p.wic0
    /* JADX INFO: renamed from: a */
    public final xic0 mo67011a() {
        return this.f230656b;
    }

    @Override // p204p.dic0
    public final Object getValue() {
        return this.f230656b.get();
    }
}
