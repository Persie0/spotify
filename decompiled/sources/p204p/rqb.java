package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rqb {

    /* JADX INFO: renamed from: a */
    public final Object f201789a;

    /* JADX INFO: renamed from: b */
    public final List f201790b;

    public rqb(List list, List list2) {
        this.f201789a = list;
        this.f201790b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqb)) {
            return false;
        }
        rqb rqbVar = (rqb) obj;
        return this.f201789a.equals(rqbVar.f201789a) && this.f201790b.equals(rqbVar.f201790b);
    }

    public final int hashCode() {
        return this.f201790b.hashCode() + (this.f201789a.hashCode() * 31);
    }
}
