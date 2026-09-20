package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class np3 {

    /* JADX INFO: renamed from: a */
    public final long f156858a;

    /* JADX INFO: renamed from: b */
    public final qp71 f156859b;

    /* JADX INFO: renamed from: c */
    public final int f156860c;

    /* JADX INFO: renamed from: d */
    public final vsd0 f156861d;

    /* JADX INFO: renamed from: e */
    public final long f156862e;

    /* JADX INFO: renamed from: f */
    public final qp71 f156863f;

    /* JADX INFO: renamed from: g */
    public final int f156864g;

    /* JADX INFO: renamed from: h */
    public final vsd0 f156865h;

    /* JADX INFO: renamed from: i */
    public final long f156866i;

    /* JADX INFO: renamed from: j */
    public final long f156867j;

    public np3(long j, qp71 qp71Var, int i, vsd0 vsd0Var, long j2, qp71 qp71Var2, int i2, vsd0 vsd0Var2, long j3, long j4) {
        this.f156858a = j;
        this.f156859b = qp71Var;
        this.f156860c = i;
        this.f156861d = vsd0Var;
        this.f156862e = j2;
        this.f156863f = qp71Var2;
        this.f156864g = i2;
        this.f156865h = vsd0Var2;
        this.f156866i = j3;
        this.f156867j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && np3.class == obj.getClass()) {
            np3 np3Var = (np3) obj;
            if (this.f156858a == np3Var.f156858a && this.f156860c == np3Var.f156860c && this.f156862e == np3Var.f156862e && this.f156864g == np3Var.f156864g && this.f156866i == np3Var.f156866i && this.f156867j == np3Var.f156867j && Objects.equals(this.f156859b, np3Var.f156859b) && Objects.equals(this.f156861d, np3Var.f156861d) && Objects.equals(this.f156863f, np3Var.f156863f) && Objects.equals(this.f156865h, np3Var.f156865h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f156858a), this.f156859b, Integer.valueOf(this.f156860c), this.f156861d, Long.valueOf(this.f156862e), this.f156863f, Integer.valueOf(this.f156864g), this.f156865h, Long.valueOf(this.f156866i), Long.valueOf(this.f156867j));
    }
}
