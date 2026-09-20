package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qo0 {

    /* JADX INFO: renamed from: a */
    public final String f190730a;

    /* JADX INFO: renamed from: b */
    public final boolean f190731b;

    public qo0(String str, boolean z) {
        this.f190730a = str;
        this.f190731b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo0)) {
            return false;
        }
        qo0 qo0Var = (qo0) obj;
        return wj50.m88271j(this.f190730a, qo0Var.f190730a) && this.f190731b == qo0Var.f190731b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190731b) + (this.f190730a.hashCode() * 31);
    }
}
