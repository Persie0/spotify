package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pii0 {

    /* JADX INFO: renamed from: a */
    public final String f177973a;

    /* JADX INFO: renamed from: b */
    public final String f177974b;

    /* JADX INFO: renamed from: c */
    public final int f177975c;

    public pii0(String str, String str2, int i) {
        this.f177973a = str;
        this.f177974b = str2;
        this.f177975c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pii0)) {
            return false;
        }
        pii0 pii0Var = (pii0) obj;
        return wj50.m88271j(this.f177973a, pii0Var.f177973a) && this.f177974b.equals(pii0Var.f177974b) && this.f177975c == pii0Var.f177975c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f177975c) + s571.m77243b(this.f177973a.hashCode() * 31, 31, this.f177974b);
    }
}
