package p204p;

import android.webkit.WebView;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes10.dex */
public final class p511 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f174052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p511(kqi0 kqi0Var, int i) {
        super(1);
        this.f174051a = i;
        this.f174052b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f174051a;
        fbk fbkVar = null;
        boolean z = true;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f174052b;
        switch (i) {
            case 0:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 1:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 2:
                ((gh00) kqi0Var.getValue()).invoke((ze11) obj);
                return w2a1Var;
            case 3:
                tiv0 tiv0VarM71276k = pwg1.m71276k((jo70) obj, true);
                kqi0Var.setValue(new siv0(tiv0VarM71276k.f220751a, tiv0VarM71276k.f220752b, tiv0VarM71276k.f220753c, tiv0VarM71276k.f220754d));
                return w2a1Var;
            case 4:
                if (((td61) obj) != td61.f219243c) {
                    kqi0Var.setValue(null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                kqi0Var.setValue(new g450(((g450) obj).f76347a));
                return w2a1Var;
            case 6:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 7:
                kqi0Var.setValue((String) obj);
                return w2a1Var;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kqi0Var.setValue(bool);
                return w2a1Var;
            case 9:
                kqi0Var.setValue((WebView) obj);
                return w2a1Var;
            case 10:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                kqi0Var.setValue(bool2);
                return w2a1Var;
            case 11:
                kqi0Var.setValue(Boolean.valueOf(((kqz) obj).m57129b()));
                return w2a1Var;
            case 12:
                jo70 jo70Var = (jo70) obj;
                tiv0 tiv0VarMo30001I = pwg1.m71280o(jo70Var).mo30001I(jo70Var, true);
                if (!tiv0VarMo30001I.equals((tiv0) kqi0Var.getValue())) {
                    kqi0Var.setValue(tiv0VarMo30001I);
                }
                return w2a1Var;
            case 13:
                vc80 vc80Var = (vc80) obj;
                vc80Var.f240074c = new vi1(24, fbkVar, kqi0Var);
                vc80Var.f240075d = new uvy0(kqi0Var, 19);
                return w2a1Var;
            case 14:
                kqi0Var.setValue(Integer.valueOf((int) (((jo70) obj).mo30018b() & 4294967295L)));
                return w2a1Var;
            case 15:
                vc80 vc80Var2 = (vc80) obj;
                vc80Var2.f240074c = new vi1(26, fbkVar, kqi0Var);
                vc80Var2.f240072a = new vi1(27, fbkVar, kqi0Var);
                vc80Var2.f240075d = new uvy0(kqi0Var, 20);
                return w2a1Var;
            case 16:
                kqi0Var.setValue(new g450(((jo70) obj).mo30018b()));
                return w2a1Var;
            case 17:
                tiv0 tiv0VarM71276k2 = pwg1.m71276k((jo70) obj, true);
                kqi0Var.setValue(new siv0(tiv0VarM71276k2.f220751a, tiv0VarM71276k2.f220752b, tiv0VarM71276k2.f220753c, tiv0VarM71276k2.f220754d));
                return w2a1Var;
            case 18:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                kqi0Var.setValue(bool3);
                return w2a1Var;
            case 19:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                kqi0Var.setValue(bool4);
                return w2a1Var;
            case 20:
                ydj.m93453l(((jo70) obj).mo30029m(0L), kqi0Var);
                return w2a1Var;
            case 21:
                ydj.m93453l(((Offset) obj).f493a, kqi0Var);
                return w2a1Var;
            case 22:
                kqi0Var.setValue(Integer.valueOf(((Number) obj).intValue()));
                return w2a1Var;
            case 23:
                ((fdx0) obj).m41380b(((Boolean) kqi0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                return w2a1Var;
            case 24:
                ((gh00) kqi0Var.getValue()).invoke((rwa1) obj);
                return w2a1Var;
            case 25:
                p340 p340Var = ((sm6) obj).f210571b.f159718a;
                if (p340Var.mo68986b() != -1 && ybs.m93300a(((ybs) kqi0Var.getValue()).f271238a, p340Var.mo68986b()) > 0) {
                    ptl.m70999t(p340Var.mo68986b(), kqi0Var);
                }
                return w2a1Var;
            case 26:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 27:
                im91 im91Var = epb1.f61615a;
                kqi0Var.setValue((VideoSurfaceView) obj);
                return w2a1Var;
            case 28:
                kqi0Var.setValue((gh00) obj);
                return w2a1Var;
            default:
                kqi0Var.setValue((gh00) obj);
                return w2a1Var;
        }
    }
}
