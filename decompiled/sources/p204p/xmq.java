package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xmq {

    /* JADX INFO: renamed from: a */
    public final int f263426a;

    public xmq(int i) {
        this.f263426a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmq) && this.f263426a == ((xmq) obj).f263426a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f263426a);
    }
}
