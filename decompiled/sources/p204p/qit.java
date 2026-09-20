package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qit implements rmt {

    /* JADX INFO: renamed from: a */
    public final String f189067a;

    /* JADX INFO: renamed from: b */
    public final String f189068b;

    public qit(String str, String str2) {
        this.f189067a = str;
        this.f189068b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qit)) {
            return false;
        }
        qit qitVar = (qit) obj;
        return wj50.m88271j(this.f189067a, qitVar.f189067a) && wj50.m88271j(this.f189068b, qitVar.f189068b);
    }

    public final int hashCode() {
        return this.f189068b.hashCode() + (this.f189067a.hashCode() * 31);
    }
}
