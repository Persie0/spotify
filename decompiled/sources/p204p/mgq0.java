package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes3.dex */
public final class mgq0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f143610b;

    public /* synthetic */ mgq0(Object obj, int i) {
        this.f143609a = i;
        this.f143610b = obj;
    }

    @Override // p204p.ewr
    public final void dispose() {
        c631 c631VarM37499a;
        int i = this.f143609a;
        fbk fbkVar = null;
        Object obj = this.f143610b;
        switch (i) {
            case 0:
                ((lgq0) obj).m87300e();
                return;
            case 1:
                v5r0 v5r0Var = (v5r0) obj;
                v5r0Var.f237584I = 3;
                k5r0 k5r0Var = v5r0Var.f237604u;
                if (k5r0Var != null) {
                    v5r0Var.m84749f(k5r0Var);
                    return;
                } else {
                    v5r0Var.m84755l();
                    return;
                }
            case 2:
                q831 q831Var = (q831) obj;
                e0r0 e0r0Var = (e0r0) q831Var.f186235i.f158717a.getValue();
                if (e0r0Var == null || (c631VarM37499a = e0r0Var.m37499a()) == null || !c631VarM37499a.m31507h()) {
                    return;
                }
                q831Var.m72300d();
                return;
            case 3:
                ((vps0) obj).f243778h.f239424b.mo30231j(w2a1.f247311a);
                return;
            case 4:
                ((wcm) ((a3d) obj).f11930g).f250070a.f38640e = null;
                return;
            case 5:
                ((bku0) obj).f28016c.m55709w();
                return;
            case 6:
                yqu0 yqu0Var = (yqu0) ((oqu0) obj);
                bqa bqaVar = yqu0Var.f275305e;
                if (bqaVar == null) {
                    return;
                }
                yqu0Var.f275302b.mo31988d(yqu0Var);
                yqu0Var.m94397c(new tqu0(yqu0Var, bqaVar, null));
                yqu0Var.f275305e = null;
                return;
            case 7:
                ((onv0) obj).m67423g();
                return;
            case 8:
                ((vyv0) obj).f246335b.m39811c();
                return;
            case 9:
                u3a u3aVar = (u3a) obj;
                if (u3aVar != null) {
                    u3aVar.f226308b.destroy();
                    u3aVar.f226307a.destroy();
                    return;
                }
                return;
            case 10:
                ((pex0) obj).f176880d.m60129c();
                return;
            case 11:
                ((ago) obj).m25872i();
                return;
            case 12:
                ogo ogoVar = ((bw41) obj).f31536a;
                if (ogoVar != null) {
                    ogoVar.dispose();
                    return;
                }
                return;
            case 13:
                k441 k441Var = (k441) obj;
                ku00 ku00Var = (ku00) k441Var.f119081N0;
                if (ku00Var == null) {
                    wj50.m88260d0("gatedContentService");
                    throw null;
                }
                ku00Var.m57370e();
                pto0 pto0Var = (pto0) k441Var.f119082O0;
                if (pto0Var != null) {
                    pto0Var.m71010d();
                    return;
                } else {
                    wj50.m88260d0("playabilityService");
                    throw null;
                }
            case 14:
                ((jez0) ((AbstractC1806e9) obj)).m53143P1(null);
                return;
            case 15:
                c791 c791Var = (c791) obj;
                c791Var.m31695i();
                c791Var.f34827a.mo38145D1();
                return;
            case 16:
                n5q n5qVar = xsr.f265651a;
                rb20 rb20Var = pvb0.f181680a;
                rnj0 rnj0Var = rnj0.f200934b;
                rb20Var.getClass();
                x0h1.m89578u(kk40.m56661c(opo.m67570t(rb20Var, rnj0Var)), null, 0, new wm81((y991) obj, fbkVar, 5), 3);
                return;
            case 17:
                ((v7i0) obj).m84852c();
                return;
            case 18:
                ((di41) obj).mo26601e(null);
                return;
            case 19:
                lg21 lg21Var = (lg21) obj;
                if (lg21Var != null) {
                    lg21Var.m58929h();
                    return;
                }
                return;
            case 20:
                tpb1 tpb1Var = (tpb1) obj;
                Boolean bool = tpb1Var.f222480d;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        ((v7i0) tpb1Var.f222479c.getValue()).m84852c();
                        return;
                    } else {
                        ((yhq) tpb1Var.f222478b.getValue()).m93689c(yuw.f276484d);
                        return;
                    }
                }
                return;
            case 21:
                ((egd1) obj).f59316c.m97090l(null);
                return;
            case 22:
                ((kxd1) obj).m57594c();
                return;
            default:
                c7e1 c7e1Var = (c7e1) obj;
                MobiusLoop.Controller controller = c7e1Var.f34865a;
                controller.stop();
                controller.disconnect();
                kk40.m56680v(c7e1Var.f34866b, null);
                return;
        }
    }
}
