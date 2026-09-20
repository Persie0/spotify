package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b551 implements d551 {

    /* JADX INFO: renamed from: a */
    public final String f23514a;

    public b551(String str) {
        this.f23514a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b551) && wj50.m88271j(this.f23514a, ((b551) obj).f23514a);
    }

    public final int hashCode() {
        return this.f23514a.hashCode();
    }
}
