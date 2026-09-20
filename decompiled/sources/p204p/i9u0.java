package p204p;

import android.content.Context;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class i9u0 implements dut {

    /* JADX INFO: renamed from: a */
    public final bwt0 f100079a;

    /* JADX INFO: renamed from: b */
    public final u4l0 f100080b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f100081c;

    /* JADX INFO: renamed from: d */
    public final q831 f100082d;

    /* JADX INFO: renamed from: e */
    public final Context f100083e;

    /* JADX INFO: renamed from: f */
    public final epx f100084f;

    /* JADX INFO: renamed from: g */
    public final gcu0 f100085g;

    /* JADX INFO: renamed from: h */
    public final wxh0 f100086h;

    /* JADX INFO: renamed from: i */
    public final kfk f100087i;

    /* JADX INFO: renamed from: t */
    public final cph f100088t;

    public i9u0(bwt0 bwt0Var, u4l0 u4l0Var, z9j0 z9j0Var, q831 q831Var, Context context, epx epxVar, gcu0 gcu0Var) {
        this.f100079a = bwt0Var;
        this.f100080b = u4l0Var;
        this.f100081c = z9j0Var;
        this.f100082d = q831Var;
        this.f100083e = context;
        this.f100084f = epxVar;
        this.f100085g = gcu0Var;
        p3u0 p3u0Var = p3u0.f173736X;
        n5q n5qVar = xsr.f265651a;
        this.f100086h = uuf1.m83999s(p3u0Var, pvb0.f181680a.f197428f, null, new fyf(new iy6(this, 26), true, 1932028631), 4);
        this.f100087i = new kfk(4);
        fyf fyfVar = c3h.f33684a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f100088t = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Serializable m49991e(i9u0 i9u0Var, String str, ibk ibkVar) {
        g9u0 g9u0Var;
        String str2;
        m340 m340Var;
        if (ibkVar instanceof g9u0) {
            g9u0Var = (g9u0) ibkVar;
            int i = g9u0Var.f77880d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9u0Var.f77880d = i - Integer.MIN_VALUE;
            } else {
                g9u0Var = new g9u0(i9u0Var, ibkVar);
            }
        } else {
            g9u0Var = new g9u0(i9u0Var, ibkVar);
        }
        Object objM86755t = g9u0Var.f77878b;
        int i2 = g9u0Var.f77880d;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM54985d = k0e1.m54985d(((jpx) i9u0Var.f100084f).m53978b(new C1668ai("ratings", false, (gh00) new j1r0(str, 24))).filter(alq0.f16940f));
            g9u0Var.f77877a = str;
            g9u0Var.f77880d = 1;
            objM86755t = vyf1.m86755t(yabVarM54985d, g9u0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = g9u0Var.f77877a;
            bga.m29073P(objM86755t);
        }
        gqx gqxVar = (gqx) objM86755t;
        erc1 erc1Var = (erc1) gqxVar.mo45449a(erc1.class, str).f72301b;
        Object obj = null;
        List list = (erc1Var == null || (m340Var = erc1Var.f62079a) == null) ? null : m340Var.f139524a;
        if (list == null) {
            list = lau.f131415a;
        }
        for (Object obj2 : list) {
            if (((z240) obj2).f278476b == a340.f11861b) {
                obj = obj2;
                break;
            }
        }
        z240 z240Var = (z240) obj;
        if (z240Var == null) {
            z240Var = (z240) g6f.m43745s0(list);
        }
        if (z240Var == null || (str2 = z240Var.f278475a.f198763a) == null) {
            str2 = "";
        }
        z2q0 z2q0Var = (z2q0) gqxVar.mo45449a(z2q0.class, str).f72301b;
        return new pqm0(str2, new Integer(z2q0Var != null ? z2q0Var.f278642a.f268663a : 0));
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f100087i;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f100088t;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f100086h;
    }
}
