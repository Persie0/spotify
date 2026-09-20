package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class gzm0 implements he41 {

    /* JADX INFO: renamed from: e */
    public static final dx00 f85987e = new dx00(5);

    /* JADX INFO: renamed from: a */
    public final String f85988a;

    /* JADX INFO: renamed from: b */
    public final Map f85989b;

    /* JADX INFO: renamed from: c */
    public final String f85990c;

    /* JADX INFO: renamed from: d */
    public final String f85991d;

    public gzm0(Map map, String str, String str2, String str3) {
        this.f85988a = str;
        this.f85989b = map;
        this.f85990c = str2;
        this.f85991d = str3;
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
        if (!(obj instanceof gzm0)) {
            return false;
        }
        gzm0 gzm0Var = (gzm0) obj;
        return wj50.m88271j(this.f85988a, gzm0Var.f85988a) && wj50.m88271j(this.f85989b, gzm0Var.f85989b) && wj50.m88271j(this.f85990c, gzm0Var.f85990c) && wj50.m88271j(this.f85991d, gzm0Var.f85991d);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f85987e;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(this.f85988a.hashCode() * 31, 31, this.f85989b);
        String str = this.f85990c;
        return this.f85991d.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
