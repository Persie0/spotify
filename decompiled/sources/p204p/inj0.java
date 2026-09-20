package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class inj0 {

    /* JADX INFO: renamed from: a */
    public final String f104013a;

    /* JADX INFO: renamed from: b */
    public final boolean f104014b;

    public inj0(String str, boolean z) {
        this.f104013a = str;
        this.f104014b = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m51130a() {
        return this.f104013a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51131b() {
        return this.f104014b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inj0)) {
            return false;
        }
        inj0 inj0Var = (inj0) obj;
        return wj50.m88271j(this.f104013a, inj0Var.f104013a) && this.f104014b == inj0Var.f104014b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104014b) + (this.f104013a.hashCode() * 31);
    }
}
