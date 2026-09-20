package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wt60 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f254864a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f254865b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f254866c;

    public wt60(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f254864a = arrayList;
        this.f254865b = arrayList2;
        this.f254866c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt60)) {
            return false;
        }
        wt60 wt60Var = (wt60) obj;
        return this.f254864a.equals(wt60Var.f254864a) && this.f254865b.equals(wt60Var.f254865b) && this.f254866c.equals(wt60Var.f254866c);
    }

    public final int hashCode() {
        return this.f254866c.hashCode() + lq51.m59700f(this.f254865b, this.f254864a.hashCode() * 31, 31);
    }
}
