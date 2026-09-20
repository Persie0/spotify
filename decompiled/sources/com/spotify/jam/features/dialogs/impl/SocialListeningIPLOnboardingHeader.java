package com.spotify.jam.features.dialogs.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/jam/features/dialogs/impl/SocialListeningIPLOnboardingHeader;", "Landroid/widget/GridLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_jam_features_dialogs_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SocialListeningIPLOnboardingHeader extends GridLayout {
    public SocialListeningIPLOnboardingHeader(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public static View m12031a(SocialListeningIPLOnboardingHeader socialListeningIPLOnboardingHeader, int i, int i2, int i3, Integer num, int i4) {
        if ((i4 & 16) != 0) {
            num = null;
        }
        View viewInflate = LayoutInflater.from(socialListeningIPLOnboardingHeader.getContext()).inflate(i, (ViewGroup) socialListeningIPLOnboardingHeader, false);
        if (num != null) {
            viewInflate.setBackgroundResource(num.intValue());
        }
        GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) viewInflate.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    public SocialListeningIPLOnboardingHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SocialListeningIPLOnboardingHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public /* synthetic */ SocialListeningIPLOnboardingHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
