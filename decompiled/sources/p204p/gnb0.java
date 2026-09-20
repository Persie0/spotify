package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gnb0 {

    /* JADX INFO: renamed from: a */
    public final String f82674a;

    public gnb0(String str) {
        this.f82674a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnb0) && wj50.m88271j(this.f82674a, ((gnb0) obj).f82674a);
    }

    public final int hashCode() {
        return (this.f82674a.hashCode() * 31) - 1386559057;
    }
}
