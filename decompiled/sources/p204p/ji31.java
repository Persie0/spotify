package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ji31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final String f112634a;

    /* JADX INFO: renamed from: b */
    public final boolean f112635b;

    public ji31(String str, boolean z) {
        this.f112634a = str;
        this.f112635b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji31)) {
            return false;
        }
        ji31 ji31Var = (ji31) obj;
        return this.f112634a.equals(ji31Var.f112634a) && this.f112635b == ji31Var.f112635b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112635b) + (this.f112634a.hashCode() * 31);
    }
}
