package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zbr {

    /* JADX INFO: renamed from: a */
    public final boolean f281385a;

    /* JADX INFO: renamed from: b */
    public final boolean f281386b;

    /* JADX INFO: renamed from: c */
    public final boolean f281387c;

    /* JADX INFO: renamed from: d */
    public final boolean f281388d;

    /* JADX INFO: renamed from: e */
    public final boolean f281389e;

    /* JADX INFO: renamed from: f */
    public final boolean f281390f;

    /* JADX INFO: renamed from: g */
    public final boolean f281391g;

    public zbr(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f281385a = z;
        this.f281386b = z2;
        this.f281387c = z3;
        this.f281388d = z4;
        this.f281389e = z5;
        this.f281390f = z6;
        this.f281391g = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbr)) {
            return false;
        }
        zbr zbrVar = (zbr) obj;
        return this.f281385a == zbrVar.f281385a && this.f281386b == zbrVar.f281386b && this.f281387c == zbrVar.f281387c && this.f281388d == zbrVar.f281388d && this.f281389e == zbrVar.f281389e && this.f281390f == zbrVar.f281390f && this.f281391g == zbrVar.f281391g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281391g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f281385a) * 31, 31, this.f281386b), 31, this.f281387c), 31, this.f281388d), 31, this.f281389e), 31, this.f281390f);
    }
}
