package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class mfs0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f143169a;

    /* JADX INFO: renamed from: b */
    public final String f143170b;

    /* JADX INFO: renamed from: c */
    public final Set f143171c;

    /* JADX INFO: renamed from: d */
    public final Set f143172d;

    public mfs0(String str, String str2, Set set, Set set2) {
        this.f143169a = str;
        this.f143170b = str2;
        this.f143171c = set;
        this.f143172d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfs0)) {
            return false;
        }
        mfs0 mfs0Var = (mfs0) obj;
        return wj50.m88271j(this.f143169a, mfs0Var.f143169a) && wj50.m88271j(this.f143170b, mfs0Var.f143170b) && wj50.m88271j(this.f143171c, mfs0Var.f143171c) && wj50.m88271j(this.f143172d, mfs0Var.f143172d);
    }

    public final int hashCode() {
        return this.f143172d.hashCode() + klh.m56830b(s571.m77243b(this.f143169a.hashCode() * 31, 31, this.f143170b), 31, this.f143171c);
    }
}
