package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class aay extends xhf1 {

    /* JADX INFO: renamed from: d */
    public final int f13949d;

    public aay(int i) {
        this.f13949d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aay) && this.f13949d == ((aay) obj).f13949d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f13949d);
    }
}
