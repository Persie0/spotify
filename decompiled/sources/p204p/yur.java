package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class yur {

    /* JADX INFO: renamed from: a */
    public final boolean f276441a;

    /* JADX INFO: renamed from: b */
    public final boolean f276442b;

    /* JADX INFO: renamed from: c */
    public final boolean f276443c;

    /* JADX INFO: renamed from: d */
    public final boolean f276444d;

    /* JADX INFO: renamed from: e */
    public final boolean f276445e;

    /* JADX INFO: renamed from: f */
    public final mur f276446f;

    /* JADX INFO: renamed from: g */
    public final int f276447g;

    public yur(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, mur murVar, int i) {
        this.f276441a = z;
        this.f276442b = z2;
        this.f276443c = z3;
        this.f276444d = z4;
        this.f276445e = z5;
        this.f276446f = murVar;
        this.f276447g = i;
    }

    /* JADX INFO: renamed from: a */
    public static yur m94669a(yur yurVar, boolean z, boolean z2, boolean z3, boolean z4, mur murVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = yurVar.f276441a;
        }
        boolean z5 = z;
        boolean z6 = yurVar.f276442b;
        if ((i2 & 4) != 0) {
            z2 = yurVar.f276443c;
        }
        boolean z7 = z2;
        if ((i2 & 8) != 0) {
            z3 = yurVar.f276444d;
        }
        boolean z8 = z3;
        if ((i2 & 16) != 0) {
            z4 = yurVar.f276445e;
        }
        boolean z9 = z4;
        if ((i2 & 32) != 0) {
            murVar = yurVar.f276446f;
        }
        mur murVar2 = murVar;
        if ((i2 & 64) != 0) {
            i = yurVar.f276447g;
        }
        yurVar.getClass();
        return new yur(z5, z6, z7, z8, z9, murVar2, i);
    }

    /* JADX INFO: renamed from: b */
    public final wn0 m94670b(eh00 eh00Var, boolean z, boolean z2) {
        vky vkyVar = new vky(z2);
        mur murVar = this.f276446f;
        return new wn0(vkyVar, xtm0.m92096q(murVar.f147424e), murVar.f147422c.f126662a, murVar.f147420a, murVar.f147425f, murVar.f147421b, murVar.f147426g.getValue(), murVar.f147427h, murVar.f147428i, z, new ke0(27, eh00Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yur)) {
            return false;
        }
        yur yurVar = (yur) obj;
        return this.f276441a == yurVar.f276441a && this.f276442b == yurVar.f276442b && this.f276443c == yurVar.f276443c && this.f276444d == yurVar.f276444d && this.f276445e == yurVar.f276445e && wj50.m88271j(this.f276446f, yurVar.f276446f) && this.f276447g == yurVar.f276447g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276447g) + ((this.f276446f.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f276441a) * 31, 31, this.f276442b), 31, this.f276443c), 31, this.f276444d), 31, this.f276445e)) * 31);
    }
}
