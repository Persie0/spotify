package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class ruf {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f202837b = AtomicIntegerFieldUpdater.newUpdater(ruf.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f202838a;

    public ruf(Throwable th, boolean z) {
        this.f202838a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return opo.m67555e(this) + '[' + this.f202838a + ']';
    }
}
