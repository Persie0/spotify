package p204p;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes11.dex */
public final class oxo extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f171475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pxo f171476b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxo(pxo pxoVar, int i) {
        super(0);
        this.f171475a = i;
        this.f171476b = pxoVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f171475a) {
            case 0:
                pxo pxoVar = this.f171476b;
                twy twyVar = pxoVar.f183145c;
                pxoVar.f183146d.f174438c = 1;
                ll6 ll6Var = pxoVar.f183149g;
                if (ll6Var != null) {
                    int currentItem = ((ViewPager2) twyVar.f224514f).getCurrentItem() < h6f.m46714K(ll6Var.f134534a) ? ((ViewPager2) twyVar.f224514f).getCurrentItem() + 1 : 0;
                    ((ViewPager2) twyVar.f224514f).setCurrentItem(currentItem);
                    pxoVar.m71557b(currentItem, ll6Var.f134535b);
                }
                break;
            default:
                pxo pxoVar2 = this.f171476b;
                ll6 ll6Var2 = pxoVar2.f183149g;
                if (ll6Var2 != null) {
                    pxoVar2.m71556a(ll6Var2);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
