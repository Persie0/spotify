package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oz10 {

    /* JADX INFO: renamed from: a */
    public final List f171926a;

    /* JADX INFO: renamed from: b */
    public final List f171927b;

    public oz10(List list, List list2) {
        this.f171926a = list;
        this.f171927b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz10)) {
            return false;
        }
        oz10 oz10Var = (oz10) obj;
        return wj50.m88271j(this.f171926a, oz10Var.f171926a) && wj50.m88271j(this.f171927b, oz10Var.f171927b);
    }

    public final int hashCode() {
        return this.f171927b.hashCode() + (this.f171926a.hashCode() * 31);
    }
}
