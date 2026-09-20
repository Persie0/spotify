package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class pd01 {

    /* JADX INFO: renamed from: a */
    public final Object f176318a;

    /* JADX INFO: renamed from: b */
    public final Object f176319b;

    public pd01(Set set, Set set2) {
        this.f176318a = set;
        this.f176319b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd01)) {
            return false;
        }
        pd01 pd01Var = (pd01) obj;
        return this.f176318a.equals(pd01Var.f176318a) && this.f176319b.equals(pd01Var.f176319b);
    }

    public final int hashCode() {
        return this.f176319b.hashCode() + (this.f176318a.hashCode() * 31);
    }
}
