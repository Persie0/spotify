package com.spotify.encoreconsumermobile.elements.badge.download;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.oqs;
import p204p.s2s;
import p204p.tc41;
import p204p.vc41;
import p204p.w9s;
import p204p.wg61;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/download/DownloadBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_download-download"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DownloadBadgeView extends AppCompatImageView implements oqs {
    public DownloadBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(w9s w9sVar) {
        int iOrdinal = w9sVar.ordinal();
        if (iOrdinal == 0) {
            setImageDrawable(null);
            setVisibility(8);
            return;
        }
        if (iOrdinal == 1) {
            m9593f(w9s.f249256b, R.string.download_badge_waiting_content_description);
            return;
        }
        if (iOrdinal == 2) {
            m9593f(w9s.f249257c, R.string.download_badge_downloading_content_description);
        } else if (iOrdinal == 3) {
            m9593f(w9s.f249258d, R.string.download_badge_downloaded_content_description);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            m9593f(w9s.f249259e, R.string.download_badge_error_content_description);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final void m9593f(w9s w9sVar, int i) {
        s2s s2sVar;
        Drawable drawable = getDrawable();
        if (drawable instanceof s2s) {
            s2sVar = (s2s) drawable;
            if (s2sVar.f205063g == w9sVar) {
                s2sVar.setCallback(null);
            } else {
                s2sVar = new s2s(getContext());
            }
        } else {
            s2sVar = new s2s(getContext());
        }
        wg61 wg61Var = s2sVar.f205062f;
        s2sVar.setCallback(this);
        tc41 tc41Var = s2sVar.f205060d;
        if (s2sVar.f205063g != w9sVar) {
            s2sVar.f205063g = w9sVar;
            int iOrdinal = w9sVar.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalArgumentException("DownloadBadgeDrawable.State cannot be Empty");
            }
            if (iOrdinal == 1) {
                ((ObjectAnimator) wg61Var.getValue()).cancel();
                tc41Var.f219008a = vc41.DOWNLOAD;
                tc41Var.m80421f();
                tc41Var.m80422g();
                tc41Var.invalidateSelf();
                tc41Var.m80418c(s2sVar.f205058b);
            } else if (iOrdinal == 2) {
                ((ObjectAnimator) wg61Var.getValue()).start();
            } else if (iOrdinal == 3) {
                ((ObjectAnimator) wg61Var.getValue()).cancel();
                tc41Var.f219008a = vc41.DOWNLOADED;
                tc41Var.m80421f();
                tc41Var.m80422g();
                tc41Var.invalidateSelf();
                tc41Var.m80418c(s2sVar.f205057a);
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ObjectAnimator) wg61Var.getValue()).cancel();
                tc41Var.f219008a = vc41.EXCLAMATION_CIRCLE;
                tc41Var.m80421f();
                tc41Var.m80422g();
                tc41Var.invalidateSelf();
                tc41Var.m80418c(s2sVar.f205059c);
            }
            s2sVar.invalidateSelf();
        }
        setImageDrawable(s2sVar);
        setContentDescription(getContext().getString(i));
        setVisibility(0);
    }

    public DownloadBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DownloadBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
    }

    public /* synthetic */ DownloadBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
