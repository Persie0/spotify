package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f193082a;

    /* JADX INFO: renamed from: b */
    public final boolean f193083b;

    public qvq0(String str, boolean z) {
        this.f193082a = str;
        this.f193083b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvq0)) {
            return false;
        }
        qvq0 qvq0Var = (qvq0) obj;
        return wj50.m88271j(this.f193082a, qvq0Var.f193082a) && this.f193083b == qvq0Var.f193083b;
    }

    public final int hashCode() {
        String str = this.f193082a;
        return Boolean.hashCode(this.f193083b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
