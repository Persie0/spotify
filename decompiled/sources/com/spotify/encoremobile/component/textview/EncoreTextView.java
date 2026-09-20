package com.spotify.encoremobile.component.textview;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.e000;
import p204p.gtq;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoremobile_component_textview-textview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class EncoreTextView extends MaterialTextView {
    public EncoreTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // com.google.android.material.textview.MaterialTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e000.m37475a(this, i);
    }

    public EncoreTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e000.m37476b(this, attributeSet, i);
    }

    public /* synthetic */ EncoreTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.encoreTextViewStyle : i);
    }
}
