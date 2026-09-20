package p204p;

import android.os.Build;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class hmu {

    /* JADX INFO: renamed from: a */
    public final View f93074a;

    public hmu(View view) {
        this.f93074a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m47990a(int i) {
        int iM38547C = edb.m38547C(i);
        View view = this.f93074a;
        if (iM38547C == 0) {
            view.performHapticFeedback(0);
            return;
        }
        if (iM38547C == 1) {
            if (Build.VERSION.SDK_INT >= 27) {
                view.performHapticFeedback(9);
                return;
            } else {
                view.performHapticFeedback(4);
                return;
            }
        }
        if (iM38547C == 2) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(23);
                return;
            } else {
                view.performHapticFeedback(1);
                return;
            }
        }
        if (iM38547C != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            view.performHapticFeedback(24);
        } else if (i2 >= 27) {
            view.performHapticFeedback(8);
        } else {
            view.performHapticFeedback(1);
        }
    }
}
