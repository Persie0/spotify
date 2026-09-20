package com.spotify.encoreconsumermobile.elements.loadingdots;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a061;
import p204p.gtq;
import p204p.oqs;
import p204p.r9b0;
import p204p.wg61;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/loadingdots/ThreeDotsLoaderView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/r9b0;", "d", "Lp/fr70;", "getDotAnimation", "()Lp/r9b0;", "dotAnimation", "src_main_java_com_spotify_encoreconsumermobile_elements_loadingdots-loadingdots"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ThreeDotsLoaderView extends AppCompatImageView implements oqs {

    /* JADX INFO: renamed from: d */
    public final wg61 f3682d;

    public ThreeDotsLoaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final r9b0 getDotAnimation() {
        return (r9b0) this.f3682d.getValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2820d(Object obj) {
    }

    public ThreeDotsLoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ThreeDotsLoaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3682d = new wg61(new a061(this, 15));
        setContentDescription(context.getString(R.string.dot_animation_loading_content_description));
        setImageDrawable(getDotAnimation());
        getDotAnimation().m75030k();
    }

    public /* synthetic */ ThreeDotsLoaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
