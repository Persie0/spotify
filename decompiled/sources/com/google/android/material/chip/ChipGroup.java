package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p204p.bcg1;
import p204p.h1u0;
import p204p.mec1;
import p204p.plz;
import p204p.vgg1;
import p204p.w5e;
import p204p.x5e;
import p204p.y5e;
import p204p.yic1;
import p204p.z5e;

/* JADX INFO: loaded from: classes4.dex */
public class ChipGroup extends plz {

    /* JADX INFO: renamed from: L0 */
    public int f2107L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f2108M0;

    /* JADX INFO: renamed from: e */
    public int f2109e;

    /* JADX INFO: renamed from: f */
    public int f2110f;

    /* JADX INFO: renamed from: g */
    public boolean f2111g;

    /* JADX INFO: renamed from: h */
    public boolean f2112h;

    /* JADX INFO: renamed from: i */
    public final w5e f2113i;

    /* JADX INFO: renamed from: t */
    public final z5e f2114t;

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f2107L0 = i;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f2107L0;
                if (i2 != -1 && this.f2111g) {
                    m1615c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m1614b(int i) {
        int i2 = this.f2107L0;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.f2111g) {
            m1615c(i2, false);
        }
        if (i != -1) {
            m1615c(i, true);
        }
        setCheckedId(i);
    }

    /* JADX INFO: renamed from: c */
    public final void m1615c(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof Chip) {
            this.f2108M0 = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.f2108M0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof x5e);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new x5e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new x5e(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f2111g) {
            return this.f2107L0;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f2111g) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f2109e;
    }

    public int getChipSpacingVertical() {
        return this.f2110f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2107L0;
        if (i != -1) {
            m1615c(i, true);
            setCheckedId(this.f2107L0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) yic1.m93704m(getRowCount(), this.f178833c ? getChipCount() : -1, this.f2111g ? 1 : 2, false).f273079b);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f2109e != i) {
            this.f2109e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f2110f != i) {
            this.f2110f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2114t.f279547a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f2112h = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // p204p.plz
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f2111g != z) {
            this.f2111g = z;
            this.f2108M0 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f2108M0 = false;
            setCheckedId(-1);
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        Context contextM85455K = vgg1.m85455K(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextM85455K, attributeSet, i);
        this.f178833c = false;
        TypedArray typedArrayObtainStyledAttributes = contextM85455K.getTheme().obtainStyledAttributes(attributeSet, h1u0.f86742p, 0, 0);
        this.f178831a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f178832b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2113i = new w5e(this, 0);
        z5e z5eVar = new z5e(this);
        this.f2114t = z5eVar;
        this.f2107L0 = -1;
        this.f2108M0 = false;
        TypedArray typedArrayM28739t = bcg1.m28739t(getContext(), attributeSet, h1u0.f86734h, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM28739t.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM28739t.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM28739t.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM28739t.getBoolean(5, false));
        setSingleSelection(typedArrayM28739t.getBoolean(6, false));
        setSelectionRequired(typedArrayM28739t.getBoolean(4, false));
        int resourceId = typedArrayM28739t.getResourceId(0, -1);
        if (resourceId != -1) {
            this.f2107L0 = resourceId;
        }
        typedArrayM28739t.recycle();
        super.setOnHierarchyChangeListener(z5eVar);
        WeakHashMap weakHashMap = mec1.f142677a;
        setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new x5e(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setOnCheckedChangeListener(y5e y5eVar) {
    }
}
