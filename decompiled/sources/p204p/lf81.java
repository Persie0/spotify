package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lf81 {

    /* JADX INFO: renamed from: d */
    public static final lf81 f132851d = new lf81(new kf81[0]);

    /* JADX INFO: renamed from: e */
    public static final String f132852e;

    /* JADX INFO: renamed from: a */
    public final int f132853a;

    /* JADX INFO: renamed from: b */
    public final wsv0 f132854b;

    /* JADX INFO: renamed from: c */
    public int f132855c;

    static {
        String str = h0b1.f86200a;
        f132852e = Integer.toString(0, 36);
    }

    public lf81(kf81... kf81VarArr) {
        wsv0 wsv0VarM69792q = pf40.m69792q(kf81VarArr);
        this.f132854b = wsv0VarM69792q;
        this.f132853a = kf81VarArr.length;
        int i = 0;
        while (i < wsv0VarM69792q.f254765d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < wsv0VarM69792q.f254765d; i3++) {
                if (((kf81) wsv0VarM69792q.get(i)).equals(wsv0VarM69792q.get(i3))) {
                    yif1.m93810s("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final kf81 m58848a(int i) {
        return (kf81) this.f132854b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public final int m58849b(kf81 kf81Var) {
        int iIndexOf = this.f132854b.indexOf(kf81Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lf81.class != obj.getClass()) {
            return false;
        }
        lf81 lf81Var = (lf81) obj;
        if (this.f132853a != lf81Var.f132853a) {
            return false;
        }
        wsv0 wsv0Var = lf81Var.f132854b;
        wsv0 wsv0Var2 = this.f132854b;
        wsv0Var2.getClass();
        return pmf0.m70330p(wsv0Var2, wsv0Var);
    }

    public final int hashCode() {
        if (this.f132855c == 0) {
            this.f132855c = this.f132854b.hashCode();
        }
        return this.f132855c;
    }

    public final String toString() {
        return this.f132854b.toString();
    }
}
