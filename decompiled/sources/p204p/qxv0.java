package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qxv0 {

    /* JADX INFO: renamed from: a */
    public final String f193753a;

    /* JADX INFO: renamed from: b */
    public final List f193754b;

    /* JADX INFO: renamed from: c */
    public final uxv0 f193755c;

    public qxv0(String str, List list, uxv0 uxv0Var) {
        this.f193753a = str;
        this.f193754b = list;
        this.f193755c = uxv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxv0)) {
            return false;
        }
        qxv0 qxv0Var = (qxv0) obj;
        return wj50.m88271j(this.f193753a, qxv0Var.f193753a) && wj50.m88271j(this.f193754b, qxv0Var.f193754b) && wj50.m88271j(this.f193755c, qxv0Var.f193755c);
    }

    public final int hashCode() {
        return this.f193755c.hashCode() + s571.m77244c(this.f193753a.hashCode() * 31, 31, this.f193754b);
    }
}
