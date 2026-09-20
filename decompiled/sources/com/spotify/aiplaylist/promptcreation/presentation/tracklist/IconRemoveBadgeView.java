package com.spotify.aiplaylist.promptcreation.presentation.tracklist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2569xe;
import p204p.azu0;
import p204p.lzj;
import p204p.mec1;
import p204p.pc0;
import p204p.qr60;
import p204p.spi0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/IconRemoveBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "<set-?>", "b", "Ljava/lang/Object;", "isIconVisible", "()Z", "setIconVisible", "(Z)V", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class IconRemoveBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f2760c = {new spi0(IconRemoveBadgeView.class, "isIconVisible", "isIconVisible()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final azu0 f2761a;

    /* JADX INFO: renamed from: b */
    public final pc0 f2762b;

    public IconRemoveBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void setIconVisible(boolean z) {
        this.f2762b.m39516c(f2760c[0], this, Boolean.valueOf(z));
    }

    public IconRemoveBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IconRemoveBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.remove_badge_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            ImageView imageView = (ImageView) viewInflate;
            this.f2761a = new azu0(9, imageView, imageView);
            imageView.setImageTintList(lzj.m60387w(imageView.getContext(), R.color.gray_trailing_icon));
            mec1.m61564p(imageView, new C2569xe(imageView, 6));
            this.f2762b = new pc0(this);
            return;
        }
        throw new NullPointerException("rootView");
    }

    public /* synthetic */ IconRemoveBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
