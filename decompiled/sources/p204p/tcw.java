package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;

/* JADX INFO: loaded from: classes6.dex */
public final class tcw implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f219151a;

    /* JADX INFO: renamed from: b */
    public final TextView f219152b;

    /* JADX INFO: renamed from: c */
    public final EqualizerView f219153c;

    /* JADX INFO: renamed from: d */
    public final TextView f219154d;

    public tcw(ConstraintLayout constraintLayout, TextView textView, EqualizerView equalizerView, TextView textView2) {
        this.f219151a = constraintLayout;
        this.f219152b = textView;
        this.f219153c = equalizerView;
        this.f219154d = textView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f219151a;
    }
}
