package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class nmb0 {

    /* JADX INFO: renamed from: a */
    public final String f155394a;

    /* JADX INFO: renamed from: b */
    public final List f155395b;

    /* JADX INFO: renamed from: c */
    public final sbb0 f155396c;

    public nmb0(String str, List list, sbb0 sbb0Var) {
        this.f155394a = str;
        this.f155395b = list;
        this.f155396c = sbb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmb0)) {
            return false;
        }
        nmb0 nmb0Var = (nmb0) obj;
        return wj50.m88271j(this.f155394a, nmb0Var.f155394a) && wj50.m88271j(this.f155395b, nmb0Var.f155395b) && wj50.m88271j(this.f155396c, nmb0Var.f155396c);
    }

    public final int hashCode() {
        return this.f155396c.hashCode() + s571.m77244c(this.f155394a.hashCode() * 31, 31, this.f155395b);
    }
}
