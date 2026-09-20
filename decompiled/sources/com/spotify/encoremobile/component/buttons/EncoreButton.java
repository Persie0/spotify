package com.spotify.encoremobile.component.buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.spotify.music.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.e000;
import p204p.g6f;
import p204p.gtq;
import p204p.klu;
import p204p.lzj;
import p204p.mgu;
import p204p.moi0;
import p204p.qzb0;
import p204p.x2d0;
import p204p.x4w0;

/* JADX INFO: loaded from: classes.dex */
@gtq
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Lp/klu;", "flags", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILp/klu;)V", "", "value", "T0", "Z", "isIconActive", "()Z", "setIconActive", "(Z)V", "U0", "setShouldUseSmallGlyph", "shouldUseSmallGlyph", "p/mgu", "src_main_java_com_spotify_encoremobile_component_buttons-buttons"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class EncoreButton extends MaterialButton {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public boolean isIconActive;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public boolean shouldUseSmallGlyph;

    public EncoreButton(Context context) {
        this(context, null, 0, null, 14, null);
    }

    private final void setShouldUseSmallGlyph(boolean z) {
        if (z != this.shouldUseSmallGlyph) {
            refreshDrawableState();
        }
        this.shouldUseSmallGlyph = z;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        if (this.isIconActive) {
            arrayList.add(Integer.valueOf(R.attr.state_icon_active));
        }
        if (this.shouldUseSmallGlyph) {
            arrayList.add(Integer.valueOf(R.attr.state_small_glyph));
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), g6f.m43726i1(arrayList)) : super.onCreateDrawableState(i);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof mgu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mgu mguVar = (mgu) parcelable;
        super.onRestoreInstanceState(mguVar.m66261c());
        setIconActive(mguVar.m61731g());
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        mgu mguVar = new mgu((x2d0) super.onSaveInstanceState());
        mguVar.m61732h(this.isIconActive);
        return mguVar;
    }

    public final void setIconActive(boolean z) {
        if (z != this.isIconActive) {
            this.isIconActive = z;
            refreshDrawableState();
        }
    }

    @Override // p204p.u55, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e000.m37475a(this, i);
    }

    public EncoreButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public EncoreButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    public EncoreButton(Context context, AttributeSet attributeSet, int i, klu kluVar) {
        super(context, attributeSet, i);
        e000.m37476b(this, attributeSet, i);
        setIconActive(x4w0.m89923N(getContext(), attributeSet, i).f124212a);
        setShouldUseSmallGlyph(qzb0.m74318r(getIconSize(), getResources()));
        if (((Boolean) moi0.f145682b.getValue()).booleanValue()) {
            Integer numValueOf = attributeSet != null ? Integer.valueOf(attributeSet.getStyleAttribute()) : null;
            if ((numValueOf != null && numValueOf.intValue() == 2132017548) || ((numValueOf != null && numValueOf.intValue() == 2132017550) || ((numValueOf != null && numValueOf.intValue() == 2132017552) || ((numValueOf != null && numValueOf.intValue() == 2132017549) || ((numValueOf != null && numValueOf.intValue() == 2132017551) || (numValueOf != null && numValueOf.intValue() == 2132017553)))))) {
                setStrokeColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}}, new int[]{0}));
                setBackgroundTintList(lzj.m60387w(context, R.color.encore_button_secondary_tinted_background));
            }
        }
    }

    public /* synthetic */ EncoreButton(Context context, AttributeSet attributeSet, int i, klu kluVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.encoreButtonStyle : i, (i2 & 8) != 0 ? moi0.f145681a : kluVar);
    }
}
