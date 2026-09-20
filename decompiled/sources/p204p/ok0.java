package p204p;

import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Action;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ok0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166195a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f166196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f166197c;

    public /* synthetic */ ok0(int i, Object obj, Object obj2) {
        this.f166195a = i;
        this.f166197c = obj;
        this.f166196b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v90, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f166195a) {
            case 0:
                pk0 pk0Var = (pk0) this.f166197c;
                pqm0 pqm0Var = (pqm0) this.f166196b;
                wj50.m88279p(pqm0Var);
                x02 x02Var = (x02) pqm0Var.f180350a;
                long jLongValue = ((Number) pqm0Var.f180351b).longValue();
                d850 d850VarM84362c = ((v02) pk0Var.f178340h).m84362c(x02Var.f256756P0, x02Var.f256757Q0, x02Var.f256772i, x02Var.f256760T0);
                om0.m67310a((om0) pk0Var.f178339g, qm0.MINIMIZED, x02Var.f256773t, Long.valueOf(jLongValue), null, null, 120);
                ((n02) pk0Var.f178338f).m63276a(d850VarM84362c);
                break;
            case 1:
                wk0 wk0Var = (wk0) this.f166197c;
                pqm0 pqm0Var2 = (pqm0) this.f166196b;
                wj50.m88279p(pqm0Var2);
                x02 x02Var2 = (x02) pqm0Var2.f180350a;
                long jLongValue2 = ((Number) pqm0Var2.f180351b).longValue();
                d850 d850VarM84362c2 = ((v02) wk0Var.f252086i).m84362c(x02Var2.f256756P0, x02Var2.f256757Q0, x02Var2.f256772i, x02Var2.f256760T0);
                om0.m67310a((om0) wk0Var.f252085h, qm0.MINIMIZED, x02Var2.f256773t, Long.valueOf(jLongValue2), null, null, 120);
                ((n02) wk0Var.f252084g).m63276a(d850VarM84362c2);
                break;
            case 2:
                ((qu0) this.f166197c).f192524c.m84364e(((su0) this.f166196b).f213967a);
                break;
            case 3:
                ((uu0) this.f166197c).f234054c.m84364e(((su0) this.f166196b).f213967a);
                break;
            case 4:
                ((vu0) this.f166197c).f244801c.m84365f(((xu0) this.f166196b).f265963a);
                break;
            case 5:
                ((yu0) this.f166197c).f276235c.m84365f(((xu0) this.f166196b).f265963a);
                break;
            case 6:
                ((dz0) this.f166197c).f54475i.m83184a(((gj7) this.f166196b).f80381a, true);
                break;
            case 7:
                Logger.m3965a("SpotifyAlarmLauncherService stopping from cachePlaylistContextHandler", new Object[0]);
                yv2 yv2Var = (yv2) this.f166197c;
                zq2 zq2Var = (zq2) this.f166196b;
                Logger.m3965a("Stopping SpotifyAlarmLauncherService", new Object[0]);
                yv2Var.f276542f.m23396g();
                zq2Var.invoke();
                break;
            case 8:
                ((an10) ((dg10) ((cxe) this.f166197c).f43015e).f48704b).m26458e((vn80) this.f166196b, "alexa", true, "", "", "");
                break;
            case 9:
                ((cc6) this.f166197c).f83503b.f235651a.f246566f.m43245b((String) this.f166196b);
                break;
            case 10:
                ((qn6) this.f166197c).f190479b.accept((zjs0) this.f166196b);
                break;
            case 11:
                aed0 aed0Var = (aed0) this.f166197c;
                if (aed0Var != null) {
                    aed0Var.f14848i.set(false);
                }
                fx6 fx6Var = (fx6) this.f166196b;
                fx6Var.f74251O0 = null;
                fx6.m42991a(fx6Var);
                break;
            case 12:
                ((fk9) this.f166197c).f70510g.remove((List) this.f166196b);
                break;
            case 13:
                Object systemService = ((Context) this.f166197c).getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                if (notificationManager != null) {
                    notificationManager.cancel(R.id.notification_sync);
                }
                ((BroadcastReceiver.PendingResult) this.f166196b).finish();
                break;
            case 14:
                hv31 hv31Var = (hv31) this.f166197c;
                xre xreVar = ((ghb) this.f166196b).f79879c;
                fv31 fv31Var = ghb.f79876f;
                mv31 mv31Var = (mv31) hv31Var;
                if (!mv31Var.m62894o(fv31Var)) {
                    ((wy3) xreVar).getClass();
                    System.currentTimeMillis();
                    fr0.m42475s((wy3) xreVar, mv31Var.edit(), fv31Var);
                }
                break;
            case 15:
                hv31 hv31Var2 = (hv31) this.f166197c;
                fv31 fv31Var2 = (fv31) this.f166196b;
                lv31 lv31VarEdit = hv31Var2.edit();
                lv31VarEdit.m60048a(fv31Var2, true);
                lv31VarEdit.m60054g();
                break;
            case 16:
                ((fmc) this.f166197c).f71016g.onNext(emc.m39411a((emc) this.f166196b, true));
                break;
            case 17:
                g631 g631Var = (g631) this.f166196b;
                x3f x3fVar = (x3f) this.f166197c;
                if (!x3fVar.f257800a.m72301f()) {
                    x3fVar.f257800a.m72307m(g631Var);
                } else {
                    x3fVar.f257800a.m72305j(g631Var);
                }
                break;
            case 18:
                s7i.m77377b((s7i) this.f166197c, ((xei) this.f166196b).f260719a, null);
                break;
            case 19:
                xho xhoVar = (xho) this.f166196b;
                Integer num = (Integer) this.f166197c;
                if (num == null || num.intValue() != -1) {
                    ye50 ye50Var = xhoVar.f261686c;
                    wj50.m88279p(num);
                    int iIntValue = num.intValue();
                    lv31 lv31VarEdit2 = ((zho) ye50Var).f282988a.edit();
                    lv31VarEdit2.m60049b(zho.f282987j, iIntValue);
                    lv31VarEdit2.m60054g();
                }
                zxx0 zxx0Var = xhoVar.f261684a;
                zxx0.f287421a.getClass();
                yxx0 yxx0Var = xxx0.f267128g;
                wj50.m88279p(num);
                int iIntValue2 = num.intValue();
                int i = 1;
                if (((j14) xhoVar.f261685b.get()).m52110a() && !((zho) xhoVar.f261686c).f282988a.mo48713h(zho.f282983f, false) && iIntValue2 != 1) {
                    i = 0;
                }
                zxx0Var.mo27557c(yxx0Var, Integer.valueOf(i));
                break;
            case 20:
                ((a6p) this.f166197c).f12838h = (gqi) this.f166196b;
                break;
            case 21:
                ((hc80) this.f166197c).getLifecycle().mo31988d((wor) this.f166196b);
                break;
            case 22:
                ((Consumer) this.f166197c).accept(this.f166196b);
                break;
            case 23:
                ((Consumer) this.f166197c).accept(new x0u(((h1u) this.f166196b).m46467g()));
                break;
            case 24:
                ((n4x) this.f166197c).f150437f.remove((pqm0) this.f166196b);
                break;
            case 25:
                ((qe70) this.f166197c).invoke((a7x) this.f166196b);
                break;
            case 26:
                ((ddx0) ((q6u) this.f166197c).f185927d).m35756b(((sn90) this.f166196b).f210857a);
                break;
            case 27:
                q831 q831Var = (q831) ((xyx) this.f166197c).f267436b;
                Integer num2 = (Integer) this.f166196b;
                na6.m63963k(num2.intValue() != 0, "Invalid resource ID provided: %s", num2);
                na6.m63963k(true, "Invalid resource ID provided: %s", null);
                q831Var.m72305j(new g631(null, "", num2, null, null, null, null, null, false));
                break;
            case 28:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.f166197c;
                Logger.m3965a("Go: Session ended for device: %s", bluetoothDevice.getAddress());
                if (((xxi) ((zi10) this.f166196b).f283060a.f117736a.remove(bluetoothDevice.getAddress())) == null) {
                    na6.m63957e("Connection could not be removed because it is not present.");
                }
                break;
            default:
                zi10 zi10Var = (zi10) this.f166197c;
                xxi xxiVar = (xxi) this.f166196b;
                xxiVar.f267008b = 4;
                zi10Var.f283066g.onNext(xxiVar);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ok0(gh00 gh00Var, a7x a7xVar) {
        this.f166195a = 25;
        this.f166197c = (qe70) gh00Var;
        this.f166196b = a7xVar;
    }
}
