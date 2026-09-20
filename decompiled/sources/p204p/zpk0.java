package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zpk0 {

    /* JADX INFO: renamed from: a */
    public final Object f285172a;

    /* JADX INFO: renamed from: b */
    public final long f285173b;

    /* JADX INFO: renamed from: c */
    public final long f285174c;

    public zpk0(Object obj, long j, long j2) {
        this.f285172a = obj;
        this.f285173b = j;
        this.f285174c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpk0)) {
            return false;
        }
        zpk0 zpk0Var = (zpk0) obj;
        return wj50.m88271j(this.f285172a, zpk0Var.f285172a) && this.f285173b == zpk0Var.f285173b && this.f285174c == zpk0Var.f285174c;
    }

    public final int hashCode() {
        Object obj = this.f285172a;
        return Long.hashCode(this.f285174c) + dq60.m36605e((obj == null ? 0 : obj.hashCode()) * 31, this.f285173b, 31);
    }

    public /* synthetic */ zpk0(long j, Object obj) {
        this(obj, j, -1L);
    }
}
