package p204p;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ofr implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ofr f164894a;
    private static final ktz0 descriptor;

    static {
        ofr ofrVar = new ofr();
        f164894a = ofrVar;
        vwp0 vwp0Var = new vwp0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.DeviceSuggestionResponse", ofrVar, 1);
        vwp0Var.m86594k("recommendation", true);
        descriptor = vwp0Var;
    }

    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{epv0.m39700t(k061.f117906a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        frhVarMo29814b.getClass();
        m061 m061Var = null;
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
                m061Var = (m061) frhVarMo29814b.mo39211B(ktz0Var, 0, k061.f117906a, m061Var);
                i = 1;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new qfr(i, m061Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        m061 m061Var = ((qfr) obj).f188284a;
        if (m061Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 0, k061.f117906a, m061Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
