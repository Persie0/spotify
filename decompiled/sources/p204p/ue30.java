package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ue30 implements we30 {

    /* JADX INFO: renamed from: a */
    public final int f229390a;

    public ue30(int i) {
        this.f229390a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue30) && this.f229390a == ((ue30) obj).f229390a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f229390a);
    }
}
