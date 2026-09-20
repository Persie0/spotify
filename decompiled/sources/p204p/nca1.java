package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nca1 {

    /* JADX INFO: renamed from: a */
    public final String f152482a;

    /* JADX INFO: renamed from: b */
    public final String f152483b;

    /* JADX INFO: renamed from: c */
    public final boolean f152484c;

    public nca1(String str, String str2, boolean z) {
        this.f152482a = str;
        this.f152483b = str2;
        this.f152484c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nca1)) {
            return false;
        }
        nca1 nca1Var = (nca1) obj;
        return wj50.m88271j(this.f152482a, nca1Var.f152482a) && wj50.m88271j(this.f152483b, nca1Var.f152483b) && this.f152484c == nca1Var.f152484c;
    }

    public final int hashCode() {
        int iHashCode = this.f152482a.hashCode() * 31;
        String str = this.f152483b;
        return Boolean.hashCode(this.f152484c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
