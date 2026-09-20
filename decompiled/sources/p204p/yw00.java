package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yw00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f276814d = new ak0(25);

    /* JADX INFO: renamed from: a */
    public final mec0 f276815a;

    /* JADX INFO: renamed from: b */
    public final String f276816b;

    /* JADX INFO: renamed from: c */
    public final String f276817c;

    public yw00(mec0 mec0Var, String str, String str2) {
        this.f276815a = mec0Var;
        this.f276816b = str;
        this.f276817c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw00)) {
            return false;
        }
        yw00 yw00Var = (yw00) obj;
        return this.f276815a.equals(yw00Var.f276815a) && wj50.m88271j(this.f276816b, yw00Var.f276816b) && wj50.m88271j(this.f276817c, yw00Var.f276817c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f276814d;
    }

    public final int hashCode() {
        int iHashCode = this.f276815a.hashCode() * 31;
        String str = this.f276816b;
        return this.f276817c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
