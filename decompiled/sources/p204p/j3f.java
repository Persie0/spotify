package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j3f implements g210 {

    /* JADX INFO: renamed from: a */
    public static final j3f f108368a;
    private static final ktz0 descriptor;

    static {
        j3f j3fVar = new j3f();
        f108368a = j3fVar;
        vwp0 vwp0Var = new vwp0("com.spotify.podcast.endpoints.collection.CollectionEpisodesPolicy.DecorationPolicy", j3fVar, 1);
        vwp0Var.m86594k("list", false);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{k6w.f119850a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        n3f n3fVar = null;
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
                n3fVar = (n3f) frhVarMo29814b.mo39210A(ktz0Var, 0, k6w.f119850a, n3fVar);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new l3f(i, n3fVar);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        hrhVarMo35820b.mo44941k(ktz0Var, 0, k6w.f119850a, ((l3f) obj).f129320a);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
