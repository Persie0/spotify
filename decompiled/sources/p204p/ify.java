package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ify {

    /* JADX INFO: renamed from: a */
    public final String f101839a;

    /* JADX INFO: renamed from: b */
    public final String f101840b;

    /* JADX INFO: renamed from: c */
    public final qf40 f101841c;

    public ify(String str, String str2, qf40 qf40Var) {
        this.f101839a = str;
        this.f101840b = str2;
        this.f101841c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ify)) {
            return false;
        }
        ify ifyVar = (ify) obj;
        return wj50.m88271j(this.f101839a, ifyVar.f101839a) && wj50.m88271j(this.f101840b, ifyVar.f101840b) && wj50.m88271j(this.f101841c, ifyVar.f101841c);
    }

    public final int hashCode() {
        return this.f101841c.hashCode() + s571.m77243b(this.f101839a.hashCode() * 31, 31, this.f101840b);
    }
}
