package p204p;

import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class qeb1 implements neb1 {

    /* JADX INFO: renamed from: g */
    public static final rr60 f187881g = epv0.m39700t(veb1.Companion.serializer());

    /* JADX INFO: renamed from: h */
    public static final fv31 f187882h = fv31.f73628b.m78182S("version_sunsetting_data_source_cache");

    /* JADX INFO: renamed from: a */
    public final hv31 f187883a;

    /* JADX INFO: renamed from: b */
    public final xqb f187884b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f187885c;

    /* JADX INFO: renamed from: d */
    public final fk60 f187886d;

    /* JADX INFO: renamed from: e */
    public final seb1 f187887e;

    /* JADX INFO: renamed from: f */
    public veb1 f187888f;

    public qeb1(fke fkeVar, hv31 hv31Var, xqb xqbVar, zpn zpnVar, fk60 fk60Var) {
        this.f187883a = hv31Var;
        this.f187884b = xqbVar;
        this.f187885c = zpnVar;
        this.f187886d = fk60Var;
        this.f187887e = qjg1.m72916h(fkeVar.m41917a());
        String strMo48710e = hv31Var.mo48710e(f187882h, null);
        this.f187888f = strMo48710e != null ? (veb1) fk60Var.m41880a(strMo48710e, f187881g) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m72605a(veb1 veb1Var) {
        if (wj50.m88271j(this.f187888f, veb1Var)) {
            return;
        }
        this.f187888f = veb1Var;
        seb1 seb1Var = veb1Var.f240666a;
        seb1 seb1Var2 = veb1Var.f240667b;
        Objects.toString(seb1Var);
        Objects.toString(seb1Var2);
        lv31 lv31VarEdit = this.f187883a.edit();
        lv31VarEdit.m60051d(f187882h, this.f187886d.m41881b(f187881g, veb1Var));
        lv31VarEdit.m60054g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m72606b(ibk ibkVar) {
        peb1 peb1Var;
        if (ibkVar instanceof peb1) {
            peb1Var = (peb1) ibkVar;
            int i = peb1Var.f176698c;
            if ((i & Integer.MIN_VALUE) != 0) {
                peb1Var.f176698c = i - Integer.MIN_VALUE;
            } else {
                peb1Var = new peb1(this, ibkVar);
            }
        } else {
            peb1Var = new peb1(this, ibkVar);
        }
        Object objM91826f = peb1Var.f176696a;
        int i2 = peb1Var.f176698c;
        if (i2 == 0) {
            bga.m29073P(objM91826f);
            s74 s74Var = (s74) this.f187885c.get();
            int i3 = s74Var == null ? -1 : oeb1.f164397a[s74Var.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    peb1Var.f176698c = 1;
                    objM91826f = this.f187884b.m91826f(peb1Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM91826f == yukVar) {
                        return yukVar;
                    }
                } else if (i3 == 2) {
                    m72605a(new veb1(new seb1(), null));
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m72605a(new veb1(null, new seb1()));
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM91826f);
        veb1 veb1Var = (veb1) objM91826f;
        if (veb1Var != null) {
            m72605a(veb1Var);
        }
        return w2a1.f247311a;
    }
}
