package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jxk {

    /* JADX INFO: renamed from: a */
    public final String f117149a;

    /* JADX INFO: renamed from: b */
    public final boolean f117150b;

    public jxk(String str, boolean z) {
        this.f117149a = str;
        this.f117150b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxk)) {
            return false;
        }
        jxk jxkVar = (jxk) obj;
        return wj50.m88271j(this.f117149a, jxkVar.f117149a) && this.f117150b == jxkVar.f117150b;
    }

    public final int hashCode() {
        String str = this.f117149a;
        return Boolean.hashCode(this.f117150b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
