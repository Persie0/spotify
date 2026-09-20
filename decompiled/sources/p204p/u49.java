package p204p;

import android.content.Context;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class u49 {

    /* JADX INFO: renamed from: a */
    public final Context f226624a;

    /* JADX INFO: renamed from: b */
    public final jth f226625b;

    /* JADX INFO: renamed from: c */
    public final bd40 f226626c;

    /* JADX INFO: renamed from: d */
    public final luk f226627d;

    /* JADX INFO: renamed from: e */
    public final luk f226628e;

    /* JADX INFO: renamed from: f */
    public final luk f226629f;

    public u49(Context context, jth jthVar, bd40 bd40Var, luk lukVar, int i, int i2) {
        this.f226624a = context;
        this.f226625b = jthVar;
        this.f226626c = bd40Var;
        this.f226627d = lukVar;
        kuk kukVar = luk.f137098b;
        this.f226628e = lukVar.mo40637Q(i);
        this.f226629f = lukVar.mo40637Q(i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m82314a(u49 u49Var, String str, x49 x49Var, int i, p49 p49Var, ibk ibkVar) {
        s49 s49Var;
        u49Var.getClass();
        if (ibkVar instanceof s49) {
            s49Var = (s49) ibkVar;
            int i2 = s49Var.f205517c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s49Var.f205517c = i2 - Integer.MIN_VALUE;
            } else {
                s49Var = new s49(u49Var, ibkVar);
            }
        } else {
            s49Var = new s49(u49Var, ibkVar);
        }
        Object obj = s49Var.f205515a;
        int i3 = s49Var.f205517c;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return ((s6x0) obj).f206218a;
        }
        bga.m29073P(obj);
        long j = 1024;
        z940 z940Var = new z940(new Long(x49Var.f258019e * j * j), edb.m38565n(x49Var.f258015a, "/image_", i));
        bd40 bd40Var = u49Var.f226626c;
        t52 t52Var = new t52(26, p49Var);
        s49Var.f205517c = 1;
        Object objM41355c = ((fd40) bd40Var).m41355c(str, z940Var, t52Var, s49Var);
        yuk yukVar = yuk.f276404a;
        return objM41355c == yukVar ? yukVar : objM41355c;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
    
        if (r0 == r13) goto L27;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m82315b(u49 u49Var, String str, x49 x49Var, int i, p49 p49Var, ibk ibkVar) {
        t49 t49Var;
        jy81 jy81Var;
        x49 x49Var2;
        int i2;
        p49 p49Var2;
        int i3;
        Object objM54293f;
        u49 u49Var2 = u49Var;
        u49Var2.getClass();
        if (ibkVar instanceof t49) {
            t49Var = (t49) ibkVar;
            int i4 = t49Var.f216948i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t49Var.f216948i = i4 - Integer.MIN_VALUE;
            } else {
                t49Var = new t49(u49Var2, ibkVar);
            }
        } else {
            t49Var = new t49(u49Var2, ibkVar);
        }
        t49 t49Var2 = t49Var;
        Object objM89557A = t49Var2.f216946g;
        int i5 = t49Var2.f216948i;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i5 == 0) {
                bga.m29073P(objM89557A);
                jy81Var = new jy81(Collections.singletonList(new iy81(str, new t2b0(0L, Long.MAX_VALUE), null, 12)));
                luk lukVar = u49Var2.f226627d;
                x49Var2 = x49Var;
                f81 f81Var = new f81(u49Var2, str, x49Var2, fbkVar, 19);
                t49Var2.f216940a = x49Var2;
                t49Var2.f216941b = p49Var;
                t49Var2.f216942c = u49Var2;
                t49Var2.f216943d = jy81Var;
                t49Var2.f216944e = i;
                i2 = 0;
                t49Var2.f216945f = 0;
                t49Var2.f216948i = 1;
                objM89557A = x0h1.m89557A(lukVar, f81Var, t49Var2);
                if (objM89557A != yukVar) {
                    p49Var2 = p49Var;
                    i3 = i;
                }
                return yukVar;
            }
            if (i5 == 1) {
                int i6 = t49Var2.f216945f;
                i3 = t49Var2.f216944e;
                jy81 jy81Var2 = t49Var2.f216943d;
                u49 u49Var3 = t49Var2.f216942c;
                p49Var2 = t49Var2.f216941b;
                x49 x49Var3 = t49Var2.f216940a;
                bga.m29073P(objM89557A);
                jy81Var = jy81Var2;
                x49Var2 = x49Var3;
                i2 = i6;
                u49Var2 = u49Var3;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
                objM54293f = ((s6x0) objM89557A).f206218a;
            }
            bga.m29073P(objM54293f);
            xsh xshVar = (xsh) objM54293f;
            return new mcc1(xshVar.f265591a, xshVar.f265592b, xshVar.f265593c, xshVar.f265594d);
            Integer num = (Integer) objM89557A;
            izl0 izl0Var = new izl0(x49Var2.f258015a + "/video_" + i3, x49Var2.f258016b, x49Var2.f258017c, null, null, 24);
            jth jthVar = u49Var2.f226625b;
            t52 t52Var = new t52(27, p49Var2);
            boolean z = x49Var2.f258020f;
            t49Var2.f216940a = null;
            t49Var2.f216941b = null;
            t49Var2.f216942c = null;
            t49Var2.f216943d = null;
            t49Var2.f216944e = i3;
            t49Var2.f216945f = i2;
            t49Var2.f216948i = 2;
            objM54293f = jthVar.m54293f(jy81Var, izl0Var, t52Var, (136 & 8) != 0 ? null : null, null, (136 & 32) != 0 ? false : z, (136 & 64) != 0 ? null : num, (136 & 128) != 0 ? null : null, (136 & 256) == 0, t49Var2);
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }
}
