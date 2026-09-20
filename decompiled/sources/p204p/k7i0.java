package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public final class k7i0 {

    /* JADX INFO: renamed from: a */
    public final String f120135a;

    /* JADX INFO: renamed from: b */
    public final j7i0 f120136b;

    /* JADX INFO: renamed from: c */
    public final boolean f120137c;

    /* JADX INFO: renamed from: d */
    public final boolean f120138d;

    /* JADX INFO: renamed from: e */
    public final i7i0 f120139e;

    /* JADX INFO: renamed from: f */
    public final long f120140f;

    /* JADX INFO: renamed from: g */
    public final h7i0 f120141g;

    /* JADX INFO: renamed from: h */
    public final String f120142h;

    /* JADX INFO: renamed from: i */
    public final boolean f120143i;

    /* JADX INFO: renamed from: j */
    public final int f120144j;

    public k7i0(String str, j7i0 j7i0Var, boolean z, boolean z2, i7i0 i7i0Var, long j, h7i0 h7i0Var, String str2, boolean z3, int i) {
        this.f120135a = str;
        this.f120136b = j7i0Var;
        this.f120137c = z;
        this.f120138d = z2;
        this.f120139e = i7i0Var;
        this.f120140f = j;
        this.f120141g = h7i0Var;
        this.f120142h = str2;
        this.f120143i = z3;
        this.f120144j = i;
        if (j < 0 || i7i0Var != null) {
            if (j != 0 || i7i0Var == null) {
                throw new IllegalStateException("Either initialOffsetMs or clip must be set, but not both.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55662a() {
        return this.f120137c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7i0)) {
            return false;
        }
        k7i0 k7i0Var = (k7i0) obj;
        return wj50.m88271j(this.f120135a, k7i0Var.f120135a) && wj50.m88271j(this.f120136b, k7i0Var.f120136b) && this.f120137c == k7i0Var.f120137c && this.f120138d == k7i0Var.f120138d && wj50.m88271j(this.f120139e, k7i0Var.f120139e) && this.f120140f == k7i0Var.f120140f && wj50.m88271j(this.f120141g, k7i0Var.f120141g) && wj50.m88271j(this.f120142h, k7i0Var.f120142h) && this.f120143i == k7i0Var.f120143i && this.f120144j == k7i0Var.f120144j;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f120136b.hashCode() + (this.f120135a.hashCode() * 31)) * 31, 31, this.f120137c), 31, this.f120138d);
        i7i0 i7i0Var = this.f120139e;
        int iM36605e = dq60.m36605e((iM77245d + (i7i0Var == null ? 0 : i7i0Var.hashCode())) * 31, this.f120140f, 31);
        h7i0 h7i0Var = this.f120141g;
        return edb.m38547C(this.f120144j) + s571.m77245d(s571.m77243b((iM36605e + (h7i0Var != null ? h7i0Var.hashCode() : 0)) * 31, 31, this.f120142h), 31, this.f120143i);
    }

    public /* synthetic */ k7i0(String str, j7i0 j7i0Var, boolean z, i7i0 i7i0Var, long j, h7i0 h7i0Var, String str2, boolean z2, int i, int i2) {
        this(str, j7i0Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0, (i2 & 16) != 0 ? null : i7i0Var, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? null : h7i0Var, (i2 & 128) != 0 ? UUID.randomUUID().toString() : str2, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? 3 : i);
    }
}
