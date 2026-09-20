package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class vpy0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f243814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s18 f243815b;

    public /* synthetic */ vpy0(s18 s18Var, int i) {
        this.f243814a = i;
        this.f243815b = s18Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f243814a) {
            case 0:
                czy0 czy0Var = (czy0) this.f243815b.f204624f;
                int i = ((upy0) obj).f232843a;
                long j = i;
                if (i == czy0Var.f43662c) {
                    czy0Var.f43663d = j;
                    czy0Var.f43665f = czy0Var.f43664e;
                    czy0Var.f43666g = null;
                    break;
                }
                break;
            default:
                upy0 upy0Var = (upy0) obj;
                s18 s18Var = this.f243815b;
                czy0 czy0Var2 = (czy0) s18Var.f204624f;
                int i2 = upy0Var.f232843a;
                czy0Var2.m34477b(i2, i2, upy0Var.f232845c, upy0Var.f232846d, new fwv0(24, s18Var, upy0Var));
                break;
        }
    }
}
