package p204p;

import com.spotify.libs.connect.events.proto.PlaybackGrabbingResult;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class uxp {

    /* JADX INFO: renamed from: a */
    public final txp f234977a;

    public uxp(txp txpVar) {
        this.f234977a = txpVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m84181a(hq10 hq10Var, iq10 iq10Var, Map map) {
        nzl0 nzl0Var;
        int i;
        fu6 fu6Var;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        char c = 1;
        char c2 = iq10Var == iq10.f104599a ? (char) 2 : (char) 1;
        char c3 = hq10Var.mo48191a() ? (char) 2 : (char) 1;
        char c4 = hq10Var.mo48195e() ? (char) 2 : (char) 1;
        if (hq10Var.mo48194d()) {
            nzl0Var = nzl0.WIRED;
        } else {
            e07 e07VarMo48192b = hq10Var.mo48192b();
            nzl0Var = e07VarMo48192b != null ? e07VarMo48192b.f54889d : null;
        }
        if (hq10Var.mo48194d()) {
            i = 3;
        } else {
            e07 e07VarMo48192b2 = hq10Var.mo48192b();
            i = (e07VarMo48192b2 == null || (fu6Var = e07VarMo48192b2.f54890e) == null) ? 0 : fu6Var.f73412a;
        }
        if (!(hq10Var instanceof i55)) {
            if (!(hq10Var instanceof p90)) {
                throw new NoWhenBranchMatchedException();
            }
            c = 2;
        }
        String strM43753y0 = g6f.m43753y0(map.entrySet(), ", ", "[", "]", upp.f232753U0, 24);
        String strMo26689e = hq10Var.mo48193c().mo26689e();
        xfr type = hq10Var.mo48193c().getType();
        txp txpVar = this.f234977a;
        txpVar.getClass();
        wzo0 wzo0VarM12770w = PlaybackGrabbingResult.m12770w();
        if (c2 == 1) {
            str = "do_not_grab";
        } else {
            if (c2 != 2) {
                throw null;
            }
            str = "grab";
        }
        wzo0VarM12770w.m89465v(str);
        wzo0VarM12770w.m89459m(strMo26689e);
        String strName = type.name();
        Locale locale = Locale.ROOT;
        wzo0VarM12770w.m89460q(strName.toLowerCase(locale));
        if (c3 == 1) {
            str2 = "background";
        } else {
            if (c3 != 2) {
                throw null;
            }
            str2 = "foreground";
        }
        wzo0VarM12770w.m89461r(str2);
        if (c4 == 1) {
            str3 = "paused";
        } else {
            if (c4 != 2) {
                throw null;
            }
            str3 = "playing";
        }
        wzo0VarM12770w.m89467x(str3);
        if (c == 1) {
            str4 = "app_became_foreground";
        } else {
            if (c != 2) {
                throw null;
            }
            str4 = "active_audio_output_changed";
        }
        wzo0VarM12770w.m89466w(str4);
        wzo0VarM12770w.m89464u(strM43753y0);
        if (nzl0Var != null) {
            wzo0VarM12770w.m89463t(nzl0Var.name().toLowerCase(locale));
        }
        if (i != 0) {
            switch (i) {
                case 1:
                    str5 = "APP";
                    break;
                case 2:
                    str5 = "CAR";
                    break;
                case 3:
                    str5 = "HEADPHONES";
                    break;
                case 4:
                    str5 = "SPEAKER";
                    break;
                case 5:
                    str5 = "WEARABLE";
                    break;
                case 6:
                    str5 = "GLASSES";
                    break;
                case 7:
                    str5 = "UNKNOWN";
                    break;
                default:
                    throw null;
            }
            wzo0VarM12770w.m89462s(str5.toLowerCase(locale));
        }
        txpVar.f224743a.m73616a(wzo0VarM12770w.build());
    }
}
