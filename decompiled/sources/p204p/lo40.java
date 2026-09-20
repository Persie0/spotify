package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class lo40 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f135296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f135297c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f135298d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mo40 f135299e;

    public lo40(mo40 mo40Var, int i, TextView textView, int i2, TextView textView2) {
        this.f135299e = mo40Var;
        this.f135295a = i;
        this.f135296b = textView;
        this.f135297c = i2;
        this.f135298d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.f135295a;
        mo40 mo40Var = this.f135299e;
        mo40Var.f145577h = i;
        mo40Var.f145575f = null;
        TextView textView = this.f135296b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f135297c == 1 && (appCompatTextView = mo40Var.f145581l) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f135298d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f135298d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
