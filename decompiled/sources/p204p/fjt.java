package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fjt {

    /* JADX INFO: renamed from: a */
    public final String f70400a;

    /* JADX INFO: renamed from: b */
    public final boolean f70401b;

    public fjt(String str, boolean z) {
        this.f70400a = str;
        this.f70401b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjt)) {
            return false;
        }
        fjt fjtVar = (fjt) obj;
        return wj50.m88271j(this.f70400a, fjtVar.f70400a) && this.f70401b == fjtVar.f70401b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70401b) + (this.f70400a.hashCode() * 31);
    }
}
