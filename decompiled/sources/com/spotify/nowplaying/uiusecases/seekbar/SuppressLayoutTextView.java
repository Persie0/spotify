package com.spotify.nowplaying.uiusecases.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.e000;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/nowplaying/uiusecases/seekbar/SuppressLayoutTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lp/w2a1;", "setTextSuppressingRelayout", "(Ljava/lang/CharSequence;)V", "", "setTextAdjustingWidth", "(Ljava/lang/String;)V", "src_main_java_com_spotify_nowplaying_uiusecases_seekbar-seekbar"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SuppressLayoutTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h */
    public boolean f6322h;

    public SuppressLayoutTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.f6322h) {
            return;
        }
        super.requestLayout();
    }

    public final void setTextAdjustingWidth(String text) {
        if (text.equals(getText())) {
            return;
        }
        int iMeasureText = (int) getPaint().measureText(text);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.width != iMeasureText) {
            layoutParams.width = iMeasureText;
            setLayoutParams(layoutParams);
        }
        setTextSuppressingRelayout(text);
    }

    public final void setTextSuppressingRelayout(CharSequence text) {
        this.f6322h = true;
        setText(text);
        this.f6322h = false;
    }

    public SuppressLayoutTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SuppressLayoutTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e000.m37476b(this, attributeSet, i);
    }

    public /* synthetic */ SuppressLayoutTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
