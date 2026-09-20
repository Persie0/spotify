package p204p;

import android.app.AlertDialog;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.campfire.share.impl.ShareSheetOnPlatformSectionImpl;
import com.spotify.encoreconsumermobile.elements.badge.freshness.FreshnessBadgeView;
import com.spotify.music.R;
import com.spotify.share.sheet.sections.offplatform.impl.ShareSheetOffPlatformSectionImpl;
import com.spotify.share.sheet.sections.preview.disclosure.impl.ShareSheetDisclosureSectionImpl;
import com.spotify.share.sheet.sections.preview.previewrow.impl.ShareSheetPreviewSectionImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class mg01 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f143250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg01(Object obj, int i) {
        super(0);
        this.f143249a = i;
        this.f143250b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f143249a) {
            case 0:
                return new dk0((pf01) this.f143250b, 13);
            case 1:
                return new dk0((pf01) this.f143250b, 14);
            case 2:
                return new dk0((pf01) this.f143250b, 15);
            case 3:
                return (hod) ((t2c) ((x1p0) this.f143250b).f257251f).invoke();
            case 4:
                vyr0 vyr0Var = (vyr0) this.f143250b;
                return ((m12) vyr0Var.f246314c).m60515l(((Context) vyr0Var.f246313b).getApplicationContext().getCacheDir(), "shareablesdir");
            case 5:
                return new cjc0(((is01) this.f143250b).f105085b, mo01.f145510L0);
            case 6:
                ((ms01) this.f143250b).f146660b.invoke();
                return w2a1.f247311a;
            case 7:
                ntv ntvVar = (ntv) this.f143250b;
                if (!ntvVar.f158153b) {
                    hv31 hv31Var = ((iud) ((fud) ((wg61) ntvVar.f158158g).getValue())).f105947b;
                    lv31 lv31VarEdit = hv31Var.edit();
                    fv31 fv31Var = iud.f105940e;
                    lv31VarEdit.m60049b(fv31Var, hv31Var.mo48717l(fv31Var, 0) + 1);
                    lv31VarEdit.m60054g();
                    ntvVar.f158153b = true;
                }
                return w2a1.f247311a;
            case 8:
                qs01 qs01Var = (qs01) this.f143250b;
                qs01Var.f191942V1.invoke();
                kv91 kv91Var = qs01Var.f191941U1;
                if (kv91Var == null) {
                    wj50.m88260d0("ubiLogger");
                    throw null;
                }
                geg0 geg0Var = qs01Var.f191943W1;
                if (geg0Var == null) {
                    wj50.m88260d0("mobileChatEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("share_history_sheet", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("cta_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                qs01Var.dismiss();
                return w2a1.f247311a;
            case 9:
                return ((ShareSheetDisclosureSectionImpl) this.f143250b).f6657a;
            case 10:
                return new cjc0(((ShareSheetOffPlatformSectionImpl) this.f143250b).f6656a, y011.f267862d);
            case 11:
                return new cjc0(((ShareSheetOnPlatformSectionImpl) this.f143250b).f3272a, y011.f267867i);
            case 12:
                return Integer.valueOf(((q311) this.f143250b).f184777a.m86437v());
            case 13:
                return new cjc0(((ShareSheetPreviewSectionImpl) this.f143250b).f6658a, y011.f267840M0);
            case 14:
                z711 z711Var = (z711) this.f143250b;
                kv91 kv91Var2 = z711Var.f280065c;
                ydh0 ydh0Var = (ydh0) z711Var.f280070h.getValue();
                ydh0Var.getClass();
                yt91 yt91VarM96903c3 = ydh0Var.f271771a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("gotit_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1.f247311a;
            case 15:
                ua11 ua11Var = (ua11) this.f143250b;
                tin tinVar = ua11Var.f228327a;
                z9j0 z9j0Var = ua11Var.f228328b;
                switch (tinVar.f220711a) {
                    case 0:
                        return new qa11((e940) ((phn) tinVar.f220712b).f177688b.f211626P7.get(), z9j0Var);
                    default:
                        return new qa11((e940) ((vfn) tinVar.f220712b).f241004b.f211626P7.get(), z9j0Var);
                }
            case 16:
                qc11 qc11Var = (qc11) this.f143250b;
                return qc11Var.f187238b.mo35843c(qc11Var.f187237a);
            case 17:
                return (FreshnessBadgeView) ((View) ((mp11) this.f143250b).f145835j).findViewById(R.id.freshness_badge);
            case 18:
                return ((lnn) this.f143250b).m59498a(true);
            case 19:
                ((qpx) this.f143250b).dispose();
                return w2a1.f247311a;
            case 20:
                ((ay21) this.f143250b).m27478n(new xx21(1, null));
                return w2a1.f247311a;
            case 21:
                sz8 sz8Var = (sz8) this.f143250b;
                return ((rf50) sz8Var.f215420b).m75422a((hc80) sz8Var.f215422d, ((j8g0) sz8Var.f215423e).mo24361d());
            case 22:
                azu0 azu0Var = (azu0) ((qal) this.f143250b).f186898d;
                kv91 kv91Var3 = (kv91) azu0Var.f21690b;
                bbg0 bbg0Var = (bbg0) azu0Var.f21691c;
                bbg0Var.getClass();
                yt91 yt91VarM96903c4 = bbg0Var.f25561b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("dismiss_cta", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1.f247311a;
            case 23:
                try {
                    ((AlertDialog) this.f143250b).dismiss();
                    break;
                } catch (IllegalArgumentException unused) {
                }
                return w2a1.f247311a;
            case 24:
                w0e1 w0e1Var = (w0e1) this.f143250b;
                return ((t740) w0e1Var.f246720b).mo40265a(di50.f49255h, (uwa) w0e1Var.f246721c, (z9j0) w0e1Var.f246722d, w0e1.f246717f, true, false, false, false, false, (7648 & 512) == 0, false, null, null);
            case 25:
                pzs0 pzs0Var = (pzs0) this.f143250b;
                DateFormat patternInstance = DateFormat.getPatternInstance("MMMdy", pzs0.m71768d(pzs0Var));
                patternInstance.setTimeZone((TimeZone) pzs0Var.f183795c);
                return patternInstance;
            case 26:
                return h1k.m46460a(((iu11) this.f143250b).f105821i);
            case 27:
                return (FrameLayout) mec1.m61562n((LinearLayout) ((C2636z3) this.f143250b).f278726e, R.id.heading_container);
            case 28:
                flw0 flw0Var = (flw0) ((jk80) this.f143250b).f113236b;
                return new pu11(new cju(((eju) flw0Var.f70878b).f60297e, 2), (jiz) flw0Var.f70879c, (Context) flw0Var.f70880d);
            default:
                return nxf1.m65842u((yw11) this.f143250b);
        }
    }
}
