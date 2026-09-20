package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a4y {

    /* JADX INFO: renamed from: a */
    public final String f12347a;

    /* JADX INFO: renamed from: b */
    public final List f12348b;

    /* JADX INFO: renamed from: c */
    public final int f12349c;

    /* JADX INFO: renamed from: d */
    public final int f12350d;

    public a4y(String str, int i, int i2, List list) {
        this.f12347a = str;
        this.f12348b = list;
        this.f12349c = i;
        this.f12350d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4y)) {
            return false;
        }
        a4y a4yVar = (a4y) obj;
        return wj50.m88271j(this.f12347a, a4yVar.f12347a) && wj50.m88271j(this.f12348b, a4yVar.f12348b) && this.f12349c == a4yVar.f12349c && this.f12350d == a4yVar.f12350d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12350d) + mt60.m62800g(this.f12349c, s571.m77244c(this.f12347a.hashCode() * 31, 31, this.f12348b), 31);
    }
}
