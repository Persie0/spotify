package p204p;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.campaigns.storytelling.controls.stories.StoriesProgressBar;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.music.R;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class rx4 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f203486b;

    public /* synthetic */ rx4(Object obj, int i) {
        this.f203485a = i;
        this.f203486b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f203485a;
        Object obj = this.f203486b;
        switch (i) {
            case 0:
                ((sx4) obj).requestLayout();
                return;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3d0 n3d0Var = ((BottomSheetBehavior) obj).f2036i;
                if (n3d0Var != null) {
                    n3d0Var.m63602m(fFloatValue);
                    return;
                }
                return;
            case 2:
                Drawable drawable = ((hfe) obj).f90717f;
                if (drawable != null) {
                    drawable.invalidateSelf();
                    return;
                }
                return;
            case 3:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                ((j9f) obj).f110162c.mo46867a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                ((i9f) obj).f100000a.mo44024a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                ((s0p) obj).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                ((ConstraintLayout) obj).findViewById(R.id.percentage_view).getBackground().setColorFilter(new PorterDuffColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC));
                return;
            case 8:
                ((s2s) obj).invalidateSelf();
                return;
            case 9:
                ((kis) obj).f257281c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 10:
                int i2 = EqualizerView.f3902W0;
                ((EqualizerView) obj).m9733z(true);
                return;
            case 11:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                bey beyVar = (bey) obj;
                beyVar.f26487c.setAlpha(iFloatValue);
                beyVar.f26488d.setAlpha(iFloatValue);
                beyVar.f26472Q0.invalidate();
                return;
            case 12:
                ((nv50) obj).f158804m = valueAnimator.getAnimatedFraction();
                return;
            case 13:
                ((xvb0) obj).f266343a.requestLayout();
                return;
            case 14:
                ((a2i0) obj).f11680a.mo69081a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                yak0 yak0Var = (yak0) obj;
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                int iIntValue = num.intValue();
                MotionLayout motionLayout = yak0Var.f270931a;
                ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = iIntValue;
                motionLayout.setLayoutParams(layoutParams);
                yak0Var.f270936f.invoke(num);
                return;
            case 16:
                c0m0 c0m0Var = (c0m0) obj;
                c0m0Var.f32823b.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                c0m0Var.f32823b.invalidate();
                return;
            case 17:
                ((LottieAnimationView) ((PreviewOverlayView) obj).f3719R0.f249253c).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                ((SmartShuffleButtonView) obj).getLoading().invalidateSelf();
                return;
            case 19:
                dh31 dh31Var = (dh31) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                StoriesProgressBar storiesProgressBar = ((ca51) dh31Var.f48973b).f35731S0;
                storiesProgressBar.currentStory = ((ec51) dh31Var.f48974c).f58228a;
                storiesProgressBar.currentStoryProgress = animatedFraction;
                storiesProgressBar.invalidate();
                return;
            case 20:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 21:
                ((TextInputLayout) obj).f2266f2.m79748n(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() / 100.0f;
                bhd1 bhd1Var = (bhd1) obj;
                RectF[] rectFArr = bhd1Var.f27153b;
                RectF[] rectFArr2 = bhd1Var.f27156e;
                Iterator it = new b450(0, rectFArr2.length - 1, 1).iterator();
                while (((a450) it).f12141c) {
                    int iNextInt = ((t350) it).nextInt();
                    RectF[] rectFArr3 = bhd1Var.f27154c;
                    float f = rectFArr[iNextInt].top;
                    rectFArr3[iNextInt].top = Math.min((bhd1Var.getHeight() / 2.0f) - bhd1Var.getMinRectHeight(), f - ((f - rectFArr2[iNextInt].top) * fFloatValue2));
                    float f2 = rectFArr2[iNextInt].bottom;
                    float f3 = rectFArr[iNextInt].bottom;
                    rectFArr3[iNextInt].bottom = Math.max((bhd1Var.getHeight() / 2.0f) + bhd1Var.getMinRectHeight(), edb.m38555d(f2, f3, fFloatValue2, f3));
                    RectF rectF = rectFArr3[iNextInt];
                    RectF rectF2 = rectFArr2[iNextInt];
                    rectF.left = rectF2.left;
                    rectF.right = rectF2.right;
                }
                bhd1Var.postInvalidateOnAnimation();
                return;
        }
    }

    public rx4(zyp zypVar, ConstraintLayout constraintLayout) {
        this.f203485a = 7;
        this.f203486b = constraintLayout;
    }
}
