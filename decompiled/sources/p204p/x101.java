package p204p;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x101 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f257025a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y101 f257026b;

    public x101(y101 y101Var) {
        this.f257026b = y101Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m89614a(Context context, String str, ibk ibkVar) {
        v101 v101Var;
        x101 x101Var;
        boolean z;
        if (ibkVar instanceof v101) {
            v101Var = (v101) ibkVar;
            int i = v101Var.f236215e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v101Var.f236215e = i - Integer.MIN_VALUE;
            } else {
                v101Var = new v101(this, ibkVar);
            }
        } else {
            v101Var = new v101(this, ibkVar);
        }
        Object objM63423c = v101Var.f236213c;
        int i2 = v101Var.f236215e;
        if (i2 == 0) {
            bga.m29073P(objM63423c);
            l0e1 l0e1VarM37972F = e72.m37972F(context);
            jbb jbbVarM57478p = kvf1.m57478p(l0e1VarM37972F.f128405B0, l0e1VarM37972F.f128406C0, str);
            v101Var.f236211a = this;
            v101Var.f236212b = str;
            v101Var.f236215e = 1;
            objM63423c = n0e1.m63423c(jbbVarM57478p, v101Var);
            yuk yukVar = yuk.f276404a;
            if (objM63423c == yukVar) {
                return yukVar;
            }
            x101Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = v101Var.f236212b;
            x101Var = v101Var.f236211a;
            bga.m29073P(objM63423c);
        }
        Iterable iterable = (Iterable) objM63423c;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (h6f.m46715L(h0e1.f86264b, h0e1.f86263a).contains(((i0e1) it.next()).m49374a())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        we5 we5Var = (we5) x101Var.f257025a.get(str);
        return qyg1.m74178H((we5Var != null ? we5Var.f250436b.get() : false) && z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m89615b(Context context, we5 we5Var, ibk ibkVar) {
        w101 w101Var;
        x101 x101Var;
        if (ibkVar instanceof w101) {
            w101Var = (w101) ibkVar;
            int i = w101Var.f246921e;
            if ((i & Integer.MIN_VALUE) != 0) {
                w101Var.f246921e = i - Integer.MIN_VALUE;
            } else {
                w101Var = new w101(this, ibkVar);
            }
        } else {
            w101Var = new w101(this, ibkVar);
        }
        Object obj = w101Var.f246919c;
        int i2 = w101Var.f246921e;
        if (i2 == 0) {
            bga.m29073P(obj);
            we5 we5Var2 = (we5) this.f257025a.put(we5Var.m87857b(), we5Var);
            if (we5Var2 != null) {
                we5Var2.m87856a();
            }
            knl0 knl0Var = new knl0(SessionWorker.class);
            pqm0[] pqm0VarArr = {pft0.m69840u("KEY", we5Var.m87857b())};
            qco qcoVar = new qco(0);
            pqm0 pqm0Var = pqm0VarArr[0];
            qcoVar.m72560c(pqm0Var.f180351b, (String) pqm0Var.f180350a);
            u790 u790VarM30302d = e72.m37972F(context).m55007t(we5Var.m87857b(), 1, (lnl0) ((knl0) knl0Var.m31262i(qcoVar.m72559a())).m31255b()).m30302d();
            w101Var.f246917a = this;
            w101Var.f246918b = context;
            w101Var.f246921e = 1;
            Object objM63423c = n0e1.m63423c(u790VarM30302d, w101Var);
            yuk yukVar = yuk.f276404a;
            if (objM63423c == yukVar) {
                return yukVar;
            }
            x101Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = w101Var.f246918b;
            x101Var = w101Var.f246917a;
            bga.m29073P(obj);
        }
        y101.m92608a(x101Var.f257026b, context);
        return w2a1.f247311a;
    }
}
