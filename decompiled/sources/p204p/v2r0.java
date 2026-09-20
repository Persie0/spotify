package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.GetPresetResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.ListPresetsResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.PersonalizePresetResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.Preset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class v2r0 {

    /* JADX INFO: renamed from: a */
    public final h3r0 f236714a;

    public v2r0(h3r0 h3r0Var) {
        this.f236714a = h3r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m84525a(String str, ibk ibkVar) {
        s2r0 s2r0Var;
        Object c6x0Var;
        if (ibkVar instanceof s2r0) {
            s2r0Var = (s2r0) ibkVar;
            int i = s2r0Var.f205056c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s2r0Var.f205056c = i - Integer.MIN_VALUE;
            } else {
                s2r0Var = new s2r0(this, ibkVar);
            }
        } else {
            s2r0Var = new s2r0(this, ibkVar);
        }
        Object objM46599b = s2r0Var.f205054a;
        int i2 = s2r0Var.f205056c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM46599b);
                h3r0 h3r0Var = this.f236714a;
                s2r0Var.f205056c = 1;
                objM46599b = h3r0Var.m46599b(str, s2r0Var);
                yuk yukVar = yuk.f276404a;
                if (objM46599b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46599b);
            }
            GetPresetResponse getPresetResponse = (GetPresetResponse) nkf1.m64687c((o2x0) objM46599b);
            if (!getPresetResponse.m17420o()) {
                throw new IllegalStateException("Check failed.");
            }
            c6x0Var = tkf1.m81016o(getPresetResponse.m17419n());
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
                return c6x0Var;
            }
            throw thM77348a;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.c6x0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: b */
    public final Serializable m84526b(ibk ibkVar) {
        t2r0 t2r0Var;
        ?? c6x0Var;
        if (ibkVar instanceof t2r0) {
            t2r0Var = (t2r0) ibkVar;
            int i = t2r0Var.f216615c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2r0Var.f216615c = i - Integer.MIN_VALUE;
            } else {
                t2r0Var = new t2r0(this, ibkVar);
            }
        } else {
            t2r0Var = new t2r0(this, ibkVar);
        }
        Object objM46600c = t2r0Var.f216613a;
        int i2 = t2r0Var.f216615c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM46600c);
                h3r0 h3r0Var = this.f236714a;
                t2r0Var.f216615c = 1;
                objM46600c = h3r0Var.m46600c(t2r0Var);
                yuk yukVar = yuk.f276404a;
                if (objM46600c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46600c);
            }
            ae50<Preset> ae50VarM17427n = ((ListPresetsResponse) nkf1.m64687c((o2x0) objM46600c)).m17427n();
            c6x0Var = new ArrayList(i6f.m49804T(ae50VarM17427n, 10));
            for (Preset preset : ae50VarM17427n) {
                wj50.m88279p(preset);
                c6x0Var.add(tkf1.m81016o(preset));
            }
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m84527c(String str, ibk ibkVar) {
        u2r0 u2r0Var;
        Object c6x0Var;
        if (ibkVar instanceof u2r0) {
            u2r0Var = (u2r0) ibkVar;
            int i = u2r0Var.f226155c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2r0Var.f226155c = i - Integer.MIN_VALUE;
            } else {
                u2r0Var = new u2r0(this, ibkVar);
            }
        } else {
            u2r0Var = new u2r0(this, ibkVar);
        }
        Object objM46598a = u2r0Var.f226153a;
        int i2 = u2r0Var.f226155c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM46598a);
                h3r0 h3r0Var = this.f236714a;
                u2r0Var.f226155c = 1;
                objM46598a = h3r0Var.m46598a(str, u2r0Var);
                yuk yukVar = yuk.f276404a;
                if (objM46598a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46598a);
            }
            c6x0Var = tkf1.m81015n((PersonalizePresetResponse) nkf1.m64687c((o2x0) objM46598a));
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || !(thM77348a instanceof CancellationException)) {
            return c6x0Var;
        }
        throw thM77348a;
    }
}
