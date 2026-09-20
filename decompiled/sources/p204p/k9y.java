package p204p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public class k9y extends bqc1 {
    public k9y(int i) {
        this.f29787d1 = i;
    }

    /* JADX INFO: renamed from: Y */
    public static float m55852Y(rb91 rb91Var, float f) {
        Float f2;
        return (rb91Var == null || (f2 = (Float) rb91Var.f197533a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p204p.bqc1
    /* JADX INFO: renamed from: V */
    public ObjectAnimator mo26145V(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2) {
        bpc1.f29411a.getClass();
        return m55853X(view, m55852Y(rb91Var, 0.0f), 1.0f);
    }

    @Override // p204p.bqc1
    /* JADX INFO: renamed from: W */
    public ObjectAnimator mo26146W(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2) {
        dpc1 dpc1Var = bpc1.f29411a;
        dpc1Var.getClass();
        ObjectAnimator objectAnimatorM55853X = m55853X(view, m55852Y(rb91Var, 1.0f), 0.0f);
        if (objectAnimatorM55853X == null) {
            dpc1Var.mo39656X(view, m55852Y(rb91Var2, 1.0f));
        }
        return objectAnimatorM55853X;
    }

    /* JADX INFO: renamed from: X */
    public final ObjectAnimator m55853X(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bpc1.f29411a.mo39656X(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, bpc1.f29412b, f2);
        j9y j9yVar = new j9y(view);
        objectAnimatorOfFloat.addListener(j9yVar);
        m95492u().m95486b(j9yVar);
        return objectAnimatorOfFloat;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: i */
    public final void mo26148i(rb91 rb91Var) {
        bqc1.m30248T(rb91Var);
        View view = rb91Var.f197534b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(bpc1.f29411a.mo39655F(view)) : Float.valueOf(0.0f);
        }
        rb91Var.f197533a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: z */
    public final boolean mo55854z() {
        return true;
    }
}
