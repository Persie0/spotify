package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final Set f120526a;

    public k960(Set set) {
        this.f120526a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k960) && wj50.m88271j(this.f120526a, ((k960) obj).f120526a);
    }

    public final int hashCode() {
        return this.f120526a.hashCode();
    }
}
