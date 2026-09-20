package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r1x implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f194941a;

    public r1x(String str) {
        this.f194941a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1x) && wj50.m88271j(this.f194941a, ((r1x) obj).f194941a);
    }

    public final int hashCode() {
        return this.f194941a.hashCode();
    }
}
