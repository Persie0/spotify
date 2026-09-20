package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class rm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f200410a;

    public rm1(Set set) {
        this.f200410a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm1) && wj50.m88271j(this.f200410a, ((rm1) obj).f200410a);
    }

    public final int hashCode() {
        return this.f200410a.hashCode();
    }
}
