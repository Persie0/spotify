package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b3s {

    /* JADX INFO: renamed from: a */
    public final String f23122a;

    public b3s(String str) {
        this.f23122a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3s) && wj50.m88271j(this.f23122a, ((b3s) obj).f23122a);
    }

    public final int hashCode() {
        return this.f23122a.hashCode();
    }
}
