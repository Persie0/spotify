package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lme extends kme {

    /* JADX INFO: renamed from: a */
    public final int f134952a;

    /* JADX INFO: renamed from: b */
    public final String f134953b;

    public lme(int i, String str) {
        this.f134952a = i;
        this.f134953b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lme)) {
            return false;
        }
        lme lmeVar = (lme) obj;
        return this.f134952a == lmeVar.f134952a && wj50.m88271j(this.f134953b, lmeVar.f134953b);
    }

    public final int hashCode() {
        return this.f134953b.hashCode() + (Integer.hashCode(this.f134952a) * 31);
    }
}
