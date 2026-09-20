package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public final class xbe {

    /* JADX INFO: renamed from: a */
    public final o7r f259890a;

    /* JADX INFO: renamed from: b */
    public final t4j f259891b;

    /* JADX INFO: renamed from: c */
    public final bga0 f259892c;

    /* JADX INFO: renamed from: d */
    public final e9r f259893d;

    /* JADX INFO: renamed from: e */
    public final j8r f259894e;

    /* JADX INFO: renamed from: f */
    public final k5m0 f259895f;

    /* JADX INFO: renamed from: g */
    public final luk f259896g;

    public xbe(o7r o7rVar, t4j t4jVar, bga0 bga0Var, e9r e9rVar, j8r j8rVar, k5m0 k5m0Var, luk lukVar) {
        this.f259890a = o7rVar;
        this.f259891b = t4jVar;
        this.f259892c = bga0Var;
        this.f259893d = e9rVar;
        this.f259894e = j8rVar;
        this.f259895f = k5m0Var;
        this.f259896g = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m90314a(xbe xbeVar, z7r z7rVar, fbk fbkVar) throws Throwable {
        ube ubeVar;
        j8r j8rVar = xbeVar.f259894e;
        if (fbkVar instanceof ube) {
            ubeVar = (ube) fbkVar;
            int i = ubeVar.f228704c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubeVar.f228704c = i - Integer.MIN_VALUE;
            } else {
                ubeVar = new ube(xbeVar, fbkVar);
            }
        } else {
            ubeVar = new ube(xbeVar, fbkVar);
        }
        Object obj = ubeVar.f228702a;
        int i2 = ubeVar.f228704c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Bundle bundle = new Bundle();
            bundle.putParcelable("device_location_permission_page_input", new y7r(z7rVar, null, 14));
            j8rVar.f109991a.mo46963e();
            luk lukVar = xbeVar.f259896g;
            of5 of5Var = new of5(xbeVar, bundle, 0 == true ? 1 : 0, 26);
            ubeVar.f228704c = 1;
            if (x0h1.m89557A(lukVar, of5Var, ubeVar) != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        luu0 luu0VarM31020l = bzf1.m31020l(j8rVar.f109991a);
        ubeVar.f228704c = 2;
        Object objM86755t = vyf1.m86755t(luu0VarM31020l, ubeVar);
        return objM86755t == yukVar ? yukVar : objM86755t;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m90315b(ibk ibkVar) {
        tbe tbeVar;
        Object objM87199a;
        if (ibkVar instanceof tbe) {
            tbeVar = (tbe) ibkVar;
            int i = tbeVar.f218833c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbeVar.f218833c = i - Integer.MIN_VALUE;
            } else {
                tbeVar = new tbe(this, ibkVar);
            }
        } else {
            tbeVar = new tbe(this, ibkVar);
        }
        Object obj = tbeVar.f218831a;
        int i2 = tbeVar.f218833c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f259890a.m66383b()) {
                tbeVar.f218833c = 1;
                objM87199a = ((w4j) this.f259891b).m87199a("genui_bridge", tbeVar);
                Object obj2 = yuk.f276404a;
                if (objM87199a == obj2) {
                    return obj2;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        objM87199a = ((s6x0) obj).f206218a;
        if (objM87199a instanceof c6x0) {
            objM87199a = null;
        }
        boolean z = objM87199a == a5j.f12526c;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: c */
    public final Object m90316c(ibk ibkVar) {
        vbe vbeVar;
        Object objM90315b;
        if (ibkVar instanceof vbe) {
            vbeVar = (vbe) ibkVar;
            int i = vbeVar.f239484c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vbeVar.f239484c = i - Integer.MIN_VALUE;
            } else {
                vbeVar = new vbe(this, ibkVar);
            }
        } else {
            vbeVar = new vbe(this, ibkVar);
        }
        vbe vbeVar2 = vbeVar;
        Object objM29105a = vbeVar2.f239482a;
        int i2 = vbeVar2.f239484c;
        fbk fbkVar = null;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM29105a);
            C2148n1 c2148n1 = new C2148n1(2, this, xbe.class, "presentPermissionPage", "presentPermissionPage(Lcom/spotify/devicelocation/permissionpageapi/DeviceLocationPermissionPageMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 12);
            vbeVar2.f239484c = 1;
            objM29105a = this.f259892c.m29105a(null, c2148n1, vbeVar2);
            if (objM29105a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM29105a);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM29105a);
                return objM29105a;
            }
            bga.m29073P(objM29105a);
        }
        vbeVar2.f239484c = 3;
        objM90315b = m90315b(vbeVar2);
        if (objM90315b != obj) {
            return obj;
        }
        return objM90315b;
        rnj0 rnj0Var = rnj0.f200934b;
        wbe wbeVar = new wbe((hga0) objM29105a, this, fbkVar, 0);
        vbeVar2.f239484c = 2;
        if (x0h1.m89557A(rnj0Var, wbeVar, vbeVar2) != obj) {
            vbeVar2.f239484c = 3;
            objM90315b = m90315b(vbeVar2);
            if (objM90315b != obj) {
                return objM90315b;
            }
        }
        return obj;
    }
}
