package p204p;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cgz implements xv41 {

    /* JADX INFO: renamed from: a */
    public final xv41 f37835a;

    /* JADX INFO: renamed from: b */
    public final qe70 f37836b;

    /* JADX INFO: renamed from: c */
    public pqm0 f37837c;

    /* JADX WARN: Multi-variable type inference failed */
    public cgz(gh00 gh00Var, xv41 xv41Var) {
        this.f37835a = xv41Var;
        this.f37836b = (qe70) gh00Var;
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        return m32740f(this.f37835a.getValue()).mo27502c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        bgz bgzVar;
        if (fbkVar instanceof bgz) {
            bgzVar = (bgz) fbkVar;
            int i = bgzVar.f27033c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgzVar.f27033c = i - Integer.MIN_VALUE;
            } else {
                bgzVar = new bgz(this, fbkVar);
            }
        } else {
            bgzVar = new bgz(this, fbkVar);
        }
        Object obj = bgzVar.f27031a;
        int i2 = bgzVar.f27033c;
        if (i2 == 0) {
            bga.m29073P(obj);
            nnc nncVarM92074U = xtm0.m92074U(this.f37835a, new x1w((fbk) null, this, 4));
            ap0 ap0Var = new ap0(nizVar, 14);
            bgzVar.f27033c = 1;
            Object objCollect = nncVarM92074U.collect(ap0Var, bgzVar);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new IllegalStateException("StateFlow collection should never complete");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: f */
    public final xv41 m32740f(Object obj) {
        pqm0 pqm0Var = this.f37837c;
        if (pqm0Var != null) {
            Object obj2 = pqm0Var.f180350a;
            WeakReference weakReference = (WeakReference) pqm0Var.f180351b;
            if (!wj50.m88271j(obj2, obj)) {
                weakReference = null;
            }
            xv41 xv41Var = weakReference != null ? (xv41) weakReference.get() : null;
            if (xv41Var != null) {
                return xv41Var;
            }
        }
        xv41 xv41Var2 = (xv41) this.f37836b.invoke(obj);
        this.f37837c = pft0.m69840u(obj, new WeakReference(xv41Var2));
        return xv41Var2;
    }

    @Override // p204p.xv41
    public final Object getValue() {
        return m32740f(this.f37835a.getValue()).getValue();
    }
}
