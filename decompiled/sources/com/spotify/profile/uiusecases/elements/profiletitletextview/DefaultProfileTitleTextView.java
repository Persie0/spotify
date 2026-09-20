package com.spotify.profile.uiusecases.elements.profiletitletextview;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a450;
import p204p.ikc0;
import p204p.n0e1;
import p204p.oqs;
import p204p.t350;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/profile/uiusecases/elements/profiletitletextview/DefaultProfileTitleTextView;", "", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_profile_uiusecases_elements_profiletitletextview-profiletitletextview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DefaultProfileTitleTextView extends AppCompatTextView implements oqs {
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultProfileTitleTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        Float fValueOf;
        super.onMeasure(i, i2);
        if (getLayout() != null) {
            Layout layout = getLayout();
            Iterator it = n0e1.m63417Y(0, layout.getLineCount()).iterator();
            a450 a450Var = (a450) it;
            if (a450Var.hasNext()) {
                t350 t350Var = (t350) it;
                float lineWidth = layout.getLineWidth(t350Var.nextInt());
                while (a450Var.hasNext()) {
                    lineWidth = Math.max(lineWidth, layout.getLineWidth(t350Var.nextInt()));
                }
                fValueOf = Float.valueOf(lineWidth);
            } else {
                fValueOf = null;
            }
            setMeasuredDimension(getCompoundPaddingRight() + getCompoundPaddingLeft() + (fValueOf != null ? (int) Math.ceil(fValueOf.floatValue()) : 0), getMeasuredHeight());
        }
    }

    public DefaultProfileTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ DefaultProfileTitleTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
