package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pbe1 {

    /* JADX INFO: renamed from: a */
    public final String f175794a;

    /* JADX INFO: renamed from: b */
    public final String f175795b;

    /* JADX INFO: renamed from: c */
    public final f5u f175796c;

    public pbe1(String str, String str2, f5u f5uVar) {
        this.f175794a = str;
        this.f175795b = str2;
        this.f175796c = f5uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbe1)) {
            return false;
        }
        pbe1 pbe1Var = (pbe1) obj;
        return wj50.m88271j(this.f175794a, pbe1Var.f175794a) && wj50.m88271j(this.f175795b, pbe1Var.f175795b) && wj50.m88271j(this.f175796c, pbe1Var.f175796c);
    }

    public final int hashCode() {
        return this.f175796c.hashCode() + s571.m77243b(this.f175794a.hashCode() * 31, 31, this.f175795b);
    }
}
