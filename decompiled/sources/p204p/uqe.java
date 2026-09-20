package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uqe {

    /* JADX INFO: renamed from: a */
    public final String f232985a;

    /* JADX INFO: renamed from: b */
    public final int f232986b;

    /* JADX INFO: renamed from: c */
    public final int f232987c;

    /* JADX INFO: renamed from: d */
    public final nt80 f232988d;

    public uqe(int i, int i2, String str, nt80 nt80Var) {
        this.f232985a = str;
        this.f232986b = i;
        this.f232987c = i2;
        this.f232988d = nt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqe)) {
            return false;
        }
        uqe uqeVar = (uqe) obj;
        return this.f232985a.equals(uqeVar.f232985a) && this.f232986b == uqeVar.f232986b && this.f232987c == uqeVar.f232987c && this.f232988d.equals(uqeVar.f232988d);
    }

    public final int hashCode() {
        return this.f232988d.hashCode() + mt60.m62800g(this.f232987c, mt60.m62800g(this.f232986b, this.f232985a.hashCode() * 31, 31), 31);
    }
}
