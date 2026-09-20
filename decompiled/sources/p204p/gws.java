package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class gws implements jws {

    /* JADX INFO: renamed from: a */
    public final List f85093a;

    /* JADX INFO: renamed from: b */
    public final List f85094b;

    /* JADX INFO: renamed from: c */
    public final List f85095c;

    /* JADX INFO: renamed from: d */
    public final l1g0 f85096d;

    /* JADX INFO: renamed from: e */
    public final bws f85097e;

    public gws(List list, List list2, List list3, l1g0 l1g0Var, bws bwsVar) {
        this.f85093a = list;
        this.f85094b = list2;
        this.f85095c = list3;
        this.f85096d = l1g0Var;
        this.f85097e = bwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gws)) {
            return false;
        }
        gws gwsVar = (gws) obj;
        return wj50.m88271j(this.f85093a, gwsVar.f85093a) && wj50.m88271j(this.f85094b, gwsVar.f85094b) && wj50.m88271j(this.f85095c, gwsVar.f85095c) && this.f85096d.equals(gwsVar.f85096d) && this.f85097e.equals(gwsVar.f85097e);
    }

    public final int hashCode() {
        return this.f85097e.hashCode() + ((this.f85096d.hashCode() + s571.m77244c(s571.m77244c(this.f85093a.hashCode() * 31, 31, this.f85094b), 31, this.f85095c)) * 31);
    }
}
