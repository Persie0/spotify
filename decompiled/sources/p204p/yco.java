package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class yco {

    /* JADX INFO: renamed from: a */
    public final List f271534a;

    /* JADX INFO: renamed from: b */
    public final qu80 f271535b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f271536c;

    public yco(List list, qu80 qu80Var, ArrayList arrayList) {
        this.f271534a = list;
        this.f271535b = qu80Var;
        this.f271536c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yco)) {
            return false;
        }
        yco ycoVar = (yco) obj;
        return wj50.m88271j(this.f271534a, ycoVar.f271534a) && wj50.m88271j(this.f271535b, ycoVar.f271535b) && this.f271536c.equals(ycoVar.f271536c);
    }

    public final int hashCode() {
        return this.f271536c.hashCode() + ((this.f271535b.hashCode() + (this.f271534a.hashCode() * 31)) * 31);
    }
}
