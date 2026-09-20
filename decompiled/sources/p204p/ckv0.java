package p204p;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.searchview.proto.AudioEpisode;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ckv0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f39090a;

    /* JADX INFO: renamed from: b */
    public int f39091b;

    /* JADX INFO: renamed from: c */
    public OverScroller f39092c;

    /* JADX INFO: renamed from: d */
    public Interpolator f39093d;

    /* JADX INFO: renamed from: e */
    public boolean f39094e;

    /* JADX INFO: renamed from: f */
    public boolean f39095f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f39096g;

    public ckv0(RecyclerView recyclerView) {
        this.f39096g = recyclerView;
        ejv0 ejv0Var = RecyclerView.f1187h2;
        this.f39093d = ejv0Var;
        this.f39094e = false;
        this.f39095f = false;
        this.f39092c = new OverScroller(recyclerView.getContext(), ejv0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m33202a(int i, int i2) {
        RecyclerView recyclerView = this.f39096g;
        recyclerView.setScrollState(2);
        this.f39091b = 0;
        this.f39090a = 0;
        Interpolator interpolator = this.f39093d;
        ejv0 ejv0Var = RecyclerView.f1187h2;
        if (interpolator != ejv0Var) {
            this.f39093d = ejv0Var;
            this.f39092c = new OverScroller(recyclerView.getContext(), ejv0Var);
        }
        this.f39092c.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        m33203b();
    }

    /* JADX INFO: renamed from: b */
    public final void m33203b() {
        if (this.f39094e) {
            this.f39095f = true;
            return;
        }
        RecyclerView recyclerView = this.f39096g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = mec1.f142677a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m33204c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.f39096g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), AudioEpisode.SHOW_URI_FIELD_NUMBER);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f1187h2;
        }
        if (this.f39093d != interpolator) {
            this.f39093d = interpolator;
            this.f39092c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f39091b = 0;
        this.f39090a = 0;
        recyclerView.setScrollState(2);
        this.f39092c.startScroll(0, 0, i, i2, i4);
        m33203b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.f39096g;
        int[] iArr = recyclerView.f1215S1;
        if (recyclerView.f1206O0 == null) {
            recyclerView.removeCallbacks(this);
            this.f39092c.abortAnimation();
            return;
        }
        this.f39095f = false;
        this.f39094e = true;
        recyclerView.m1028s();
        OverScroller overScroller = this.f39092c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f39090a;
            int i7 = currY - this.f39091b;
            this.f39090a = currX;
            this.f39091b = currY;
            int iM978r = RecyclerView.m978r(i6, recyclerView.f1247j1, recyclerView.f1249l1, recyclerView.getWidth());
            int iM978r2 = RecyclerView.m978r(i7, recyclerView.f1248k1, recyclerView.f1250m1, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f1215S1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m1041z(iM978r, iM978r2, 1, iArr2, null)) {
                iM978r -= iArr[0];
                iM978r2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1025q(iM978r, iM978r2);
            }
            if (recyclerView.f1204N0 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m1033u0(iM978r, iM978r2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iM978r - i8;
                int i11 = iM978r2 - i9;
                il80 il80Var = recyclerView.f1206O0.f1297e;
                if (il80Var != null && !il80Var.m50992f() && il80Var.m50993g()) {
                    int iM96246b = recyclerView.f1194F1.m96246b();
                    if (iM96246b == 0) {
                        il80Var.m50999m();
                    } else if (il80Var.m50991e() >= iM96246b) {
                        il80Var.m50997k(iM96246b - 1);
                        il80Var.m50994h(i8, i9);
                    } else {
                        il80Var.m50994h(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iM978r;
                i2 = iM978r2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1210Q0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1215S1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m979A(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.m981B(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            il80 il80Var2 = recyclerView.f1206O0.f1297e;
            if ((il80Var2 == null || !il80Var2.m50992f()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.m985D();
                        if (recyclerView.f1247j1.isFinished()) {
                            recyclerView.f1247j1.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.m986E();
                        if (recyclerView.f1249l1.isFinished()) {
                            recyclerView.f1249l1.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m987F();
                        if (recyclerView.f1248k1.isFinished()) {
                            recyclerView.f1248k1.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m983C();
                        if (recyclerView.f1250m1.isFinished()) {
                            recyclerView.f1250m1.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = mec1.f142677a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1185f2) {
                    recyclerView.f1193E1.m46030d();
                }
            } else {
                m33203b();
                dr00 dr00Var = recyclerView.f1192D1;
                if (dr00Var != null) {
                    dr00Var.m36690a(recyclerView, i3, i4);
                }
            }
        }
        il80 il80Var3 = recyclerView.f1206O0.f1297e;
        if (il80Var3 != null && il80Var3.m50992f()) {
            il80Var3.m50994h(0, 0);
        }
        this.f39094e = false;
        if (!this.f39095f) {
            recyclerView.setScrollState(0);
            recyclerView.mo403l(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = mec1.f142677a;
            recyclerView.postOnAnimation(this);
        }
    }
}
