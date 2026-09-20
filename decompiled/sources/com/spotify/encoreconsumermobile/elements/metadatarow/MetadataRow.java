package com.spotify.encoreconsumermobile.elements.metadatarow;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.a7z;
import p204p.bga;
import p204p.bk5;
import p204p.bo40;
import p204p.btz0;
import p204p.ek5;
import p204p.g6f;
import p204p.h6j;
import p204p.i6f;
import p204p.j691;
import p204p.lau;
import p204p.lxr;
import p204p.n2d0;
import p204p.p6f0;
import p204p.sjf1;
import p204p.vie1;
import p204p.w8f0;
import p204p.wj50;
import p204p.y1u0;
import p204p.y8f0;
import p204p.z6z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/metadatarow/MetadataRow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getCurrentSeparatorPositions", "()Ljava/util/List;", "Lp/y8f0;", "R0", "Lp/y8f0;", "getBinding", "()Lp/y8f0;", "binding", "S0", "I", "getSeparatorColor", "()I", "setSeparatorColor", "(I)V", "separatorColor", "p/w8f0", "src_main_java_com_spotify_encoreconsumermobile_elements_metadatarow-metadatarow"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MetadataRow extends ConstraintLayout {

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public final y8f0 binding;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public int separatorColor;

    public MetadataRow(Context context) {
        this(context, null, 0, 6, null);
    }

    private final List<Integer> getCurrentSeparatorPositions() {
        return btz0.m30496T(new j691(new n2d0(this, 27), btz0.m30480D(p6f0.f174368X, new ek5(this, 8))));
    }

    /* JADX INFO: renamed from: x */
    public static void m9627x(MetadataRow metadataRow, View view, boolean z) {
        metadataRow.getClass();
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        metadataRow.addView(view);
        w8f0 w8f0Var = (w8f0) view.getLayoutParams();
        w8f0Var.f248924r0 = z;
        w8f0Var.f248923q0 = false;
        metadataRow.m9629C();
    }

    /* JADX INFO: renamed from: B */
    public final void m9628B() {
        Iterator it = bk5.m29616i1(this.binding.f270295b.getReferencedIds()).iterator();
        while (it.hasNext()) {
            removeView(findViewById(((Number) it.next()).intValue()));
        }
        m9629C();
    }

    /* JADX INFO: renamed from: C */
    public final void m9629C() {
        Iterable iterableSingletonList;
        y8f0 y8f0Var = this.binding;
        Flow flow = y8f0Var.f270295b;
        if (getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (i < getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < getChildCount())) {
                        iterableSingletonList = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = getChildAt(i);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    arrayList.add(childAt2);
                    i = i2;
                }
            } else {
                iterableSingletonList = Collections.singletonList(childAt);
            }
        } else {
            iterableSingletonList = lau.f131415a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterableSingletonList) {
            if (!(((View) obj) instanceof Flow)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((View) it.next()).getId()));
        }
        flow.setReferencedIds(g6f.m43726i1(arrayList3));
        y8f0Var.f270295b.requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w8f0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new w8f0(-2, -2);
    }

    public final y8f0 getBinding() {
        return this.binding;
    }

    public final int getSeparatorColor() {
        return this.separatorColor;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: m */
    public final h6j generateDefaultLayoutParams() {
        return new w8f0(-2, -2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        List<bo40> listSingletonList;
        Object obj;
        a7z a7zVarM30480D = btz0.m30480D(p6f0.f174383h, new ek5(new ek5(this, 8), 2));
        bga.m29094p(2, 1);
        lxr lxrVar = new lxr(new z6z(btz0.m30491O(p6f0.f174384i, new ek5(a7zVarM30480D, 6))), p6f0.f174385t);
        boolean zHasNext = lxrVar.hasNext();
        List listSingletonList2 = lau.f131415a;
        if (zHasNext) {
            Object next = lxrVar.next();
            if (lxrVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (lxrVar.hasNext()) {
                    arrayList.add(lxrVar.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = listSingletonList2;
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(listSingletonList, 10));
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((bo40) it.next()).f29008a + 1));
        }
        if (!wj50.m88271j(getCurrentSeparatorPositions(), arrayList2)) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (1 < getChildCount()) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(childAt);
                    int i3 = 1;
                    while (i3 < getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = getChildAt(i3);
                        if (childAt2 == null) {
                            throw new IndexOutOfBoundsException();
                        }
                        arrayList3.add(childAt2);
                        i3 = i4;
                    }
                    listSingletonList2 = arrayList3;
                } else {
                    listSingletonList2 = Collections.singletonList(childAt);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = listSingletonList2.iterator();
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                obj = sjf1.f209841b;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                if (((View) next2).getTag() == obj) {
                    arrayList4.add(next2);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                removeView((View) it3.next());
            }
            for (bo40 bo40Var : listSingletonList) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.metadata_separator, (ViewGroup) this, false);
                TextView textView = (TextView) viewInflate;
                textView.setId(View.generateViewId());
                textView.setTag(obj);
                textView.setTextColor(this.separatorColor);
                addView(viewInflate, indexOfChild((View) bo40Var.f29009b) + 1);
            }
            m9629C();
        }
        super.onMeasure(i, i2);
    }

    public final void setSeparatorColor(int i) {
        this.separatorColor = i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final w8f0 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        w8f0 w8f0Var = new w8f0(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y1u0.f268407a, 0, 0);
        w8f0Var.f248924r0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        w8f0Var.f248923q0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return w8f0Var;
    }

    public MetadataRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new w8f0(layoutParams);
    }

    public MetadataRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.metadata_row, this);
        Flow flow = (Flow) vie1.m85629k(this, R.id.flowHelper);
        if (flow != null) {
            this.binding = new y8f0(this, flow);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y1u0.f268408b, 0, 0);
            this.separatorColor = typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color.white));
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.flowHelper)));
    }

    public /* synthetic */ MetadataRow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
