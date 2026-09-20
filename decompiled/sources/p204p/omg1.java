package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class omg1 {

    /* JADX INFO: renamed from: a */
    public final String f167033a;

    /* JADX INFO: renamed from: b */
    public final long f167034b;

    /* JADX INFO: renamed from: c */
    public final int f167035c;

    public omg1(long j, int i, String str) {
        this.f167033a = str;
        this.f167034b = j;
        this.f167035c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof omg1)) {
            return false;
        }
        omg1 omg1Var = (omg1) obj;
        return wj50.m88271j(omg1Var.f167033a, this.f167033a) && omg1Var.f167034b == this.f167034b && omg1Var.f167035c == this.f167035c;
    }
}
