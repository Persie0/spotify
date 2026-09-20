package p204p;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import spotify.connectivity.http.proto.ConnectionMetrics;
import spotify.connectivity.http.proto.TransactionMetrics;

/* JADX INFO: loaded from: classes8.dex */
public final class zc30 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f281448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc30(Object obj, int i) {
        super(1);
        this.f281447a = i;
        this.f281448b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        d69 d69Var;
        fty ftyVar;
        zc30 zc30Var = this;
        switch (zc30Var.f281447a) {
            case 0:
                ndy ndyVar = (ndy) zc30Var.f281448b;
                ((yg0) ndyVar.f152865b).mo35747a((Intent) ndyVar.f152866c);
                return w2a1.f247311a;
            case 1:
                iu81 iu81Var = (iu81) obj;
                HttpConnection httpConnection = (HttpConnection) zc30Var.f281448b;
                wyi wyiVarM97559u = ConnectionMetrics.m97559u();
                wyiVarM97559u.m89366u(iu81Var.f105885a / 1000.0d);
                wyiVarM97559u.m89365t(iu81Var.f105887c);
                wyiVarM97559u.m89364s(iu81Var.f105888d);
                ?? r4 = iu81Var.f105889e;
                ArrayList arrayList = new ArrayList(i6f.m49804T(r4, 10));
                for (dy81 dy81Var : r4) {
                    cy81 cy81VarM97562C = TransactionMetrics.m97562C();
                    cy81VarM97562C.m34356r(dy81Var.f54233a);
                    cy81VarM97562C.m34355q(dy81Var.f54235c);
                    int iOrdinal = dy81Var.f54245m.ordinal();
                    if (iOrdinal == 0) {
                        d69Var = d69.BEARER_CELLULAR;
                    } else if (iOrdinal == 1) {
                        d69Var = d69.BEARER_WIFI;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d69Var = d69.BEARER_UNKNOWN;
                    }
                    cy81VarM97562C.m34354m(d69Var);
                    cy81VarM97562C.m34360v(dy81Var.f54246n);
                    cy81VarM97562C.m34361w(dy81Var.f54247o);
                    int iM38547C = edb.m38547C(dy81Var.f54248p);
                    if (iM38547C == 0) {
                        ftyVar = fty.UNKNOWN;
                    } else if (iM38547C == 1) {
                        ftyVar = fty.NETWORK;
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ftyVar = fty.LOCALCACHE;
                    }
                    cy81VarM97562C.m34359u(ftyVar);
                    String str = dy81Var.f54236d;
                    if (str != null) {
                        cy81VarM97562C.m34350A(str);
                    }
                    Integer num = dy81Var.f54237e;
                    if (num != null) {
                        cy81VarM97562C.m34353D(num.intValue());
                    }
                    String str2 = dy81Var.f54238f;
                    if (str2 != null) {
                        cy81VarM97562C.m34362x(str2);
                    }
                    Long l = dy81Var.f54239g;
                    if (l != null) {
                        cy81VarM97562C.m34358t(l.longValue());
                    }
                    Long l2 = dy81Var.f54240h;
                    if (l2 != null) {
                        cy81VarM97562C.m34357s(l2.longValue());
                    }
                    Long l3 = dy81Var.f54241i;
                    if (l3 != null) {
                        cy81VarM97562C.m34364z(l3.longValue());
                    }
                    Long l4 = dy81Var.f54242j;
                    if (l4 != null) {
                        cy81VarM97562C.m34363y(l4.longValue());
                    }
                    Long l5 = dy81Var.f54243k;
                    if (l5 != null) {
                        cy81VarM97562C.m34352C(l5.longValue());
                    }
                    Long l6 = dy81Var.f54244l;
                    if (l6 != null) {
                        cy81VarM97562C.m34351B(l6.longValue());
                    }
                    arrayList.add((TransactionMetrics) cy81VarM97562C.build());
                }
                wyiVarM97559u.m89361m(arrayList);
                Integer num2 = iu81Var.f105886b;
                if (num2 != null) {
                    wyiVarM97559u.m89367v(num2.intValue());
                }
                wyiVarM97559u.m89363r("{\"http_engine\":\"okhttp\"}");
                httpConnection.onMetrics((ConnectionMetrics) wyiVarM97559u.build());
                return w2a1.f247311a;
            case 2:
                ej10 ej10Var = (ej10) zc30Var.f281448b;
                n2x0 n2x0Var = ((o2x0) obj).f161171a;
                int i = n2x0Var.f149860d;
                Throwable th = (Throwable) ej10Var.invoke(Integer.valueOf(i));
                if (th != null) {
                    return th;
                }
                if (n2x0Var.f149852O0) {
                    return null;
                }
                return new IOException(s571.m77246e(i, "Unsuccessful response from server. Error code: "));
            case 3:
                bsa bsaVar = (bsa) zc30Var.f281448b;
                d850 d850VarM30361F = bsa.m30361F(bsaVar, 12);
                nhg1.m64493m((w6j0) bsaVar.f30270f, d850VarM30361F != null ? new z2j0(null, d850VarM30361F.f46380a) : x2j0.f257512a);
                ((if0) bsaVar.f30269e).m50412d(new nzq(mzq.f148760b, null), null, false);
                return w2a1.f247311a;
            case 4:
                ((icp) obj).f100858d = new C1870fr((C1947hm) zc30Var.f281448b, (fbk) null, 15);
                return w2a1.f247311a;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    f640 f640Var = (f640) zc30Var.f281448b;
                    xfg0 xfg0Var = f640Var.f66257b;
                    xfg0Var.getClass();
                    yt91 yt91VarM96903c = xfg0Var.f260959b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("main_image_row", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    f640Var.f66256a.mo57453r(new av91("", "", new dv91("scroll", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c.m94607a(), xfg0Var.f260958a, System.currentTimeMillis()), null);
                }
                return w2a1.f247311a;
            case 6:
                mpz0 mpz0Var = (mpz0) obj;
                jpz0.m54000n(mpz0Var, ((p640) zc30Var.f281448b).f174283b);
                jpz0.m54007u(mpz0Var, 0);
                return w2a1.f247311a;
            case 7:
                hzd0 hzd0Var = new hzd0();
                cw41 cw41Var = (cw41) zc30Var.f281448b;
                hzd0Var.mo33104m(new c3y((ebf0) cw41Var.f42642Y.getValue()));
                hzd0Var.mo49264n(cw41Var, new c53(hzd0Var, 4));
                return hzd0Var;
            case 8:
                plp plpVar = (plp) obj;
                e23 e23Var = (e23) zc30Var.f281448b;
                plpVar.m70267v(g840.class, (f840) ((wg61) e23Var.f55319d).getValue(), p740.f174558L0, p740.f174559M0, p740.f174562P0, false, zy20.f287451Q0);
                plpVar.m70267v(i840.class, (rxt) e23Var.f55320e, p740.f174560N0, p740.f174561O0, p740.f174563Q0, false, zy20.f287452R0);
                return w2a1.f247311a;
            case 9:
                f840 f840Var = (f840) zc30Var.f281448b;
                return f840Var.f66850a.mo26174a(new y640(f840Var.f66853d));
            case 10:
                ((lxe) zc30Var.f281448b).m60176b();
                return w2a1.f247311a;
            case 11:
                jpz0.m54000n((mpz0) obj, ((x3o0) zc30Var.f281448b).f257842f);
                return w2a1.f247311a;
            case 12:
                fb40 fb40Var = (fb40) obj;
                kb40 kb40Var = (kb40) this.f281448b;
                fbk fbkVar = null;
                return new zux(new nzx0(new ty20(fb40Var, kb40Var, fbkVar, 5)), (fb40Var.f67708b == null || fb40Var.f67709c != null || fb40Var.f67710d) ? new ysk(Long.valueOf(System.currentTimeMillis()), 27) : new nzx0(new f620(kb40Var, fbkVar, 16)), new hb40(3, fbkVar), 1);
            case 13:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("SELECT * FROM import_records");
                try {
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G1, "uri");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G1, "stateType");
                    int iM88306q3 = wjf1.m88306q(ezx0VarMo63454G1, "progress");
                    int iM88306q4 = wjf1.m88306q(ezx0VarMo63454G1, "failureReason");
                    int iM88306q5 = wjf1.m88306q(ezx0VarMo63454G1, ContextTrack.Metadata.KEY_TITLE);
                    int iM88306q6 = wjf1.m88306q(ezx0VarMo63454G1, "artist");
                    int iM88306q7 = wjf1.m88306q(ezx0VarMo63454G1, "album");
                    int iM88306q8 = wjf1.m88306q(ezx0VarMo63454G1, "durationSeconds");
                    int iM88306q9 = wjf1.m88306q(ezx0VarMo63454G1, "coverArtUri");
                    int iM88306q10 = wjf1.m88306q(ezx0VarMo63454G1, "fileUri");
                    int iM88306q11 = wjf1.m88306q(ezx0VarMo63454G1, "contentType");
                    int iM88306q12 = wjf1.m88306q(ezx0VarMo63454G1, "showUri");
                    int iM88306q13 = wjf1.m88306q(ezx0VarMo63454G1, "imageToken");
                    int iM88306q14 = wjf1.m88306q(ezx0VarMo63454G1, "episodeUri");
                    ArrayList arrayList2 = new ArrayList();
                    while (ezx0VarMo63454G1.mo24841E1()) {
                        String strMo24844h1 = ezx0VarMo63454G1.mo24844h1(iM88306q);
                        int i2 = iM88306q;
                        int i3 = iM88306q14;
                        arrayList2.add(new wg40(strMo24844h1, vg40.m85392b((vg40) zc30Var.f281448b, ezx0VarMo63454G1.mo24844h1(iM88306q2)), ezx0VarMo63454G1.getDouble(iM88306q3), ezx0VarMo63454G1.isNull(iM88306q4) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q4), ezx0VarMo63454G1.isNull(iM88306q5) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q5), ezx0VarMo63454G1.isNull(iM88306q6) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q6), ezx0VarMo63454G1.isNull(iM88306q7) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q7), ezx0VarMo63454G1.isNull(iM88306q8) ? null : Integer.valueOf((int) ezx0VarMo63454G1.getLong(iM88306q8)), ezx0VarMo63454G1.isNull(iM88306q9) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q9), ezx0VarMo63454G1.isNull(iM88306q10) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q10), ezx0VarMo63454G1.isNull(iM88306q11) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q11), ezx0VarMo63454G1.isNull(iM88306q12) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q12), ezx0VarMo63454G1.isNull(iM88306q13) ? null : ezx0VarMo63454G1.mo24844h1(iM88306q13), ezx0VarMo63454G1.isNull(i3) ? null : ezx0VarMo63454G1.mo24844h1(i3)));
                        zc30Var = this;
                        iM88306q14 = i3;
                        iM88306q = i2;
                        break;
                    }
                    return arrayList2;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 14:
                ((icp) obj).f100858d = new C2001j3((wa30) zc30Var.f281448b, (fbk) null, 15);
                return w2a1.f247311a;
            case 15:
                return new fju(((h36) zc30Var.f281448b).f87146b.f60295c, 16).mo26174a(null);
            case 16:
                ((icp) obj).f100858d = new C1870fr((pev0) zc30Var.f281448b, (fbk) null, 17);
                return w2a1.f247311a;
            case 17:
                return ((nju) ((b7v0) zc30Var.f281448b).f24399d).mo26174a(null);
            case 18:
                jpz0.m54000n((mpz0) obj, ((vt40) zc30Var.f281448b).f244551d);
                return w2a1.f247311a;
            case 19:
                llk0 llk0Var = (llk0) obj;
                InputConnection inputConnection = llk0Var.f134656b;
                if (inputConnection != null) {
                    llk0Var.m59308a(inputConnection);
                    llk0Var.f134656b = null;
                }
                gw40 gw40Var = (gw40) zc30Var.f281448b;
                qqi0 qqi0Var = gw40Var.f84920d;
                Object[] objArr = qqi0Var.f191608a;
                int i4 = qqi0Var.f191610c;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        i5 = -1;
                    } else if (!wj50.m88271j((yjd1) objArr[i5], llk0Var)) {
                        i5++;
                    }
                }
                if (i5 >= 0) {
                    qqi0Var.m73565l(i5);
                }
                if (qqi0Var.f191610c == 0) {
                    gw40Var.f84918b.invoke();
                }
                return w2a1.f247311a;
            case 20:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = zy20.f287461Y0;
                z080 z080Var = (z080) zc30Var.f281448b;
                qspVar.f192165d = new gz40(z080Var, 0);
                qspVar.f192166e = new gz40(z080Var, 1);
                return w2a1.f247311a;
            case 21:
                return new vwt((bmh) zc30Var.f281448b, 9);
            case 22:
                Object obj2 = ((s6x0) obj).f206218a;
                tey teyVar = (tey) zc30Var.f281448b;
                Throwable thM77348a = s6x0.m77348a(obj2);
                if (thM77348a != null) {
                    u6b u6bVar = (u6b) teyVar.f219809c;
                    String strM55263v = k3h1.m55263v(thM77348a);
                    qre0 qre0Var = u6bVar.f227256a;
                    fwx fwxVarM5543r = ExternalAccessoryRemoteError.m5543r();
                    fwxVarM5543r.m42983m("jam_settings");
                    fwxVarM5543r.m42985r();
                    fwxVarM5543r.m42984q(strM55263v);
                    qre0Var.m73616a((ExternalAccessoryRemoteError) fwxVarM5543r.build());
                }
                return w2a1.f247311a;
            case 23:
                ((fyc0) ((gzl) zc30Var.f281448b).f85983e).invoke(new r550((String) obj));
                return w2a1.f247311a;
            case 24:
                l3b l3bVar = (l3b) obj;
                v850 v850Var = (v850) zc30Var.f281448b;
                return l3bVar.m57996b(new ne30(8, v850Var, v850Var.f238387O0.mo29107a(l3bVar.f129254a.mo39635n(), l3bVar.f129254a.getLayoutDirection(), l3bVar)));
            case 25:
                MobiusLoop mobiusLoop = ((p950) zc30Var.f281448b).f175159t;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("mobiusLoop");
                throw null;
            case 26:
                wa50 wa50Var = (wa50) zc30Var.f281448b;
                qsp qspVar2 = (qsp) ((hmh0) obj);
                qspVar2.f192165d = new ias(wa50Var, 26);
                qspVar2.f192166e = new ms40(wa50Var, 8);
                return w2a1.f247311a;
            case 27:
                View view = (View) obj;
                ya50 ya50Var = (ya50) zc30Var.f281448b;
                int iM91648z = (int) (ya50Var.f270800c.m91648z() * view.getResources().getDisplayMetrics().density);
                ya50Var.f270801d.getClass();
                view.setTag(R.id.custom_top_spacing, Integer.valueOf(iM91648z));
                return w2a1.f247311a;
            case 28:
                ib50 ib50Var = (ib50) zc30Var.f281448b;
                synchronized (ib50Var.f100440c) {
                    ib50Var.f100441d = 5;
                    ib50Var.f100443f = null;
                }
                return w2a1.f247311a;
            default:
                return (k5m0) ((bdn) ((vi31) zc30Var.f281448b).f241609a.m90441a((m500) ((Activity) obj))).f26163a.get();
        }
    }
}
