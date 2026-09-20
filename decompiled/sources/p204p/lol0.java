package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class lol0 {

    /* JADX INFO: renamed from: a */
    public final Set f135456a;

    /* JADX INFO: renamed from: b */
    public final Set f135457b;

    public lol0(Set set, Set set2) {
        this.f135456a = set;
        this.f135457b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lol0)) {
            return false;
        }
        lol0 lol0Var = (lol0) obj;
        return wj50.m88271j(this.f135456a, lol0Var.f135456a) && wj50.m88271j(this.f135457b, lol0Var.f135457b);
    }

    public final int hashCode() {
        return this.f135457b.hashCode() + (this.f135456a.hashCode() * 31);
    }
}
