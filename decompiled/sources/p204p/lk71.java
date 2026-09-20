package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class lk71 {

    /* JADX INFO: renamed from: a */
    public final gof f134280a;

    public lk71(gof gofVar) {
        this.f134280a = gofVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m59217a(nc20 nc20Var, Resources resources, ibk ibkVar) {
        kk71 kk71Var;
        String string;
        if (ibkVar instanceof kk71) {
            kk71Var = (kk71) ibkVar;
            int i = kk71Var.f123529e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk71Var.f123529e = i - Integer.MIN_VALUE;
            } else {
                kk71Var = new kk71(this, ibkVar);
            }
        } else {
            kk71Var = new kk71(this, ibkVar);
        }
        Object objM45343a = kk71Var.f123527c;
        int i2 = kk71Var.f123529e;
        String string2 = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM45343a);
                gof gofVar = this.f134280a;
                hey heyVar = hey.f90541a;
                kk71Var.f123525a = nc20Var;
                kk71Var.f123526b = resources;
                kk71Var.f123529e = 1;
                objM45343a = gofVar.m45343a(heyVar, 1, kk71Var);
                Object obj = yuk.f276404a;
                if (objM45343a == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resources = kk71Var.f123526b;
                nc20Var = kk71Var.f123525a;
                bga.m29073P(objM45343a);
            }
            if (((j0u0) objM45343a) == j0u0.f107559c) {
                int iOrdinal = nc20Var.ordinal();
                if (iOrdinal == 0) {
                    string = null;
                } else if (iOrdinal == 1) {
                    string = resources.getString(R.string.hard_cap_pick_track_title_override);
                } else if (iOrdinal == 2) {
                    string = null;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = resources.getString(R.string.hard_cap_pick_track_preview_title_override);
                }
                int iOrdinal2 = nc20Var.ordinal();
                if (iOrdinal2 == 0) {
                    string2 = resources.getString(R.string.hard_cap_skip_track_subtitle_override);
                } else if (iOrdinal2 == 1) {
                    string2 = resources.getString(R.string.hard_cap_pick_track_subtitle_override);
                } else if (iOrdinal2 == 2) {
                    string2 = resources.getString(R.string.hard_cap_pick_track_on_search_subtitle_override);
                } else if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return new jk71(string, string2);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
