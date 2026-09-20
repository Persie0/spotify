package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes5.dex */
public final class fma extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gma f70997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fma(gma gmaVar) {
        super(0);
        this.f70997a = gmaVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        dx40 dx40VarMo51806g;
        Rect rect = new Rect();
        gma gmaVar = this.f70997a;
        gmaVar.getRecyclerView().getGlobalVisibleRect(rect);
        swd1 swd1Var = gmaVar.f81347f1;
        int i = (swd1Var == null || (dx40VarMo51806g = swd1Var.f214650a.mo51806g(519)) == null) ? 0 : dx40VarMo51806g.f53851d;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        return siv0.m78242a(new siv0(f, f2, f3, f4), f4 - i);
    }
}
