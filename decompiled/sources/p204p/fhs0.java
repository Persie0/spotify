package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final boolean f69700a;

    public fhs0(boolean z) {
        this.f69700a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhs0) && this.f69700a == ((fhs0) obj).f69700a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69700a);
    }
}
