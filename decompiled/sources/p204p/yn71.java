package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class yn71 implements g210 {

    /* JADX INFO: renamed from: a */
    public static final yn71 f274414a;
    private static final ktz0 descriptor;

    static {
        yn71 yn71Var = new yn71();
        f274414a = yn71Var;
        vwp0 vwp0Var = new vwp0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse", yn71Var, 4);
        vwp0Var.m86594k("entityStatus", false);
        vwp0Var.m86594k("cacheControl", false);
        vwp0Var.m86594k("timeSyncedText", false);
        vwp0Var.m86594k("timeSyncedTextMetadata", false);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        return new rr60[]{do71.f50965a, zn71.f284430a, oo71.f167505e[2].getValue(), jo71.f114352a};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = oo71.f167505e;
        frhVarMo29814b.getClass();
        int i = 0;
        fo71 fo71Var = null;
        bo71 bo71Var = null;
        List list = null;
        lo71 lo71Var = null;
        boolean z = true;
        while (z) {
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            if (iMo29816p == -1) {
                z = false;
            } else if (iMo29816p == 0) {
                fo71Var = (fo71) frhVarMo29814b.mo39210A(ktz0Var, 0, do71.f50965a, fo71Var);
                i |= 1;
            } else if (iMo29816p == 1) {
                bo71Var = (bo71) frhVarMo29814b.mo39210A(ktz0Var, 1, zn71.f284430a, bo71Var);
                i |= 2;
            } else if (iMo29816p == 2) {
                list = (List) frhVarMo29814b.mo39210A(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iMo29816p != 3) {
                    throw new UnknownFieldException(iMo29816p);
                }
                lo71Var = (lo71) frhVarMo29814b.mo39210A(ktz0Var, 3, jo71.f114352a, lo71Var);
                i |= 8;
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new oo71(i, fo71Var, bo71Var, list, lo71Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        oo71 oo71Var = (oo71) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = oo71.f167505e;
        hrhVarMo35820b.mo44941k(ktz0Var, 0, do71.f50965a, oo71Var.f167506a);
        hrhVarMo35820b.mo44941k(ktz0Var, 1, zn71.f284430a, oo71Var.f167507b);
        hrhVarMo35820b.mo44941k(ktz0Var, 2, (rr60) fr70VarArr[2].getValue(), oo71Var.f167508c);
        hrhVarMo35820b.mo44941k(ktz0Var, 3, jo71.f114352a, oo71Var.f167509d);
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
