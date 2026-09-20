package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g8b implements h8b {

    /* JADX INFO: renamed from: a */
    public final Set f77448a;

    /* JADX INFO: renamed from: b */
    public final String f77449b;

    public g8b(String str, Set set) {
        this.f77448a = set;
        this.f77449b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8b)) {
            return false;
        }
        g8b g8bVar = (g8b) obj;
        return wj50.m88271j(this.f77448a, g8bVar.f77448a) && wj50.m88271j(this.f77449b, g8bVar.f77449b);
    }

    public final int hashCode() {
        return this.f77449b.hashCode() + (this.f77448a.hashCode() * 31);
    }
}
