package p204p;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;

/* JADX INFO: loaded from: classes3.dex */
public final class aee implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14854c;

    public /* synthetic */ aee(int i, Object obj, Object obj2) {
        this.f14852a = i;
        this.f14853b = obj;
        this.f14854c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.List] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i491 i491Var;
        SpannableString spannableString;
        int i = this.f14852a;
        Object obj = this.f14854c;
        Object obj2 = this.f14853b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dee deeVar = (dee) obj;
                cee ceeVar = (cee) obj2;
                dee.m35776d(fFloatValue, ceeVar);
                deeVar.m35777a(fFloatValue, ceeVar, false);
                deeVar.invalidateSelf();
                break;
            case 1:
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj2;
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((RecyclerView) ((aim) ((wup) obj).f255245b).f16015N0).setLayoutParams(layoutParams);
                break;
            case 2:
                if (((ValueAnimator) obj2).isRunning()) {
                    deq deqVar = (deq) obj;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    CancellableSeekBar cancellableSeekBar = deqVar.f48148c;
                    cancellableSeekBar.setSecondaryProgress(cancellableSeekBar.getProgress() + ((int) ((cancellableSeekBar.getMax() - cancellableSeekBar.getProgress()) * animatedFraction)));
                    ((Drawable) deqVar.f48153h.getValue()).setAlpha(255 - ((int) (animatedFraction * 255)));
                }
                break;
            case 3:
                ((vcw) obj2).f240263d.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                int i2 = EqualizerView.f3902W0;
                ((EqualizerView) obj).m9733z(false);
                break;
            default:
                long jLongValue = ((Long) valueAnimator.getAnimatedValue()).longValue();
                k491 k491Var = (k491) obj2;
                zvr zvrVar = (zvr) obj;
                ?? r1 = zvrVar.f286759e.f213371a;
                int iM46712I = h6f.m46712I(r1, new q22(24, jLongValue));
                i491 i491Var2 = i491.f98464c;
                if (iM46712I < 0) {
                    i491Var = i491Var2;
                } else {
                    rrq0 rrq0Var = (rrq0) r1.get(iM46712I);
                    i491Var = new i491(rrq0Var.f202101a, rrq0Var.f202102b);
                }
                boolean z = zvrVar.f286758d;
                int i3 = k491Var.f119158i;
                int i4 = k491Var.f119159t;
                if (!i491Var.equals(k491Var.f119155S0)) {
                    k491Var.f119155S0 = i491Var;
                    if (i491Var.equals(i491Var2)) {
                        k491Var.f119156T0 = null;
                        if (!k491Var.f119154R0) {
                            k491Var.setVisibility(4);
                        }
                        break;
                    } else {
                        k491Var.setVisibility(0);
                        String str = i491Var.f98465a;
                        if (str != k491Var.f119156T0) {
                            k491Var.f119156T0 = str;
                            int i5 = i491Var.f98466b;
                            int i6 = k491Var.f119149M0;
                            int i7 = k491Var.f119148L0;
                            if (k491Var.f119154R0) {
                                if (z) {
                                    i6 = i7;
                                }
                                spannableString = new SpannableString(str);
                                spannableString.setSpan(new w091(i6, k491Var.f119151O0), 0, spannableString.length(), 33);
                                if (i5 > 0) {
                                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i4);
                                    int length = spannableString.length();
                                    if (i5 <= length) {
                                        length = i5;
                                    }
                                    spannableString.setSpan(foregroundColorSpan, 0, length, 33);
                                }
                                if (i5 < spannableString.length()) {
                                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i3);
                                    int length2 = spannableString.length();
                                    if (i5 > length2) {
                                        i5 = length2;
                                    }
                                    spannableString.setSpan(foregroundColorSpan2, i5, spannableString.length(), 33);
                                }
                            } else {
                                SpannableString spannableString2 = new SpannableString(str);
                                spannableString2.setSpan(new p491(z ? i7 : i6, k491Var.f119159t, k491Var.f119158i, k491Var.f119150N0, k491Var.f119151O0, i5), 0, spannableString2.length(), 33);
                                spannableString = spannableString2;
                            }
                            k491Var.setText(wl51.m88491o1(spannableString), TextView.BufferType.SPANNABLE);
                            break;
                        } else {
                            int i8 = i491Var.f98466b;
                            CharSequence text = k491Var.getText();
                            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
                            if (spannable != null) {
                                int length3 = spannable.length();
                                if (i8 <= length3) {
                                    length3 = i8;
                                }
                                if (k491Var.f119154R0) {
                                    for (ForegroundColorSpan foregroundColorSpan3 : (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class)) {
                                        spannable.removeSpan(foregroundColorSpan3);
                                    }
                                    if (length3 > 0) {
                                        spannable.setSpan(new ForegroundColorSpan(i4), 0, length3, 33);
                                    }
                                    if (length3 < spannable.length()) {
                                        spannable.setSpan(new ForegroundColorSpan(i3), length3, spannable.length(), 33);
                                    }
                                } else {
                                    p491 p491Var = (p491) bk5.m29584G0(spannable.getSpans(0, spannable.length(), p491.class));
                                    if (p491Var != null) {
                                        p491Var.f173879f = i8;
                                        k491Var.invalidate();
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public aee(dee deeVar, cee ceeVar) {
        this.f14852a = 0;
        this.f14854c = deeVar;
        this.f14853b = ceeVar;
    }
}
