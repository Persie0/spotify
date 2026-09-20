package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b9n0 extends c9n0 {

    /* JADX INFO: renamed from: a */
    public final String f24979a;

    public b9n0(String str) {
        this.f24979a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9n0) && wj50.m88271j(this.f24979a, ((b9n0) obj).f24979a);
    }

    public final int hashCode() {
        return this.f24979a.hashCode();
    }

    public final String toString() {
        return "RemoteVerifyPassword()";
    }
}
