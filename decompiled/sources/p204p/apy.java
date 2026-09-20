package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class apy {

    /* JADX INFO: renamed from: a */
    public final String f18031a;

    /* JADX INFO: renamed from: b */
    public final boolean f18032b;

    public apy(String str, boolean z) {
        this.f18031a = str;
        this.f18032b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apy)) {
            return false;
        }
        apy apyVar = (apy) obj;
        return wj50.m88271j(this.f18031a, apyVar.f18031a) && this.f18032b == apyVar.f18032b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18032b) + (this.f18031a.hashCode() * 31);
    }
}
