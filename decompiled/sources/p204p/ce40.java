package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ce40 {

    /* JADX INFO: renamed from: a */
    public final List f37006a;

    /* JADX INFO: renamed from: b */
    public final w940 f37007b;

    public ce40(List list, w940 w940Var) {
        this.f37006a = list;
        this.f37007b = w940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce40)) {
            return false;
        }
        ce40 ce40Var = (ce40) obj;
        return wj50.m88271j(this.f37006a, ce40Var.f37006a) && wj50.m88271j(this.f37007b, ce40Var.f37007b);
    }

    public final int hashCode() {
        int iHashCode = this.f37006a.hashCode() * 31;
        w940 w940Var = this.f37007b;
        return iHashCode + (w940Var == null ? 0 : w940Var.hashCode());
    }
}
