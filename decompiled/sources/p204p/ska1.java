package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class ska1 {
    public static final rka1 Companion = new rka1();

    /* JADX INFO: renamed from: a */
    public final String f210068a;

    /* JADX INFO: renamed from: b */
    public final String f210069b;

    /* JADX INFO: renamed from: c */
    public final long f210070c;

    public /* synthetic */ ska1(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, qka1.f189515a.getDescriptor());
            throw null;
        }
        this.f210068a = str;
        this.f210069b = str2;
        this.f210070c = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m78368a() {
        return this.f210070c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ska1)) {
            return false;
        }
        ska1 ska1Var = (ska1) obj;
        return wj50.m88271j(this.f210068a, ska1Var.f210068a) && wj50.m88271j(this.f210069b, ska1Var.f210069b) && this.f210070c == ska1Var.f210070c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f210070c) + s571.m77243b(this.f210068a.hashCode() * 31, 31, this.f210069b);
    }

    public ska1(String str, String str2, long j) {
        this.f210068a = str;
        this.f210069b = str2;
        this.f210070c = j;
    }
}
