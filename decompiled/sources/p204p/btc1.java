package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class btc1 implements etc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f30552a;

    public btc1(boolean z) {
        this.f30552a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btc1) && this.f30552a == ((btc1) obj).f30552a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30552a);
    }
}
