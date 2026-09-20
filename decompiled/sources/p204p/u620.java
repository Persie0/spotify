package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u620 implements v620 {

    /* JADX INFO: renamed from: a */
    public final int f227207a;

    public u620(int i) {
        this.f227207a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u620) && this.f227207a == ((u620) obj).f227207a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f227207a);
    }
}
