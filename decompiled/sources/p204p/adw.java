package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class adw extends bdw implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final adw f14689a = new adw();

    private Object readResolve() {
        return f14689a;
    }

    @Override // p204p.bdw
    /* JADX INFO: renamed from: a */
    public final boolean mo25630a(Object obj, Object obj2) {
        return false;
    }

    @Override // p204p.bdw
    /* JADX INFO: renamed from: b */
    public final int mo25631b(Object obj) {
        return System.identityHashCode(obj);
    }
}
