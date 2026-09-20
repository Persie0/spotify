package com.spotify.yourlibrary.uiusecases.filterrow.chips;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gtq;
import p204p.qvl0;
import p204p.wj50;

/* JADX INFO: loaded from: classes11.dex */
@gtq
@Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/yourlibrary/uiusecases/filterrow/chips/LibraryChipBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "a", "Ljava/util/List;", "getSiblings", "()Ljava/util/List;", "setSiblings", "(Ljava/util/List;)V", "siblings", "Lp/qvl0;", "value", "b", "Lp/qvl0;", "getOrder", "()Lp/qvl0;", "setOrder", "(Lp/qvl0;)V", "order", "src_main_java_com_spotify_yourlibrary_uiusecases_filterrow-filterrow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LibraryChipBackgroundView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public List siblings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public qvl0 order;

    public LibraryChipBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final qvl0 getOrder() {
        return this.order;
    }

    public final List<View> getSiblings() {
        return this.siblings;
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrMergeDrawableStates;
        boolean z = true;
        if (this.order == null) {
            iArrMergeDrawableStates = super.onCreateDrawableState(i);
        } else {
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
            qvl0 qvl0Var = this.order;
            wj50.m88279p(qvl0Var);
            iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, qvl0Var.f193052a);
        }
        wj50.m88279p(iArrMergeDrawableStates);
        int length = iArrMergeDrawableStates.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (iArrMergeDrawableStates[i2] == 16842919) {
                break;
            }
            i2++;
        }
        List list = this.siblings;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setPressed(z);
            }
        }
        return iArrMergeDrawableStates;
    }

    public final void setOrder(qvl0 qvl0Var) {
        this.order = qvl0Var;
        refreshDrawableState();
    }

    public final void setSiblings(List<? extends View> list) {
        this.siblings = list;
    }

    public LibraryChipBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LibraryChipBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public /* synthetic */ LibraryChipBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
