package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class x050 implements c9y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f256812a;

    /* JADX INFO: renamed from: b */
    public final Object f256813b;

    public /* synthetic */ x050(Object obj, int i) {
        this.f256812a = i;
        this.f256813b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f256812a) {
            case 0:
                return this.f256813b;
            default:
                return new ogy0(((Integer) x5i0.f258449a.get()).intValue(), (Context) ((i4t0) this.f256813b).get(), "com.google.android.datatransport.events");
        }
    }
}
