package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f109479a;

    public j731(String str) {
        this.f109479a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j731) && wj50.m88271j(this.f109479a, ((j731) obj).f109479a);
    }

    public final int hashCode() {
        return this.f109479a.hashCode();
    }
}
