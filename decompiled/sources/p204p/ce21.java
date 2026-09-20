package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class ce21 implements vwf {

    /* JADX INFO: renamed from: a */
    public final vwf f37000a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f37001b;

    public ce21(vwf vwfVar, ArrayList arrayList) {
        this.f37000a = vwfVar;
        this.f37001b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce21)) {
            return false;
        }
        ce21 ce21Var = (ce21) obj;
        return wj50.m88271j(this.f37000a, ce21Var.f37000a) && this.f37001b.equals(ce21Var.f37001b);
    }

    public final int hashCode() {
        vwf vwfVar = this.f37000a;
        return this.f37001b.hashCode() + ((vwfVar == null ? 0 : vwfVar.hashCode()) * 31);
    }
}
