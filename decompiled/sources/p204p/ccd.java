package p204p;

import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ccd extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dcd f36383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccd(dcd dcdVar, int i) {
        super(4);
        this.f36382a = i;
        this.f36383b = dcdVar;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        av91 av91Var;
        String string;
        int i = this.f36382a;
        dcd dcdVar = this.f36383b;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                return new geg0(dcdVar.f47498c);
            default:
                bcd bcdVar = (bcd) obj2;
                xbd xbdVar = (xbd) obj4;
                zt91 zt91Var = ((geg0) obj).f79118a;
                boolean z = bcdVar instanceof zbd;
                vbd vbdVar = vbd.f239476a;
                if (z) {
                    if (!(xbdVar instanceof wbd)) {
                        if (xbdVar.equals(vbdVar)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("go_to_profile_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                    String str = ((zbd) bcdVar).f281299a.f178685e;
                    dv91 dv91Var = new dv91("hit", 1);
                    string = str != null ? str.toString() : null;
                    av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                } else {
                    if (!(bcdVar instanceof acd)) {
                        if (bcdVar instanceof ybd) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (xbdVar instanceof wbd) {
                        return null;
                    }
                    if (!xbdVar.equals(vbdVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c3 = zt91Var.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("header", null, null, null, null));
                    yt91VarM96903c3.f276056j = false;
                    yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("faces_button", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                    String str2 = dcdVar.f47497b;
                    Set set = mjd.f144234a;
                    String strConcat = "spotify:chat-details:".concat(str2);
                    dv91 dv91Var2 = new dv91("hit", 1);
                    string = strConcat != null ? strConcat.toString() : null;
                    av91Var = new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
        }
    }
}
