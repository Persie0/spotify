package p204p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ffr {

    /* JADX INFO: renamed from: a */
    public final Set f69071a;

    /* JADX INFO: renamed from: b */
    public final w3p0 f69072b;

    /* JADX INFO: renamed from: c */
    public final boolean f69073c;

    /* JADX INFO: renamed from: d */
    public final Long f69074d;

    /* JADX INFO: renamed from: e */
    public final Long f69075e;

    /* JADX INFO: renamed from: f */
    public final Map f69076f;

    /* JADX INFO: renamed from: g */
    public final boolean f69077g;

    public ffr(Set set, w3p0 w3p0Var, boolean z, Long l, Long l2, Map map, boolean z2) {
        this.f69071a = set;
        this.f69072b = w3p0Var;
        this.f69073c = z;
        this.f69074d = l;
        this.f69075e = l2;
        this.f69076f = map;
        this.f69077g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static ffr m41555a(ffr ffrVar, Set set, w3p0 w3p0Var, boolean z, Long l, Long l2, Map map, boolean z2, int i) {
        if ((i & 1) != 0) {
            set = ffrVar.f69071a;
        }
        Set set2 = set;
        if ((i & 2) != 0) {
            w3p0Var = ffrVar.f69072b;
        }
        w3p0 w3p0Var2 = w3p0Var;
        if ((i & 4) != 0) {
            z = ffrVar.f69073c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            l = ffrVar.f69074d;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = ffrVar.f69075e;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            map = ffrVar.f69076f;
        }
        Map map2 = map;
        if ((i & 64) != 0) {
            z2 = ffrVar.f69077g;
        }
        ffrVar.getClass();
        return new ffr(set2, w3p0Var2, z3, l3, l4, map2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffr)) {
            return false;
        }
        ffr ffrVar = (ffr) obj;
        return wj50.m88271j(this.f69071a, ffrVar.f69071a) && wj50.m88271j(this.f69072b, ffrVar.f69072b) && this.f69073c == ffrVar.f69073c && wj50.m88271j(this.f69074d, ffrVar.f69074d) && wj50.m88271j(this.f69075e, ffrVar.f69075e) && wj50.m88271j(this.f69076f, ffrVar.f69076f) && this.f69077g == ffrVar.f69077g;
    }

    public final int hashCode() {
        int iHashCode = this.f69071a.hashCode() * 31;
        w3p0 w3p0Var = this.f69072b;
        int iM77245d = s571.m77245d((iHashCode + (w3p0Var == null ? 0 : w3p0Var.hashCode())) * 31, 31, this.f69073c);
        Long l = this.f69074d;
        int iHashCode2 = (iM77245d + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f69075e;
        return Boolean.hashCode(this.f69077g) + edb.m38557f((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f69076f);
    }
}
