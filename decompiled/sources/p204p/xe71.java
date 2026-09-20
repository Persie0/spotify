package p204p;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes10.dex */
public final class xe71 extends Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof String ? new SpannableString(charSequence) : (Spannable) charSequence;
    }
}
