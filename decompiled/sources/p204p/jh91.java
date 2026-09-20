package p204p;

import android.os.Parcelable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jh91 implements Parcelable {

    /* JADX INFO: renamed from: b */
    public static final Set f112371b = s601.m77310m0(gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_DOWNLOAD, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_PICK_TRACK, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_PREV, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SKIP_NEXT, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_UNSHUFFLE, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_SCRUB, gn80.ON_DEMAND_TRIAL_OPT_IN_UPSELL_QUEUE_REORDER);

    /* JADX INFO: renamed from: c */
    public static final Set f112372c = s601.m77310m0(ch91.f37968d, dh91.f49023d, ih91.f102214d, hh91.f91309d, gh91.f79859d, fh91.f69614d, eh91.f59520d);

    /* JADX INFO: renamed from: a */
    public final gn80 f112373a;

    public jh91(gn80 gn80Var) {
        this.f112373a = gn80Var;
    }

    /* JADX INFO: renamed from: c */
    public final String m53368c() {
        List list;
        ef41 ef41VarM64319a = nf41.m64319a(this.f112373a);
        String str = (ef41VarM64319a == null || (list = ef41VarM64319a.f58941c) == null) ? null : (String) g6f.m43745s0(list);
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(("No uri found for " + this).toString());
    }

    /* JADX INFO: renamed from: g */
    public final String m53369g(int i) {
        return edb.m38565n(m53368c(), "?trial_length_days=", i);
    }
}
