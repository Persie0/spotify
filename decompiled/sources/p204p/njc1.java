package p204p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class njc1 {

    /* JADX INFO: renamed from: a */
    public final View f154560a;

    /* JADX INFO: renamed from: b */
    public int f154561b;

    /* JADX INFO: renamed from: c */
    public int f154562c;

    /* JADX INFO: renamed from: d */
    public int f154563d;

    /* JADX INFO: renamed from: e */
    public int f154564e;

    /* JADX INFO: renamed from: f */
    public int f154565f;

    /* JADX INFO: renamed from: g */
    public boolean f154566g;

    public njc1(View view) {
        this.f154560a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m64605a() {
        int iMax = this.f154563d;
        if (this.f154566g) {
            iMax = Math.max(this.f154564e, Math.min(this.f154565f, iMax));
        }
        View view = this.f154560a;
        int top = iMax - (view.getTop() - this.f154561b);
        WeakHashMap weakHashMap = mec1.f142677a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f154562c));
    }
}
