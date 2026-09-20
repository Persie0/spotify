package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class bve0 extends ho01 {

    /* JADX INFO: renamed from: a */
    public final String f31343a;

    /* JADX INFO: renamed from: b */
    public final String f31344b;

    /* JADX INFO: renamed from: c */
    public final String f31345c;

    /* JADX INFO: renamed from: d */
    public final String f31346d;

    /* JADX INFO: renamed from: e */
    public final k1b1 f31347e;

    /* JADX INFO: renamed from: f */
    public final Map f31348f;

    public bve0(String str, String str2, String str3, String str4, k1b1 k1b1Var, Map map) {
        this.f31343a = str;
        this.f31344b = str2;
        this.f31345c = str3;
        this.f31346d = str4;
        this.f31347e = k1b1Var;
        this.f31348f = map;
    }

    @Override // p204p.ho01
    /* JADX INFO: renamed from: b */
    public final String mo26481b() {
        return this.f31346d;
    }

    @Override // p204p.ho01
    /* JADX INFO: renamed from: c */
    public final String mo26482c() {
        return this.f31343a;
    }

    @Override // p204p.ho01
    /* JADX INFO: renamed from: d */
    public final Map mo26483d() {
        return this.f31348f;
    }

    @Override // p204p.ho01
    /* JADX INFO: renamed from: e */
    public final k1b1 mo26484e() {
        return this.f31347e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bve0)) {
            return false;
        }
        bve0 bve0Var = (bve0) obj;
        return wj50.m88271j(this.f31343a, bve0Var.f31343a) && wj50.m88271j(this.f31344b, bve0Var.f31344b) && wj50.m88271j(this.f31345c, bve0Var.f31345c) && wj50.m88271j(this.f31346d, bve0Var.f31346d) && wj50.m88271j(this.f31347e, bve0Var.f31347e) && wj50.m88271j(this.f31348f, bve0Var.f31348f);
    }

    public final int hashCode() {
        int iHashCode = this.f31343a.hashCode() * 31;
        String str = this.f31344b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f31345c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31346d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k1b1 k1b1Var = this.f31347e;
        return this.f31348f.hashCode() + ((iHashCode4 + (k1b1Var != null ? k1b1Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ bve0(String str, String str2, Map map) {
        this(str, str2, null, null, null, map);
    }
}
