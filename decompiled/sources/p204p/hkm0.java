package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hkm0 {

    /* JADX INFO: renamed from: a */
    public final String f92456a;

    /* JADX INFO: renamed from: b */
    public final String f92457b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f92458c;

    public hkm0(String str, String str2, ArrayList arrayList) {
        this.f92456a = str;
        this.f92457b = str2;
        this.f92458c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkm0)) {
            return false;
        }
        hkm0 hkm0Var = (hkm0) obj;
        return this.f92456a.equals(hkm0Var.f92456a) && this.f92457b.equals(hkm0Var.f92457b) && this.f92458c.equals(hkm0Var.f92458c);
    }

    public final int hashCode() {
        return this.f92458c.hashCode() + s571.m77243b(this.f92456a.hashCode() * 31, 31, this.f92457b);
    }
}
