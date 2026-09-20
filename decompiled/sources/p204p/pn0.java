package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class pn0 implements qn0 {

    /* JADX INFO: renamed from: a */
    public final String f179272a;

    /* JADX INFO: renamed from: b */
    public final List f179273b;

    public pn0(String str, List list) {
        this.f179272a = str;
        this.f179273b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn0)) {
            return false;
        }
        pn0 pn0Var = (pn0) obj;
        return wj50.m88271j(this.f179272a, pn0Var.f179272a) && wj50.m88271j(this.f179273b, pn0Var.f179273b);
    }

    public final int hashCode() {
        String str = this.f179272a;
        return this.f179273b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
