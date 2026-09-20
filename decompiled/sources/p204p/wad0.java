package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wad0 implements yad0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f249454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f249455b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r300 f249456c;

    public /* synthetic */ wad0(Context context, r300 r300Var, int i) {
        this.f249454a = i;
        this.f249455b = context;
        this.f249456c = r300Var;
    }

    @Override // p204p.yad0
    /* JADX INFO: renamed from: c */
    public final int mo87593c(Object obj) {
        switch (this.f249454a) {
            case 0:
                return ((tad0) obj).m80346e(this.f249455b, this.f249456c) ? 1 : 0;
            default:
                tad0 tad0Var = (tad0) obj;
                String str = tad0Var.f218545b;
                r300 r300Var = this.f249456c;
                return ((str.equals(r300Var.f195387p) || str.equals(zad0.m95773c(r300Var))) && tad0Var.m80344c(this.f249455b, r300Var, false) && tad0Var.m80345d(r300Var)) ? 1 : 0;
        }
    }
}
