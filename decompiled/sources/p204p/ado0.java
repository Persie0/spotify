package p204p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ado0 implements jc20 {

    /* JADX INFO: renamed from: a */
    public final View f14649a;

    public ado0(View view) {
        this.f14649a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m25615a(int i) {
        int i2 = 16;
        if (!mc20.m61435a(i, 16)) {
            i2 = 6;
            if (!mc20.m61435a(i, 6)) {
                i2 = 13;
                if (!mc20.m61435a(i, 13)) {
                    i2 = 23;
                    if (!mc20.m61435a(i, 23)) {
                        i2 = 3;
                        if (!mc20.m61435a(i, 3)) {
                            i2 = 0;
                            if (!mc20.m61435a(i, 0)) {
                                i2 = 17;
                                if (!mc20.m61435a(i, 17)) {
                                    i2 = 27;
                                    if (!mc20.m61435a(i, 27)) {
                                        i2 = 26;
                                        if (!mc20.m61435a(i, 26)) {
                                            i2 = 9;
                                            if (!mc20.m61435a(i, 9)) {
                                                i2 = 22;
                                                if (!mc20.m61435a(i, 22)) {
                                                    i2 = 21;
                                                    if (!mc20.m61435a(i, 21)) {
                                                        i2 = 1;
                                                        if (!mc20.m61435a(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        int iM89204y = wwg1.m89204y(i2);
        if (iM89204y == -1) {
            return;
        }
        this.f14649a.performHapticFeedback(iM89204y);
    }
}
