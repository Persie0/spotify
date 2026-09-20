package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qwc implements zwc {

    /* JADX INFO: renamed from: a */
    public final String f193325a;

    /* JADX INFO: renamed from: b */
    public final boolean f193326b;

    public qwc(String str, boolean z) {
        this.f193325a = str;
        this.f193326b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwc)) {
            return false;
        }
        qwc qwcVar = (qwc) obj;
        return wj50.m88271j(this.f193325a, qwcVar.f193325a) && this.f193326b == qwcVar.f193326b;
    }

    public final int hashCode() {
        String str = this.f193325a;
        return Boolean.hashCode(this.f193326b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
