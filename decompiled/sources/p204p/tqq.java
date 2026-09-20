package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tqq extends uqq {

    /* JADX INFO: renamed from: a */
    public final String f222866a;

    /* JADX INFO: renamed from: b */
    public final String f222867b;

    public tqq(String str, String str2) {
        this.f222866a = str;
        this.f222867b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqq)) {
            return false;
        }
        tqq tqqVar = (tqq) obj;
        return wj50.m88271j(this.f222866a, tqqVar.f222866a) && wj50.m88271j(this.f222867b, tqqVar.f222867b);
    }

    public final int hashCode() {
        return this.f222867b.hashCode() + (this.f222866a.hashCode() * 31);
    }
}
