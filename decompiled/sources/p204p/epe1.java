package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class epe1 {

    /* JADX INFO: renamed from: a */
    public final vlu f61636a;

    /* JADX INFO: renamed from: b */
    public final boolean f61637b;

    /* JADX INFO: renamed from: c */
    public final boolean f61638c;

    public epe1(vlu vluVar, boolean z, boolean z2) {
        this.f61636a = vluVar;
        this.f61637b = z;
        this.f61638c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epe1)) {
            return false;
        }
        epe1 epe1Var = (epe1) obj;
        return wj50.m88271j(this.f61636a, epe1Var.f61636a) && this.f61637b == epe1Var.f61637b && this.f61638c == epe1Var.f61638c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f61638c) + s571.m77245d(this.f61636a.hashCode() * 31, 31, this.f61637b);
    }
}
