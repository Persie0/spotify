package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class z93 implements aa3 {

    /* JADX INFO: renamed from: a */
    public final String f280652a;

    public z93(String str) {
        this.f280652a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m95617a() {
        return this.f280652a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z93) && wj50.m88271j(this.f280652a, ((z93) obj).f280652a);
    }

    public final int hashCode() {
        return this.f280652a.hashCode();
    }
}
