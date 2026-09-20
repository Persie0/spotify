package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class m690 {

    /* JADX INFO: renamed from: a */
    public final am71 f140428a;

    /* JADX INFO: renamed from: b */
    public sr4 f140429b;

    public m690(am71 am71Var) {
        this.f140428a = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m60972a() {
        sr4 sr4VarM76275a = ((rr4) this.f140428a).m76275a("list_ux_platform");
        Iterator it = h6f.m46715L("ListPage", "UntilLoadedState", "UntilListComposition").iterator();
        while (it.hasNext()) {
            sr4VarM76275a.m79019k((String) it.next(), null, (4 & 4) != 0);
        }
        this.f140429b = sr4VarM76275a;
    }

    /* JADX INFO: renamed from: b */
    public final void m60973b(int i) {
        String str;
        sr4 sr4Var = this.f140429b;
        if (sr4Var != null) {
            sr4Var.m79016f("ListPage");
            switch (i) {
                case 1:
                    str = "SuccessNormal";
                    break;
                case 2:
                    str = "SuccessNoItemList";
                    break;
                case 3:
                    str = "SuccessEmptyItemList";
                    break;
                case 4:
                    str = "FailedLookup";
                    break;
                case 5:
                    str = "FailedTimeout";
                    break;
                case 6:
                    str = "FailedNotFound";
                    break;
                case 7:
                    str = "FailedForbidden";
                    break;
                case 8:
                    str = "FailedUnavailableForLegalReasons";
                    break;
                default:
                    throw null;
            }
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
            ((rr4) this.f140428a).m76276b(sr4Var.m79015d());
        }
        this.f140429b = null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m60974c(i690 i690Var, eh00 eh00Var) {
        Object objM79010h;
        sr4 sr4Var = this.f140429b;
        return (sr4Var == null || (objM79010h = sr4.m79010h(sr4Var, i690Var.toString(), eh00Var)) == null) ? eh00Var.invoke() : objM79010h;
    }

    /* JADX INFO: renamed from: d */
    public final Object m60975d(i690 i690Var, gh00 gh00Var) {
        return m60974c(i690Var, new k380(this, i690Var, gh00Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m60976e(i690 i690Var, gh00 gh00Var, ibk ibkVar) {
        k690 k690Var;
        i690 i690Var2;
        sr4 sr4Var;
        if (ibkVar instanceof k690) {
            k690Var = (k690) ibkVar;
            int i = k690Var.f119700e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k690Var.f119700e = i - Integer.MIN_VALUE;
            } else {
                k690Var = new k690(this, ibkVar);
            }
        } else {
            k690Var = new k690(this, ibkVar);
        }
        Object obj = k690Var.f119698c;
        int i2 = k690Var.f119700e;
        if (i2 == 0) {
            bga.m29073P(obj);
            sr4 sr4Var2 = this.f140429b;
            Object obj2 = yuk.f276404a;
            if (sr4Var2 != null) {
                sr4Var2.m79019k(i690Var.toString(), null, (4 & 4) != 0);
                k690Var.f119696a = i690Var;
                k690Var.f119697b = sr4Var2;
                k690Var.f119700e = 1;
                Object objInvoke = gh00Var.invoke(k690Var);
                if (objInvoke != obj2) {
                    i690Var2 = i690Var;
                    sr4Var = sr4Var2;
                    obj = objInvoke;
                }
            } else {
                k690Var.f119696a = null;
                k690Var.f119697b = null;
                k690Var.f119700e = 2;
                Object objInvoke2 = gh00Var.invoke(k690Var);
                if (objInvoke2 != obj2) {
                    return objInvoke2;
                }
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        sr4Var = k690Var.f119697b;
        i690Var2 = k690Var.f119696a;
        bga.m29073P(obj);
        sr4Var.m79016f(i690Var2.toString());
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m60977f(i690 i690Var, c9k c9kVar, ArrayList arrayList, ibk ibkVar) {
        l690 l690Var;
        i690 i690Var2;
        sr4 sr4Var;
        if (ibkVar instanceof l690) {
            l690Var = (l690) ibkVar;
            int i = l690Var.f130279e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l690Var.f130279e = i - Integer.MIN_VALUE;
            } else {
                l690Var = new l690(this, ibkVar);
            }
        } else {
            l690Var = new l690(this, ibkVar);
        }
        Object obj = l690Var.f130277c;
        int i2 = l690Var.f130279e;
        am71 am71Var = this.f140428a;
        if (i2 == 0) {
            bga.m29073P(obj);
            sr4 sr4VarM76275a = ((rr4) am71Var).m76275a("list_ux_platform_" + i690Var);
            sr4VarM76275a.m79019k(i690Var.toString(), null, (4 & 4) != 0);
            gh00 qi2Var = new qi2(5, arrayList, c9kVar, this, sr4VarM76275a, null);
            l690Var.f130275a = i690Var;
            l690Var.f130276b = sr4VarM76275a;
            l690Var.f130279e = 1;
            Object objM60976e = m60976e(i690Var, qi2Var, l690Var);
            Object obj2 = yuk.f276404a;
            if (objM60976e == obj2) {
                return obj2;
            }
            i690Var2 = i690Var;
            sr4Var = sr4VarM76275a;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sr4Var = l690Var.f130276b;
            i690Var2 = l690Var.f130275a;
            bga.m29073P(obj);
        }
        sr4Var.m79016f(i690Var2.toString());
        ((rr4) am71Var).m76276b(sr4Var.m79015d());
        return w2a1.f247311a;
    }
}
