package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class en1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f61041a;

    /* JADX INFO: renamed from: b */
    public final Set f61042b;

    public en1(Set set, Set set2) {
        this.f61041a = set;
        this.f61042b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en1)) {
            return false;
        }
        en1 en1Var = (en1) obj;
        return wj50.m88271j(this.f61041a, en1Var.f61041a) && wj50.m88271j(this.f61042b, en1Var.f61042b);
    }

    public final int hashCode() {
        return this.f61042b.hashCode() + (this.f61041a.hashCode() * 31);
    }
}
