package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class gfz implements i8a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f79488b;

    public gfz(sp5 sp5Var, i4t0 i4t0Var) {
        this.f79487a = 26;
        this.f79488b = sp5Var;
    }

    @Override // p204p.efz
    /* JADX INFO: renamed from: e */
    public final Object mo38764e() {
        switch (this.f79487a) {
            case 0:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48507a());
            case 1:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48504T());
            case 2:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48512f());
            case 3:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48514h());
            case 4:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48515i());
            case 5:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48519m());
            case 6:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48520n());
            case 7:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48522p());
            case 8:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48523q());
            case 9:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48524r());
            case 10:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48525s());
            case 11:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48526t());
            case 12:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48532z());
            case 13:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48506V());
            case 14:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48485A());
            case 15:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48492H());
            case 16:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48495K());
            case 17:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48497M());
            case 18:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48498N());
            case 19:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48499O());
            case 20:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48501Q());
            case 21:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48505U());
            case 22:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48528v());
            case 23:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48509c() && Build.VERSION.SDK_INT >= 34);
            case 24:
                return Boolean.valueOf(((hsi) ((i4t0) this.f79488b).get()).m48486B());
            case 25:
                return Boolean.valueOf(((fzd0) ((i4t0) this.f79488b).get()).m43197a());
            default:
                ((sp5) this.f79488b).getClass();
                return Boolean.FALSE;
        }
    }

    public /* synthetic */ gfz(i4t0 i4t0Var, int i) {
        this.f79487a = i;
        this.f79488b = i4t0Var;
    }
}
