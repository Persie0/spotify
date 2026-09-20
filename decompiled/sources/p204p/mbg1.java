package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class mbg1 {

    /* JADX INFO: renamed from: a */
    public int f141927a;

    /* JADX INFO: renamed from: b */
    public pf40 f141928b;

    /* JADX INFO: renamed from: c */
    public byte f141929c;

    /* JADX INFO: renamed from: a */
    public final void m61401a(int i) {
        this.f141927a = i;
        this.f141929c = (byte) 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m61402b(wsv0 wsv0Var) {
        this.f141928b = pf40.m69791p(wsv0Var);
    }

    /* JADX INFO: renamed from: c */
    public final zhg1 m61403c() {
        pf40 pf40Var;
        if (this.f141929c == 1 && (pf40Var = this.f141928b) != null) {
            return new zhg1(this.f141927a, pf40Var);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f141929c == 0) {
            sb.append(" currentIndex");
        }
        if (this.f141928b == null) {
            sb.append(" entries");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
