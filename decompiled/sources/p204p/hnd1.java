package p204p;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class hnd1 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final Context f93311a;

    /* JADX INFO: renamed from: b */
    public final luk f93312b;

    /* JADX INFO: renamed from: c */
    public final zv41 f93313c;

    /* JADX INFO: renamed from: d */
    public final c9k f93314d;

    public hnd1(Context context, luk lukVar, bji bjiVar) {
        this.f93311a = context;
        this.f93312b = lukVar;
        zv41 zv41VarM52819d = jag1.m52819d(jnd1.f114086a);
        this.f93313c = zv41VarM52819d;
        c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(lukVar, qlg1.m73202g()));
        this.f93314d = c9kVarM56661c;
        if (new bv4(false, bjiVar).m30584a()) {
            zv41VarM52819d.m97091m(null, lnd1.f135149a);
            x0h1.m89578u(c9kVarM56661c, null, 0, new pwb1(this, null, 13), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m48009a(hnd1 hnd1Var, ibk ibkVar) {
        gnd1 gnd1Var;
        if (ibkVar instanceof gnd1) {
            gnd1Var = (gnd1) ibkVar;
            int i = gnd1Var.f82696c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnd1Var.f82696c = i - Integer.MIN_VALUE;
            } else {
                gnd1Var = new gnd1(hnd1Var, ibkVar);
            }
        } else {
            gnd1Var = new gnd1(hnd1Var, ibkVar);
        }
        Object objM48221p = gnd1Var.f82694a;
        int i2 = gnd1Var.f82696c;
        if (i2 == 0) {
            bga.m29073P(objM48221p);
            gnd1Var.f82696c = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(gnd1Var));
            hqbVar.m48222q();
            Executor executorM95212s = z2h1.m95212s(hnd1Var.f93312b);
            dnd1 dnd1Var = new dnd1(executorM95212s);
            Context context = hnd1Var.f93311a;
            gc41 gc41Var = new gc41(hqbVar, 26);
            int i3 = dmd1.f50498a;
            executorM95212s.execute(new kgd0(dnd1Var, gc41Var, context, 21));
            objM48221p = hqbVar.m48221p();
            yuk yukVar = yuk.f276404a;
            if (objM48221p == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM48221p);
        }
        return ((s6x0) objM48221p).f206218a;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f93314d, null);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
