package p204p;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes4.dex */
public class ric0 extends aic0 {

    /* JADX INFO: renamed from: b */
    public volatile Object f199479b;

    public ric0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.f199479b = null;
    }

    @Override // p204p.dic0
    public final Object getValue() {
        return this.f199479b;
    }
}
