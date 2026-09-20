package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class kbm0 implements Serializable {
    public static final jbm0 Companion = new jbm0();

    /* JADX INFO: renamed from: a */
    public final String f121231a;

    public /* synthetic */ kbm0(int i, String str) {
        if (1 == (i & 1)) {
            this.f121231a = str;
        } else {
            edo.m38617p(i, 1, ibm0.f100610a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbm0) && wj50.m88271j(this.f121231a, ((kbm0) obj).f121231a);
    }

    public final int hashCode() {
        return this.f121231a.hashCode();
    }

    public kbm0(String str) {
        this.f121231a = str;
    }
}
