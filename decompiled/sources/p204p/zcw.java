package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zcw extends bdw implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final zcw f281578a = new zcw();

    private Object readResolve() {
        return f281578a;
    }

    @Override // p204p.bdw
    /* JADX INFO: renamed from: a */
    public final boolean mo25630a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // p204p.bdw
    /* JADX INFO: renamed from: b */
    public final int mo25631b(Object obj) {
        return obj.hashCode();
    }
}
