package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hmf0 implements imf0 {

    /* JADX INFO: renamed from: a */
    public final String f92975a;

    public hmf0(String str) {
        this.f92975a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmf0) && wj50.m88271j(this.f92975a, ((hmf0) obj).f92975a);
    }

    public final int hashCode() {
        return this.f92975a.hashCode();
    }
}
