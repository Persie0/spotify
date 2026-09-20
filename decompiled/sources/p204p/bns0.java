package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class bns0 {
    public static final ans0 Companion = new ans0();

    /* JADX INFO: renamed from: a */
    public final String f28919a;

    /* JADX INFO: renamed from: b */
    public final String f28920b;

    public /* synthetic */ bns0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28919a = null;
        } else {
            this.f28919a = str;
        }
        if ((i & 2) == 0) {
            this.f28920b = null;
        } else {
            this.f28920b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bns0)) {
            return false;
        }
        bns0 bns0Var = (bns0) obj;
        return wj50.m88271j(this.f28919a, bns0Var.f28919a) && wj50.m88271j(this.f28920b, bns0Var.f28920b);
    }

    public final int hashCode() {
        String str = this.f28919a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28920b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
