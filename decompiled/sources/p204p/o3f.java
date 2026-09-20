package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o3f implements g210 {

    /* JADX INFO: renamed from: a */
    public static final o3f f161358a;
    private static final ktz0 descriptor;

    static {
        o3f o3fVar = new o3f();
        f161358a = o3fVar;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy.Policy", o3fVar, 1);
        vwp0Var.m86594k("policy", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{j3f.f108368a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        l3f l3fVar = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else {
                if (iMo29816p != 0) {
                    throw new UnknownFieldException(iMo29816p);
                }
                l3fVar = (l3f) frhVarMo29814b.mo39210A(ktz0Var, 0, j3f.f108368a, l3fVar);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new q3f(i, l3fVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, j3f.f108368a, ((q3f) obj).f184875a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
