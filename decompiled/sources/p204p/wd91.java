package p204p;

import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;

/* JADX INFO: loaded from: classes11.dex */
public final class wd91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250239a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TranssionCardWidgetProvider f250240b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd91(TranssionCardWidgetProvider transsionCardWidgetProvider, int i) {
        super(0);
        this.f250239a = i;
        this.f250240b = transsionCardWidgetProvider;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f250239a) {
            case 0:
                er70 er70Var = this.f250240b.f183374d;
                if (er70Var != null) {
                    return kkc0.m56706s0(((dtd1) er70Var.get()).f52801a);
                }
                wj50.m88260d0("bitmapCache");
                throw null;
            default:
                TranssionCardWidgetProvider transsionCardWidgetProvider = this.f250240b;
                return transsionCardWidgetProvider.f7080e.mo25796a(new wd91(transsionCardWidgetProvider, 0));
        }
    }
}
