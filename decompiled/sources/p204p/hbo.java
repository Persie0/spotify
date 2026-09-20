package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hbo implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89564a;

    /* JADX INFO: renamed from: b */
    public final Object f89565b;

    public /* synthetic */ hbo(Object obj, int i) {
        this.f89564a = i;
        this.f89565b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = this.f89564a;
        Object obj = this.f89565b;
        switch (i) {
            case 0:
                iqb1 iqb1Var = (iqb1) ((p7o) obj).f174733c;
                return new ibo(new tw80(iqb1Var.f104714c, (Object) iqb1Var.f104713b, (Object) iqb1Var.f104712a, (Object) iqb1Var.f104715d, (Object) iqb1Var.f104716e, (Object) iqb1Var.f104717f, (Object) iqb1Var.f104718g, (Object) iqb1Var.f104719h, 24));
            case 1:
                cdn cdnVar = (cdn) obj;
                pgo pgoVar = ((mrq) cdnVar.f36915b).f146588a;
                jg31.m53271i(pgoVar);
                return new z080(pgoVar, ((l3n) cdnVar.f36917d).m58011d(), cdnVar.m32454q());
            case 2:
                return ptl.m70983d((o6q) ((etb1) ((ybn) obj).f271220c).f62676a.get());
            case 3:
                iqb1 iqb1Var2 = (iqb1) ((r8n) obj).f196820c;
                return new ibo(new tw80(iqb1Var2.f104714c, (Object) iqb1Var2.f104713b, (Object) iqb1Var2.f104712a, (Object) iqb1Var2.f104715d, (Object) iqb1Var2.f104716e, (Object) iqb1Var2.f104717f, (Object) iqb1Var2.f104718g, (Object) iqb1Var2.f104719h, 24));
            case 4:
                return hgi0.m47449B((dcm0) ((z4n) obj).f279302b);
            case 5:
                return new xbo(this);
            case 6:
                return new olm(this, 5);
            case 7:
                return new rzn(this, 1);
            case 8:
                c9e1 c9e1Var = (c9e1) ((r8n) obj).f196820c;
                wt80 wt80Var = (wt80) c9e1Var.f35483f.get();
                jg31.m53271i(wt80Var);
                rqs0 rqs0Var = (rqs0) c9e1Var.f35484g.get();
                jg31.m53271i(rqs0Var);
                qbn0 qbn0Var = new qbn0();
                q9e1 q9e1Var = (q9e1) c9e1Var.f35485h.get();
                jg31.m53271i(q9e1Var);
                vmz vmzVar = (vmz) c9e1Var.f35486i.get();
                jg31.m53271i(vmzVar);
                xux0 xux0Var = (xux0) c9e1Var.f35487j.get();
                jg31.m53271i(xux0Var);
                bji bjiVar = (bji) c9e1Var.f35479b.get();
                jg31.m53271i(bjiVar);
                c84 c84Var = new c84(false, false, bjiVar);
                n5q n5qVar = xsr.f265651a;
                return new e7e1(wt80Var, rqs0Var, qbn0Var, q9e1Var, vmzVar, xux0Var, pvb0.f181680a, c84Var.m31772b(), c84Var.m31771a());
            case 9:
                vzn vznVar = (vzn) obj;
                String strM58011d = ((l3n) vznVar.f246489d).m58011d();
                oen oenVar = (oen) vznVar.f246487b;
                q9e1 q9e1Var2 = (q9e1) oenVar.f164479c.f169973vd.get();
                jg31.m53271i(q9e1Var2);
                t431 t431Var = (t431) oenVar.f164478b.f211991cg.get();
                jg31.m53271i(t431Var);
                hy21 hy21VarM80029a = t431Var.m80029a(new p431(null, null, 1, null, 39));
                gcu0 gcu0Var = (gcu0) oenVar.f164478b.f211595O3.get();
                jg31.m53271i(gcu0Var);
                return new q2e1(strM58011d, q9e1Var2, hy21VarM80029a, gcu0Var);
            case 10:
                ri5 ri5Var = new ri5(11);
                qzn qznVar = (qzn) obj;
                ven venVar = (ven) qznVar.f194229b;
                z9j0 z9j0Var = (z9j0) venVar.f240774b.f169565X.get();
                jg31.m53271i(z9j0Var);
                vsk vskVar = (vsk) venVar.f240773a.f212152ia.get();
                jg31.m53271i(vskVar);
                String str = ((l3n) qznVar.f194230c).f129353e;
                jg31.m53271i(str);
                son sonVar = venVar.f240773a;
                e940 e940Var = (e940) sonVar.f211626P7.get();
                jg31.m53271i(e940Var);
                qmr0 qmr0Var = (qmr0) sonVar.f211777Un.get();
                jg31.m53271i(qmr0Var);
                return new bmh(ri5Var, z9j0Var, vskVar, str, new u7y(e940Var, qmr0Var));
            default:
                ((j7n0) obj).getClass();
                return new alk0();
        }
    }
}
