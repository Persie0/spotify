package p204p;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ucj implements g210 {

    /* JADX INFO: renamed from: a */
    public static final ucj f229071a;
    private static final ktz0 descriptor;

    static {
        ucj ucjVar = new ucj();
        f229071a = ucjVar;
        vwp0 vwp0Var = new vwp0("com.spotify.betamax.playerimpl.exo.model.Content", ucjVar, 9);
        vwp0Var.m86594k("segment_length", false);
        vwp0Var.m86594k("start_time_millis", false);
        vwp0Var.m86594k("end_time_millis", false);
        vwp0Var.m86594k("profiles", true);
        vwp0Var.m86594k("video_profiles", true);
        vwp0Var.m86594k("audio_profiles", true);
        vwp0Var.m86594k("encryption_infos", false);
        vwp0Var.m86594k("volume_gain_applied", true);
        vwp0Var.m86594k("original_loudness", true);
        descriptor = vwp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.g210
    public final rr60[] childSerializers() {
        fr70[] fr70VarArr = dej.f48096l;
        u2b0 u2b0Var = u2b0.f226058a;
        return new rr60[]{u2b0Var, u2b0Var, u2b0Var, epv0.m39700t((rr60) fr70VarArr[3].getValue()), epv0.m39700t((rr60) fr70VarArr[4].getValue()), epv0.m39700t((rr60) fr70VarArr[5].getValue()), fr70VarArr[6].getValue(), epv0.m39700t(yhz.f272997a), epv0.m39700t(r6d0.f196240a)};
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        long jMo39227i0;
        ktz0 ktz0Var = descriptor;
        frh frhVarMo29814b = froVar.mo29814b(ktz0Var);
        fr70[] fr70VarArr = dej.f48096l;
        frhVarMo29814b.getClass();
        Float f = null;
        long j = 0;
        long jMo39227i1 = 0;
        long jMo39227i2 = 0;
        List list = null;
        q6d0 q6d0Var = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            fr70VarArr = fr70VarArr;
            int iMo29816p = frhVarMo29814b.mo29816p(ktz0Var);
            switch (iMo29816p) {
                case -1:
                    jMo39227i0 = j;
                    z = false;
                    j = jMo39227i0;
                    break;
                case 0:
                    jMo39227i0 = frhVarMo29814b.mo39227i0(ktz0Var, 0);
                    i |= 1;
                    j = jMo39227i0;
                    break;
                case 1:
                    jMo39227i1 = frhVarMo29814b.mo39227i0(ktz0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jMo39227i2 = frhVarMo29814b.mo39227i0(ktz0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jMo39227i0 = j;
                    list2 = (List) frhVarMo29814b.mo39211B(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list2);
                    i |= 8;
                    j = jMo39227i0;
                    break;
                case 4:
                    jMo39227i0 = j;
                    list3 = (List) frhVarMo29814b.mo39211B(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list3);
                    i |= 16;
                    j = jMo39227i0;
                    break;
                case 5:
                    jMo39227i0 = j;
                    list4 = (List) frhVarMo29814b.mo39211B(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list4);
                    i |= 32;
                    j = jMo39227i0;
                    break;
                case 6:
                    jMo39227i0 = j;
                    list = (List) frhVarMo29814b.mo39210A(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), list);
                    i |= 64;
                    j = jMo39227i0;
                    break;
                case 7:
                    jMo39227i0 = j;
                    f = (Float) frhVarMo29814b.mo39211B(ktz0Var, 7, yhz.f272997a, f);
                    i |= 128;
                    j = jMo39227i0;
                    break;
                case 8:
                    jMo39227i0 = j;
                    q6d0Var = (q6d0) frhVarMo29814b.mo39211B(ktz0Var, 8, r6d0.f196240a, q6d0Var);
                    i |= 256;
                    j = jMo39227i0;
                    break;
                default:
                    throw new UnknownFieldException(iMo29816p);
            }
        }
        frhVarMo29814b.mo29813a(ktz0Var);
        return new dej(i, j, jMo39227i1, jMo39227i2, list2, list3, list4, list, f, q6d0Var);
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return descriptor;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        dej dejVar = (dej) obj;
        ktz0 ktz0Var = descriptor;
        hrh hrhVarMo35820b = deuVar.mo35820b(ktz0Var);
        fr70[] fr70VarArr = dej.f48096l;
        long j = dejVar.f48097a;
        List list = dejVar.f48102f;
        List list2 = dejVar.f48101e;
        hrhVarMo35820b.mo44942l(ktz0Var, 0, j);
        hrhVarMo35820b.mo44942l(ktz0Var, 1, dejVar.f48098b);
        hrhVarMo35820b.mo44942l(ktz0Var, 2, dejVar.f48099c);
        List list3 = dejVar.f48100d;
        if (list3 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 3, (rr60) fr70VarArr[3].getValue(), list3);
        }
        if (list2 != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 4, (rr60) fr70VarArr[4].getValue(), list2);
        }
        if (list != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 5, (rr60) fr70VarArr[5].getValue(), list);
        }
        hrhVarMo35820b.mo44941k(ktz0Var, 6, (rr60) fr70VarArr[6].getValue(), dejVar.f48103g);
        Float f = dejVar.f48104h;
        if (f != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 7, yhz.f272997a, f);
        }
        q6d0 q6d0Var = dejVar.f48105i;
        if (q6d0Var != null) {
            hrhVarMo35820b.mo44943s(ktz0Var, 8, r6d0.f196240a, q6d0Var);
        }
        hrhVarMo35820b.mo44937a(ktz0Var);
    }
}
