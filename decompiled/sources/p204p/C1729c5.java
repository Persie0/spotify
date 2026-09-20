package p204p;

import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: p.c5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1729c5 implements dut {

    /* JADX INFO: renamed from: a */
    public final epx f34036a;

    /* JADX INFO: renamed from: b */
    public final m011 f34037b;

    /* JADX INFO: renamed from: c */
    public final q2c f34038c;

    /* JADX INFO: renamed from: d */
    public final mmh0 f34039d;

    /* JADX INFO: renamed from: e */
    public final j2a1 f34040e;

    /* JADX INFO: renamed from: f */
    public final cph f34041f;

    public C1729c5(epx epxVar, m011 m011Var, q2c q2cVar) {
        this.f34036a = epxVar;
        this.f34037b = m011Var;
        this.f34038c = q2cVar;
        C2076l3 c2076l3 = C2076l3.f129134N0;
        C2362s4 c2362s4 = C2362s4.f205376b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        C1692b5 c1692b5 = new C1692b5(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(C2039k4.class), c1037x558fa59a.m15633a(c1692b5));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(C2077l4.class), new C1037x558fa59a().m15633a(new C2637z4(this)));
        n5q n5qVar = xsr.f265651a;
        this.f34039d = alf1.m26338u(c2076l3, c2362s4, new C1044a(tlp.f221498c, coroutinesSubtypeEffectHandlerBuilderM42464h), C1965i3.f97969d, new C2199o2(this, 2));
        this.f34040e = new j2a1();
        fyf fyfVar = lyf.f138053a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f34041f = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.jiu] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX INFO: renamed from: e */
    public static final Object m31450e(C1729c5 c1729c5, String str, ibk ibkVar) {
        C2520w4 c2520w4;
        m340 m340Var;
        w240 w240Var;
        String str2;
        ufu ufuVar;
        ufu ufuVar2;
        List list;
        String strM43753y0;
        m340 m340Var2;
        z240 z240VarM60640a;
        String str3;
        w240 w240Var2;
        jiu jiuVar;
        if (ibkVar instanceof C2520w4) {
            c2520w4 = (C2520w4) ibkVar;
            int i = c2520w4.f247669d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2520w4.f247669d = i - Integer.MIN_VALUE;
            } else {
                c2520w4 = new C2520w4(c1729c5, ibkVar);
            }
        } else {
            c2520w4 = new C2520w4(c1729c5, ibkVar);
        }
        Object objM86756u = c2520w4.f247667b;
        int i2 = c2520w4.f247669d;
        jiu jiuVar2 = 0;
        jiuVar2 = 0;
        jiuVar2 = 0;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86756u);
                yab yabVarM54985d = k0e1.m54985d(((jpx) c1729c5.f34036a).m53978b(new C1668ai("about-the-song-share-card", false, (gh00) new C2597y1(str, 1))));
                C2559x4 c2559x4 = new C2559x4(2, 0, jiuVar2);
                c2520w4.f247666a = str;
                c2520w4.f247669d = 1;
                objM86756u = vyf1.m86756u(yabVarM54985d, c2559x4, c2520w4);
                yuk yukVar = yuk.f276404a;
                if (objM86756u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c2520w4.f247666a;
                bga.m29073P(objM86756u);
            }
            gqx gqxVar = (gqx) objM86756u;
            erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str).f72301b;
            v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str).f72301b;
            if (erc1Var != null && (w240Var2 = erc1Var.f62082d) != null && (jiuVar = w240Var2.f247224c) != null) {
                jiuVar2 = jiuVar;
            } else if (erc1Var != null && (m340Var = erc1Var.f62079a) != null && (w240Var = m340Var.f139525b) != null) {
                jiuVar2 = w240Var.f247224c;
            }
            String str4 = (erc1Var == null || (m340Var2 = erc1Var.f62079a) == null || (z240VarM60640a = m340Var2.m60640a(a340.f11861b)) == null || (str3 = z240VarM60640a.f278475a.f198763a) == null) ? "" : str3;
            if (v140Var == null || (str2 = v140Var.f236243a) == null) {
                str2 = "";
            }
            String str5 = (v140Var == null || (list = v140Var.f236246d) == null || (strM43753y0 = g6f.m43753y0(list, ", ", null, null, C2076l3.f129135O0, 30)) == null) ? "" : strM43753y0;
            int iM75429D = -16777216;
            int iM75429D2 = (jiuVar2 == 0 || (ufuVar2 = jiuVar2.f112823a) == null) ? -16777216 : rfg1.m75429D(ufuVar2.f229876c);
            if (jiuVar2 != 0 && (ufuVar = jiuVar2.f112823a) != null) {
                iM75429D = rfg1.m75429D(ufuVar.f229875b.f123093a);
            }
            return new C2201o4(iM75429D2, iM75429D, str2, str5, str4);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new C2201o4(-16777216, -16777216, "", "", "");
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f34040e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f34041f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f34039d;
    }
}
