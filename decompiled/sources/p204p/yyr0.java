package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yyr0 extends zzr0 {

    /* JADX INFO: renamed from: a */
    public final String f277563a;

    /* JADX INFO: renamed from: b */
    public final String f277564b;

    public yyr0(String str, String str2) {
        this.f277563a = str;
        this.f277564b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyr0)) {
            return false;
        }
        yyr0 yyr0Var = (yyr0) obj;
        return wj50.m88271j(this.f277563a, yyr0Var.f277563a) && wj50.m88271j(this.f277564b, yyr0Var.f277564b);
    }

    public final int hashCode() {
        return this.f277564b.hashCode() + (this.f277563a.hashCode() * 31);
    }
}
