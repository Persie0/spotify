package com.spotify.encoremobile.component.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.music.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eee;
import p204p.ezu;
import p204p.g6f;
import p204p.gee;
import p204p.gtq;
import p204p.h1u0;
import p204p.h2u0;
import p204p.tn40;
import p204p.wzu;
import p204p.xde;
import p204p.zde;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/encoremobile/component/buttons/EncoreProgressIndicatorButton;", "Lcom/spotify/encoremobile/component/buttons/EncoreButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "icon", "Lp/w2a1;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "getIcon", "()Landroid/graphics/drawable/Drawable;", "", "value", "V0", "Z", "getShowProgressIndicator", "()Z", "setShowProgressIndicator", "(Z)V", "showProgressIndicator", "p/ezu", "src_main_java_com_spotify_encoremobile_component_buttons-buttons"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EncoreProgressIndicatorButton extends EncoreButton {

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public boolean showProgressIndicator;

    /* JADX INFO: renamed from: W0 */
    public final wzu f3796W0;

    /* JADX INFO: renamed from: X0 */
    public Drawable f3797X0;

    public EncoreProgressIndicatorButton(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // com.google.android.material.button.MaterialButton
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public Drawable getF3797X0() {
        return this.f3797X0;
    }

    public final boolean getShowProgressIndicator() {
        return this.showProgressIndicator;
    }

    @Override // com.spotify.encoremobile.component.buttons.EncoreButton, com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        ArrayList arrayList = new ArrayList();
        if (this.showProgressIndicator) {
            arrayList.add(Integer.valueOf(R.attr.state_progress_indicator_visible));
        }
        return !arrayList.isEmpty() ? View.mergeDrawableStates(super.onCreateDrawableState(arrayList.size() + i), g6f.m43726i1(arrayList)) : super.onCreateDrawableState(i);
    }

    @Override // com.spotify.encoremobile.component.buttons.EncoreButton, com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ezu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ezu ezuVar = (ezu) parcelable;
        super.onRestoreInstanceState(ezuVar.f161807a);
        setShowProgressIndicator(ezuVar.f64470c);
    }

    @Override // com.spotify.encoremobile.component.buttons.EncoreButton, com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ezu ezuVar = new ezu(super.onSaveInstanceState());
        ezuVar.f64470c = this.showProgressIndicator;
        return ezuVar;
    }

    @Override // com.google.android.material.button.MaterialButton
    public void setIcon(Drawable icon) {
        this.f3797X0 = icon;
        if (this.showProgressIndicator) {
            icon = this.f3796W0;
        }
        super.setIcon(icon);
    }

    public final void setShowProgressIndicator(boolean z) {
        this.showProgressIndicator = z;
        super.setIcon(z ? this.f3796W0 : this.f3797X0);
    }

    public EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null, 8, null);
        Context context2 = getContext();
        int i2 = eee.f58757M0;
        gee geeVar = new gee(context2, attributeSet, i);
        xde xdeVar = new xde(geeVar);
        xdeVar.f260468c = 1;
        wzu wzuVar = new wzu(new tn40(context2, geeVar, xdeVar, new zde(geeVar)));
        wzuVar.f256686d = new int[0];
        this.f3796W0 = wzuVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h2u0.f87059a, i, 0);
        setShowProgressIndicator(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, h1u0.f86747u, i, 0);
        this.f3797X0 = typedArrayObtainStyledAttributes2.getDrawable(10);
        typedArrayObtainStyledAttributes2.recycle();
        super.setIcon(this.showProgressIndicator ? wzuVar : this.f3797X0);
    }

    public /* synthetic */ EncoreProgressIndicatorButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.encoreButtonStyle : i);
    }
}
