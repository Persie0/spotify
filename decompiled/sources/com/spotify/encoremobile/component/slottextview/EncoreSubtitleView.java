package com.spotify.encoremobile.component.slottextview;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gtq;
import p204p.v09;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/encoremobile/component/slottextview/EncoreSubtitleView;", "Lp/v09;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_encoremobile_component_slottextview-slottextview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EncoreSubtitleView extends v09 {
    /* JADX WARN: Multi-variable type inference failed */
    public EncoreSubtitleView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public EncoreSubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.style.TextAppearance_Encore_Subtitle);
    }

    public /* synthetic */ EncoreSubtitleView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
