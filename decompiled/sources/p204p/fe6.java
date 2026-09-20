package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fe6 {

    /* JADX INFO: renamed from: a */
    public final String f68692a;

    /* JADX INFO: renamed from: b */
    public final List f68693b;

    /* JADX INFO: renamed from: c */
    public final int f68694c;

    /* JADX INFO: renamed from: d */
    public final boolean f68695d;

    public fe6(String str, AbstractC2524w8 abstractC2524w8, int i, boolean z) {
        this.f68692a = str;
        this.f68693b = abstractC2524w8;
        this.f68694c = i;
        this.f68695d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe6)) {
            return false;
        }
        fe6 fe6Var = (fe6) obj;
        return wj50.m88271j(this.f68692a, fe6Var.f68692a) && wj50.m88271j(this.f68693b, fe6Var.f68693b) && this.f68694c == fe6Var.f68694c && this.f68695d == fe6Var.f68695d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68695d) + mt60.m62800g(this.f68694c, s571.m77244c(this.f68692a.hashCode() * 31, 31, this.f68693b), 31);
    }
}
