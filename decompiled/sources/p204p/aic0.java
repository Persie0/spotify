package p204p;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aic0 extends WeakReference implements dic0 {

    /* JADX INFO: renamed from: a */
    public final int f15934a;

    public aic0(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.f15934a = i;
    }

    @Override // p204p.dic0
    /* JADX INFO: renamed from: b */
    public final int mo26067b() {
        return this.f15934a;
    }

    @Override // p204p.dic0
    /* JADX INFO: renamed from: c */
    public dic0 mo26068c() {
        return null;
    }

    @Override // p204p.dic0
    public final Object getKey() {
        return get();
    }
}
