package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z7v {

    /* JADX INFO: renamed from: a */
    public final String f280284a;

    public z7v(String str) {
        this.f280284a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7v) && this.f280284a.equals(((z7v) obj).f280284a);
    }

    public final int hashCode() {
        return this.f280284a.hashCode() * 31;
    }
}
