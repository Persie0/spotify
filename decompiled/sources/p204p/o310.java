package p204p;

import com.comscore.streaming.ContentType;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class o310 implements kxf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161226a = 1;

    /* JADX INFO: renamed from: b */
    public final voc1 f161227b;

    /* JADX INFO: renamed from: c */
    public final yfd1 f161228c;

    /* JADX INFO: renamed from: d */
    public final Object f161229d;

    /* JADX INFO: renamed from: e */
    public final Object f161230e;

    /* JADX INFO: renamed from: f */
    public final Object f161231f;

    /* JADX INFO: renamed from: g */
    public final Object f161232g;

    public o310(yby0 yby0Var, z9j0 z9j0Var, n6i n6iVar, dsw0 dsw0Var, voc1 voc1Var, yfd1 yfd1Var) {
        this.f161229d = yby0Var;
        this.f161230e = z9j0Var;
        this.f161231f = n6iVar;
        this.f161232g = dsw0Var;
        this.f161227b = voc1Var;
        this.f161228c = yfd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: e */
    public static final Object m66166e(o310 o310Var, lwf lwfVar, String str, boolean z, ibk ibkVar) {
        ie70 ie70Var;
        Object c6x0Var;
        siy siyVar = (siy) o310Var.f161232g;
        if (ibkVar instanceof ie70) {
            ie70Var = (ie70) ibkVar;
            int i = ie70Var.f101341e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ie70Var.f101341e = i - Integer.MIN_VALUE;
            } else {
                ie70Var = new ie70(o310Var, ibkVar);
            }
        } else {
            ie70Var = new ie70(o310Var, ibkVar);
        }
        Object objM96567o = ie70Var.f101339c;
        int i2 = ie70Var.f101341e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM82518k = ((u7n) o310Var.f161230e).m82518k(o310Var.f161227b.f243453a, "", Collections.singletonList(str), z);
                ie70Var.f101337a = lwfVar;
                ie70Var.f101338b = str;
                ie70Var.f101341e = 1;
                objM96567o = zn91.m96567o(singleM82518k, ie70Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = ie70Var.f101338b;
                lwfVar = ie70Var.f101337a;
                bga.m29073P(objM96567o);
            }
            c6x0Var = (m93) objM96567o;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        String str2 = str;
        boolean z2 = c6x0Var instanceof c6x0;
        if (!z2) {
            if (z2) {
                c6x0Var = null;
            }
            m93 m93Var = (m93) c6x0Var;
            if (wj50.m88271j(m93Var, new j93(null))) {
                yfd1.m93554f(o310Var.f161228c, lwfVar.f137561e, "labeled_add_to_collection_button", str2, null, new ej10(str2, 28), 8);
                siyVar.m78245a(2, Collections.singletonMap("itemUri", str2));
            } else if (wj50.m88271j(m93Var, new k93(null))) {
                yfd1.m93554f(o310Var.f161228c, lwfVar.f137561e, "labeled_add_to_collection_button", str2, null, new ej10(str2, 29), 8);
                siyVar.m78245a(3, Collections.singletonMap("itemUri", str2));
            } else if (wj50.m88271j(m93Var, new l93())) {
                yfd1.m93554f(o310Var.f161228c, lwfVar.f137561e, "labeled_add_to_collection_button", str2, null, xa70.f259588M0, 8);
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kxf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24313a(int i, lwf lwfVar, vwf vwfVar, xq00 xq00Var, fxh0 fxh0Var) {
        switch (this.f161226a) {
            case 0:
                m66167c((n310) vwfVar, lwfVar, fxh0Var, xq00Var, i);
                break;
            default:
                m66168d((he70) vwfVar, lwfVar, fxh0Var, xq00Var, i);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m66167c(n310 n310Var, lwf lwfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1024399142);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(n310Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(lwfVar) : xq00Var.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            h0k h0kVar = new h0k(1, "");
            String str = n310Var.f149905f;
            boolean zM91770i = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(lwfVar))) | xq00Var.m91770i(this) | ((i2 & 14) == 4);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new rcx(this, lwfVar, n310Var, 7);
                xq00Var.m91793t0(objM91750T);
            }
            stg1.m79262c(h0kVar, str, (eh00) objM91750T, fxh0Var, xq00Var, (i2 << 3) & 7168);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00(this, n310Var, lwfVar, fxh0Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m66168d(he70 he70Var, lwf lwfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        Object vvsVar;
        kqi0 kqi0Var;
        boolean z;
        vta vtaVar;
        sgu sguVar;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(-696635308);
        if ((i & 6) == 0) {
            i2 = (xq00Var2.m91766g(he70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var2.m91766g(lwfVar) : xq00Var2.m91770i(lwfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91766g(fxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str = he70Var.f90338a;
            vsa vsaVar = he70Var.f90344g;
            vta vtaVar2 = he70Var.f90343f;
            kqi0 kqi0VarM77670i = sam.m77670i(k0e1.m54985d(z5f.m95457d((z5f) this.f161229d, "", new String[]{str}).map(new ia70(1, this, str)).distinctUntilChanged()), Boolean.FALSE, null, xq00Var2, 48, 2);
            String str2 = ((Boolean) kqi0VarM77670i.getValue()).booleanValue() ? he70Var.f90339b : he70Var.f90340c;
            String str3 = ((Boolean) kqi0VarM77670i.getValue()).booleanValue() ? he70Var.f90341d : he70Var.f90342e;
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            int i3 = i2;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            wwu wwuVar = ((Boolean) kqi0VarM77670i.getValue()).booleanValue() ? hou.f93607c : ztu.f286267c;
            boolean zM91770i = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i3 & 64) != 0 && xq00Var2.m91770i(lwfVar))) | xq00Var2.m91770i(this) | ((i3 & 14) == 4) | xq00Var2.m91766g(kqi0VarM77670i);
            Object objM91750T = xq00Var2.m91750T();
            if (zM91770i || objM91750T == ia7Var) {
                kqi0Var = kqi0VarM77670i;
                z = false;
                vvsVar = new vvs(lwfVar, this, he70Var, kqi0Var, 12);
                xq00Var2.m91793t0(vvsVar);
            } else {
                vvsVar = objM91750T;
                kqi0Var = kqi0VarM77670i;
                z = false;
            }
            peu peuVar = new peu(u40.f226523c, (eh00) vvsVar);
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                vtaVar = vtaVar2;
                if (vtaVar == vta.f244590a && vsaVar == vsa.f244390a) {
                    xq00Var2.m91771i0(-1345485457);
                    Object objM91750T2 = xq00Var2.m91750T();
                    if (objM91750T2 == ia7Var) {
                        objM91750T2 = sd70.f207919X0;
                        xq00Var2.m91793t0(objM91750T2);
                    }
                    sgu sguVar2 = new sgu(18, null, (th00) objM91750T2, null, null, 26);
                    xq00Var2.m91788r(z);
                    sguVar = sguVar2;
                }
                qxg1.m74126j(vtaVar, r17, str2, str3, wwuVar, peuVar, null, sguVar, xq00Var2, 32768, 64);
                xq00Var2 = xq00Var2;
                xq00Var2.m91788r(true);
            } else {
                vtaVar = vtaVar2;
            }
            xq00Var2.m91771i0(-1345054774);
            xq00Var2.m91788r(z);
            sguVar = null;
            qxg1.m74126j(vtaVar, r17, str2, str3, wwuVar, peuVar, null, sguVar, xq00Var2, 32768, 64);
            xq00Var2 = xq00Var2;
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new mg60(this, he70Var, lwfVar, fxh0Var, i, 4);
        }
    }

    public o310(voc1 voc1Var, yfd1 yfd1Var, z5f z5fVar, u7n u7nVar, pu4 pu4Var, siy siyVar) {
        this.f161227b = voc1Var;
        this.f161228c = yfd1Var;
        this.f161229d = z5fVar;
        this.f161230e = u7nVar;
        this.f161231f = pu4Var;
        this.f161232g = siyVar;
    }
}
