package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qk00 {

    /* JADX INFO: renamed from: a */
    public final String f189396a;

    /* JADX INFO: renamed from: b */
    public final wwu f189397b;

    /* JADX INFO: renamed from: c */
    public final int f189398c;

    public qk00(int i, String str, wwu wwuVar) {
        this.f189396a = str;
        this.f189397b = wwuVar;
        this.f189398c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk00)) {
            return false;
        }
        qk00 qk00Var = (qk00) obj;
        return this.f189396a.equals(qk00Var.f189396a) && wj50.m88271j(this.f189397b, qk00Var.f189397b) && this.f189398c == qk00Var.f189398c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f189398c) + ((this.f189397b.hashCode() + (this.f189396a.hashCode() * 31)) * 31);
    }
}
