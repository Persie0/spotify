package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f3b1 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final Set f65449e;

    public f3b1(Set set) {
        super(5, 7);
        this.f65449e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3b1) && wj50.m88271j(this.f65449e, ((f3b1) obj).f65449e);
    }

    public final int hashCode() {
        return this.f65449e.hashCode();
    }
}
