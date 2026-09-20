package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class klf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f123887a;

    public klf(String str) {
        this.f123887a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klf) && wj50.m88271j(this.f123887a, ((klf) obj).f123887a);
    }

    public final int hashCode() {
        return this.f123887a.hashCode();
    }
}
