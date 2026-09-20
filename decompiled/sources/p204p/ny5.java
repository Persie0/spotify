package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ny5 {

    /* JADX INFO: renamed from: a */
    public final String f159709a;

    /* JADX INFO: renamed from: b */
    public final int f159710b;

    /* JADX INFO: renamed from: c */
    public final int f159711c;

    /* JADX INFO: renamed from: d */
    public final String f159712d;

    /* JADX INFO: renamed from: e */
    public final String f159713e;

    /* JADX INFO: renamed from: f */
    public final List f159714f;

    public ny5(String str, int i, int i2, String str2, String str3, List list) {
        this.f159709a = str;
        this.f159710b = i;
        this.f159711c = i2;
        this.f159712d = str2;
        this.f159713e = str3;
        this.f159714f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny5)) {
            return false;
        }
        ny5 ny5Var = (ny5) obj;
        return wj50.m88271j(this.f159709a, ny5Var.f159709a) && this.f159710b == ny5Var.f159710b && this.f159711c == ny5Var.f159711c && wj50.m88271j(this.f159712d, ny5Var.f159712d) && wj50.m88271j(this.f159713e, ny5Var.f159713e) && wj50.m88271j(this.f159714f, ny5Var.f159714f);
    }

    public final int hashCode() {
        return this.f159714f.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f159711c, mt60.m62800g(this.f159710b, this.f159709a.hashCode() * 31, 31), 31), 31, this.f159712d), 31, this.f159713e);
    }
}
