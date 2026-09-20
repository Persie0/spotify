package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jjo implements kjo {

    /* JADX INFO: renamed from: a */
    public final String f113062a;

    public jjo(String str) {
        this.f113062a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjo) && wj50.m88271j(this.f113062a, ((jjo) obj).f113062a);
    }

    @Override // p204p.kjo
    public final String getMessage() {
        return this.f113062a;
    }

    public final int hashCode() {
        return this.f113062a.hashCode();
    }
}
