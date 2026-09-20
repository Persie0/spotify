package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mcy implements ncy {

    /* JADX INFO: renamed from: a */
    public final int f142266a;

    public mcy(int i) {
        this.f142266a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcy) && this.f142266a == ((mcy) obj).f142266a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f142266a);
    }
}
