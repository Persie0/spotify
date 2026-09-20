package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mpo implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f146055a;

    public mpo(String str) {
        this.f146055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpo) && wj50.m88271j(this.f146055a, ((mpo) obj).f146055a);
    }

    public final int hashCode() {
        return this.f146055a.hashCode();
    }
}
