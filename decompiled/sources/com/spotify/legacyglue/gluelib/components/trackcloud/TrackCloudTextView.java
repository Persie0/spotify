package com.spotify.legacyglue.gluelib.components.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import p204p.g000;
import p204p.nd81;

/* JADX INFO: loaded from: classes7.dex */
class TrackCloudTextView extends EncoreTextView {

    /* JADX INFO: renamed from: h */
    public nd81 f5051h;

    public TrackCloudTextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nd81 nd81Var = this.f5051h;
        String str = nd81Var.f152709e;
        boolean z2 = nd81Var.f152710f;
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (TextUtils.isEmpty(str) || lineCount <= 0 || getLayout().getEllipsisCount(i5) <= 0) {
            return;
        }
        SpannableString spannableStringM64198a = nd81.m64198a(getContext());
        SpannableString spannableString = new SpannableString(str);
        if (z2) {
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        } else {
            spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.gray_70)), 0, spannableString.length(), 33);
        }
        int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
        int length = str.length() + spannableStringM64198a.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        int i6 = lineEnd - length;
        if (i6 >= 0) {
            spannableStringBuilder.delete(i6, spannableStringBuilder.length());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.delete(this.f5051h.m64199b(length2), length2);
            spannableStringBuilder.append((CharSequence) spannableStringM64198a);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        setText(spannableStringBuilder);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g000.m43251a(this, context);
    }
}
