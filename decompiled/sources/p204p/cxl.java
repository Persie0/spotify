package p204p;

import android.animation.AnimatorSet;
import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class cxl extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43057b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxl(Object obj) {
        super(1);
        this.f43056a = 7;
        this.f43057b = (Object[]) obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, p.izd1] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        gh00 j20Var;
        String string;
        vg3 vg3Var;
        switch (this.f43056a) {
            case 0:
                plp plpVar = (plp) obj;
                e23 e23Var = (e23) this.f43057b;
                rk0 rk0Var = (rk0) e23Var.f55318c;
                cwm0 cwm0Var = (cwm0) e23Var.f55319d;
                gh00 gh00Var = (gh00) e23Var.f55320e;
                plpVar.m70267v(nwl.class, ((i4o) rk0Var.f199934b).m49678a(cwm0Var, gh00Var), ssl.f213652V0, ssl.f213655X0, axl.f20922i, false, bxl.f31913f);
                plpVar.m70267v(owl.class, ((t3o) rk0Var.f199935c).m80014a(cwm0Var, gh00Var), ssl.f213657Y0, ssl.f213659Z0, axl.f20923t, false, bxl.f31914g);
                plpVar.m70267v(twl.class, ((f4o) rk0Var.f199936d).m40736a(cwm0Var, gh00Var), ssl.f213660a1, ssl.f213662b1, axl.f20906X, false, bxl.f31915h);
                plpVar.m70267v(vwl.class, ((p3o) rk0Var.f199937e).m69079a(cwm0Var, gh00Var), ssl.f213664c1, axl.f20913b, axl.f20908Y, false, bxl.f31916i);
                plpVar.m70267v(rwl.class, ((k4o) rk0Var.f199938f).m55402a(cwm0Var, gh00Var), axl.f20915c, ssl.f213642L0, axl.f20910Z, false, sik.f209539b1);
                plpVar.m70267v(pwl.class, ((m4o) rk0Var.f199940h).m60815a(cwm0Var, gh00Var), ssl.f213643M0, ssl.f213644N0, axl.f20917d, false, sik.f209541c1);
                plpVar.m70267v(uwl.class, ((o4o) rk0Var.f199939g).m66248a(cwm0Var, gh00Var), ssl.f213645O0, ssl.f213646P0, axl.f20918e, false, bxl.f31907b);
                plpVar.m70267v(qwl.class, w9h1.m87517y(((e5o) rk0Var.f199941i).m37833a(cwm0Var, gh00Var), null, null, 3), ssl.f213647Q0, ssl.f213648R0, axl.f20919f, false, bxl.f31909c);
                plpVar.m70267v(wwl.class, w9h1.m87517y(((f5o) rk0Var.f199942t).m40771a(cwm0Var, gh00Var), null, null, 3), ssl.f213649S0, ssl.f213650T0, axl.f20920g, false, bxl.f31911d);
                plpVar.m70267v(swl.class, ((d4o) rk0Var.f199932X).m34929a(cwm0Var, gh00Var), ssl.f213651U0, ssl.f213653W0, axl.f20921h, false, bxl.f31912e);
                return w2a1.f247311a;
            case 1:
                return new nzx0(new w1m((Set) obj, (o1m) this.f43057b, (fbk) null, 0));
            case 2:
                return ((x1m) this.f43057b).f257230d;
            case 3:
                return ((kju) ((b7v0) this.f43057b).f24399d).mo26174a(null);
            case 4:
                C1790du c1790du = (C1790du) this.f43057b;
                c1790du.f52930h = p3n0.m69075f((luk) c1790du.f52927e);
                return new C1865fm(c1790du, 27);
            case 5:
                ((icp) obj).f100858d = new C2001j3((s5m) this.f43057b, (fbk) null, 7);
                return w2a1.f247311a;
            case 6:
                w7m w7mVar = (w7m) obj;
                y7m y7mVar = (y7m) this.f43057b;
                return new zux(fag1.m41151B(y7mVar.f270105b, y7mVar.f270109f, w7mVar), y7mVar.f270104a.mo53908a(w7mVar.f248717a), new ysl(3, 3, (fbk) null), 1);
            case 7:
                Object obj2 = ((Object[]) this.f43057b)[((Number) obj).intValue()];
                if (obj2 != null) {
                    return (String) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            case 8:
                as5 as5Var = (as5) this.f43057b;
                return fag1.m41173v((pgo) as5Var.f19299b, (tjo) as5Var.f19300c, (v3m) obj);
            case 9:
                return Boolean.valueOf(wj50.m88271j(((rza) ((pqm0) obj).f180350a).f204102a, ((dya) this.f43057b).f54254b.f204102a));
            case 10:
                ((Number) obj).intValue();
                return (fiz) ((aio) this.f43057b).f16067c.get();
            case 11:
                List<kho> items = ((vjo) this.f43057b).f242023a.getData().mo28634a(obj).getItems();
                ArrayList arrayList = new ArrayList();
                for (kho khoVar : items) {
                    tn61 tn61Var = khoVar.f122697d;
                    k35 k35Var = khoVar.f122694a;
                    if (tn61Var == null) {
                        tn61Var = k35Var.f118762a;
                    }
                    if (!(tn61Var instanceof jqx) && !(k35Var.f118763b instanceof String)) {
                        throw new IllegalStateException("You can only convert data statements to required meta data if all the tables are ExtendedMetadataTable");
                    }
                    Object obj3 = k35Var.f118763b;
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                return Collections.singletonMap(w2a1.f247311a, g6f.m43736n1(arrayList));
            case 12:
                List list = (List) obj;
                int size = list.size();
                sko skoVar = (sko) this.f43057b;
                int i = skoVar.f210170b;
                if (size == i) {
                    return skoVar.f210171c.invoke(list);
                }
                final String strM38560i = edb.m38560i(list.size(), i, "Mismatching number of values between the table values response array (", " items) and the DataStatement parameter pack (", " items)");
                throw new Exception(strM38560i) { // from class: com.spotify.kodiak.dataloader.statement.DataStatement$DataStatementError

                    /* JADX INFO: renamed from: a */
                    public final String f5002a;

                    {
                        super(strM38560i);
                        this.f5002a = strM38560i;
                    }

                    @Override // java.lang.Throwable
                    public final String getMessage() {
                        return this.f5002a;
                    }
                };
            case 13:
                gww0 gww0Var = (gww0) this.f43057b;
                if (gww0Var instanceof fww0) {
                    j20Var = new j20(gww0Var, 16);
                } else {
                    if (!(gww0Var instanceof eww0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j20Var = m1k.f139022i;
                }
                return (Boolean) j20Var.invoke(Collections.singletonMap(gww0Var.getKey(), new cbf0(obj)));
            case 14:
                jpz0.m54000n((mpz0) obj, ((d400) this.f43057b).f45042d);
                return w2a1.f247311a;
            case 15:
                noo nooVar = (noo) this.f43057b;
                v300 v300Var = nooVar.f156758b;
                ybv ybvVar = ((ty80) obj).f224877f;
                String str2 = ybvVar.f271271p;
                Map map = ybvVar.f271272q;
                boolean z = ((w300) v300Var).m87094a(str2) == u300.DAYLIST_SNAPSHOT;
                try {
                    string = (String) new qc7(z, nooVar, 2).invoke(pze1.m71734n6(z050.m95042r6(z ? (String) map.get("created") : (String) map.get("expires")), nooVar.f156760d));
                    break;
                } catch (Exception unused) {
                    string = null;
                }
                String str3 = ybvVar.f271258c;
                if (str3 == null) {
                    str3 = "";
                }
                if (string != null && !wl51.m88460J0(str3)) {
                    string = nooVar.f156757a.getResources().getString(R.string.header_timestamp_description, string, str3);
                    wj50.m88279p(string);
                } else if (string == null) {
                    string = str3;
                }
                return new nkx(string);
            case 16:
                return new iz80(((poo) this.f43057b).f179736a);
            case 17:
                clb clbVar = (clb) this.f43057b;
                x0h1.m89578u((c9k) clbVar.f39231b, null, 0, new r2m(clbVar, (gqo) obj, null, 9), 3);
                return w2a1.f247311a;
            case 18:
                fdx0 fdx0Var = (fdx0) obj;
                fdx0Var.m41395u(b9m.m28515o(1.0f, 1.0f));
                fdx0Var.m41389l(3.0f);
                fdx0Var.m41396v(fdx0Var.mo24619j() * ((shn0) this.f43057b).f209239a);
                fdx0Var.m41384f(false);
                return w2a1.f247311a;
            case 19:
                return new suo((ViewGroup) obj, ((wto) this.f43057b).f254988d);
            case 20:
                cqx cqxVar = (cqx) obj;
                nuo nuoVar = (nuo) this.f43057b;
                cqxVar.m33646a(nuoVar.f158683c, ee7.class, false);
                String str4 = nuoVar.f158683c;
                cqxVar.m33646a(str4, v140.class, false);
                cqxVar.m33646a(str4, cb7.class, false);
                cqxVar.m33646a(str4, pad1.class, false);
                cqxVar.m33646a(str4, p3r.class, false);
                return w2a1.f247311a;
            case 21:
                ((icp) obj).f100858d = new C1825es((e60) this.f43057b, (fbk) null, 12);
                return w2a1.f247311a;
            case 22:
                gh00 gh00Var2 = (gh00) ((mwo) this.f43057b).f147829b;
                int iOrdinal = ((q6y) obj).ordinal();
                if (iOrdinal == 0) {
                    vg3Var = vg3.f241103a;
                } else if (iOrdinal == 1) {
                    vg3Var = vg3.f241104b;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vg3Var = vg3.f241105c;
                }
                gh00Var2.invoke(vg3Var);
                return w2a1.f247311a;
            case 23:
                ((AnimatorSet) this.f43057b).cancel();
                return w2a1.f247311a;
            case 24:
                return new thl(((t6p) ((r6p) this.f43057b).f196333a.get()).f217590b, (msi) obj, 20);
            case 25:
                if (!(((nlq0) obj) instanceof nlq0)) {
                    throw new NoWhenBranchMatchedException();
                }
                xlh xlhVar = ((f9p) this.f43057b).f67314e;
                if (xlhVar != null) {
                    xlhVar.f263147a.invoke(yvk.f276694a);
                }
                return w2a1.f247311a;
            case 26:
                ((w9p) this.f43057b).f249214X.invoke(pjl.f178276a);
                return w2a1.f247311a;
            case 27:
                return (ovf) ((b7v0) this.f43057b).f24399d;
            case 28:
                return ((kfp) this.f43057b).f122207b;
            default:
                return (ovf) ((b7v0) this.f43057b).f24399d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxl(Object obj, int i) {
        super(1);
        this.f43056a = i;
        this.f43057b = obj;
    }
}
