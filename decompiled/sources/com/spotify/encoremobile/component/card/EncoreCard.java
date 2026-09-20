package com.spotify.encoremobile.component.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import com.spotify.encoremobile.component.slottextview.EncorePretitleView;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C1889g9;
import p204p.ahu;
import p204p.bfu;
import p204p.bx3;
import p204p.cfu;
import p204p.ggu;
import p204p.gtq;
import p204p.h6j;
import p204p.i2u0;
import p204p.i3d0;
import p204p.nfu;
import p204p.psg1;
import p204p.vu21;
import p204p.xu21;
import p204p.zgu;

/* JADX INFO: loaded from: classes6.dex */
@gtq
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, m24212d2 = {"Lcom/spotify/encoremobile/component/card/EncoreCard;", "Lp/ggu;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "horizontalSpacing", "Lp/w2a1;", "setHorizontalSpacing", "(I)V", "verticalSpacing", "setVerticalSpacing", "titleSpacing", "setTitleSpacing", "Lp/ahu;", "Q0", "Lp/ahu;", "getBinding", "()Lp/ahu;", "binding", "Lp/nfu;", "value", "R0", "Lp/nfu;", "getMediaAspectRatio", "()Lp/nfu;", "setMediaAspectRatio", "(Lp/nfu;)V", "mediaAspectRatio", "p/zgu", "src_main_java_com_spotify_encoremobile_component_card-card"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EncoreCard extends ggu {

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public final ahu binding;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public nfu mediaAspectRatio;

    public EncoreCard(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setMediaAspectRatio(nfu nfuVar) {
        this.mediaAspectRatio = nfuVar;
        View viewM9674c = m9674c(vu21.f244848a);
        ViewGroup.LayoutParams layoutParams = viewM9674c.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        h6jVar.f88109G = nfuVar.f153427a;
        viewM9674c.setLayoutParams(h6jVar);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws C1889g9 {
        if (view == null) {
            throw new IllegalArgumentException("Cannot add a null child view to a ViewGroup");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The specified child already has a parent. You must call removeView() on the child's parent first.");
        }
        if (view.getId() == R.id.content_root) {
            super.addView(view, i, layoutParams);
            return;
        }
        if (!(layoutParams instanceof xu21)) {
            throw new C1889g9(6);
        }
        xu21 xu21Var = (xu21) layoutParams;
        vu21 vu21Var = xu21Var.f265985a;
        if (vu21Var == null) {
            throw new C1889g9(6);
        }
        psg1.m70832H(m9674c(vu21Var), view);
        if (vu21Var == vu21.f244848a) {
            nfu nfuVar = xu21Var.f265986b;
            if (nfuVar instanceof bfu) {
                nfuVar = cfu.f37441b;
            }
            setMediaAspectRatio(nfuVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final View m9674c(vu21 vu21Var) {
        int iOrdinal = vu21Var.ordinal();
        ahu ahuVar = this.binding;
        switch (iOrdinal) {
            case 0:
                return ahuVar.f15774a.findViewById(R.id.media_slot);
            case 1:
                return ahuVar.f15774a.findViewById(R.id.leading_slot);
            case 2:
                return ahuVar.f15774a.findViewById(R.id.pretitle_slot);
            case 3:
                return ahuVar.f15774a.findViewById(R.id.title_slot);
            case 4:
                return ahuVar.f15774a.findViewById(R.id.subtitle_slot);
            case 5:
                return ahuVar.f15774a.findViewById(R.id.trailing_slot);
            case 6:
                return ahuVar.f15774a.findViewById(R.id.body_slot);
            case 7:
                return ahuVar.f15774a.findViewById(R.id.footer_slot);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new xu21(getContext(), attributeSet);
    }

    public final ahu getBinding() {
        return this.binding;
    }

    public final nfu getMediaAspectRatio() {
        return this.mediaAspectRatio;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zgu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zgu zguVar = (zgu) parcelable;
        super.onRestoreInstanceState(zguVar.f161807a);
        setMediaAspectRatio(bx3.m30737i(zguVar.f282715c));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        zgu zguVar = new zgu(parcelableOnSaveInstanceState);
        zguVar.f282715c = "";
        zguVar.f282715c = this.mediaAspectRatio.f153427a;
        return zguVar;
    }

    public final void setHorizontalSpacing(int horizontalSpacing) {
        ((Flow) this.binding.f15774a.findViewById(R.id.horizontal_title_block_flow)).setHorizontalGap(horizontalSpacing);
    }

    public final void setTitleSpacing(int titleSpacing) {
        ((Flow) this.binding.f15774a.findViewById(R.id.vertical_title_block_flow)).setVerticalGap(titleSpacing);
    }

    public final void setVerticalSpacing(int verticalSpacing) {
        ((Flow) this.binding.f15774a.findViewById(R.id.card_flow)).setVerticalGap(verticalSpacing);
    }

    public EncoreCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new xu21(getContext(), attributeSet);
    }

    public EncoreCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.binding = new ahu(this);
        this.mediaAspectRatio = cfu.f37441b;
        LayoutInflater.from(context).inflate(R.layout.encore_card, this);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.encore_box_default_padding);
        i3d0 i3d0Var = this.f2084h;
        i3d0Var.f98143b.set(0, dimensionPixelSize, 0, dimensionPixelSize);
        i3d0Var.m49611h();
        Context context2 = getContext();
        int[] iArr = i2u0.f97923a;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        setHorizontalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.encore_card_medium_density_horizontal_spacing)));
        setVerticalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.encore_card_medium_density_vertical_spacing)));
        setTitleSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(R.dimen.encore_card_medium_density_title_spacing)));
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
        String string = typedArrayObtainStyledAttributes2.getString(1);
        if (string != null) {
            EncorePretitleView encorePretitleView = new EncorePretitleView(context, null, 2, null);
            encorePretitleView.setText(string);
            psg1.m70832H(m9674c(vu21.f244849b), encorePretitleView);
        }
        String string2 = typedArrayObtainStyledAttributes2.getString(2);
        if (string2 != null) {
            EncoreSubtitleView encoreSubtitleView = new EncoreSubtitleView(context, null, 2, null);
            encoreSubtitleView.setText(string2);
            psg1.m70832H(m9674c(vu21.f244851d), encoreSubtitleView);
        }
        String string3 = typedArrayObtainStyledAttributes2.getString(3);
        if (string3 != null) {
            EncoreTitleView encoreTitleView = new EncoreTitleView(context, null, 2, null);
            encoreTitleView.setText(string3);
            psg1.m70832H(m9674c(vu21.f244850c), encoreTitleView);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FrameLayout.LayoutParams(layoutParams);
    }

    public /* synthetic */ EncoreCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.encoreCardStyle : i);
    }
}
