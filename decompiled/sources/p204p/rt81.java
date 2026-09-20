package p204p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rt81 extends ioj0 {

    /* JADX INFO: renamed from: f */
    public final bqa f202512f;

    /* JADX INFO: renamed from: g */
    public di41 f202513g;

    public rt81(nny0 nny0Var, kb7 kb7Var, yqq yqqVar) {
        super(nny0Var, kb7Var, yqqVar);
        this.f202512f = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00da, code lost:
    
        if (r0.invoke(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [p.qx0, p.th00] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m76370c(rt81 rt81Var, nny0 nny0Var, ot81 ot81Var, ibk ibkVar) {
        pt81 pt81Var;
        rt81Var.getClass();
        t7q t7qVar = rt81Var.f104237e;
        if (ibkVar instanceof pt81) {
            pt81Var = (pt81) ibkVar;
            int i = pt81Var.f181074c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt81Var.f181074c = i - Integer.MIN_VALUE;
            } else {
                pt81Var = new pt81(rt81Var, ibkVar);
            }
        } else {
            pt81Var = new pt81(rt81Var, ibkVar);
        }
        pt81 pt81Var2 = pt81Var;
        Object obj = pt81Var2.f181072a;
        int i2 = pt81Var2.f181074c;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        rlv0 rlv0VarM36622v = dq60.m36622v(obj);
        rlv0VarM36622v.f200373a = ot81Var;
        long j = ot81Var.f169002b;
        long j2 = ot81Var.f169001a;
        ((o5b1) t7qVar.f217871b).m66281a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((o5b1) t7qVar.f217872c).m66281a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
        ot81 ot81VarM76371g = m76371g(rt81Var.f202512f);
        if (ot81VarM76371g != null) {
            long j3 = ot81VarM76371g.f169002b;
            long j4 = ot81VarM76371g.f169001a;
            ((o5b1) t7qVar.f217871b).m66281a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((o5b1) t7qVar.f217872c).m66281a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            rlv0VarM36622v.f200373a = ((ot81) rlv0VarM36622v.f200373a).m67773a(ot81VarM76371g);
        }
        th00 xt61Var = new xt61(rt81Var, nny0Var, rlv0VarM36622v, (fbk) null, 3);
        pt81Var2.f181074c = 1;
        if (rt81Var.m51207b(xt61Var, pt81Var2) != obj2) {
        }
        return obj2;
        ?? r0 = rt81Var.f104234b;
        m5b1 m5b1Var = new m5b1(pp91.m70524e(((o5b1) t7qVar.f217871b).m66282b(Float.MAX_VALUE), ((o5b1) t7qVar.f217872c).m66282b(Float.MAX_VALUE)));
        pt81Var2.f181074c = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static ot81 m76371g(bqa bqaVar) {
        ot81 ot81Var = null;
        vsz0 vsz0VarM43277s = g0b1.m43277s(new w100((Object) new g2i0(bqaVar, 1), (fbk) (0 == true ? 1 : 0), 2));
        while (vsz0VarM43277s.hasNext()) {
            ot81 ot81VarM67773a = (ot81) vsz0VarM43277s.next();
            if (ot81Var != null) {
                ot81VarM67773a = ot81Var.m67773a(ot81VarM67773a);
            }
            ot81Var = ot81VarM67773a;
        }
        return ot81Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final boolean m76372d(e6q0 e6q0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        bqa bqaVar;
        nny0 nny0Var;
        k6q0 k6q0Var = (k6q0) g6f.m43745s0(e6q0Var.f56704a);
        if (k6q0Var != null) {
            List listM55603c = k6q0Var.m55603c();
            int size = listM55603c.size();
            int i = 0;
            z3 = false;
            while (true) {
                bqaVar = this.f202512f;
                nny0Var = this.f104233a;
                if (i >= size) {
                    break;
                }
                ux20 ux20Var = (ux20) listM55603c.get(i);
                long j = ux20Var.f234812d ^ (-9223372034707292160L);
                if (!(nny0Var.m65227i(nny0Var.m65223e(j)) == 0.0f)) {
                    z3 = !(bqaVar.mo30231j(new ot81(j, ux20Var.f234809a, false)) instanceof tnc) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = k6q0Var.f119821l ^ (-9223372034707292160L);
            boolean z4 = e6q0Var.f56709f == 12;
            if (!(nny0Var.m65227i(nny0Var.m65223e(j2)) == 0.0f) || z4) {
                if (!(bqaVar.mo30231j(new ot81(j2, k6q0Var.f119811b, z4)) instanceof tnc) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.f104236d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m76373e(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        int i = e6q0Var.f56709f;
        if (i == 10 || i == 11 || i == 12) {
            ?? r5 = e6q0Var.f56704a;
            int size = r5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((k6q0) r5.get(i2)).m55612l()) {
                    return;
                }
            }
            if (f6q0Var == f6q0.f66485a && this.f104236d) {
                m76372d(e6q0Var);
                ioj0.m51206a(e6q0Var);
            }
            if (f6q0Var == f6q0.f66486b && !this.f104236d && m76372d(e6q0Var)) {
                ioj0.m51206a(e6q0Var);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m76374f(xuk xukVar) {
        if (this.f202513g == null) {
            this.f202513g = x0h1.m89578u(xukVar, null, 0, new qt81(this, null), 3);
        }
    }
}
