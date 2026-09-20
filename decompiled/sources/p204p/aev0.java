package p204p;

import android.net.Uri;
import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class aev0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dev0 f14965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xgg1 f14966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f14968d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f14969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aev0(dev0 dev0Var, xgg1 xgg1Var, int i, String str, String str2) {
        super(0);
        this.f14965a = dev0Var;
        this.f14966b = xgg1Var;
        this.f14967c = i;
        this.f14968d = str;
        this.f14969e = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Uri uri = this.f14965a.f48182e;
        lr50 lr50Var = (lr50) this.f14966b;
        return new WidgetInteraction.ItemClick.GridItemClick(uri, this.f14967c, null, this.f14968d, this.f14969e, lr50Var.f136227d, lr50Var.f136228e, 4, null);
    }
}
