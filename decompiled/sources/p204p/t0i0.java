package p204p;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class t0i0 implements tpk {

    /* JADX INFO: renamed from: b */
    public static final ayd0 f215894b;

    /* JADX INFO: renamed from: a */
    public final hk60 f215895a;

    static {
        urv0 urv0Var = ayd0.f21209e;
        f215894b = zn91.m96520H("application/json; charset=UTF-8");
    }

    public t0i0(hk60 hk60Var) {
        this.f215895a = hk60Var;
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public final Object mo26363k(Object obj) throws EOFException {
        npa npaVar = new npa();
        this.f215895a.toJson(rm60.m75901x(npaVar), obj);
        return new na20(1, f215894b, npaVar.mo45417J0(npaVar.f156904b));
    }
}
