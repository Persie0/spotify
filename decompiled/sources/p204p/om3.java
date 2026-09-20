package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class om3 implements pm3 {

    /* JADX INFO: renamed from: a */
    public final String f166962a;

    public om3(String str) {
        this.f166962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om3) && wj50.m88271j(this.f166962a, ((om3) obj).f166962a);
    }

    public final int hashCode() {
        return this.f166962a.hashCode();
    }
}
