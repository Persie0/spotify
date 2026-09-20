package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xib implements cjb {

    /* JADX INFO: renamed from: a */
    public final ArrayList f261841a;

    /* JADX INFO: renamed from: b */
    public final int f261842b;

    public xib(int i, ArrayList arrayList) {
        this.f261841a = arrayList;
        this.f261842b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xib)) {
            return false;
        }
        xib xibVar = (xib) obj;
        return this.f261841a.equals(xibVar.f261841a) && this.f261842b == xibVar.f261842b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f261842b) + (this.f261841a.hashCode() * 31);
    }
}
