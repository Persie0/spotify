package p204p;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public class fa71 extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final TextInputLayout f67453d;

    public fa71(TextInputLayout textInputLayout) {
        this.f67453d = textInputLayout;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public void mo1668d(View view, C2374sf c2374sf) {
        AccessibilityNodeInfo accessibilityNodeInfo = c2374sf.f208417a;
        this.f281839a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f67453d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.f2263e2;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (!zIsEmpty) {
            c2374sf.m77988w(text);
        } else if (!TextUtils.isEmpty(string)) {
            c2374sf.m77988w(string);
            if (!z && placeholderText != null) {
                c2374sf.m77988w(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c2374sf.m77988w(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c2374sf.m77983r(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c2374sf.m77988w(string);
            }
            c2374sf.m77987v(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}
