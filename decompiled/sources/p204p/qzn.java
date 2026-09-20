package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpen;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class qzn implements Function, u6m0, jhs {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f194228a;

    /* JADX INFO: renamed from: b */
    public final Object f194229b;

    /* JADX INFO: renamed from: c */
    public Object f194230c;

    /* JADX INFO: renamed from: d */
    public Object f194231d;

    public /* synthetic */ qzn(Object obj, Object obj2, Object obj3, int i) {
        this.f194228a = i;
        this.f194229b = obj;
        this.f194230c = obj2;
        this.f194231d = obj3;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zv41 m74340b(qzn qznVar) {
        return (zv41) qznVar.f194230c;
    }

    /* JADX INFO: renamed from: c */
    public static lep m74341c(lfd0 lfd0Var) {
        w780 w780Var = new w780(3, (byte) 0);
        w780Var.f248601e = null;
        Uri uri = lfd0Var.f132915b;
        m12 m12Var = new m12(uri == null ? null : uri.toString(), lfd0Var.f132919f, w780Var);
        o3a1 it = lfd0Var.f132916c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) m12Var.f138799e)) {
                ((HashMap) m12Var.f138799e).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        int i = mva.f147544a;
        zz11 zz11Var = new zz11(-1, 10);
        UUID uuid = lfd0Var.f132914a;
        abz abzVar = v900.f238809d;
        uuid.getClass();
        boolean z = lfd0Var.f132917d;
        boolean z2 = lfd0Var.f132918e;
        int[] iArrM54979N = k0e1.m54979N(lfd0Var.f132920g);
        for (int i2 : iArrM54979N) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            c95.m31843i(z3);
        }
        lep lepVar = new lep(uuid, abzVar, m12Var, map, z, (int[]) iArrM54979N.clone(), z2, zz11Var);
        byte[] bArr = lfd0Var.f132921h;
        lepVar.m58808l(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null, 0);
        return lepVar;
    }

    @Override // p204p.jhs
    /* JADX INFO: renamed from: a */
    public ihs mo53430a(ufd0 ufd0Var) {
        lep lepVar;
        ufd0Var.f229763b.getClass();
        lfd0 lfd0Var = ufd0Var.f229763b.f164729c;
        if (lfd0Var == null) {
            return ihs.f102352a;
        }
        synchronized (this.f194229b) {
            try {
                if (!lfd0Var.equals((lfd0) this.f194230c)) {
                    this.f194230c = lfd0Var;
                    this.f194231d = m74341c(lfd0Var);
                }
                lepVar = (lep) this.f194231d;
                lepVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return lepVar;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        vke0 vke0Var;
        switch (this.f194228a) {
            case 20:
                pes0 pes0Var = (pes0) obj;
                wke0 wke0Var = pes0Var.f176841a;
                if (((qis0) this.f194230c).f189063c && (vke0Var = wke0Var.f252220f) != null && (!vke0Var.f242214c.isEmpty())) {
                    return new sfs0(wke0Var.f252215a);
                }
                wke0 wke0Var2 = pes0Var.f176841a;
                String strM87089e = wke0Var2.f252216b;
                boolean z = pes0Var.f176842b;
                vke0 vke0Var2 = wke0Var2.f252220f;
                hv31 hv31Var = ((ris0) this.f194231d).f199612a;
                fv31 fv31Var = ris0.f199611c;
                if (!hv31Var.mo48713h(fv31Var, false) && !z && vke0Var2 != null && (!vke0Var2.f242214c.isEmpty())) {
                    lv31 lv31VarEdit = hv31Var.edit();
                    lv31VarEdit.m60048a(fv31Var, true);
                    lv31VarEdit.m60055h();
                    strM87089e = ((w2y0) this.f194229b).m87089e(R.string.first_response_with_plus_education, strM87089e);
                }
                return new cgs0(wke0.m88365c(wke0Var2, strM87089e, 0L, 0L, 61), pes0Var.f176843c);
            default:
                wr11 wr11Var = (wr11) obj;
                List list = (List) this.f194230c;
                sdo sdoVar = (sdo) this.f194229b;
                return wr11Var == wr11.f254245c ? ((t4f) sdoVar.f208049c).m80061b(sdo.m77847C(list, r5f.PRERELEASE)).ignoreElement() : ((n5f) sdoVar.f208048b).m63722c(sdo.m77848D(list, (d850) this.f194231d)).ignoreElement();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m74342d() {
        return ((Boolean) ((wg61) this.f194231d).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public void m74343e(buo buoVar) {
        zto ztoVarM9172w = DeeplinkOpen.m9172w();
        ztoVarM9172w.m96939r(buoVar.f31175b);
        ztoVarM9172w.m96940s(((grh) this.f194229b).mo28600b(buoVar.f31174a));
        ztoVarM9172w.m96938q(((kuo) ((juo) this.f194231d)).m57409a(iuo.LOGGED_IN));
        String str = buoVar.f31176c;
        if (str != null) {
            ztoVarM9172w.m96942u(str);
            if (q0f1.m71817D(str) != null) {
                ztoVarM9172w.m96943v(q0f1.m71817D(str));
            }
        }
        String str2 = buoVar.f31177d;
        if (str2 != null) {
            ztoVarM9172w.m96944w(str2);
        }
        ztoVarM9172w.m96937m(buoVar.f31179f);
        ztoVarM9172w.m96945x(buoVar.f31178e);
        String str3 = buoVar.f31180g;
        if (str3 != null) {
            ztoVarM9172w.m96941t(str3);
        }
        DeeplinkOpen deeplinkOpen = (DeeplinkOpen) ztoVarM9172w.build();
        qre0 qre0Var = (qre0) this.f194230c;
        wj50.m88279p(deeplinkOpen);
        qre0Var.m73616a(deeplinkOpen);
        deeplinkOpen.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public Object m74344f(boolean z, ibk ibkVar) {
        cjo cjoVar;
        Object c6x0Var;
        zv41 zv41Var = (zv41) this.f194230c;
        if (ibkVar instanceof cjo) {
            cjoVar = (cjo) ibkVar;
            int i = cjoVar.f38632d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cjoVar.f38632d = i - Integer.MIN_VALUE;
            } else {
                cjoVar = new cjo(this, ibkVar);
            }
        } else {
            cjoVar = new cjo(this, ibkVar);
        }
        Object objMo54020a = cjoVar.f38630b;
        int i2 = cjoVar.f38632d;
        try {
            if (i2 == 0) {
                bga.m29073P(objMo54020a);
                m6x0 m6x0Var = new m6x0(z);
                zv41Var.getClass();
                zv41Var.m97091m(null, m6x0Var);
                sio sioVar = (sio) this.f194229b;
                cjoVar.f38629a = z;
                cjoVar.f38632d = 1;
                objMo54020a = sioVar.mo54020a(z, cjoVar);
                yuk yukVar = yuk.f276404a;
                if (objMo54020a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = cjoVar.f38629a;
                bga.m29073P(objMo54020a);
            }
            c6x0Var = (Boolean) objMo54020a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (c6x0Var instanceof c6x0) {
            c6x0Var = null;
        }
        Object m6x0Var2 = ((Boolean) c6x0Var) != null ? new m6x0(z) : d6x0.f45920a;
        zv41Var.getClass();
        zv41Var.m97091m(null, m6x0Var2);
        return m6x0Var2;
    }

    /* JADX INFO: renamed from: g */
    public b231 m74345g() {
        kq80 kq80Var = ((orq) this.f194229b).f168640b;
        jg31.m53271i(kq80Var);
        otn otnVar = ((men) this.f194231d).f142768b;
        return new b231(kq80Var, otnVar.m67885N3(), new wn10((q831) otnVar.f169667d.f211468Ja.get()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.qe70, p.th00] */
    @Override // p204p.u6m0
    /* JADX INFO: renamed from: k */
    public t6m0 mo34969k(dcm0 dcm0Var, Bundle bundle) {
        return new ybn((qfi0) this.f194229b, (d6a0) this.f194230c, bundle, (qe70) this.f194231d);
    }

    public qzn(Context context, ucw ucwVar, z9j0 z9j0Var) {
        this.f194228a = 29;
        this.f194229b = z9j0Var;
        this.f194230c = new wg61(new C2652zj(context, 9));
        this.f194231d = new wg61(new glk(26, ucwVar, this));
    }

    public qzn(sio sioVar) {
        this.f194228a = 19;
        this.f194229b = sioVar;
        this.f194230c = jag1.m52819d(null);
        this.f194231d = nxf1.m65828g(new bjo(this, null, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qzn(qfi0 qfi0Var, d6a0 d6a0Var, th00 th00Var) {
        this.f194228a = 26;
        this.f194229b = qfi0Var;
        this.f194230c = d6a0Var;
        this.f194231d = (qe70) th00Var;
    }

    public qzn(Activity activity, ResolveInfo resolveInfo) {
        this.f194228a = 24;
        this.f194229b = activity;
        this.f194230c = resolveInfo;
        this.f194231d = new wg61(new sho(this, 16));
    }

    public qzn() {
        this.f194228a = 28;
        this.f194229b = new Object();
    }

    public qzn(vc11 vc11Var) {
        this.f194228a = 7;
        this.f194229b = vc11Var;
        int i = 19;
        this.f194230c = new d3o(this, 0, i);
        this.f194231d = new d3o(this, 1, i);
    }

    public qzn(ven venVar, l3n l3nVar) {
        this.f194228a = 17;
        this.f194229b = venVar;
        this.f194230c = l3nVar;
        this.f194231d = new hbo(this, 10);
    }

    public qzn(agn agnVar, l3n l3nVar) {
        this.f194228a = 9;
        this.f194229b = l3nVar;
        this.f194231d = agnVar;
        this.f194230c = be21.m28868a(new tzn(this, 28));
    }

    public qzn(nin ninVar, l3n l3nVar, mrq mrqVar) {
        this.f194228a = 6;
        this.f194229b = l3nVar;
        this.f194230c = ninVar;
        this.f194231d = new tzn(this, 13);
    }

    public qzn(uen uenVar, l3n l3nVar, mrq mrqVar) {
        this.f194228a = 5;
        this.f194229b = l3nVar;
        this.f194230c = uenVar;
        this.f194231d = new tzn(this, 7);
    }

    public qzn(ven venVar, l3n l3nVar, mrq mrqVar) {
        this.f194228a = 2;
        this.f194229b = l3nVar;
        this.f194230c = venVar;
        this.f194231d = new tzn(this, 0);
    }

    public qzn(jfn jfnVar, l3n l3nVar, mrq mrqVar) {
        this.f194228a = 1;
        this.f194229b = l3nVar;
        this.f194230c = jfnVar;
        this.f194231d = new n8n(this, 27);
    }

    public qzn(ren renVar, l3n l3nVar, cu50 cu50Var) {
        this.f194228a = 10;
        this.f194229b = cu50Var;
        this.f194231d = renVar;
        this.f194230c = be21.m28868a(new p8o(this, 8));
    }

    public qzn(bc21 bc21Var, q2c q2cVar) {
        this.f194228a = 11;
        this.f194229b = bc21Var;
        int i = 12;
        this.f194230c = be21.m28868a(new s7o(this, 1, i));
        this.f194231d = be21.m28868a(new s7o(this, 0, i));
    }

    public qzn(keb1 keb1Var) {
        this.f194228a = 14;
        this.f194229b = keb1Var;
        int i = 4;
        this.f194230c = new zao(this, 1, i);
        this.f194231d = new zao(this, 0, i);
    }

    public qzn(bgn bgnVar, l3n l3nVar, esq esqVar) {
        this.f194228a = 0;
        this.f194229b = bgnVar;
        int i = 5;
        this.f194230c = be21.m28868a(new oyn(this, 1, i));
        this.f194231d = be21.m28868a(new oyn(this, 0, i));
    }

    public qzn(gtt0 gtt0Var, htt0 htt0Var) {
        this.f194228a = 4;
        this.f194229b = gtt0Var;
        int i = 11;
        this.f194230c = b2s.m27972b(new oyn(this, 1, i));
        this.f194231d = new oyn(this, 0, i);
    }

    public qzn(men menVar, l3n l3nVar, orq orqVar) {
        this.f194228a = 8;
        this.f194229b = orqVar;
        this.f194231d = menVar;
        this.f194230c = b2s.m27972b(new tzn(this, 19));
    }

    public qzn(nin ninVar, l3n l3nVar, esq esqVar) {
        this.f194228a = 12;
        this.f194229b = l3nVar;
        this.f194231d = ninVar;
        this.f194230c = be21.m28868a(new p8o(this, 20));
    }

    public qzn(jsa1 jsa1Var, nsa1 nsa1Var, dcm0 dcm0Var) {
        this.f194228a = 13;
        this.f194229b = dcm0Var;
        int i = 27;
        this.f194231d = new s7o(this, 1, i);
        this.f194230c = b2s.m27972b(new s7o(this, 0, i));
    }

    public qzn(j5c1 j5c1Var, eoh eohVar) {
        this.f194228a = 15;
        this.f194229b = j5c1Var;
        int i = 9;
        this.f194230c = b2s.m27972b(new zao(this, 0, i));
        this.f194231d = new zao(this, 1, i);
    }

    public qzn(hqd1 hqd1Var, iqd1 iqd1Var, dcm0 dcm0Var) {
        this.f194228a = 16;
        this.f194229b = dcm0Var;
        int i = 22;
        this.f194231d = new zao(this, 1, i);
        this.f194230c = b2s.m27972b(new zao(this, 0, i));
    }

    public qzn(yat0 yat0Var, ynh ynhVar, zat0 zat0Var, dcm0 dcm0Var) {
        this.f194228a = 3;
        this.f194229b = yat0Var;
        this.f194231d = dcm0Var;
        this.f194230c = b2s.m27972b(new tzn(this, 3));
    }

    public qzn(t27[] t27VarArr) {
        this.f194228a = 23;
        d721 d721Var = new d721();
        xp31 xp31Var = new xp31(false);
        t27[] t27VarArr2 = new t27[t27VarArr.length + 2];
        this.f194229b = t27VarArr2;
        System.arraycopy(t27VarArr, 0, t27VarArr2, 0, t27VarArr.length);
        this.f194230c = d721Var;
        this.f194231d = xp31Var;
        t27VarArr2[t27VarArr.length] = d721Var;
        t27VarArr2[t27VarArr.length + 1] = xp31Var;
    }
}
