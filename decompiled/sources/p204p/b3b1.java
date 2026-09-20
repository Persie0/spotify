package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b3b1 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final Set f23013e;

    public b3b1(Set set) {
        super(1, 7);
        this.f23013e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3b1) && wj50.m88271j(this.f23013e, ((b3b1) obj).f23013e);
    }

    public final int hashCode() {
        return this.f23013e.hashCode();
    }
}
