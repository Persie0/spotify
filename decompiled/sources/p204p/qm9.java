package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class qm9 {
    public static final pm9 Companion = new pm9();

    /* JADX INFO: renamed from: a */
    public final String f190162a;

    /* JADX INFO: renamed from: b */
    public final String f190163b;

    /* JADX INFO: renamed from: c */
    public final String f190164c;

    public /* synthetic */ qm9(String str, String str2, int i, String str3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, om9.f166998a.getDescriptor());
            throw null;
        }
        this.f190162a = str;
        this.f190163b = str2;
        this.f190164c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm9)) {
            return false;
        }
        qm9 qm9Var = (qm9) obj;
        return wj50.m88271j(this.f190162a, qm9Var.f190162a) && wj50.m88271j(this.f190163b, qm9Var.f190163b) && wj50.m88271j(this.f190164c, qm9Var.f190164c);
    }

    public final int hashCode() {
        return this.f190164c.hashCode() + s571.m77243b(this.f190162a.hashCode() * 31, 31, this.f190163b);
    }

    public qm9(String str, String str2, String str3) {
        this.f190162a = str;
        this.f190163b = str2;
        this.f190164c = str3;
    }
}
