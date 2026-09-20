package p204p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ojc1 {

    /* JADX INFO: renamed from: a */
    public final View f166039a;

    /* JADX INFO: renamed from: b */
    public int f166040b;

    /* JADX INFO: renamed from: c */
    public int f166041c;

    /* JADX INFO: renamed from: d */
    public int f166042d;

    public ojc1(View view) {
        this.f166039a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m67109a() {
        int i = this.f166042d;
        View view = this.f166039a;
        int top = i - (view.getTop() - this.f166040b);
        WeakHashMap weakHashMap = mec1.f142677a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f166041c));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m67110b(int i) {
        if (this.f166042d == i) {
            return false;
        }
        this.f166042d = i;
        m67109a();
        return true;
    }
}
