package com.spotify.artist.creatorartist;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p204p.ryp;

/* JADX INFO: loaded from: classes4.dex */
public class ExpandableEllipsizeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h */
    public CharSequence f2997h;

    /* JADX INFO: renamed from: i */
    public boolean f2998i;

    public ExpandableEllipsizeTextView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new ryp(this, 11));
    }

    public void setShouldExpandText(boolean z) {
        this.f2998i = z;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f2997h = charSequence;
        m3275t();
    }

    /* JADX INFO: renamed from: t */
    public final void m3275t() {
        CharSequence charSequenceAppend = this.f2997h;
        if (!this.f2998i && !TextUtils.isEmpty(charSequenceAppend) && this.f2997h.length() > 256) {
            charSequenceAppend = new SpannableStringBuilder(this.f2997h, 0, 257).append((CharSequence) "...");
        }
        super.setText(charSequenceAppend, TextView.BufferType.SPANNABLE);
    }

    public ExpandableEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2997h = "";
    }
}
