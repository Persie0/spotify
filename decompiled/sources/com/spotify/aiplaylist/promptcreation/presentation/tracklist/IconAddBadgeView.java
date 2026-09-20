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
import p204p.fw40;
import p204p.lzj;
import p204p.mec1;
import p204p.pc0;
import p204p.qr60;
import p204p.spi0;
import p204p.ty30;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/aiplaylist/promptcreation/presentation/tracklist/IconAddBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isActive", "Lp/w2a1;", "setAccessibility", "(Z)V", "<set-?>", "b", "Ljava/lang/Object;", "isIconActive", "()Z", "setIconActive", "src_main_java_com_spotify_aiplaylist_promptcreation-promptcreation"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class IconAddBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qr60[] f2757c = {new spi0(IconAddBadgeView.class, "isIconActive", "isIconActive()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final fw40 f2758a;

    /* JADX INFO: renamed from: b */
    public final pc0 f2759b;

    public IconAddBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibility(boolean isActive) {
        fw40 fw40Var = this.f2758a;
        if (isActive) {
            ((ImageView) fw40Var.f73935c).setContentDescription(getResources().getString(R.string.tick_content_description));
            ImageView imageView = (ImageView) fw40Var.f73935c;
            mec1.m61564p(imageView, new ty30(imageView, R.string.tick_accessibility_action));
        } else {
            ((ImageView) fw40Var.f73935c).setContentDescription(getResources().getString(R.string.plus_track_content_description));
            ImageView imageView2 = (ImageView) fw40Var.f73935c;
            mec1.m61564p(imageView2, new ty30(imageView2, R.string.plus_accessibility_action));
        }
    }

    public final void setIconActive(boolean z) {
        this.f2759b.m39516c(f2757c[0], this, Boolean.valueOf(z));
    }

    public IconAddBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public IconAddBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.add_badge_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            ImageView imageView = (ImageView) viewInflate;
            this.f2758a = new fw40(7, imageView, imageView);
            imageView.setImageTintList(lzj.m60387w(imageView.getContext(), R.color.gray_trailing_icon));
            this.f2759b = new pc0(this);
            return;
        }
        throw new NullPointerException("rootView");
    }

    public /* synthetic */ IconAddBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
