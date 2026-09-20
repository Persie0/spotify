package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ptn0 implements he41 {

    /* JADX INFO: renamed from: e */
    public static final dx00 f181203e = new dx00(12);

    /* JADX INFO: renamed from: a */
    public final String f181204a;

    /* JADX INFO: renamed from: b */
    public final Map f181205b;

    /* JADX INFO: renamed from: c */
    public final String f181206c;

    /* JADX INFO: renamed from: d */
    public final String f181207d;

    public ptn0(Map map, String str, String str2, String str3) {
        this.f181204a = str;
        this.f181205b = map;
        this.f181206c = str2;
        this.f181207d = str3;
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
        if (!(obj instanceof ptn0)) {
            return false;
        }
        ptn0 ptn0Var = (ptn0) obj;
        return wj50.m88271j(this.f181204a, ptn0Var.f181204a) && wj50.m88271j(this.f181205b, ptn0Var.f181205b) && wj50.m88271j(this.f181206c, ptn0Var.f181206c) && wj50.m88271j(this.f181207d, ptn0Var.f181207d);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f181203e;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(this.f181204a.hashCode() * 31, 31, this.f181205b);
        String str = this.f181206c;
        return this.f181207d.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
