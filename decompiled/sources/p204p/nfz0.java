package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nfz0 {

    /* JADX INFO: renamed from: a */
    public final String f153486a;

    /* JADX INFO: renamed from: b */
    public final List f153487b;

    /* JADX INFO: renamed from: c */
    public final int f153488c;

    public nfz0(String str, int i, List list) {
        this.f153486a = str;
        this.f153487b = list;
        this.f153488c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfz0)) {
            return false;
        }
        nfz0 nfz0Var = (nfz0) obj;
        return wj50.m88271j(this.f153486a, nfz0Var.f153486a) && wj50.m88271j(this.f153487b, nfz0Var.f153487b) && this.f153488c == nfz0Var.f153488c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f153488c) + s571.m77244c(this.f153486a.hashCode() * 31, 31, this.f153487b);
    }
}
