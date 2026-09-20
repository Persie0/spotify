package p204p;

import com.spotify.martini.martinidata.model.Mode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class dxj {

    /* JADX INFO: renamed from: a */
    public final azp0 f53996a;

    /* JADX INFO: renamed from: b */
    public final nqy f53997b;

    /* JADX INFO: renamed from: c */
    public final kpy f53998c;

    public dxj(azp0 azp0Var, nqy nqyVar, kpy kpyVar) {
        this.f53996a = azp0Var;
        this.f53997b = nqyVar;
        this.f53998c = kpyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m37256a(String str, voc1 voc1Var, Mode mode, ibk ibkVar) {
        axj axjVar;
        if (ibkVar instanceof axj) {
            axjVar = (axj) ibkVar;
            int i = axjVar.f20884f;
            if ((i & Integer.MIN_VALUE) != 0) {
                axjVar.f20884f = i - Integer.MIN_VALUE;
            } else {
                axjVar = new axj(this, ibkVar);
            }
        } else {
            axjVar = new axj(this, ibkVar);
        }
        Object objMo57021e = axjVar.f20882d;
        int i2 = axjVar.f20884f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo57021e);
            uwj uwjVarM27666y = this.f53996a.m27666y(mode);
            axjVar.f20879a = str;
            axjVar.f20880b = voc1Var;
            axjVar.f20884f = 1;
            objMo57021e = uwjVarM27666y.mo57021e(str, axjVar);
            if (objMo57021e != yukVar) {
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = axjVar.f20881c;
            bga.m29073P(objMo57021e);
            return obj;
        }
        voc1Var = axjVar.f20880b;
        str = axjVar.f20879a;
        bga.m29073P(objMo57021e);
        if (((twj) objMo57021e) instanceof swj) {
            this.f53997b.f157350a.put(str, mqy.f146380c);
            axjVar.f20879a = null;
            axjVar.f20880b = null;
            axjVar.f20881c = objMo57021e;
            axjVar.f20884f = 2;
            Object objEmit = ((hqi0) this.f53998c.f125156a.computeIfAbsent(str, rer.f198417c)).emit(new pqm0(voc1Var, null), axjVar);
            if (objEmit != yukVar) {
                objEmit = w2a1.f247311a;
            }
            if (objEmit == yukVar) {
                return yukVar;
            }
        }
        return objMo57021e;
    }

    /* JADX INFO: renamed from: b */
    public final Object m37257b(String str, voc1 voc1Var, pqy pqyVar, ibk ibkVar) {
        mqy mqyVar;
        int iOrdinal = pqyVar.ordinal();
        if (iOrdinal == 0) {
            mqyVar = mqy.f146378a;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            mqyVar = mqy.f146379b;
        }
        this.f53997b.f157350a.put(str, mqyVar);
        Object objEmit = ((hqi0) this.f53998c.f125156a.computeIfAbsent(str, rer.f198417c)).emit(new pqm0(voc1Var, pqyVar), ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objEmit != yukVar) {
            objEmit = w2a1Var;
        }
        return objEmit == yukVar ? objEmit : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m37258c(gfj0 gfj0Var, voc1 voc1Var, Mode mode, ibk ibkVar) {
        bxj bxjVar;
        if (ibkVar instanceof bxj) {
            bxjVar = (bxj) ibkVar;
            int i = bxjVar.f31874f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bxjVar.f31874f = i - Integer.MIN_VALUE;
            } else {
                bxjVar = new bxj(this, ibkVar);
            }
        } else {
            bxjVar = new bxj(this, ibkVar);
        }
        Object objMo26623f = bxjVar.f31872d;
        int i2 = bxjVar.f31874f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo26623f);
            uwj uwjVarM27666y = this.f53996a.m27666y(mode);
            bxjVar.f31869a = gfj0Var;
            bxjVar.f31870b = voc1Var;
            bxjVar.f31874f = 1;
            objMo26623f = uwjVarM27666y.mo26623f(gfj0Var, bxjVar);
            if (objMo26623f != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = bxjVar.f31871c;
            bga.m29073P(objMo26623f);
            return obj2;
        }
        voc1Var = bxjVar.f31870b;
        gfj0Var = bxjVar.f31869a;
        bga.m29073P(objMo26623f);
        if (((twj) objMo26623f) instanceof swj) {
            String str = gfj0Var.f79367a;
            bxjVar.f31869a = null;
            bxjVar.f31870b = null;
            bxjVar.f31871c = objMo26623f;
            bxjVar.f31874f = 2;
            if (m37257b(str, voc1Var, pqy.f180445b, bxjVar) == obj) {
                return obj;
            }
        }
        return objMo26623f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m37259d(String str, voc1 voc1Var, Mode mode, ibk ibkVar) {
        cxj cxjVar;
        if (ibkVar instanceof cxj) {
            cxjVar = (cxj) ibkVar;
            int i = cxjVar.f43045f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cxjVar.f43045f = i - Integer.MIN_VALUE;
            } else {
                cxjVar = new cxj(this, ibkVar);
            }
        } else {
            cxjVar = new cxj(this, ibkVar);
        }
        Object objMo26622b = cxjVar.f43043d;
        int i2 = cxjVar.f43045f;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo26622b);
            uwj uwjVarM27666y = this.f53996a.m27666y(mode);
            cxjVar.f43040a = str;
            cxjVar.f43041b = voc1Var;
            cxjVar.f43045f = 1;
            objMo26622b = uwjVarM27666y.mo26622b(str, cxjVar);
            if (objMo26622b != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = cxjVar.f43042c;
            bga.m29073P(objMo26622b);
            return obj2;
        }
        voc1Var = cxjVar.f43041b;
        str = cxjVar.f43040a;
        bga.m29073P(objMo26622b);
        if (((twj) objMo26622b) instanceof swj) {
            cxjVar.f43040a = null;
            cxjVar.f43041b = null;
            cxjVar.f43042c = objMo26622b;
            cxjVar.f43045f = 2;
            if (m37257b(str, voc1Var, pqy.f180444a, cxjVar) == obj) {
                return obj;
            }
        }
        return objMo26622b;
    }
}
