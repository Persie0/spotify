package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class iop0 {

    /* JADX INFO: renamed from: a */
    public final String f104267a;

    /* JADX INFO: renamed from: b */
    public final Object f104268b;

    /* JADX INFO: renamed from: c */
    public final boolean f104269c;

    /* JADX INFO: renamed from: d */
    public final boolean f104270d;

    public iop0(List list, boolean z, String str, boolean z2) {
        this.f104267a = str;
        this.f104268b = list;
        this.f104269c = z;
        this.f104270d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iop0)) {
            return false;
        }
        iop0 iop0Var = (iop0) obj;
        return wj50.m88271j(this.f104267a, iop0Var.f104267a) && this.f104268b.equals(iop0Var.f104268b) && this.f104269c == iop0Var.f104269c && this.f104270d == iop0Var.f104270d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104270d) + s571.m77245d(dq60.m36604d(this.f104267a.hashCode() * 31, 31, this.f104268b), 31, this.f104269c);
    }
}
