package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class m56 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f140150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f140151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m56(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f140148a = i;
        this.f140149b = obj;
        this.f140150c = obj2;
        this.f140151d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long jM30569u;
        int i = this.f140148a;
        int i2 = 14;
        int i3 = 12;
        int i4 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f140151d;
        Object obj3 = this.f140150c;
        Object obj4 = this.f140149b;
        switch (i) {
            case 0:
                return new l56(((n56) obj4).f150495c.mo25867c(((xt5) ((zt5) obj3).getData()).mo28634a((qt5) obj2)), 0);
            case 1:
                hmd hmdVar = (hmd) obj3;
                sr0 sr0Var = new sr0(2, hmdVar, (kjd) obj2);
                hc80 hc80Var = (hc80) obj4;
                hc80Var.getLifecycle().mo31986a(sr0Var);
                return new uld(hc80Var, sr0Var, hmdVar);
            case 2:
                fdx0 fdx0Var = (fdx0) obj;
                rv41 rv41Var = (rv41) obj3;
                rv41 rv41Var2 = (rv41) obj4;
                fdx0Var.m41380b(rv41Var2 != null ? ((Number) rv41Var2.getValue()).floatValue() : 1.0f);
                fdx0Var.m41390m(rv41Var != null ? ((Number) rv41Var.getValue()).floatValue() : 1.0f);
                fdx0Var.m41391o(rv41Var != null ? ((Number) rv41Var.getValue()).floatValue() : 1.0f);
                rv41 rv41Var3 = (rv41) obj2;
                if (rv41Var3 != null) {
                    jM30569u = ((i591) rv41Var3.getValue()).f98851a;
                } else {
                    int i5 = i591.f98850c;
                    jM30569u = bul.m30569u();
                }
                fdx0Var.m41395u(jM30569u);
                return w2a1Var;
            case 3:
                FaceView.m9680e((FaceView) obj4, (e940) obj3, (j6y) obj2, (omr0) obj);
                return w2a1Var;
            case 4:
                whu whuVar = (whu) obj;
                qf40 qf40Var = (qf40) obj4;
                g2z g2zVar = (g2z) obj3;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : qf40Var) {
                    if (((n2z) obj5).m63574g().mo46503c() == g2zVar) {
                        arrayList.add(obj5);
                    }
                }
                whuVar.m88174b(arrayList.size(), rkk.m75763o(new xkh(arrayList, qf40Var, (xst) obj2, 25), true, -1673449743), new l24(i2, arrayList));
                return w2a1Var;
            case 5:
                oxg1.m68218k((icp) obj, (n430) obj4, (s4k) obj3, (m0b) obj2);
                return w2a1Var;
            case 6:
                ((nwz0) obj4).getClass();
                Intent intentM65808a = nwz0.m65808a((Context) obj3, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_PUSH_ACTIONS");
                intentM65808a.putExtra("push_data", ((Bundle) obj).getParcelable("push_data"));
                return cyx.m34393b(intentM65808a, AppLifecycleServicePendingIntent.DISMISS, (wet0) obj2);
            case 7:
                b9b b9bVar = (b9b) obj;
                n2x0 n2x0Var = (n2x0) obj3;
                h9b h9bVar = b9bVar.f24817b;
                if (h9bVar.f88912c) {
                    return null;
                }
                u3h1.m82301x(h9bVar, new m5l0((o5l0) obj2, n2x0Var));
                return bif1.m29338s(b9bVar, ((kvu0) obj4).f126959e, n2x0Var);
            case 8:
                return new C2648zf((kqi0) obj4, (miq0) obj3, (Bundle) obj2, i3);
            case 9:
                Context context = (Context) obj3;
                Intent intentM65809b = ((nwz0) obj4).m65809b(context, "com.spotify.mobile.android.service.action.STOP");
                ((xo4) obj2).getClass();
                if (xo4.m91527a(context)) {
                    try {
                        Logger.m3965a("Sending STOP_SERVICE intent to lifecycle service", new Object[0]);
                        context.startService(intentM65809b);
                    } catch (IllegalStateException unused) {
                        Logger.m3965a("Trying to destroy service when app is in background", new Object[0]);
                    }
                    break;
                } else {
                    Logger.m3965a("Tried to send STOP_SERVICE intent while lifecycle service is not running (which is fine)", new Object[0]);
                }
                return w2a1Var;
            case 10:
                hzd0 hzd0Var = (hzd0) obj2;
                ck90 ck90Var = (ck90) ((qe70) obj4).invoke(obj);
                rlv0 rlv0Var = (rlv0) obj3;
                Object obj6 = rlv0Var.f200373a;
                if (obj6 != ck90Var) {
                    if (obj6 != null) {
                        gzd0 gzd0Var = (gzd0) hzd0Var.f96902Y.mo84313b((ck90) obj6);
                        if (gzd0Var != null) {
                            gzd0Var.f85897a.mo33102k(gzd0Var);
                        }
                    }
                    rlv0Var.f200373a = ck90Var;
                    if (ck90Var != null) {
                        hzd0Var.mo49264n(ck90Var, new jj3(new gh41(hzd0Var, 4)));
                    }
                }
                return w2a1Var;
            case 11:
                uw70 uw70Var = (uw70) obj;
                uw70.m84091c(uw70Var, null, rkk.m75763o(new y23((fyf) obj3, i3), true, -1480114363), 3);
                qf40 qf40Var2 = (qf40) obj4;
                uw70Var.mo30902e(((AbstractC2282q6) qf40Var2).mo33075a(), null, new ng71(14, qf40Var2), rkk.m75763o(new k120(qf40Var2, (fyf) obj2, i4), true, 802480018));
                return w2a1Var;
            default:
                qgr0.m72756c((Context) obj4, (swz0) obj3, (nwz0) obj2, "com.spotify.music.feature.widget.PAUSE");
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m56(gh00 gh00Var, rlv0 rlv0Var, hzd0 hzd0Var) {
        super(1);
        this.f140148a = 10;
        this.f140149b = (qe70) gh00Var;
        this.f140150c = rlv0Var;
        this.f140151d = hzd0Var;
    }
}
