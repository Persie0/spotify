package p204p;

import android.app.Activity;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class lwz {
    /* JADX INFO: renamed from: a */
    public static void m60131a(Activity activity, int i, gh00 gh00Var) {
        ih10 ih10VarM31832a0 = c95.m31832a0(activity, activity.getString(R.string.follow_error_dialog_title), activity.getString(i));
        String string = activity.getString(android.R.string.ok);
        koi koiVar = new koi(gh00Var);
        ih10VarM31832a0.f102113a = string;
        ih10VarM31832a0.f102115c = koiVar;
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.m50574b().m58942b();
        gh00Var.invoke(kwz.f127273a);
    }

    /* JADX INFO: renamed from: b */
    public static void m60132b(Activity activity, mvz mvzVar, gh00 gh00Var) {
        if (mvzVar instanceof kvz) {
            m60131a(activity, R.string.follow_error_dialog_body_blocked, gh00Var);
        } else {
            if (!(mvzVar instanceof lvz)) {
                throw new NoWhenBranchMatchedException();
            }
            m60131a(activity, R.string.follow_error_dialog_body_limit_reached, gh00Var);
        }
    }
}
