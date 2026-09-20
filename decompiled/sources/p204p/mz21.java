package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final boolean f148593a;

    public mz21(boolean z) {
        this.f148593a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mz21) && this.f148593a == ((mz21) obj).f148593a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f148593a);
    }
}
