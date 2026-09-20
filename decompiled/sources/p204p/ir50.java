package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ir50 {

    /* JADX INFO: renamed from: a */
    public final String f104921a;

    /* JADX INFO: renamed from: b */
    public final List f104922b;

    public ir50(String str, ae50 ae50Var) {
        this.f104921a = str;
        this.f104922b = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir50)) {
            return false;
        }
        ir50 ir50Var = (ir50) obj;
        return wj50.m88271j(this.f104921a, ir50Var.f104921a) && wj50.m88271j(this.f104922b, ir50Var.f104922b);
    }

    public final int hashCode() {
        return this.f104922b.hashCode() + (this.f104921a.hashCode() * 31);
    }
}
