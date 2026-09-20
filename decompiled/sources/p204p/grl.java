package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class grl implements jrl {

    /* JADX INFO: renamed from: a */
    public final int f83787a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f83788b;

    /* JADX INFO: renamed from: c */
    public final int f83789c;

    public grl(ArrayList arrayList, int i, int i2) {
        this.f83787a = i;
        this.f83788b = arrayList;
        this.f83789c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grl)) {
            return false;
        }
        grl grlVar = (grl) obj;
        return this.f83787a == grlVar.f83787a && this.f83788b.equals(grlVar.f83788b) && this.f83789c == grlVar.f83789c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f83789c) + lq51.m59700f(this.f83788b, edb.m38547C(this.f83787a) * 31, 31);
    }
}
