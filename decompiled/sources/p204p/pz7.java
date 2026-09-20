package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pz7 extends u3l {

    /* JADX INFO: renamed from: a */
    public final List f183620a;

    /* JADX INFO: renamed from: b */
    public final q3l f183621b;

    /* JADX INFO: renamed from: c */
    public final i3l f183622c;

    /* JADX INFO: renamed from: d */
    public final r3l f183623d;

    /* JADX INFO: renamed from: e */
    public final List f183624e;

    public pz7(List list, tz7 tz7Var, i3l i3lVar, vz7 vz7Var, List list2) {
        this.f183620a = list;
        this.f183621b = tz7Var;
        this.f183622c = i3lVar;
        this.f183623d = vz7Var;
        this.f183624e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u3l) {
            u3l u3lVar = (u3l) obj;
            List list = this.f183620a;
            if (list != null ? list.equals(((pz7) u3lVar).f183620a) : ((pz7) u3lVar).f183620a == null) {
                q3l q3lVar = this.f183621b;
                if (q3lVar != null ? q3lVar.equals(((pz7) u3lVar).f183621b) : ((pz7) u3lVar).f183621b == null) {
                    i3l i3lVar = this.f183622c;
                    if (i3lVar != null ? i3lVar.equals(((pz7) u3lVar).f183622c) : ((pz7) u3lVar).f183622c == null) {
                        pz7 pz7Var = (pz7) u3lVar;
                        if (this.f183623d.equals(pz7Var.f183623d) && this.f183624e.equals(pz7Var.f183624e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f183620a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        q3l q3lVar = this.f183621b;
        int iHashCode2 = (iHashCode ^ (q3lVar == null ? 0 : q3lVar.hashCode())) * 1000003;
        i3l i3lVar = this.f183622c;
        return (((((i3lVar != null ? i3lVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f183623d.hashCode()) * 1000003) ^ this.f183624e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f183620a + ", exception=" + this.f183621b + ", appExitInfo=" + this.f183622c + ", signal=" + this.f183623d + ", binaries=" + this.f183624e + "}";
    }
}
