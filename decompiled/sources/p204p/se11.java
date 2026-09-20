package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class se11 implements ze11 {

    /* JADX INFO: renamed from: a */
    public final String f208169a;

    public se11(String str) {
        this.f208169a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se11) && wj50.m88271j(this.f208169a, ((se11) obj).f208169a);
    }

    public final int hashCode() {
        return this.f208169a.hashCode();
    }
}
