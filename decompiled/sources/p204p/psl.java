package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class psl {

    /* JADX INFO: renamed from: a */
    public final ArrayList f180888a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f180889b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f180890c;

    public psl(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f180888a = arrayList;
        this.f180889b = arrayList2;
        this.f180890c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psl)) {
            return false;
        }
        psl pslVar = (psl) obj;
        return this.f180888a.equals(pslVar.f180888a) && this.f180889b.equals(pslVar.f180889b) && this.f180890c.equals(pslVar.f180890c);
    }

    public final int hashCode() {
        return this.f180890c.hashCode() + lq51.m59700f(this.f180889b, this.f180888a.hashCode() * 31, 31);
    }
}
