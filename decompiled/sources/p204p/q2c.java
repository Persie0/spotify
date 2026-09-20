package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class q2c {

    /* JADX INFO: renamed from: a */
    public final dcr0 f184583a;

    /* JADX INFO: renamed from: b */
    public final m011 f184584b;

    /* JADX INFO: renamed from: c */
    public final int f184585c;

    public q2c(dcr0 dcr0Var, m011 m011Var, int i) {
        this.f184583a = dcr0Var;
        this.f184584b = m011Var;
        this.f184585c = i;
    }

    /* JADX INFO: renamed from: a */
    public final Object m71995a(i2c i2cVar, fbk fbkVar) {
        boolean z = i2cVar instanceof h2c;
        dcr0 dcr0Var = this.f184583a;
        int i = this.f184585c;
        yuk yukVar = yuk.f276404a;
        if (z) {
            Object objM35670a = dcr0Var.m35670a(new q8r0(i, ((h2c) i2cVar).f86949a), fbkVar);
            if (objM35670a == yukVar) {
                return objM35670a;
            }
        } else if (i2cVar instanceof e2c) {
            Object objM35670a2 = dcr0Var.m35670a(new n8r0(i, ((e2c) i2cVar).f55421a), fbkVar);
            if (objM35670a2 == yukVar) {
                return objM35670a2;
            }
        } else if (i2cVar instanceof g2c) {
            Object objM35670a3 = dcr0Var.m35670a(new p8r0(i, ((g2c) i2cVar).f75884a), fbkVar);
            if (objM35670a3 == yukVar) {
                return objM35670a3;
            }
        } else if (i2cVar instanceof f2c) {
            Object objM35670a4 = dcr0Var.m35670a(new o8r0(i), fbkVar);
            if (objM35670a4 == yukVar) {
                return objM35670a4;
            }
        } else if (i2cVar instanceof d2c) {
            Object objM35670a5 = dcr0Var.m35670a(new m8r0(i, ((d2c) i2cVar).f44534a), fbkVar);
            if (objM35670a5 == yukVar) {
                return objM35670a5;
            }
        } else if (i2cVar instanceof b2c) {
            Object objM35670a6 = dcr0Var.m35670a(new k8r0(i, ((b2c) i2cVar).f22562a), fbkVar);
            if (objM35670a6 == yukVar) {
                return objM35670a6;
            }
        } else {
            boolean z2 = i2cVar instanceof y1c;
            m011 m011Var = this.f184584b;
            if (z2) {
                Object objM60397a = m011Var.m60397a(new rf11(((y1c) i2cVar).f268226a, i), fbkVar);
                if (objM60397a == yukVar) {
                    return objM60397a;
                }
            } else if (i2cVar instanceof a2c) {
                Object objM60397a2 = m011Var.m60397a(new m2r(((a2c) i2cVar).f11621a, i), fbkVar);
                if (objM60397a2 == yukVar) {
                    return objM60397a2;
                }
            } else {
                if (!(i2cVar instanceof z1c)) {
                    throw new NoWhenBranchMatchedException();
                }
                z1c z1cVar = (z1c) i2cVar;
                Object objM60397a3 = m011Var.m60397a(new sf11(z1cVar.f278276a, z1cVar.f278277b, z1cVar.f278278c, z1cVar.f278279d, i), fbkVar);
                if (objM60397a3 == yukVar) {
                    return objM60397a3;
                }
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final onc m71996b() {
        return xtm0.m92105z(new o2c(this.f184583a.f47620a, this, 0), new o2c(this.f184584b.m60398b(new k011(qpv0.f191387a.mo54112b(n1c.class), Integer.valueOf(this.f184585c))), this, 1));
    }
}
