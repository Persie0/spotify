package p204p;

import android.graphics.Bitmap;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.p6 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2245p6 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174262a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f174263b;

    public /* synthetic */ C2245p6(int i, Object obj, Object obj2) {
        this.f174262a = i;
        this.f174263b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0542  */
    /* JADX WARN: Code duplicated, block: B:193:0x057d  */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i;
        jm9 jm9Var;
        l440 l440Var;
        l440 l440Var2;
        boolean z;
        Brush brush;
        q94 q94VarM75612f;
        String strConcat;
        StringBuilder sb;
        int i2;
        qs70 qs70Var;
        qs70 qs70Var2;
        int i3 = this.f174262a;
        boolean z2 = false;
        float f = 0.0f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f174263b;
        switch (i3) {
            case 0:
                return obj == ((AbstractC2282q6) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ul60 ul60Var = (ul60) obj2;
                ul60Var.mo39408t((String) g6f.m43687A0(ul60Var.f231443a), (yk60) obj);
                return w2a1Var;
            case 2:
                AbstractC2328r7 abstractC2328r7 = (AbstractC2328r7) obj2;
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == abstractC2328r7 ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != abstractC2328r7 ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 3:
                hi1 hi1Var = (hi1) obj2;
                hi1Var.f91641O0.invoke((m471) obj, oqg1.m67639h(hi1Var, AndroidCompositionLocals_androidKt.f502b));
                return w2a1Var;
            case 4:
                ((mpz0) obj).mo62511a(llz0.f134727c, new klz0(gb20.f78173a, ((i4l0) obj2).mo28001a(), 2, true));
                return w2a1Var;
            case 5:
                return new C1865fm((m29) obj2, 12);
            case 6:
                return new C1865fm((r481) obj2, 14);
            case 7:
                u9a u9aVar = (u9a) obj2;
                l3b l3bVar = (l3b) obj;
                if (l3bVar.mo24619j() * u9aVar.f228112P0 < 0.0f || Size.m264e(l3bVar.f129254a.mo39635n()) <= 0.0f) {
                    return l3bVar.m57996b(new C2126mg(9));
                }
                float f2 = 2;
                final float fMin = Math.min(ybs.m93301b(u9aVar.f228112P0, 0.0f) ? 1.0f : (float) Math.ceil(l3bVar.mo24619j() * u9aVar.f228112P0), (float) Math.ceil(Size.m264e(l3bVar.f129254a.mo39635n()) / f2));
                final float f3 = fMin / f2;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() & 4294967295L)) - fMin)) & 4294967295L);
                float f4 = fMin * f2;
                boolean z3 = f4 > Size.m264e(l3bVar.f129254a.mo39635n());
                ncg1 ncg1VarMo29107a = u9aVar.f228114R0.mo29107a(l3bVar.f129254a.mo39635n(), l3bVar.f129254a.getLayoutDirection(), l3bVar);
                if (!(ncg1VarMo29107a instanceof kyl0)) {
                    if (!(ncg1VarMo29107a instanceof myl0)) {
                        boolean z4 = z3;
                        if (!(ncg1VarMo29107a instanceof lyl0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final Brush brush2 = u9aVar.f228113Q0;
                        final long j = z4 ? 0L : jFloatToRawIntBits;
                        if (z4) {
                            jFloatToRawIntBits2 = l3bVar.f129254a.mo39635n();
                        }
                        final long j2 = jFloatToRawIntBits2;
                        final DrawStyle em51Var = z4 ? qxy.f193763a : new em51(fMin, 0.0f, 0, 0, null, 30);
                        return l3bVar.m57996b(new gh00() { // from class: p.o9a
                            @Override // p204p.gh00
                            public final Object invoke(Object obj3) {
                                tgj tgjVar = (tgj) obj3;
                                tgjVar.mo50174s1();
                                DrawScope.m273U0(tgjVar, brush2, j, j2, 0.0f, em51Var, null, 0, 104);
                                return w2a1.f247311a;
                            }
                        });
                    }
                    final Brush brush3 = u9aVar.f228113Q0;
                    zlx0 zlx0Var = ((myl0) ncg1VarMo29107a).f148481d;
                    if (q3d0.m72077H(zlx0Var)) {
                        final long j3 = zlx0Var.f284099e;
                        final em51 em51Var2 = new em51(fMin, 0.0f, 0, 0, null, 30);
                        final boolean z5 = z3;
                        return l3bVar.m57996b(new gh00() { // from class: p.s9a
                            @Override // p204p.gh00
                            public final Object invoke(Object obj3) throws Throwable {
                                c06 c06Var;
                                long j4;
                                tgj tgjVar = (tgj) obj3;
                                tgjVar.mo50174s1();
                                boolean z6 = z5;
                                Brush brush4 = brush3;
                                long j5 = j3;
                                if (z6) {
                                    DrawScope.m276f0(tgjVar, brush4, 0L, 0L, j5, 0.0f, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f5 = f3;
                                    if (fIntBitsToFloat < f5) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tgjVar.mo295n() >> 32));
                                        float f6 = fMin;
                                        float f7 = fIntBitsToFloat2 - f6;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tgjVar.mo295n() & 4294967295L)) - f6;
                                        c06 c06VarMo291d1 = tgjVar.mo291d1();
                                        long jM31085B = c06VarMo291d1.m31085B();
                                        c06VarMo291d1.m31107v().mo25287p();
                                        try {
                                            ((kca) c06VarMo291d1.f32694b).m56024e(f6, f6, f7, fIntBitsToFloat3, 0);
                                            j4 = jM31085B;
                                            c06Var = c06VarMo291d1;
                                            try {
                                                DrawScope.m276f0(tgjVar, brush4, 0L, 0L, j5, 0.0f, null, 246);
                                                stz0.m79358l(c06Var, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                stz0.m79358l(c06Var, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c06Var = c06VarMo291d1;
                                            j4 = jM31085B;
                                        }
                                    } else {
                                        DrawScope.m276f0(tgjVar, brush4, jFloatToRawIntBits, jFloatToRawIntBits2, mwg1.m63042v(j5, f5), 0.0f, em51Var2, 208);
                                    }
                                }
                                return w2a1.f247311a;
                            }
                        });
                    }
                    boolean z6 = z3;
                    if (u9aVar.f228111O0 == null) {
                        u9aVar.f228111O0 = new n9a();
                    }
                    n9a n9aVar = u9aVar.f228111O0;
                    wj50.m88279p(n9aVar);
                    uk4 uk4Var = n9aVar.f151761d;
                    uk4 uk4Var2 = uk4Var;
                    if (uk4Var == null) {
                        uk4 uk4VarM91259a = xk4.m91259a();
                        n9aVar.f151761d = uk4VarM91259a;
                        uk4Var2 = uk4VarM91259a;
                    }
                    uk4Var2.m83308m();
                    uk4Var2.m83300e(zlx0Var, 1);
                    if (!z6) {
                        uk4 uk4VarM91259a2 = xk4.m91259a();
                        uk4VarM91259a2.m83300e(new zlx0(fMin, fMin, zlx0Var.m96393b() - fMin, zlx0Var.m96392a() - fMin, mwg1.m63042v(zlx0Var.f284099e, fMin), mwg1.m63042v(zlx0Var.f284100f, fMin), mwg1.m63042v(zlx0Var.f284101g, fMin), mwg1.m63042v(zlx0Var.f284102h, fMin)), 1);
                        uk4Var2.m83306k(uk4Var2, uk4VarM91259a2, 0);
                    }
                    return l3bVar.m57996b(new C1926h6(7, uk4Var2, brush3));
                }
                Brush brush4 = u9aVar.f228113Q0;
                kyl0 kyl0Var = (kyl0) ncg1VarMo29107a;
                vbn0 vbn0Var = kyl0Var.f127886d;
                if (z3) {
                    return l3bVar.m57996b(new C1926h6(8, kyl0Var, brush4));
                }
                if (brush4 instanceof pk31) {
                    jm9Var = new jm9(5, n6f.m63765b(((pk31) brush4).f178375a, 1.0f, 0.0f, 0.0f, 0.0f, 14));
                    i = 1;
                } else {
                    i = 0;
                    jm9Var = null;
                }
                tiv0 tiv0VarM83303h = ((uk4) vbn0Var).m83303h();
                float f5 = tiv0VarM83303h.f220752b;
                float f6 = tiv0VarM83303h.f220751a;
                if (u9aVar.f228111O0 == null) {
                    u9aVar.f228111O0 = new n9a();
                }
                n9a n9aVar2 = u9aVar.f228111O0;
                wj50.m88279p(n9aVar2);
                uk4 uk4Var3 = n9aVar2.f151761d;
                uk4 uk4Var4 = uk4Var3;
                if (uk4Var3 == null) {
                    uk4 uk4VarM91259a3 = xk4.m91259a();
                    n9aVar2.f151761d = uk4VarM91259a3;
                    uk4Var4 = uk4VarM91259a3;
                }
                uk4Var4.m83308m();
                vbn0.m85168c(uk4Var4, tiv0VarM83303h);
                uk4Var4.m83306k(uk4Var4, vbn0Var, 0);
                rlv0 rlv0Var = new rlv0();
                long jCeil = (((long) ((int) Math.ceil(tiv0VarM83303h.f220753c - f6))) << 32) | (((long) ((int) Math.ceil(tiv0VarM83303h.f220754d - f5))) & 4294967295L);
                n9a n9aVar3 = u9aVar.f228111O0;
                wj50.m88279p(n9aVar3);
                q94 q94Var = n9aVar3.f151758a;
                ky3 ky3VarM97181a = n9aVar3.f151759b;
                if (q94Var != null) {
                    Bitmap.Config config = q94Var.f186483a.getConfig();
                    wj50.m88279p(config);
                    l440Var = new l440(fz6.m43144H(config));
                } else {
                    l440Var = null;
                }
                if (l440Var != null && l440Var.f129566a == 0) {
                    z = true;
                } else {
                    if (q94Var != null) {
                        Bitmap.Config config2 = q94Var.f186483a.getConfig();
                        wj50.m88279p(config2);
                        l440Var2 = new l440(fz6.m43144H(config2));
                    } else {
                        l440Var2 = null;
                    }
                    if (l440Var2 != null && i == l440Var2.f129566a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (q94Var == null || ky3VarM97181a == null) {
                    brush = brush4;
                    q94VarM75612f = riw0.m75612f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    n9aVar3.f151758a = q94VarM75612f;
                    ky3VarM97181a = zxc.m97181a(q94VarM75612f);
                    n9aVar3.f151759b = ky3VarM97181a;
                } else {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() >> 32));
                    Bitmap bitmap = q94Var.f186483a;
                    if (fIntBitsToFloat <= bitmap.getWidth()) {
                        brush = brush4;
                        if (Float.intBitsToFloat((int) (l3bVar.f129254a.mo39635n() & 4294967295L)) <= bitmap.getHeight() && z) {
                            q94VarM75612f = q94Var;
                        }
                    } else {
                        brush = brush4;
                    }
                    q94VarM75612f = riw0.m75612f((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                    n9aVar3.f151758a = q94VarM75612f;
                    ky3VarM97181a = zxc.m97181a(q94VarM75612f);
                    n9aVar3.f151759b = ky3VarM97181a;
                }
                krb krbVar = n9aVar3.f151760c;
                if (krbVar == null) {
                    krbVar = new krb();
                    n9aVar3.f151760c = krbVar;
                }
                c06 c06Var = krbVar.f125601b;
                jrb jrbVar = krbVar.f125600a;
                long jM39677M = epv0.m39677M(jCeil);
                ko70 layoutDirection = l3bVar.f129254a.getLayoutDirection();
                krb krbVar2 = krbVar;
                yqq yqqVar = jrbVar.f115127a;
                jm9 jm9Var2 = jm9Var;
                ko70 ko70Var = jrbVar.f115128b;
                Brush brush5 = brush;
                wqb wqbVar = jrbVar.f115129c;
                uk4 uk4Var5 = uk4Var4;
                long j4 = jrbVar.f115130d;
                jrbVar.f115127a = l3bVar;
                jrbVar.f115128b = layoutDirection;
                jrbVar.f115129c = ky3VarM97181a;
                jrbVar.f115130d = jM39677M;
                ky3VarM97181a.mo25287p();
                DrawScope.m277h0(krbVar2, n6f.f150862b, 0L, jM39677M, 0.0f, null, null, 58);
                float f7 = -f6;
                float f8 = -f5;
                ((kca) c06Var.f32694b).m56035r(f7, f8);
                try {
                    DrawScope.m278k1(krbVar2, kyl0Var.f127886d, brush5, 0.0f, new em51(f4, 0.0f, 0, 0, null, 30), 52);
                    ky3 ky3Var = ky3VarM97181a;
                    float f9 = 1;
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (krbVar2.mo295n() >> 32)) + f9) / Float.intBitsToFloat((int) (krbVar2.mo295n() >> 32));
                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (krbVar2.mo295n() & 4294967295L)) + f9) / Float.intBitsToFloat((int) (krbVar2.mo295n() & 4294967295L));
                    q94 q94Var2 = q94VarM75612f;
                    long jMo294i1 = krbVar2.mo294i1();
                    long jM31085B = c06Var.m31085B();
                    c06Var.m31107v().mo25287p();
                    try {
                        ((kca) c06Var.f32694b).m56033p(fIntBitsToFloat2, fIntBitsToFloat3, jMo294i1);
                        DrawScope.m278k1(krbVar2, uk4Var5, brush5, 0.0f, null, 28);
                        c06Var.m31107v().mo25279h();
                        c06Var.m31095L(jM31085B);
                        ((kca) c06Var.f32694b).m56035r(-f7, -f8);
                        ky3Var.mo25279h();
                        jrbVar.f115127a = yqqVar;
                        jrbVar.f115128b = ko70Var;
                        jrbVar.f115129c = wqbVar;
                        jrbVar.f115130d = j4;
                        q94Var2.f186483a.prepareToDraw();
                        rlv0Var.f200373a = q94Var2;
                        return l3bVar.m57996b(new t9a(tiv0VarM83303h, rlv0Var, jCeil, jm9Var2));
                    } catch (Throwable th) {
                        c06Var.m31107v().mo25279h();
                        c06Var.m31095L(jM31085B);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ((kca) c06Var.f32694b).m56035r(-f7, -f8);
                    throw th2;
                }
            case 8:
                qlv0 qlv0Var = (qlv0) obj2;
                ce91 ce91Var = (ce91) obj;
                if (ce91Var instanceof igj) {
                    qlv0Var.f189932a = ((n6f) ((igj) ce91Var).f101996M0.getValue()).f150873a;
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 9:
                ((ggj) obj2).f79684a.setValue((jlq) obj);
                return w2a1Var;
            case 10:
                return ((Callable) obj2).call();
            case 11:
                ((obm0) ((zwp) obj2).f287022U0.f25916b).mo46732b(vbm0.f239539e);
                return w2a1Var;
            case 12:
                return Boolean.valueOf(((sjx0) obj).mo48695a((roa) obj2));
            case 13:
                float fFloatValue = ((Float) obj).floatValue();
                c581 state = ((ch21) obj2).f37883k.getState();
                state.m31458b(state.f34107c.m84031v() + fFloatValue);
                return w2a1Var;
            case 14:
                float fFloatValue2 = ((Float) obj).floatValue();
                c581 state2 = ((sm91) obj2).f210604o.getState();
                state2.m31458b(state2.f34107c.m84031v() + fFloatValue2);
                return w2a1Var;
            case 15:
                ((xqr) obj2).f265094Y = true;
                return w2a1Var;
            case 16:
                TimeZone timeZone = c0f1.f32774a;
                ((wqr) obj2).f254143X = true;
                return w2a1Var;
            case 17:
                return new fxf(17, (usr) obj2, (gh00) obj);
            case 18:
                ((cep) obj2).f37164a.f48134a.invoke(new Offset(((ucs) obj).f229099a));
                return w2a1Var;
            case 19:
                ((Float) obj).floatValue();
                return Float.valueOf(((qgs) obj2).m72762a().mo35989Z0(igs.f102045a));
            case 20:
                jts jtsVar = (jts) obj;
                StringBuilder sbM36620t = dq60.m36620t(((jts) obj2) == jtsVar ? " > " : "   ");
                if (!(jtsVar instanceof knf)) {
                    if (jtsVar instanceof c501) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        c501 c501Var = (c501) jtsVar;
                        sb.append(c501Var.f34043a.f107641b.length());
                        sb.append(", newCursorPosition=");
                        i2 = c501Var.f34044b;
                    } else if (jtsVar instanceof b501) {
                        strConcat = ((b501) jtsVar).toString();
                    } else if (jtsVar instanceof mpq) {
                        strConcat = ((mpq) jtsVar).toString();
                    } else if (jtsVar instanceof npq) {
                        strConcat = ((npq) jtsVar).toString();
                    } else if (jtsVar instanceof i601) {
                        strConcat = ((i601) jtsVar).toString();
                    } else if (jtsVar instanceof s9z) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (jtsVar instanceof ymq) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strMo29111F = qpv0.f191387a.mo54112b(jtsVar.getClass()).mo29111F();
                        if (strMo29111F == null) {
                            strMo29111F = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strMo29111F);
                    }
                    sbM36620t.append(strConcat);
                    return sbM36620t.toString();
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                knf knfVar = (knf) jtsVar;
                sb.append(knfVar.f124400a.f107641b.length());
                sb.append(", newCursorPosition=");
                i2 = knfVar.f124401b;
                strConcat = edb.m38567p(sb, i2, ')');
                sbM36620t.append(strConcat);
                return sbM36620t.toString();
            case 21:
                qqi0 qqi0Var = (qqi0) obj2;
                Object[] objArr = qqi0Var.f191608a;
                int i4 = qqi0Var.f191610c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((n6d0) objArr[i5]).mo27119a();
                }
                return w2a1Var;
            case 22:
                izz izzVar = (izz) obj2;
                gp91 gp91Var = (gp91) obj;
                gp91 gp91Var2 = new gp91(null, gp91Var.f83113b, gp91Var.f83114c, gp91Var.f83115d, gp91Var.f83116e);
                return izzVar.f107309c.m27887t(gp91Var2, new C1926h6(20, izzVar, gp91Var2)).getValue();
            case 23:
                l3b l3bVar2 = (l3b) obj;
                bj9 bj9Var = l3bVar2.f129257d;
                wj50.m88279p(bj9Var);
                rx10 rx10VarMo49970b = ((ox10) bj9Var.invoke()).mo49970b();
                C2126mg c2126mg = new C2126mg(27);
                ko70 layoutDirection2 = l3bVar2.f129254a.getLayoutDirection();
                long jM39676L = epv0.m39676L(l3bVar2.f129254a.mo39635n());
                tgj tgjVar = l3bVar2.f129256c;
                wj50.m88279p(tgjVar);
                tgjVar.mo290Z(jM39676L, new k3b(c2126mg, tgjVar, l3bVar2, layoutDirection2, tgjVar.mo291d1().m31108w(), tgjVar.mo291d1().m31110z()), rx10VarMo49970b);
                qlv0 qlv0Var2 = new qlv0();
                qlv0Var2.f189932a = n6f.f150871k;
                return l3bVar2.m57996b(new bw4((xy30) obj2, qlv0Var2, new rlv0(), rx10VarMo49970b, 2));
            case 24:
                return (p340) obj2;
            case 25:
                plv0 plv0Var = (plv0) obj2;
                StringBuilder sb3 = new StringBuilder();
                int i6 = plv0Var.f178796a;
                plv0Var.f178796a = i6 + 1;
                sb3.append(i6);
                sb3.append(':');
                sb3.append(((kxe) obj).f127468a);
                return sb3.toString();
            case 26:
                ko40 ko40Var = (ko40) obj2;
                l3b l3bVar3 = (l3b) obj;
                float fMo24619j = l3bVar3.mo24619j() * ((ybs) ko40Var.f124533Y0.m45912e()).f271238a;
                uk4 uk4VarM91259a4 = xk4.m91259a();
                ch01 ch01VarM56468a = ko40Var.f124532X0;
                if (ch01VarM56468a == null) {
                    ch01VarM56468a = ki01.m56468a((hi01) oqg1.m67639h(ko40Var, ki01.f122754a), 6);
                }
                ncg1 ncg1VarMo29107a2 = ch01VarM56468a.mo29107a(l3bVar3.f129254a.mo39635n(), l3bVar3.f129254a.getLayoutDirection(), l3bVar3);
                if (ncg1VarMo29107a2 instanceof lyl0) {
                    vbn0.m85168c(uk4VarM91259a4, ((lyl0) ncg1VarMo29107a2).f138074d);
                } else if (ncg1VarMo29107a2 instanceof myl0) {
                    uk4VarM91259a4.m83300e(((myl0) ncg1VarMo29107a2).f148481d, 1);
                } else {
                    if (!(ncg1VarMo29107a2 instanceof kyl0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uk4VarM91259a4.m83299d(((kyl0) ncg1VarMo29107a2).f127886d, 0L);
                }
                uk4 uk4VarM91259a5 = xk4.m91259a();
                vbn0.m85168c(uk4VarM91259a5, new tiv0(0.0f, Float.intBitsToFloat((int) (l3bVar3.f129254a.mo39635n() & 4294967295L)) - fMo24619j, Float.intBitsToFloat((int) (l3bVar3.f129254a.mo39635n() >> 32)), Float.intBitsToFloat((int) (4294967295L & l3bVar3.f129254a.mo39635n()))));
                uk4 uk4VarM91259a6 = xk4.m91259a();
                uk4VarM91259a6.m83306k(uk4VarM91259a5, uk4VarM91259a4, 1);
                return l3bVar3.m57996b(new C1926h6(22, uk4VarM91259a6, ko40Var));
            case 27:
                return Integer.valueOf(((ws70) obj2).m88879c(((Integer) obj).intValue()));
            case 28:
                zs70 zs70Var = (zs70) obj2;
                z4y z4yVar = zs70Var.f285875p;
                lnp lnpVar = zs70Var.f285860a;
                boolean z7 = zs70Var.f285868i;
                float f10 = -((Float) obj).floatValue();
                if ((f10 >= 0.0f || zs70Var.mo28417d()) && (f10 <= 0.0f || zs70Var.mo28416c())) {
                    if (Math.abs(zs70Var.f285866g) > 0.5f) {
                        pt40.m70893c("entered drag with non-zero pending scroll");
                    }
                    float f11 = zs70Var.f285866g + f10;
                    zs70Var.f285866g = f11;
                    if (Math.abs(f11) > 0.5f) {
                        float f12 = zs70Var.f285866g;
                        int iM72083N = q3d0.m72083N(f12);
                        qs70 qs70VarM73679f = ((qs70) zs70Var.f285864e.getValue()).m73679f(iM72083N, !zs70Var.f285861b);
                        if (qs70VarM73679f == null || (qs70Var2 = zs70Var.f285862c) == null) {
                            qs70Var = qs70VarM73679f;
                        } else {
                            qs70 qs70VarM73679f2 = qs70Var2.m73679f(iM72083N, true);
                            if (qs70VarM73679f2 != null) {
                                zs70Var.f285862c = qs70VarM73679f2;
                                qs70Var = qs70VarM73679f;
                            } else {
                                qs70Var = null;
                            }
                        }
                        if (qs70Var != null) {
                            zs70Var.m96823g(qs70Var, zs70Var.f285861b, true);
                            pqo0.m70679s(zs70Var.f285877r);
                            float f13 = f12 - zs70Var.f285866g;
                            if (z7) {
                                lnpVar.m59504c(z4yVar, f13, qs70Var);
                            }
                        } else {
                            lp70 lp70Var = zs70Var.f285869j;
                            if (lp70Var != null) {
                                lp70Var.m59635l();
                            }
                            float f14 = f12 - zs70Var.f285866g;
                            qs70 qs70VarM96824h = zs70Var.m96824h();
                            if (z7) {
                                lnpVar.m59504c(z4yVar, f14, qs70VarM96824h);
                            }
                        }
                    }
                    if (Math.abs(zs70Var.f285866g) > 0.5f) {
                        f10 -= zs70Var.f285866g;
                        zs70Var.f285866g = 0.0f;
                    }
                    f = f10;
                }
                return Float.valueOf(-f);
            default:
                return new vwt((gv70) obj2, 10);
        }
    }

    public /* synthetic */ C2245p6(Object obj, int i) {
        this.f174262a = i;
        this.f174263b = obj;
    }
}
