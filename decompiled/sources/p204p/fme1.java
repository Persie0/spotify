package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fme1 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final int f71035c;

    public fme1(int i) {
        super(new kb01(0, new f6w0(i, 18), String.valueOf(i)), 22);
        this.f71035c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fme1) && this.f71035c == ((fme1) obj).f71035c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f71035c);
    }
}
