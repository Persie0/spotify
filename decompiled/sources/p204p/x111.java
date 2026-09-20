package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class x111 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f257032a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f257033b;

    /* JADX INFO: renamed from: c */
    public final d211 f257034c;

    /* JADX INFO: renamed from: d */
    public final d211 f257035d;

    /* JADX INFO: renamed from: e */
    public final d211 f257036e;

    public x111(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, d211 d211Var, d211 d211Var2, d211 d211Var3) {
        this.f257032a = linkedHashMap;
        this.f257033b = linkedHashMap2;
        this.f257034c = d211Var;
        this.f257035d = d211Var2;
        this.f257036e = d211Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x111)) {
            return false;
        }
        x111 x111Var = (x111) obj;
        return this.f257032a.equals(x111Var.f257032a) && this.f257033b.equals(x111Var.f257033b) && wj50.m88271j(this.f257034c, x111Var.f257034c) && wj50.m88271j(this.f257035d, x111Var.f257035d) && wj50.m88271j(this.f257036e, x111Var.f257036e);
    }

    public final int hashCode() {
        int iHashCode = (this.f257034c.hashCode() + ((this.f257033b.hashCode() + (this.f257032a.hashCode() * 31)) * 31)) * 31;
        d211 d211Var = this.f257035d;
        int iHashCode2 = (iHashCode + (d211Var == null ? 0 : d211Var.hashCode())) * 31;
        d211 d211Var2 = this.f257036e;
        return iHashCode2 + (d211Var2 != null ? d211Var2.hashCode() : 0);
    }
}
