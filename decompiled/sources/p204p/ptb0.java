package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class ptb0 {
    public static final otb0 Companion = new otb0();

    /* JADX INFO: renamed from: a */
    public final String f181096a;

    /* JADX INFO: renamed from: b */
    public final String f181097b;

    public /* synthetic */ ptb0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, ntb0.f158042a.getDescriptor());
            throw null;
        }
        this.f181096a = str;
        this.f181097b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptb0)) {
            return false;
        }
        ptb0 ptb0Var = (ptb0) obj;
        return wj50.m88271j(this.f181096a, ptb0Var.f181096a) && wj50.m88271j(this.f181097b, ptb0Var.f181097b);
    }

    public final int hashCode() {
        return this.f181097b.hashCode() + (this.f181096a.hashCode() * 31);
    }

    public ptb0(String str, String str2) {
        this.f181096a = str;
        this.f181097b = str2;
    }
}
