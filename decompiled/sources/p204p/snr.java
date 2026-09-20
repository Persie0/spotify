package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class snr implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f211018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fcd1 f211019b;

    public /* synthetic */ snr(fcd1 fcd1Var, int i) {
        this.f211018a = i;
        this.f211019b = fcd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f211018a) {
            case 0:
                this.f211019b.f68100e.mo46962a(((gnr) obj).f82772a);
                break;
            case 1:
                boolean z = ((bnr) obj).f28916a;
                zv41 zv41Var = this.f211019b.f68101f;
                zv41Var.m97091m(null, ecd1.m38491a((ecd1) zv41Var.getValue(), z, false, false, null, 14));
                break;
            case 2:
                boolean z2 = ((zmr) obj).f284333a;
                zv41 zv41Var2 = this.f211019b.f68101f;
                zv41Var2.m97091m(null, ecd1.m38491a((ecd1) zv41Var2.getValue(), false, z2, false, null, 13));
                break;
            case 3:
                boolean z3 = ((ymr) obj).f274321a;
                zv41 zv41Var3 = this.f211019b.f68101f;
                zv41Var3.m97091m(null, ecd1.m38491a((ecd1) zv41Var3.getValue(), false, false, z3, null, 11));
                break;
            case 4:
                int i = ((enr) obj).f61220a;
                hb11 hb11Var = this.f211019b.f68098c;
                if (i < 0) {
                    i = 0;
                }
                hb11Var.mo46962a(Integer.valueOf(i));
                break;
            case 5:
                tmr tmrVar = (tmr) obj;
                int i2 = tmrVar.f221768a;
                fcd1 fcd1Var = this.f211019b;
                fcd1Var.f68096a.mo46962a(Integer.valueOf(i2));
                Integer num = tmrVar.f221769b;
                if (num != null) {
                    fcd1Var.f68097b.mo46962a(Integer.valueOf(num.intValue()));
                }
                break;
            case 6:
                this.f211019b.f68097b.mo46962a(Integer.valueOf(((umr) obj).f231934a));
                break;
            default:
                this.f211019b.f68099d.mo46962a(Boolean.valueOf(!((inr) obj).f104047a));
                break;
        }
    }
}
