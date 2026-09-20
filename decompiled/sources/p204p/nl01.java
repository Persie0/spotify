package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nl01 implements sl01 {

    /* JADX INFO: renamed from: a */
    public final String f154984a;

    public nl01(String str) {
        this.f154984a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl01) && wj50.m88271j(this.f154984a, ((nl01) obj).f154984a);
    }

    public final int hashCode() {
        return this.f154984a.hashCode();
    }
}
