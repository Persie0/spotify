package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pjt implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f178309a;

    /* JADX INFO: renamed from: b */
    public final d850 f178310b;

    public pjt(String str, d850 d850Var) {
        this.f178309a = str;
        this.f178310b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjt)) {
            return false;
        }
        pjt pjtVar = (pjt) obj;
        return wj50.m88271j(this.f178309a, pjtVar.f178309a) && wj50.m88271j(this.f178310b, pjtVar.f178310b);
    }

    public final int hashCode() {
        return this.f178310b.hashCode() + (this.f178309a.hashCode() * 31);
    }
}
