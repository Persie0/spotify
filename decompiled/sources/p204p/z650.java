package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class z650 implements Serializable {
    public static final y650 Companion = new y650();

    /* JADX INFO: renamed from: a */
    public final String f279709a;

    public /* synthetic */ z650(int i, String str) {
        if (1 == (i & 1)) {
            this.f279709a = str;
        } else {
            edo.m38617p(i, 1, x650.f258595a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z650) && wj50.m88271j(this.f279709a, ((z650) obj).f279709a);
    }

    public final int hashCode() {
        return this.f279709a.hashCode();
    }

    public final String toString() {
        return this.f279709a;
    }

    public z650(String str) {
        this.f279709a = str;
    }
}
