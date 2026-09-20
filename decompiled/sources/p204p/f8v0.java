package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class f8v0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g8v0 f67095b;

    public /* synthetic */ f8v0(g8v0 g8v0Var, int i) {
        this.f67094a = i;
        this.f67095b = g8v0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.f67094a;
        g8v0 g8v0Var = this.f67095b;
        switch (i) {
            case 0:
                m5v0 m5v0Var = (m5v0) obj;
                z9j0 z9j0Var = g8v0Var.f77604e.f40799a;
                String str = m5v0Var.f140292b;
                d850 d850Var = m5v0Var.f140293c;
                try {
                    if (d850Var != null) {
                        z9j0Var.mo47342b(str, d850Var, null);
                    } else {
                        z9j0Var.mo47346g(str);
                    }
                } catch (Exception e) {
                    na6.m63959g("Failed to navigate to the uri:".concat(str), e);
                    return;
                }
                break;
            case 1:
                n5v0 n5v0Var = (n5v0) obj;
                s4k.m77200a(g8v0Var.f77605f, n5v0Var.f150626b, xoc1.f264231y0.f243453a, n5v0Var.f150627c, null, 8);
                break;
            case 2:
                g8v0Var.f77603d.m39465a(((s5v0) obj).f205912b);
                break;
            default:
                o5v0 o5v0Var = (o5v0) obj;
                int i2 = o5v0Var.f162109c;
                String str2 = o5v0Var.f162108b;
                String strM77246e = i2 > 0 ? s571.m77246e(i2, "?playTimestamp=") : "";
                yfu0 yfu0Var = g8v0Var.f77606g;
                String strM77251j = s571.m77251j("spotify:listeningactivity:", str2, strM77246e);
                uoc1 uoc1Var = xoc1.f264038a;
                yfu0Var.m93568a(strM77251j, str2);
                break;
        }
    }
}
