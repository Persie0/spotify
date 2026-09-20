package p204p;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard$Events;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class wga extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f251012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wga(Object obj, int i) {
        super(1);
        this.f251011a = i;
        this.f251012b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        CappingState cappingState;
        int i = this.f251011a;
        nau nauVar = nau.f152117a;
        int i2 = 21;
        boolean zMo35686b = true;
        zMo35686b = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f251012b;
        switch (i) {
            case 0:
                return ((xga) obj2).f261255f;
            case 1:
                jpz0.m54000n((mpz0) obj, ((uha) obj2).f230394e);
                return w2a1Var;
            case 2:
                tiv0 tiv0Var = (tiv0) obj;
                oka okaVar = (oka) obj2;
                if (okaVar.f63766L0) {
                    x0h1.m89578u(okaVar.m40262v1(), null, 0, new gw8((Object) okaVar, (Object) tiv0Var, (fbk) (objArr == true ? 1 : 0), i2), 3);
                }
                return w2a1Var;
            case 3:
                return (fiz) ((ay0) obj2).invoke();
            case 4:
                ((fna) obj2).m42213k(new vma((String) obj));
                return w2a1Var;
            case 5:
                olm0 olm0Var = (olm0) obj;
                ik40 ik40Var = (ik40) obj2;
                z9j0 z9j0Var = (z9j0) ik40Var.f103007c;
                if (olm0Var instanceof io3) {
                    d850 d850Var = ((io3) olm0Var).f104108a;
                    if (d850Var != null) {
                        z9j0Var.mo47342b(xoc1.f264240z1.f243453a, d850Var, null);
                    } else {
                        z9j0Var.mo47346g(xoc1.f264240z1.f243453a);
                    }
                } else {
                    dcy0 dcy0Var = (dcy0) ik40Var.f103011g;
                    if (dcy0Var == null) {
                        wj50.m88260d0("scannablesNavigator");
                        throw null;
                    }
                    zMo35686b = dcy0Var.mo35686b(olm0Var);
                }
                return Boolean.valueOf(zMo35686b);
            case 6:
                ((Number) obj).intValue();
                g2r g2rVar = (g2r) obj2;
                String str = g2rVar.f75998e;
                String str2 = g2rVar.f75996c;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-browse-evo";
                yt91VarM50626j.f276052f = "2.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276051e = str;
                yt91VarM50626j.f276050d = str2;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                h6f.m46715L("find", "browse/genres");
                st91 st91Var = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a));
            case 7:
                d850 d850Var2 = (d850) obj;
                c06 c06Var = (c06) obj2;
                if (((lrt0) c06Var.f32695c).mo29774a().f180666a) {
                    ydk0.m93461b((ydk0) c06Var.f32694b, d850Var2.f46380a, 2);
                } else {
                    ust0 ust0Var = (ust0) c06Var.f32696d;
                    g631 g631Var = ust0Var.f233687e;
                    q831 q831Var = ust0Var.f233683a;
                    if (q831Var.m72301f()) {
                        q831Var.m72305j(g631Var);
                    } else {
                        q831Var.m72307m(g631Var);
                    }
                }
                return w2a1Var;
            case 8:
                gpa gpaVar = new gpa((Context) obj);
                bpa bpaVar = (bpa) obj2;
                gpaVar.setBubbleData(bpaVar.f29364b);
                gpaVar.setContentDescription(bpaVar.f29365c);
                fz6.m43142F(gpaVar);
                return gpaVar;
            case 9:
                q9b q9bVar = (q9b) obj2;
                q9bVar.f186554c.m91445b(q9bVar.f186555d, (gh0) obj);
                return w2a1Var;
            case 10:
                ((icp) obj).f100858d = new C2198o1(obj2, (fbk) (objArr2 == true ? 1 : 0), 9);
                return w2a1Var;
            case 11:
                jpz0.m54000n((mpz0) obj, ((thb) obj2).f220389e);
                return w2a1Var;
            case 12:
                Boolean boolM45949u = gwg1.m45949u((String) obj);
                if (boolM45949u != null) {
                    return new ysk(Boolean.valueOf(!boolM45949u.booleanValue()), 27);
                }
                w280 w280Var = (w280) ((u280) ((i26) obj2).f97753c);
                return mvl0.m62953p(kyf1.m57709n(new px70(((mv31) w280Var.f247272a).m62896q(w280.f247271b), zMo35686b ? 1 : 0), new n860(w280Var, objArr3 == true ? 1 : 0, 15)));
            case 13:
                return ((aub) obj2).m27171a(1, (String) obj);
            case 14:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("SELECT * FROM message_id_and_capping");
                try {
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G1, "messageKey");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G1, "capping");
                    ArrayList arrayList = new ArrayList();
                    while (ezx0VarMo63454G1.mo24841E1()) {
                        String strMo24844h1 = ezx0VarMo63454G1.mo24844h1(iM88306q);
                        byte[] blob = ezx0VarMo63454G1.isNull(iM88306q2) ? null : ezx0VarMo63454G1.getBlob(iM88306q2);
                        kub kubVar = (kub) ((nub) obj2).f158553c.getValue();
                        kubVar.getClass();
                        if (blob != null) {
                            try {
                                cappingState = (CappingState) kubVar.f126498a.m92669a(CappingState.INSTANCE.serializer(), blob);
                            } catch (Exception e) {
                                Logger.m3966b(edb.m38564m("ClientMessagingPlatform: Error decoding capping: ", e.getMessage()), new Object[0]);
                                cappingState = null;
                            }
                        } else {
                            cappingState = null;
                        }
                        arrayList.add(new kpe0(strMo24844h1, cappingState));
                        break;
                    }
                    ezx0VarMo63454G1.close();
                    return arrayList;
                } catch (Throwable th) {
                    ezx0VarMo63454G1.close();
                    throw th;
                }
            case 15:
                mpz0 mpz0Var = (mpz0) obj;
                i1c i1cVar = (i1c) obj2;
                String str3 = i1cVar.f97469f;
                if (str3.length() == 0) {
                    str3 = i1cVar.f97465b;
                }
                jpz0.m54000n(mpz0Var, str3);
                return w2a1Var;
            case 16:
                ((fix0) obj2).f70011a.invoke((f4c1) obj);
                return w2a1Var;
            case 17:
                ((xpi0) obj).m91705a((RecyclerView) obj2);
                return w2a1Var;
            case 18:
                bms bmsVar = (bms) obj;
                ((sac) obj2).m96360k(bmsVar.f28611a, bmsVar.f28612b);
                return w2a1Var;
            case 19:
                return ((bdc) obj2).f26077c;
            case 20:
                if (adc.f14599a[((PermissionsCard$Events) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cdc cdcVar = (cdc) obj2;
                kv91 kv91Var = cdcVar.f36867t;
                yt91 yt91VarM96903c = cdcVar.f36855X.f25561b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("settings_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("open_os_settings", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 21:
                String str4 = ((cjm0) obj).f38620c;
                return new dec(new cec(str4 != null ? new sdc(((Context) ((z43) obj2).f279103b).getString(R.string.creator_section_button_show_all), str4) : null));
            case 22:
                return ((zec) obj2).f281992c;
            case 23:
                sfc sfcVar = (sfc) obj2;
                if (rfc.f198575a[((PermissionsCard$Events) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                kv91 kv91Var2 = (kv91) sfcVar.f208526i.get();
                yt91 yt91VarM96903c2 = sfcVar.f208527t.f25561b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("settings_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("open_os_settings", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 24:
                jpz0.m53997k((mpz0) obj, new b4f(((ggc) obj2).f79632c.size(), 1));
                return w2a1Var;
            case 25:
                jpz0.m53998l((mpz0) obj, new d4f(((qgc) obj2).f188439c, 0));
                return w2a1Var;
            case 26:
                Map map = ((hz80) obj).f96822X;
                ((z080) obj2).getClass();
                return Boolean.valueOf(wj50.m88271j(map.get("is_genpods_with_disconnected_connectors"), "true"));
            case 27:
                return ((slc) obj2).f210376c;
            case 28:
                pjf1.m70155l((icp) obj, new ik9((fmc) obj2, i2));
                return w2a1Var;
            default:
                MobiusLoop mobiusLoop = ((tpc) obj2).f222483O0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return w2a1Var;
                }
                wj50.m88260d0("mobiusLoop");
                throw null;
        }
    }
}
