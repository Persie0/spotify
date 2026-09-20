package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m8i0 {

    /* JADX INFO: renamed from: a */
    public final String f141056a;

    public m8i0(String str) {
        this.f141056a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8i0) && wj50.m88271j(this.f141056a, ((m8i0) obj).f141056a);
    }

    public final int hashCode() {
        return this.f141056a.hashCode();
    }
}
