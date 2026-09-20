package p204p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class r840 {

    /* JADX INFO: renamed from: a */
    public final p840 f196707a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f196708b;

    /* JADX INFO: renamed from: c */
    public final Set f196709c;

    public r840(p840 p840Var, ArrayList arrayList, Set set) {
        this.f196707a = p840Var;
        this.f196708b = arrayList;
        this.f196709c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r840)) {
            return false;
        }
        r840 r840Var = (r840) obj;
        return wj50.m88271j(this.f196707a, r840Var.f196707a) && this.f196708b.equals(r840Var.f196708b) && wj50.m88271j(this.f196709c, r840Var.f196709c);
    }

    public final int hashCode() {
        return this.f196709c.hashCode() + lq51.m59700f(this.f196708b, this.f196707a.hashCode() * 31, 31);
    }
}
