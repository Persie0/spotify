package p204p;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.SeekBar;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;

/* JADX INFO: loaded from: classes6.dex */
public final class wcw implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final vcw f250127a;

    /* JADX INFO: renamed from: b */
    public int f250128b = 4;

    /* JADX INFO: renamed from: c */
    public boolean f250129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EqualizerView f250130d;

    public wcw(EqualizerView equalizerView, vcw vcwVar) {
        this.f250130d = equalizerView;
        this.f250127a = vcwVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            vcw vcwVar = this.f250127a;
            int i2 = vcwVar.f240261b;
            boolean z2 = vcwVar.f240265f;
            EqualizerView equalizerView = this.f250130d;
            gh00 gh00Var = equalizerView.f3906U0;
            if (gh00Var != null) {
                gh00Var.invoke(new rcw(i2, i));
            }
            equalizerView.m9733z(z2);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f250129c = true;
        this.f250127a.f240265f = this.f250128b != 1;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f250129c = false;
        this.f250127a.f240265f = false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1 && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        int action2 = motionEvent.getAction();
        this.f250128b = action2;
        if (this.f250129c && action2 != 1) {
            z = true;
        }
        this.f250127a.f240265f = z;
        view.onTouchEvent(motionEvent);
        return true;
    }
}
