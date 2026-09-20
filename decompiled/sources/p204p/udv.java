package p204p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class udv implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f229333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f229334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextView f229335c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f229336d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f229337e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f229338f;

    public /* synthetic */ udv(Object obj, TextView textView, Object obj2, Object obj3, Object obj4, int i) {
        this.f229333a = i;
        this.f229334b = obj;
        this.f229335c = textView;
        this.f229336d = obj2;
        this.f229337e = obj3;
        this.f229338f = obj4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f229333a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f229333a;
        Object obj = this.f229338f;
        Object obj2 = this.f229337e;
        Object obj3 = this.f229336d;
        Object obj4 = this.f229334b;
        TextView textView = this.f229335c;
        switch (i) {
            case 0:
                Iterator it = h6f.m46715L((ParagraphView) obj4, (ParagraphView) textView, (ParagraphView) obj3, (EncoreButton) obj2, (ImageView) obj).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setVisibility(8);
                }
                break;
            default:
                EditText editText = (EditText) textView;
                if (((tf60) obj4).isActive()) {
                    editText.setHint(((Number) ((List) obj3).get(((plv0) obj2).f178796a)).intValue());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(500L);
                    valueAnimatorOfFloat.addUpdateListener(new hpe0(editText, 1));
                    ((rlv0) obj).f200373a = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f229333a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f229333a;
    }

    /* JADX INFO: renamed from: a */
    private final void m82866a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m82867b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m82868c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m82869d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m82870e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m82871f(Animator animator) {
    }
}
