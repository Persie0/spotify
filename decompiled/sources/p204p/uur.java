package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class uur {

    /* JADX INFO: renamed from: a */
    public final int f234245a;

    /* JADX INFO: renamed from: b */
    public final boolean f234246b;

    /* JADX INFO: renamed from: c */
    public final gu3 f234247c;

    public uur(int i, boolean z, gu3 gu3Var) {
        this.f234245a = i;
        this.f234246b = z;
        this.f234247c = gu3Var;
    }

    /* JADX INFO: renamed from: b */
    public static Next m84033b(yur yurVar, String str) {
        return Next.m15605a(Effects.m15571a(new mm70(str, yurVar.f276446f.f147423d)));
    }

    /* JADX INFO: renamed from: a */
    public final Next m84034a(yur yurVar, Set set) {
        yur yurVarM94669a;
        boolean z = yurVar.f276444d;
        int i = yurVar.f276447g;
        boolean z2 = false;
        boolean z3 = z && !yurVar.f276445e;
        if (z3 && i > 0) {
            z2 = true;
        }
        boolean z4 = this.f234246b;
        if (!(z4 && z2) && (z4 || !z3)) {
            yurVarM94669a = yurVar;
        } else {
            yurVarM94669a = yur.m94669a(yurVar, false, false, false, true, null, 0, ContentType.SHORT_FORM_ON_DEMAND);
            set.add(new yrw0(yurVar.f276446f.f147420a.mo29280c(), i < 50 ? qm0.VIEWABILITY_50_LESS : qm0.VIEWABILITY_50));
        }
        return Next.m15607i(yurVarM94669a, set);
    }
}
