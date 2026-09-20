package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ra5 implements ta5 {

    /* JADX INFO: renamed from: a */
    public final int f197200a;

    public ra5(int i) {
        this.f197200a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra5) && this.f197200a == ((ra5) obj).f197200a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f197200a) + 644280799;
    }
}
