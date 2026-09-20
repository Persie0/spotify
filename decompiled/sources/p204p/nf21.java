package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class nf21 implements pf21 {

    /* JADX INFO: renamed from: a */
    public final int f153232a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f153233b;

    public nf21(int i, ArrayList arrayList) {
        this.f153232a = i;
        this.f153233b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf21)) {
            return false;
        }
        nf21 nf21Var = (nf21) obj;
        return this.f153232a == nf21Var.f153232a && this.f153233b.equals(nf21Var.f153233b);
    }

    public final int hashCode() {
        return this.f153233b.hashCode() + (Integer.hashCode(this.f153232a) * 31);
    }
}
