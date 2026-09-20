package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class j960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final Set f110110a;

    public j960(Set set) {
        this.f110110a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j960) && wj50.m88271j(this.f110110a, ((j960) obj).f110110a);
    }

    public final int hashCode() {
        return this.f110110a.hashCode();
    }
}
