package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class guo0 {

    /* JADX INFO: renamed from: a */
    public final String f84518a;

    /* JADX INFO: renamed from: b */
    public final String f84519b;

    public guo0(String str, String str2) {
        this.f84518a = str;
        this.f84519b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guo0)) {
            return false;
        }
        guo0 guo0Var = (guo0) obj;
        return wj50.m88271j(this.f84518a, guo0Var.f84518a) && wj50.m88271j(this.f84519b, guo0Var.f84519b);
    }

    public final int hashCode() {
        return ((this.f84519b.hashCode() + (this.f84518a.hashCode() * 31)) * 31) - 14090548;
    }
}
