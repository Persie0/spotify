package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tge1 implements zge1 {

    /* JADX INFO: renamed from: a */
    public final String f220179a;

    /* JADX INFO: renamed from: b */
    public final s7f f220180b;

    public tge1(String str, s7f s7fVar) {
        this.f220179a = str;
        this.f220180b = s7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tge1)) {
            return false;
        }
        tge1 tge1Var = (tge1) obj;
        return wj50.m88271j(this.f220179a, tge1Var.f220179a) && wj50.m88271j(this.f220180b, tge1Var.f220180b);
    }

    public final int hashCode() {
        return this.f220180b.hashCode() + (this.f220179a.hashCode() * 31);
    }
}
