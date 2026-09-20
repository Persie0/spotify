package p204p;

import android.animation.ValueAnimator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.equalizer.uiusecases.equalizerpicker.RotatingLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class vcw {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f240260a;

    /* JADX INFO: renamed from: b */
    public final int f240261b;

    /* JADX INFO: renamed from: c */
    public final TextView f240262c;

    /* JADX INFO: renamed from: d */
    public final SeekBar f240263d;

    /* JADX INFO: renamed from: e */
    public final RotatingLayout f240264e;

    /* JADX INFO: renamed from: f */
    public boolean f240265f = false;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f240266g = null;

    public vcw(ConstraintLayout constraintLayout, int i, TextView textView, SeekBar seekBar, RotatingLayout rotatingLayout) {
        this.f240260a = constraintLayout;
        this.f240261b = i;
        this.f240262c = textView;
        this.f240263d = seekBar;
        this.f240264e = rotatingLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcw)) {
            return false;
        }
        vcw vcwVar = (vcw) obj;
        return this.f240260a.equals(vcwVar.f240260a) && this.f240261b == vcwVar.f240261b && this.f240262c.equals(vcwVar.f240262c) && this.f240263d.equals(vcwVar.f240263d) && this.f240264e.equals(vcwVar.f240264e) && this.f240265f == vcwVar.f240265f && wj50.m88271j(this.f240266g, vcwVar.f240266g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f240264e.hashCode() + ((this.f240263d.hashCode() + ((this.f240262c.hashCode() + mt60.m62800g(this.f240261b, this.f240260a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f240265f);
        ValueAnimator valueAnimator = this.f240266g;
        return iM77245d + (valueAnimator == null ? 0 : valueAnimator.hashCode());
    }
}
