package p204p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class na51 {

    /* JADX INFO: renamed from: a */
    public final eh00 f151953a;

    /* JADX INFO: renamed from: b */
    public da51 f151954b = new da51(lau.f131415a);

    /* JADX INFO: renamed from: c */
    public ArrayList f151955c = new ArrayList();

    public na51(eh00 eh00Var) {
        this.f151953a = eh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final Object m63951a(int i, ibk ibkVar) {
        ma51 ma51Var;
        mc51 mc51VarMo70483b;
        if (ibkVar instanceof ma51) {
            ma51Var = (ma51) ibkVar;
            int i2 = ma51Var.f141480d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ma51Var.f141480d = i2 - Integer.MIN_VALUE;
            } else {
                ma51Var = new ma51(this, ibkVar);
            }
        } else {
            ma51Var = new ma51(this, ibkVar);
        }
        Object objMo32425a = ma51Var.f141478b;
        int i3 = ma51Var.f141480d;
        if (i3 == 0) {
            bga.m29073P(objMo32425a);
            if (i < 0 || i >= this.f151954b.f46980a.size()) {
                throw new IllegalStateException(("Story request before cache is initialized: " + i).toString());
            }
            uc51 uc51Var = (uc51) this.f151954b.f46980a.get(i);
            if (uc51Var instanceof sc51) {
                ma51Var.f141477a = i;
                ma51Var.f141480d = 1;
                objMo32425a = ((sc51) uc51Var).mo32425a(ma51Var);
                yuk yukVar = yuk.f276404a;
                if (objMo32425a == yukVar) {
                    return yukVar;
                }
            } else {
                if (!(uc51Var instanceof tc51)) {
                    throw new NoWhenBranchMatchedException();
                }
                mc51VarMo70483b = ((tc51) uc51Var).mo70483b();
            }
            if (!(mc51VarMo70483b instanceof kc51)) {
                throw new IllegalStateException(s571.m77246e(i, "Can't load story "), ((kc51) mc51VarMo70483b).f121375a);
            }
            if (mc51VarMo70483b instanceof lc51) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = this.f151955c;
            db51 db51Var = ((lc51) mc51VarMo70483b).f131828a;
            arrayList.set(i, new zd51(db51Var));
            return db51Var;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = ma51Var.f141477a;
        bga.m29073P(objMo32425a);
        mc51VarMo70483b = (mc51) objMo32425a;
        if (!(mc51VarMo70483b instanceof kc51)) {
            throw new IllegalStateException(s571.m77246e(i, "Can't load story "), ((kc51) mc51VarMo70483b).f121375a);
        }
        if (mc51VarMo70483b instanceof lc51) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = this.f151955c;
        db51 db51Var2 = ((lc51) mc51VarMo70483b).f131828a;
        arrayList2.set(i, new zd51(db51Var2));
        return db51Var2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m63952b(int i, mb61 mb61Var) {
        ae51 ae51Var = ae51.f14751a;
        be51 be51Var = (i < 0 || i >= this.f151955c.size()) ? ae51Var : (be51) this.f151955c.get(i);
        if (be51Var instanceof zd51) {
            return ((zd51) be51Var).f281627a;
        }
        if (wj50.m88271j(be51Var, ae51Var)) {
            return m63951a(i, mb61Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
