package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c6d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f34517a;

    public c6d1(String str) {
        this.f34517a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6d1) && wj50.m88271j(this.f34517a, ((c6d1) obj).f34517a);
    }

    public final int hashCode() {
        return this.f34517a.hashCode();
    }
}
