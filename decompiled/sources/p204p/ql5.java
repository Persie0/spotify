package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ql5 {

    /* JADX INFO: renamed from: a */
    public final String f189735a;

    /* JADX INFO: renamed from: b */
    public final vda1 f189736b;

    /* JADX INFO: renamed from: c */
    public final List f189737c;

    public ql5(String str, List list, vda1 vda1Var) {
        this.f189735a = str;
        this.f189736b = vda1Var;
        this.f189737c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql5)) {
            return false;
        }
        ql5 ql5Var = (ql5) obj;
        return wj50.m88271j(this.f189735a, ql5Var.f189735a) && wj50.m88271j(this.f189736b, ql5Var.f189736b) && wj50.m88271j(this.f189737c, ql5Var.f189737c);
    }

    public final int hashCode() {
        return this.f189737c.hashCode() + ((this.f189736b.hashCode() + (this.f189735a.hashCode() * 31)) * 31);
    }
}
