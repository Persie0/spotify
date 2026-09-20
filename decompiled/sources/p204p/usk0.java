package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class usk0 {

    /* JADX INFO: renamed from: a */
    public final String f233646a;

    /* JADX INFO: renamed from: b */
    public final String f233647b;

    /* JADX INFO: renamed from: c */
    public final String f233648c;

    /* JADX INFO: renamed from: d */
    public final boolean f233649d;

    /* JADX INFO: renamed from: e */
    public final eh00 f233650e;

    public usk0(String str, String str2, String str3, boolean z, eh00 eh00Var) {
        this.f233646a = str;
        this.f233647b = str2;
        this.f233648c = str3;
        this.f233649d = z;
        this.f233650e = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usk0)) {
            return false;
        }
        usk0 usk0Var = (usk0) obj;
        return wj50.m88271j(this.f233646a, usk0Var.f233646a) && wj50.m88271j(this.f233647b, usk0Var.f233647b) && wj50.m88271j(this.f233648c, usk0Var.f233648c) && this.f233649d == usk0Var.f233649d && wj50.m88271j(this.f233650e, usk0Var.f233650e);
    }

    public final int hashCode() {
        return this.f233650e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f233646a.hashCode() * 31, 31, this.f233647b), 31, this.f233648c), 31, this.f233649d);
    }
}
