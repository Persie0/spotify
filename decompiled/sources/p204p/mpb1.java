package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mpb1 {

    /* JADX INFO: renamed from: a */
    public final String f145956a;

    /* JADX INFO: renamed from: b */
    public final String f145957b;

    /* JADX INFO: renamed from: c */
    public final String f145958c;

    /* JADX INFO: renamed from: d */
    public final String f145959d;

    /* JADX INFO: renamed from: e */
    public final String f145960e;

    /* JADX INFO: renamed from: f */
    public final float f145961f;

    public mpb1(String str, String str2, String str3, String str4, String str5, float f) {
        this.f145956a = str;
        this.f145957b = str2;
        this.f145958c = str3;
        this.f145959d = str4;
        this.f145960e = str5;
        this.f145961f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpb1)) {
            return false;
        }
        mpb1 mpb1Var = (mpb1) obj;
        return wj50.m88271j(this.f145956a, mpb1Var.f145956a) && wj50.m88271j(this.f145957b, mpb1Var.f145957b) && wj50.m88271j(this.f145958c, mpb1Var.f145958c) && wj50.m88271j(this.f145959d, mpb1Var.f145959d) && wj50.m88271j(this.f145960e, mpb1Var.f145960e) && Float.compare(this.f145961f, mpb1Var.f145961f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f145961f) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f145956a.hashCode() * 31, 31, this.f145957b), 31, this.f145958c), 31, this.f145959d), 31, this.f145960e);
    }
}
