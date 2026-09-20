package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class sk11 implements jn80 {

    /* JADX INFO: renamed from: a */
    public final i7k f209975a;

    /* JADX INFO: renamed from: b */
    public final dcz f209976b;

    public sk11(i7k i7kVar, dcz dczVar) {
        this.f209975a = i7kVar;
        this.f209976b = dczVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r7 == r4) goto L28;
     */
    @Override // p204p.jn80
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33757a(s50 s50Var, fbk fbkVar) {
        qk11 qk11Var;
        g3m g3mVar;
        if (fbkVar instanceof qk11) {
            qk11Var = (qk11) fbkVar;
            int i = qk11Var.f189407d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk11Var.f189407d = i - Integer.MIN_VALUE;
            } else {
                qk11Var = new qk11(this, (ibk) fbkVar);
            }
        } else {
            qk11Var = new qk11(this, (ibk) fbkVar);
        }
        Object objM96567o = qk11Var.f189405b;
        int i2 = qk11Var.f189407d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM49872d = this.f209975a.m49872d((String) g6f.m43741q0(s50Var.f205670a));
            qk11Var.f189404a = s50Var;
            qk11Var.f189407d = 1;
            objM96567o = zn91.m96567o(singleM49872d, qk11Var);
            if (objM96567o != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            s50Var = qk11Var.f189404a;
            bga.m29073P(objM96567o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s50Var = qk11Var.f189404a;
            bga.m29073P(objM96567o);
        }
        g3mVar = (g3m) objM96567o;
        return new t50(g3mVar, s50Var.f205670a);
        int iOrdinal = ((wr11) objM96567o).ordinal();
        g3mVar = x2m.f257521a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                qk11Var.f189404a = s50Var;
                qk11Var.f189407d = 2;
                objM96567o = m78363b(s50Var, qk11Var);
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new t50(g3mVar, s50Var.f205670a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m78363b(s50 s50Var, ibk ibkVar) {
        rk11 rk11Var;
        if (ibkVar instanceof rk11) {
            rk11Var = (rk11) ibkVar;
            int i = rk11Var.f199951d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rk11Var.f199951d = i - Integer.MIN_VALUE;
            } else {
                rk11Var = new rk11(this, ibkVar);
            }
        } else {
            rk11Var = new rk11(this, ibkVar);
        }
        Object objM96567o = rk11Var.f199949b;
        int i2 = rk11Var.f199951d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            if (!s50Var.f205672c) {
                Single singleM35687a = this.f209976b.m35687a();
                rk11Var.f199948a = s50Var;
                rk11Var.f199951d = 1;
                objM96567o = zn91.m96567o(singleM35687a, rk11Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            }
            if (s50Var.f205672c) {
                return c3m.f33702a;
            }
            return s50Var.f205674e ? y2m.f268641a : x2m.f257521a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s50Var = rk11Var.f199948a;
        bga.m29073P(objM96567o);
        if (((Boolean) objM96567o).booleanValue()) {
            return new b3m(null);
        }
        if (s50Var.f205672c) {
            return c3m.f33702a;
        }
        if (s50Var.f205674e) {
        }
    }
}
