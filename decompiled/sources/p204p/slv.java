package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class slv implements tlv {

    /* JADX INFO: renamed from: a */
    public final int f210496a;

    public slv(int i) {
        this.f210496a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slv) && this.f210496a == ((slv) obj).f210496a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f210496a);
    }
}
