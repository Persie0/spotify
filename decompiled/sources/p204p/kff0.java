package p204p;

import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;

/* JADX INFO: loaded from: classes11.dex */
public final class kff0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MiuiDynamicNpvWidgetProvider f122161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kff0(MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider, int i) {
        super(0);
        this.f122160a = i;
        this.f122161b = miuiDynamicNpvWidgetProvider;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f122160a) {
            case 0:
                er70 er70Var = this.f122161b.f183374d;
                if (er70Var != null) {
                    return kkc0.m56706s0(((dtd1) er70Var.get()).f52801a);
                }
                wj50.m88260d0("bitmapCache");
                throw null;
            default:
                MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider = this.f122161b;
                return miuiDynamicNpvWidgetProvider.f6982e.mo25796a(new kff0(miuiDynamicNpvWidgetProvider, 0));
        }
    }
}
