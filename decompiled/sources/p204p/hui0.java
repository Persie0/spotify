package p204p;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes7.dex */
public final class hui0 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iCodePointCount = spanned.toString().codePointCount(0, spanned.length());
        int iCodePointCount2 = charSequence.toString().codePointCount(i, i2);
        int iCodePointCount3 = iCodePointCount - spanned.toString().codePointCount(i3, i4);
        if (iCodePointCount2 + iCodePointCount3 <= 20) {
            return null;
        }
        int i5 = 20 - iCodePointCount3;
        if (i5 <= 0) {
            return "";
        }
        String string = charSequence.subSequence(i, i2).toString();
        if (string.codePointCount(0, string.length()) <= i5) {
            return string;
        }
        int iCharCount = 0;
        for (int i6 = 0; iCharCount < string.length() && i6 < i5; i6++) {
            iCharCount += Character.charCount(string.codePointAt(iCharCount));
        }
        return string.substring(0, iCharCount);
    }
}
