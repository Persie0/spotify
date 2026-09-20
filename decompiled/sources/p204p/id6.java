package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class id6 implements vq21 {

    /* JADX INFO: renamed from: a */
    public static final ri5 f100952a;

    /* JADX INFO: renamed from: b */
    public static final si5 f100953b;

    /* JADX INFO: renamed from: c */
    public static final ti5 f100954c;

    /* JADX INFO: renamed from: d */
    public static sd40 f100955d;

    static {
        int i = 0;
        f100952a = new ri5(i);
        f100953b = new si5(i);
        f100954c = new ti5(i);
    }

    /* JADX INFO: renamed from: c */
    public static final void m50276c(b250 b250Var, fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(969728541);
        int i2 = (xq00Var.m91770i(b250Var) ? 4 : 2) | i;
        int i3 = 0;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            wpi0 wpi0Var = xwt.f266743a;
            fmu0 fmu0VarM69676b = pda0.m69676b(xq00Var);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = new e250(new ack(b250Var, i3));
                xq00Var.m91793t0(objM91750T);
            }
            e250 e250Var = (e250) objM91750T;
            boolean zM91766g = xq00Var.m91766g(fmu0VarM69676b) | xq00Var.m91766g(b250Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                e250Var.m37590d(new ack(b250Var, i3));
                n5q n5qVar = xsr.f265651a;
                e250Var.m37589c(fmu0VarM69676b, pvb0.f181680a);
                xq00Var.m91793t0(w2a1.f247311a);
            }
            xwt.m92301b(e250Var.f55362j, rkk.m75772x(842387056, new vn2(fyfVar, 9), xq00Var), xq00Var, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new nph(b250Var, fyfVar, i, 26);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m50277d(fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1581898286);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            kyu kyuVar = new kyu(1, null, 3, null, zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 2), null, null, 0, null, 490);
            fyf fyfVar = ehg.f59581a;
            fyf fyfVar2 = ehg.f59582b;
            fyf fyfVar3 = ehg.f59583c;
            fxh0Var2 = cxh0.f43038a;
            p711.m69222a(fxh0Var2, kyuVar, null, false, null, null, null, null, null, fyfVar, null, fyfVar2, null, null, null, fyfVar3, xq00Var, 805306438, 196656, 30204);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new i6q(fxh0Var2, i, 12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m50278e(fgz0 fgz0Var, xq00 xq00Var, int i) {
        String str = fgz0Var.f69483b;
        String str2 = fgz0Var.f69482a;
        xq00Var.m91775k0(-265829244);
        int i2 = i | (xq00Var.m91766g(fgz0Var) ? 4 : 2);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM43753y0 = g6f.m43753y0(bk5.m29582E0(new String[]{str2, str}), ", ", null, null, null, 62);
            if (str != null) {
                xq00Var.m91771i0(600971611);
                str2 = str2 + k0e1.m54977L(R.string.workout_segment_header_separator, xq00Var) + str;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(601073415);
                xq00Var.m91788r(false);
            }
            String str3 = str2;
            fxh0 fxh0VarM96866z = zsf1.m96866z(mi21.m61818b(mi21.m61822f(1.0f, cxh0.f43038a), 0.0f, leu.m58816b(xq00Var).f117230b.f224767j, 1), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d);
            boolean zM91766g = xq00Var.m91766g(strM43753y0);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new mv81(strM43753y0, 25);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96643a = zoz0.m96643a(fxh0VarM96866z, (gh00) objM91750T);
            zi5 zi5Var = bj5.f27610a;
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d), d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96643a);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            m50279f(fgz0Var.f69484c, 0, xq00Var);
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            long j = leu.m58815a(xq00Var).f112824b.f138757a;
            ol80 ol80Var = new ol80(1);
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            ahf1.m25932d(str3, new cr70(1.0f, true), if71Var, j, null, null, 2, false, ol80Var, 0, null, xq00Var, 0, 0, 1712);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new c6c1(fgz0Var, i, 17);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m50279f(int i, int i2, xq00 xq00Var) {
        xq00 xq00Var2;
        int i3;
        xq00Var.m91775k0(-1910512663);
        int i4 = (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | i2;
        if (xq00Var.m91752Y(i4 & 1, (i4 & 3) != 2)) {
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                i3 = R.drawable.ic_workout_start_end;
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.drawable.ic_workout_section;
            }
            float f = leu.m58816b(xq00Var).f117235g.f159605c;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(r9g1.m75068p(mi21.m61834r(f, cxh0Var), hmx0.f93097a), leu.m58815a(xq00Var).f112824b.f138757a, kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            xq00Var2 = xq00Var;
            iz30.m51966a(kmg1.m56924v(i3, 0, xq00Var), mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var), leu.m58815a(xq00Var).f112823a.f229876c, xq00Var2, 56, 0);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evm0(i, i2, 28);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m50280g(float f, float f2, float f3, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        float f5;
        xq00Var.m91775k0(250428478);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f3;
                int i4 = xq00Var.m91760d(f4) ? 256 : 128;
                i3 |= i4;
            } else {
                f4 = f3;
            }
            i3 |= i4;
        } else {
            f4 = f3;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                if ((i2 & 4) != 0) {
                    f5 = 0;
                }
                xq00Var.m91790s();
                dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
                f4 = f5;
            } else {
                xq00Var.m91757b0();
                int i5 = i2 & 4;
            }
            f5 = f4;
            xq00Var.m91790s();
            dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f5, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
            f4 = f5;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tsx(f, f2, f4, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final b740 m50281h(String str, String str2, String str3, boolean z) {
        boolean zM88460J0 = wl51.m88460J0(str);
        int i = !zM88460J0 ? 1 : 0;
        int i2 = 2;
        int i3 = wl51.m88460J0(str2) ? 0 : 2;
        if (wl51.m88460J0(str3) && !z) {
            i2 = 0;
        } else if (!zM88460J0 || i3 != 0) {
            i2 = 1;
        }
        return new b740(i, i3, i2);
    }

    /* JADX INFO: renamed from: i */
    public static Intent m50282i(Context context, EntryPoint entryPoint) {
        Intent intent = new Intent(context, (Class<?>) AllboardingActivity.class);
        EntryPoint.Companion.getClass();
        return intent.putExtra("entry-point", entryPoint.ordinal());
    }

    /* JADX INFO: renamed from: j */
    public static dk80 m50283j() {
        return dk80.f49923d;
    }

    /* JADX INFO: renamed from: m */
    public static final gh00 m50284m(z9j0 z9j0Var, hae0 hae0Var, int i, boolean z, xq00 xq00Var, int i2) {
        Object objM91750T = xq00Var.m91750T();
        ia7 ia7Var = t6x0.f217647t;
        if (objM91750T == ia7Var) {
            objM91750T = new ngw0(z9j0Var);
            xq00Var.m91793t0(objM91750T);
        }
        ngw0 ngw0Var = (ngw0) objM91750T;
        boolean z2 = ((((i2 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91766g(hae0Var)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && xq00Var.m91762e(edb.m38547C(i))) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && xq00Var.m91768h(z)) || (i2 & 3072) == 2048);
        Object objM91750T2 = xq00Var.m91750T();
        if (z2 || objM91750T2 == ia7Var) {
            objM91750T2 = new au20(ngw0Var, hae0Var, i, z);
            xq00Var.m91793t0(objM91750T2);
        }
        return (gh00) objM91750T2;
    }

    /* JADX INFO: renamed from: n */
    public static final aib m50285n(a3y a3yVar, zhb zhbVar) {
        int i;
        cbf0 cbf0VarM35556a;
        a3y a3yVar2 = a3yVar;
        ebf0 ebf0Var = a3yVar2.f12080a;
        if (ebf0Var == null) {
            throw new IllegalArgumentException("Metadata is null");
        }
        ArrayList arrayList = zhbVar.f282865c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            dbf0 dbf0VarM38368c = ebf0Var.m38368c(ub21.class, (String) next);
            if (dbf0VarM38368c != null ? dbf0VarM38368c instanceof cbf0 : false) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            int i2 = i;
            if (!it2.hasNext()) {
                return new aib(zhbVar.f282863a, arrayList3, zhbVar.f282864b);
            }
            Object next2 = it2.next();
            i = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            String str = (String) next2;
            dbf0 dbf0VarM38368c2 = ebf0Var.m38368c(ub21.class, str);
            ktx ktxVar = (dbf0VarM38368c2 == null || (cbf0VarM35556a = dbf0VarM38368c2.m35556a()) == null) ? null : (ktx) cbf0VarM35556a.f36107a;
            if (ktxVar == null) {
                throw new IllegalArgumentException(klh.m56834f(ub21.class.getSimpleName(), " not found for uri: ", str).toString());
            }
            ub21 ub21Var = (ub21) ktxVar;
            zbr zbrVar = a3yVar2.f12081b;
            boolean z = zbrVar != null ? zbrVar.f281388d : true;
            f5u f5uVar = zhbVar.f282866d;
            String str2 = ub21Var.f228616b;
            String str3 = ub21Var.f228617c;
            String str4 = ub21Var.f228615a;
            String str5 = ub21Var.f228622h;
            String str6 = ub21Var.f228618d;
            String str7 = ub21Var.f228625k;
            String str8 = ub21Var.f228626l;
            es61 es61Var = (es61) g6f.m43745s0(ub21Var.f228620f);
            arrayList3.add(new thb(i2, str2, str3, str4, str5, str6, str7, str8, z, f5uVar, es61Var != null ? es61Var.f62296a : null));
            a3yVar2 = a3yVar;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Map m50286o(ebf0 ebf0Var) {
        Object obj;
        pq60 pq60Var = ebf0Var.f57921a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((AbstractC2328r7) pq60Var).mo36657a()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : map.entrySet()) {
                Class cls = (Class) entry2.getKey();
                dbf0 dbf0Var = (dbf0) entry2.getValue();
                jqx jqxVar = new jqx(qpv0.f191387a.mo54112b(cls));
                cbf0 cbf0VarM35556a = dbf0Var.m35556a();
                pqm0 pqm0Var = (cbf0VarM35556a == null || (obj = cbf0VarM35556a.f36107a) == null) ? null : new pqm0(new k35(jqxVar, str), obj);
                if (pqm0Var != null) {
                    arrayList2.add(pqm0Var);
                }
            }
            j6f.m52564V(arrayList2, arrayList);
        }
        return kkc0.m56705r0(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public static final xf81 m50287p(ContextTrack contextTrack) {
        return new xf81(e72.m38021r(contextTrack), (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_TITLE), (String) contextTrack.metadata().get("image_url"), contextTrack.uri());
    }

    @Override // p204p.vq21
    /* JADX INFO: renamed from: a */
    public float mo50288a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo49880k(Throwable th);

    /* JADX INFO: renamed from: l */
    public abstract void mo49881l(x4b x4bVar);
}
