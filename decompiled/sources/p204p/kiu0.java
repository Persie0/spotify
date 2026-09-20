package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kiu0 {

    /* JADX INFO: renamed from: a */
    public final String f123096a;

    /* JADX INFO: renamed from: b */
    public final String f123097b;

    /* JADX INFO: renamed from: c */
    public final voc1 f123098c;

    public kiu0(String str, String str2, voc1 voc1Var) {
        this.f123096a = str;
        this.f123097b = str2;
        this.f123098c = voc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiu0)) {
            return false;
        }
        kiu0 kiu0Var = (kiu0) obj;
        return wj50.m88271j(this.f123096a, kiu0Var.f123096a) && wj50.m88271j(this.f123097b, kiu0Var.f123097b) && wj50.m88271j(this.f123098c, kiu0Var.f123098c);
    }

    public final int hashCode() {
        return this.f123098c.f243453a.hashCode() + s571.m77243b(this.f123096a.hashCode() * 31, 31, this.f123097b);
    }
}
