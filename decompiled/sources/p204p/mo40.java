package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class mo40 {

    /* JADX INFO: renamed from: a */
    public final Context f145570a;

    /* JADX INFO: renamed from: b */
    public final TextInputLayout f145571b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f145572c;

    /* JADX INFO: renamed from: d */
    public int f145573d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f145574e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f145575f;

    /* JADX INFO: renamed from: g */
    public final float f145576g;

    /* JADX INFO: renamed from: h */
    public int f145577h;

    /* JADX INFO: renamed from: i */
    public int f145578i;

    /* JADX INFO: renamed from: j */
    public CharSequence f145579j;

    /* JADX INFO: renamed from: k */
    public boolean f145580k;

    /* JADX INFO: renamed from: l */
    public AppCompatTextView f145581l;

    /* JADX INFO: renamed from: m */
    public CharSequence f145582m;

    /* JADX INFO: renamed from: n */
    public int f145583n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f145584o;

    /* JADX INFO: renamed from: p */
    public CharSequence f145585p;

    /* JADX INFO: renamed from: q */
    public boolean f145586q;

    /* JADX INFO: renamed from: r */
    public AppCompatTextView f145587r;

    /* JADX INFO: renamed from: s */
    public int f145588s;

    /* JADX INFO: renamed from: t */
    public ColorStateList f145589t;

    /* JADX INFO: renamed from: u */
    public Typeface f145590u;

    public mo40(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f145570a = context;
        this.f145571b = textInputLayout;
        this.f145576g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    /* JADX INFO: renamed from: a */
    public final void m62376a(AppCompatTextView appCompatTextView, int i) {
        if (this.f145572c == null && this.f145574e == null) {
            Context context = this.f145570a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f145572c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f145572c;
            TextInputLayout textInputLayout = this.f145571b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f145574e = new FrameLayout(context);
            this.f145572c.addView(this.f145574e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m62377b();
            }
        }
        if (i == 0 || i == 1) {
            this.f145574e.setVisibility(0);
            this.f145574e.addView(appCompatTextView);
        } else {
            this.f145572c.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f145572c.setVisibility(0);
        this.f145573d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m62377b() {
        if (this.f145572c != null) {
            TextInputLayout textInputLayout = this.f145571b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f145570a;
                boolean zM88951z = wtg1.m88951z(context);
                LinearLayout linearLayout = this.f145572c;
                WeakHashMap weakHashMap = mec1.f142677a;
                int paddingStart = editText.getPaddingStart();
                if (zM88951z) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM88951z) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM88951z) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m62378c() {
        AnimatorSet animatorSet = this.f145575f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m62379d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, i3 == i ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(167L);
            objectAnimatorOfFloat.setInterpolator(r05.f194383a);
            arrayList.add(objectAnimatorOfFloat);
            if (i3 == i) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f145576g, 0.0f);
                objectAnimatorOfFloat2.setDuration(217L);
                objectAnimatorOfFloat2.setInterpolator(r05.f194386d);
                arrayList.add(objectAnimatorOfFloat2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m62380e() {
        return (this.f145578i != 1 || this.f145581l == null || TextUtils.isEmpty(this.f145579j)) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final TextView m62381f(int i) {
        if (i == 1) {
            return this.f145581l;
        }
        if (i != 2) {
            return null;
        }
        return this.f145587r;
    }

    /* JADX INFO: renamed from: g */
    public final void m62382g() {
        this.f145579j = null;
        m62378c();
        if (this.f145577h == 1) {
            if (!this.f145586q || TextUtils.isEmpty(this.f145585p)) {
                this.f145578i = 0;
            } else {
                this.f145578i = 2;
            }
        }
        m62385j(this.f145577h, this.f145578i, m62384i(this.f145581l, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m62383h(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f145572c;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f145574e) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.f145573d - 1;
        this.f145573d = i2;
        LinearLayout linearLayout2 = this.f145572c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m62384i(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = mec1.f142677a;
        TextInputLayout textInputLayout = this.f145571b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f145578i == this.f145577h && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m62385j(int i, int i2, boolean z) {
        TextView textViewM62381f;
        TextView textViewM62381f2;
        mo40 mo40Var = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            mo40Var.f145575f = animatorSet;
            ArrayList arrayList = new ArrayList();
            mo40Var.m62379d(arrayList, mo40Var.f145586q, mo40Var.f145587r, 2, i, i2);
            mo40Var.m62379d(arrayList, mo40Var.f145580k, mo40Var.f145581l, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            lo40 lo40Var = new lo40(this, i2, m62381f(i), i, mo40Var.m62381f(i2));
            mo40Var = this;
            animatorSet.addListener(lo40Var);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewM62381f2 = mo40Var.m62381f(i2)) != null) {
                textViewM62381f2.setVisibility(0);
                textViewM62381f2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM62381f = m62381f(i)) != null) {
                textViewM62381f.setVisibility(4);
                if (i == 1) {
                    textViewM62381f.setText((CharSequence) null);
                }
            }
            mo40Var.f145577h = i2;
        }
        TextInputLayout textInputLayout = mo40Var.f145571b;
        textInputLayout.m1655q();
        textInputLayout.m1657s(z, false);
        textInputLayout.m1664z();
    }
}
