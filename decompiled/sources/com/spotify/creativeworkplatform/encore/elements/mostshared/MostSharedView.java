package com.spotify.creativeworkplatform.encore.elements.mostshared;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.oqs;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/creativeworkplatform/encore/elements/mostshared/MostSharedView;", "Landroid/widget/TextView;", "Lp/oqs;", "", "Lp/w2a1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_creativeworkplatform_encore_elements_mostshared-mostshared"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MostSharedView extends TextView implements oqs {
    /* JADX WARN: Multi-variable type inference failed */
    public MostSharedView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m9051a(boolean z) {
        if (z) {
            setText(getContext().getString(R.string.most_shared));
            setTextColor(getContext().getColor(R.color.gray_70));
        }
        setVisibility(z ? 0 : 8);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2820d(Object obj) {
        m9051a(((Boolean) obj).booleanValue());
    }

    public MostSharedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
    }

    public /* synthetic */ MostSharedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
