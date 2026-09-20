package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class eu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f62916d = new ak0(8);

    /* JADX INFO: renamed from: a */
    public final Map f62917a;

    /* JADX INFO: renamed from: b */
    public final String f62918b;

    /* JADX INFO: renamed from: c */
    public final String f62919c;

    public eu9(String str, String str2, Map map) {
        this.f62917a = map;
        this.f62918b = str;
        this.f62919c = str2;
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
        if (!(obj instanceof eu9)) {
            return false;
        }
        eu9 eu9Var = (eu9) obj;
        return wj50.m88271j(this.f62917a, eu9Var.f62917a) && wj50.m88271j(this.f62918b, eu9Var.f62918b) && wj50.m88271j(this.f62919c, eu9Var.f62919c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f62916d;
    }

    public final int hashCode() {
        int iHashCode = this.f62917a.hashCode() * 31;
        String str = this.f62918b;
        return this.f62919c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
