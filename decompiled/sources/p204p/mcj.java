package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mcj {

    /* JADX INFO: renamed from: a */
    public final String f142169a;

    /* JADX INFO: renamed from: b */
    public final String f142170b;

    public mcj(String str, String str2) {
        this.f142169a = str;
        this.f142170b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcj)) {
            return false;
        }
        mcj mcjVar = (mcj) obj;
        return wj50.m88271j(this.f142169a, mcjVar.f142169a) && wj50.m88271j(this.f142170b, mcjVar.f142170b);
    }

    public final int hashCode() {
        return this.f142170b.hashCode() + (this.f142169a.hashCode() * 31);
    }
}
