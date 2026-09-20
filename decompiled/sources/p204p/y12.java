package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y12 extends a22 {

    /* JADX INFO: renamed from: e */
    public final String f268134e;

    /* JADX INFO: renamed from: f */
    public final m761 f268135f;

    /* JADX INFO: renamed from: g */
    public final int f268136g;

    /* JADX INFO: renamed from: h */
    public final String f268137h;

    /* JADX INFO: renamed from: i */
    public final String f268138i;

    public y12(int i, String str, String str2, String str3, m761 m761Var) {
        super(str, m761Var, i, str3);
        this.f268134e = str;
        this.f268135f = m761Var;
        this.f268136g = i;
        this.f268137h = str2;
        this.f268138i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y12)) {
            return false;
        }
        y12 y12Var = (y12) obj;
        return wj50.m88271j(this.f268134e, y12Var.f268134e) && this.f268135f == y12Var.f268135f && this.f268136g == y12Var.f268136g && wj50.m88271j(this.f268137h, y12Var.f268137h) && wj50.m88271j(this.f268138i, y12Var.f268138i);
    }

    public final int hashCode() {
        return this.f268138i.hashCode() + s571.m77243b(mt60.m62800g(this.f268136g, (this.f268135f.hashCode() + (this.f268134e.hashCode() * 31)) * 31, 31), 31, this.f268137h);
    }

    public /* synthetic */ y12(String str) {
        this(8, str, "", "", m761.MUSIC_NPV);
    }
}
