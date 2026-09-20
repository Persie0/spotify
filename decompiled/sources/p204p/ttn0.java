package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ttn0 implements he41 {

    /* JADX INFO: renamed from: e */
    public static final dx00 f223645e = new dx00(16);

    /* JADX INFO: renamed from: a */
    public final String f223646a;

    /* JADX INFO: renamed from: b */
    public final Map f223647b;

    /* JADX INFO: renamed from: c */
    public final String f223648c;

    /* JADX INFO: renamed from: d */
    public final String f223649d;

    public ttn0(Map map, String str, String str2, String str3) {
        this.f223646a = str;
        this.f223647b = map;
        this.f223648c = str2;
        this.f223649d = str3;
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
        if (!(obj instanceof ttn0)) {
            return false;
        }
        ttn0 ttn0Var = (ttn0) obj;
        return wj50.m88271j(this.f223646a, ttn0Var.f223646a) && wj50.m88271j(this.f223647b, ttn0Var.f223647b) && wj50.m88271j(this.f223648c, ttn0Var.f223648c) && wj50.m88271j(this.f223649d, ttn0Var.f223649d);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f223645e;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(this.f223646a.hashCode() * 31, 31, this.f223647b);
        String str = this.f223648c;
        return this.f223649d.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
