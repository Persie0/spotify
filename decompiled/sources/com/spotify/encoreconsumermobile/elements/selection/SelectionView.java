package com.spotify.encoreconsumermobile.elements.selection;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.alz0;
import p204p.nf60;
import p204p.oqs;
import p204p.wg61;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/selection/SelectionView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "d", "Lp/fr70;", "getSelectedDrawable", "()Landroid/graphics/drawable/Drawable;", "selectedDrawable", "e", "getNotSelectedDrawable", "notSelectedDrawable", "src_main_java_com_spotify_encoreconsumermobile_elements_selection-selection"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SelectionView extends AppCompatImageView implements oqs {

    /* JADX INFO: renamed from: d */
    public final wg61 f3747d;

    /* JADX INFO: renamed from: e */
    public final wg61 f3748e;

    public SelectionView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final Drawable getNotSelectedDrawable() {
        return (Drawable) this.f3748e.getValue();
    }

    private final Drawable getSelectedDrawable() {
        return (Drawable) this.f3747d.getValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(alz0 alz0Var) {
        Drawable selectedDrawable;
        setTag(R.id.selection_view_tag, alz0Var);
        setVisibility(alz0Var == alz0.f17014a ? 8 : 0);
        int iOrdinal = alz0Var.ordinal();
        if (iOrdinal == 1) {
            setSelected(true);
            selectedDrawable = getSelectedDrawable();
        } else if (iOrdinal != 2) {
            selectedDrawable = null;
        } else {
            setSelected(false);
            selectedDrawable = getNotSelectedDrawable();
        }
        setImageDrawable(selectedDrawable);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(isSelected());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(isSelected());
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    public SelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        this.f3747d = new wg61(new nf60(context, 22));
        this.f3748e = new wg61(new nf60(context, 21));
    }

    public /* synthetic */ SelectionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
