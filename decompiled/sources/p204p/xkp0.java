package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class xkp0 implements ykp0 {

    /* JADX INFO: renamed from: a */
    public final clp0 f262915a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f262916b;

    public xkp0(clp0 clp0Var, ArrayList arrayList) {
        this.f262915a = clp0Var;
        this.f262916b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkp0)) {
            return false;
        }
        xkp0 xkp0Var = (xkp0) obj;
        return this.f262915a.equals(xkp0Var.f262915a) && this.f262916b.equals(xkp0Var.f262916b);
    }

    @Override // p204p.ykp0
    public final clp0 getSender() {
        return this.f262915a;
    }

    public final int hashCode() {
        return this.f262916b.hashCode() + (this.f262915a.hashCode() * 31);
    }
}
