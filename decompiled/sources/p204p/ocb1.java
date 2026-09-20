package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ocb1 {

    /* JADX INFO: renamed from: a */
    public final String f163893a;

    /* JADX INFO: renamed from: b */
    public final List f163894b;

    public ocb1(String str, List list) {
        this.f163893a = str;
        this.f163894b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocb1)) {
            return false;
        }
        ocb1 ocb1Var = (ocb1) obj;
        return wj50.m88271j(this.f163893a, ocb1Var.f163893a) && wj50.m88271j(this.f163894b, ocb1Var.f163894b);
    }

    public final int hashCode() {
        return this.f163894b.hashCode() + (this.f163893a.hashCode() * 31);
    }
}
