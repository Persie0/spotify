package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class fxl {

    /* JADX INFO: renamed from: a */
    public final String f74388a;

    /* JADX INFO: renamed from: b */
    public final List f74389b;

    /* JADX INFO: renamed from: c */
    public final int f74390c;

    public fxl(String str, int i, List list) {
        this.f74388a = str;
        this.f74389b = list;
        this.f74390c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxl)) {
            return false;
        }
        fxl fxlVar = (fxl) obj;
        return wj50.m88271j(this.f74388a, fxlVar.f74388a) && wj50.m88271j(this.f74389b, fxlVar.f74389b) && this.f74390c == fxlVar.f74390c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f74390c) + s571.m77244c(this.f74388a.hashCode() * 31, 31, this.f74389b);
    }
}
