package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class g4y {

    /* JADX INFO: renamed from: a */
    public final String f76548a;

    /* JADX INFO: renamed from: b */
    public final List f76549b;

    /* JADX INFO: renamed from: c */
    public final int f76550c;

    /* JADX INFO: renamed from: d */
    public final int f76551d;

    public g4y(String str, int i, int i2, List list) {
        this.f76548a = str;
        this.f76549b = list;
        this.f76550c = i;
        this.f76551d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4y)) {
            return false;
        }
        g4y g4yVar = (g4y) obj;
        return wj50.m88271j(this.f76548a, g4yVar.f76548a) && wj50.m88271j(this.f76549b, g4yVar.f76549b) && this.f76550c == g4yVar.f76550c && this.f76551d == g4yVar.f76551d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76551d) + mt60.m62800g(this.f76550c, s571.m77244c(this.f76548a.hashCode() * 31, 31, this.f76549b), 31);
    }
}
