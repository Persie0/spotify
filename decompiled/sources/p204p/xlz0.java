package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class xlz0 implements ylz0 {

    /* JADX INFO: renamed from: a */
    public final Set f263254a;

    /* JADX INFO: renamed from: b */
    public final Set f263255b;

    public xlz0(Set set, Set set2) {
        this.f263254a = set;
        this.f263255b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlz0)) {
            return false;
        }
        xlz0 xlz0Var = (xlz0) obj;
        return wj50.m88271j(this.f263254a, xlz0Var.f263254a) && wj50.m88271j(this.f263255b, xlz0Var.f263255b);
    }

    public final int hashCode() {
        return this.f263255b.hashCode() + (this.f263254a.hashCode() * 31);
    }
}
