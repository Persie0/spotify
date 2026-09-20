package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final boolean f171967a;

    public oz21(boolean z) {
        this.f171967a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oz21) && this.f171967a == ((oz21) obj).f171967a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f171967a);
    }
}
