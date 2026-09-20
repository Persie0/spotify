package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class r731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f196424a;

    public r731(String str) {
        this.f196424a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r731) && wj50.m88271j(this.f196424a, ((r731) obj).f196424a);
    }

    public final int hashCode() {
        return this.f196424a.hashCode();
    }
}
