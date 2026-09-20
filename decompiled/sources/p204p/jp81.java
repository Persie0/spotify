package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jp81 implements lp81 {

    /* JADX INFO: renamed from: a */
    public final int f114584a;

    public jp81(int i) {
        this.f114584a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp81) && this.f114584a == ((jp81) obj).f114584a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f114584a);
    }
}
