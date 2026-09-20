package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final String f225099a;

    /* JADX INFO: renamed from: b */
    public final qjn0 f225100b;

    public tz21(String str, qjn0 qjn0Var) {
        this.f225099a = str;
        this.f225100b = qjn0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m82015a() {
        return this.f225099a;
    }

    /* JADX INFO: renamed from: b */
    public final qjn0 m82016b() {
        return this.f225100b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz21)) {
            return false;
        }
        tz21 tz21Var = (tz21) obj;
        return wj50.m88271j(this.f225099a, tz21Var.f225099a) && wj50.m88271j(this.f225100b, tz21Var.f225100b);
    }

    public final int hashCode() {
        return this.f225100b.hashCode() + (this.f225099a.hashCode() * 31);
    }
}
