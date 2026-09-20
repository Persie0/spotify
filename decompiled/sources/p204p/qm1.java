package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qm1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f190004a;

    /* JADX INFO: renamed from: b */
    public final boolean f190005b;

    public qm1(String str, boolean z) {
        this.f190004a = str;
        this.f190005b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm1)) {
            return false;
        }
        qm1 qm1Var = (qm1) obj;
        return wj50.m88271j(this.f190004a, qm1Var.f190004a) && this.f190005b == qm1Var.f190005b;
    }

    public final int hashCode() {
        return s571.m77245d(this.f190004a.hashCode() * 31, 31, this.f190005b);
    }
}
