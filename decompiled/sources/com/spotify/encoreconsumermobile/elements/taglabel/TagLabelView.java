package com.spotify.encoreconsumermobile.elements.taglabel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ei6;
import p204p.oqs;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/taglabel/TagLabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_taglabel-taglabel"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TagLabelView extends AppCompatTextView implements oqs {
    public TagLabelView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        throw ei6.m39072i(obj);
    }

    public TagLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TagLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTextAppearance(R.style.TextAppearance_Encore_TagLabel);
        setGravity(17);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_tag_label_top_bottom_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.encore_tag_label_left_right_padding);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setBackgroundResource(R.drawable.tag_label_background);
    }

    public /* synthetic */ TagLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
