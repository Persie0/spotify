package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class c920 {

    /* JADX INFO: renamed from: a */
    public final htl f35373a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f35374b;

    public c920(htl htlVar, ArrayList arrayList) {
        this.f35373a = htlVar;
        this.f35374b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c920)) {
            return false;
        }
        c920 c920Var = (c920) obj;
        return this.f35373a.equals(c920Var.f35373a) && this.f35374b.equals(c920Var.f35374b);
    }

    public final int hashCode() {
        return this.f35374b.hashCode() + (this.f35373a.hashCode() * 31);
    }
}
