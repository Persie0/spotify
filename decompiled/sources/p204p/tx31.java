package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tx31 {

    /* JADX INFO: renamed from: a */
    public final String f224553a;

    /* JADX INFO: renamed from: b */
    public final List f224554b;

    /* JADX INFO: renamed from: c */
    public final int f224555c;

    /* JADX INFO: renamed from: d */
    public final int f224556d;

    public tx31(String str, int i, int i2, List list) {
        this.f224553a = str;
        this.f224554b = list;
        this.f224555c = i;
        this.f224556d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx31)) {
            return false;
        }
        tx31 tx31Var = (tx31) obj;
        return wj50.m88271j(this.f224553a, tx31Var.f224553a) && wj50.m88271j(this.f224554b, tx31Var.f224554b) && this.f224555c == tx31Var.f224555c && this.f224556d == tx31Var.f224556d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f224556d) + mt60.m62800g(this.f224555c, s571.m77244c(this.f224553a.hashCode() * 31, 31, this.f224554b), 31);
    }
}
