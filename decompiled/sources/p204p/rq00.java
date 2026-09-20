package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rq00 {

    /* JADX INFO: renamed from: a */
    public int f201675a;

    public rq00(int i) {
        this.f201675a = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76206a() {
        return this.f201675a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return klh.m56832d(this.f201675a, " }", sb);
    }
}
