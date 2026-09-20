package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d3b1 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final Set f44845e;

    public d3b1(Set set) {
        super(4, 7);
        this.f44845e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3b1) && wj50.m88271j(this.f44845e, ((d3b1) obj).f44845e);
    }

    public final int hashCode() {
        return this.f44845e.hashCode();
    }
}
