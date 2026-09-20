package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ofv0 extends qfv0 {

    /* JADX INFO: renamed from: a */
    public final int f164913a;

    public ofv0(int i) {
        this.f164913a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofv0) && this.f164913a == ((ofv0) obj).f164913a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f164913a);
    }
}
