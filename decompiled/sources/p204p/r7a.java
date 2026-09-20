package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r7a implements s7a {

    /* JADX INFO: renamed from: a */
    public final String f196472a;

    public r7a(String str) {
        this.f196472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7a) && wj50.m88271j(this.f196472a, ((r7a) obj).f196472a);
    }

    public final int hashCode() {
        return this.f196472a.hashCode();
    }
}
