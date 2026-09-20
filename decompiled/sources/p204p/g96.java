package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g96 {

    /* JADX INFO: renamed from: a */
    public final epx f77679a;

    public /* synthetic */ g96(epx epxVar) {
        this.f77679a = epxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public Object m44008a(String str, ibk ibkVar) {
        f96 f96Var;
        m340 m340Var;
        List list;
        z240 z240Var;
        if (ibkVar instanceof f96) {
            f96Var = (f96) ibkVar;
            int i = f96Var.f67179d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f96Var.f67179d = i - Integer.MIN_VALUE;
            } else {
                f96Var = new f96(this, ibkVar);
            }
        } else {
            f96Var = new f96(this, ibkVar);
        }
        Object objM86755t = f96Var.f67177b;
        int i2 = f96Var.f67179d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                if (str.length() == 0) {
                    return new t8f0(new q8f0("Entity URI cannot be empty"));
                }
                yab yabVarM54985d = k0e1.m54985d(((jpx) this.f77679a).m53978b(new C1668ai("listening-activity-artwork", false, (gh00) new zz4(str, 9))).filter(wow0.f253605i));
                f96Var.f67176a = str;
                f96Var.f67179d = 1;
                objM86755t = vyf1.m86755t(yabVarM54985d, f96Var);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = f96Var.f67176a;
                bga.m29073P(objM86755t);
            }
            erc1 erc1Var = (erc1) ((gqx) objM86755t).mo45449a(erc1.class, str).f72301b;
            String str2 = (erc1Var == null || (m340Var = erc1Var.f62079a) == null || (list = m340Var.f139524a) == null || (z240Var = (z240) g6f.m43745s0(list)) == null) ? null : z240Var.f278475a.f198763a;
            return str2 != null ? new u8f0(str2) : new t8f0(new s8f0("No artwork found for entity URI: ".concat(str)));
        } catch (Exception e) {
            Logger.m3973i("ArtworkMetadataServiceImpl: Failed to fetch artwork for " + str + ": " + e, new Object[0]);
            return new t8f0(new r8f0(edb.m38564m("Failed to fetch artwork: ", e.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m44009b(String str, ibk ibkVar) {
        uo7 uo7Var;
        if (ibkVar instanceof uo7) {
            uo7Var = (uo7) ibkVar;
            int i = uo7Var.f232344c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uo7Var.f232344c = i - Integer.MIN_VALUE;
            } else {
                uo7Var = new uo7(this, ibkVar);
            }
        } else {
            uo7Var = new uo7(this, ibkVar);
        }
        Object obj = uo7Var.f232342a;
        int i2 = uo7Var.f232344c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleDoOnError = ((jpx) this.f77679a).m53978b(new C1668ai("ContextMenuDataLoader", false, (gh00) new zz4(str, 17))).filter(o5h1.f162002t).firstOrError().doOnError(C1710bm.f28329Z0).map(new t1h1(str, this)).doOnError(C1710bm.f28327Y0);
        uo7Var.f232344c = 1;
        Object objM96567o = zn91.m96567o(singleDoOnError, uo7Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }
}
