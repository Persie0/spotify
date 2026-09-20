package p204p;

import android.animation.ValueAnimator;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public final class hpe0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93765a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f93766b;

    public /* synthetic */ hpe0(EditText editText, int i) {
        this.f93765a = i;
        this.f93766b = editText;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        String string;
        String string2;
        switch (this.f93765a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                EditText editText = this.f93766b;
                CharSequence hint = editText.getHint();
                if (hint != null) {
                    string = hint.toString();
                    editText.setHintTextColor(editText.getHintTextColors().withAlpha((int) (fFloatValue * 255)));
                } else {
                    string = null;
                }
                editText.setHint(string);
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                EditText editText2 = this.f93766b;
                CharSequence hint2 = editText2.getHint();
                if (hint2 != null) {
                    string2 = hint2.toString();
                    editText2.setHintTextColor(editText2.getHintTextColors().withAlpha((int) (fFloatValue2 * 255)));
                } else {
                    string2 = null;
                }
                editText2.setHint(string2);
                break;
        }
    }
}
