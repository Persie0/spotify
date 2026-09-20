package p204p;

import android.content.res.Resources;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public interface ms30 {
    /* JADX INFO: renamed from: a */
    static int m62696a(Resources resources, boolean z) {
        return z ? resources.getInteger(R.integer.adaptive_ui_hugs_grid_columns) : resources.getInteger(R.integer.hugs_grid_columns);
    }

    /* JADX INFO: renamed from: b */
    static boolean m62697b(ib4 ib4Var, boolean z) {
        if (z) {
            return false;
        }
        return ib4Var.m50120b();
    }
}
