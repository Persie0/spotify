package p204p;

import android.view.MotionEvent;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class kh21 extends sjv0 implements rjv0 {

    /* JADX INFO: renamed from: a */
    public int f122506a;

    /* JADX INFO: renamed from: b */
    public int f122507b;

    /* JADX INFO: renamed from: c */
    public int f122508c;

    /* JADX INFO: renamed from: d */
    public int f122509d;

    /* JADX INFO: renamed from: e */
    public int f122510e;

    /* JADX INFO: renamed from: f */
    public int f122511f;

    @Override // p204p.sjv0
    /* JADX INFO: renamed from: a */
    public final void mo35393a(RecyclerView recyclerView, int i) {
        AbstractC0110a layoutManager;
        boolean zMo951q;
        boolean zMo953r;
        int i2 = this.f122506a;
        this.f122506a = i;
        if (i2 != 0 || i != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (zMo951q = layoutManager.mo951q()) == (zMo953r = layoutManager.mo953r())) {
            return;
        }
        if ((!zMo951q || Math.abs(this.f122511f) <= Math.abs(this.f122510e)) && (!zMo953r || Math.abs(this.f122510e) <= Math.abs(this.f122511f))) {
            return;
        }
        recyclerView.m984C0();
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: c */
    public final boolean mo28971c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f122507b = motionEvent.getPointerId(0);
            this.f122508c = (int) (motionEvent.getX() + 0.5f);
            this.f122509d = (int) (motionEvent.getY() + 0.5f);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f122507b);
            if (iFindPointerIndex >= 0 && this.f122506a != 1) {
                int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                this.f122510e = x - this.f122508c;
                this.f122511f = y - this.f122509d;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f122507b = motionEvent.getPointerId(actionIndex);
            this.f122508c = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f122509d = (int) (motionEvent.getY(actionIndex) + 0.5f);
        }
        return false;
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: d */
    public final void mo28972d(boolean z) {
    }

    @Override // p204p.rjv0
    /* JADX INFO: renamed from: e */
    public final void mo28973e(MotionEvent motionEvent) {
    }
}
