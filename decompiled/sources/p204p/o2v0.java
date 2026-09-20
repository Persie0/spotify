package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class o2v0 {

    /* JADX INFO: renamed from: a */
    public final boolean f161155a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f161156b;

    public o2v0(ArrayList arrayList, boolean z) {
        this.f161155a = z;
        this.f161156b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2v0)) {
            return false;
        }
        o2v0 o2v0Var = (o2v0) obj;
        return this.f161155a == o2v0Var.f161155a && this.f161156b.equals(o2v0Var.f161156b);
    }

    public final int hashCode() {
        return this.f161156b.hashCode() + (Boolean.hashCode(this.f161155a) * 31);
    }
}
