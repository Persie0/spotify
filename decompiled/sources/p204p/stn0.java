package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class stn0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f213937d = new dx00(15);

    /* JADX INFO: renamed from: a */
    public final Map f213938a;

    /* JADX INFO: renamed from: b */
    public final String f213939b;

    /* JADX INFO: renamed from: c */
    public final String f213940c;

    public stn0(String str, String str2, Map map) {
        this.f213938a = map;
        this.f213939b = str;
        this.f213940c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stn0)) {
            return false;
        }
        stn0 stn0Var = (stn0) obj;
        return wj50.m88271j(this.f213938a, stn0Var.f213938a) && wj50.m88271j(this.f213939b, stn0Var.f213939b) && wj50.m88271j(this.f213940c, stn0Var.f213940c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f213937d;
    }

    public final int hashCode() {
        int iHashCode = this.f213938a.hashCode() * 31;
        String str = this.f213939b;
        return this.f213940c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
