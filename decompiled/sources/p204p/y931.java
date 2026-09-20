package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y931 implements ihz {

    /* JADX INFO: renamed from: a */
    public final ea31 f270492a;

    /* JADX INFO: renamed from: b */
    public final ypo f270493b;

    /* JADX INFO: renamed from: c */
    public final n05 f270494c;

    /* JADX INFO: renamed from: d */
    public final emy0 f270495d = hmy0.f93100c;

    public y931(ea31 ea31Var, ypo ypoVar, n05 n05Var) {
        this.f270492a = ea31Var;
        this.f270493b = ypoVar;
        this.f270494c = n05Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m93139b(y931 y931Var, nly0 nly0Var, float f, float f2, v931 v931Var, ibk ibkVar) {
        x931 x931Var;
        if (ibkVar instanceof x931) {
            x931Var = (x931) ibkVar;
            int i = x931Var.f259271c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x931Var.f259271c = i - Integer.MIN_VALUE;
            } else {
                x931Var = new x931(y931Var, ibkVar);
            }
        } else {
            x931Var = new x931(y931Var, ibkVar);
        }
        x931 x931Var2 = x931Var;
        Object objMo25923f = x931Var2.f259269a;
        int i2 = x931Var2.f259271c;
        if (i2 == 0) {
            bga.m29073P(objMo25923f);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return el51.m39331a(f, f2, 28);
            }
            x931Var2.f259271c = 1;
            ypo ypoVar = y931Var.f270493b;
            objMo25923f = (Math.abs(hdg1.m47194j(ypoVar, 0.0f, f2)) >= Math.abs(f) ? new it9(ypoVar, 29) : new b741(y931Var.f270494c, 10)).mo25923f(nly0Var, qyg1.m74179I(f), qyg1.m74179I(f2), v931Var, x931Var2);
            yuk yukVar = yuk.f276404a;
            if (objMo25923f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo25923f);
        }
        return ((j05) objMo25923f).m52039c();
    }

    @Override // p204p.ihz
    /* JADX INFO: renamed from: a */
    public Object mo30162a(nly0 nly0Var, float f, fbk fbkVar) {
        return m93141d(nly0Var, f, wag1.f249525a, (ibk) fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m93140c(nly0 nly0Var, float f, gh00 gh00Var, ibk ibkVar) throws Throwable {
        u931 u931Var;
        gh00 gh00Var2;
        if (ibkVar instanceof u931) {
            u931Var = (u931) ibkVar;
            int i = u931Var.f228068d;
            if ((i & Integer.MIN_VALUE) != 0) {
                u931Var.f228068d = i - Integer.MIN_VALUE;
            } else {
                u931Var = new u931(this, ibkVar);
            }
        } else {
            u931Var = new u931(this, ibkVar);
        }
        Object objM89557A = u931Var.f228066b;
        int i2 = u931Var.f228068d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            cip cipVar = new cip(this, f, gh00Var, nly0Var, (fbk) null);
            u931Var.f228065a = gh00Var;
            u931Var.f228068d = 1;
            objM89557A = x0h1.m89557A(this.f270495d, cipVar, u931Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
            gh00Var2 = gh00Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gh00Var2 = u931Var.f228065a;
            bga.m29073P(objM89557A);
        }
        j05 j05Var = (j05) objM89557A;
        gh00Var2.invoke(qyg1.m74179I(0.0f));
        return j05Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m93141d(nly0 nly0Var, float f, gh00 gh00Var, ibk ibkVar) throws Throwable {
        w931 w931Var;
        if (ibkVar instanceof w931) {
            w931Var = (w931) ibkVar;
            int i = w931Var.f249064c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w931Var.f249064c = i - Integer.MIN_VALUE;
            } else {
                w931Var = new w931(this, ibkVar);
            }
        } else {
            w931Var = new w931(this, ibkVar);
        }
        Object objM93140c = w931Var.f249062a;
        int i2 = w931Var.f249064c;
        if (i2 == 0) {
            bga.m29073P(objM93140c);
            w931Var.f249064c = 1;
            objM93140c = m93140c(nly0Var, f, gh00Var, w931Var);
            Object obj = yuk.f276404a;
            if (objM93140c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93140c);
        }
        j05 j05Var = (j05) objM93140c;
        return qyg1.m74179I(((Number) j05Var.m52037a()).floatValue() != 0.0f ? ((Number) j05Var.m52038b().m71791a()).floatValue() : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y931) {
            y931 y931Var = (y931) obj;
            if (wj50.m88271j(y931Var.f270494c, this.f270494c) && wj50.m88271j(y931Var.f270493b, this.f270493b) && wj50.m88271j(y931Var.f270492a, this.f270492a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f270492a.hashCode() + ((this.f270493b.hashCode() + (this.f270494c.hashCode() * 31)) * 31);
    }
}
