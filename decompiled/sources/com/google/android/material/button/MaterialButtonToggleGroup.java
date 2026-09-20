package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.timepicker.C0148e;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p204p.C2281q5;
import p204p.C2569xe;
import p204p.a3d0;
import p204p.bcg1;
import p204p.crs;
import p204p.dh01;
import p204p.euk;
import p204p.fem;
import p204p.h1u0;
import p204p.kay;
import p204p.mec1;
import p204p.s780;
import p204p.vgg1;
import p204p.yic1;
import p204p.z2d0;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: L0 */
    public static final /* synthetic */ int f2069L0 = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2070a;

    /* JADX INFO: renamed from: b */
    public final z2d0 f2071b;

    /* JADX INFO: renamed from: c */
    public final s780 f2072c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f2073d;

    /* JADX INFO: renamed from: e */
    public final kay f2074e;

    /* JADX INFO: renamed from: f */
    public Integer[] f2075f;

    /* JADX INFO: renamed from: g */
    public boolean f2076g;

    /* JADX INFO: renamed from: h */
    public boolean f2077h;

    /* JADX INFO: renamed from: i */
    public boolean f2078i;

    /* JADX INFO: renamed from: t */
    public int f2079t;

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m1601c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1601c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m1601c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f2079t = i;
        m1600b();
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = mec1.f142677a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f2063e.add(this.f2071b);
        materialButton.setOnPressedChangeListenerInternal(this.f2072c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1599a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.f2059O0) {
                m1602d(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            dh01 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f2070a.add(new a3d0(shapeAppearanceModel.f48941e, shapeAppearanceModel.f48944h, shapeAppearanceModel.f48942f, shapeAppearanceModel.f48943g));
            mec1.m61564p(materialButton, new C2569xe(this, 7));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1600b() {
        Iterator it = this.f2073d.iterator();
        while (it.hasNext()) {
            ((C0148e) it.next()).m1669a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1601c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1602d(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f2078i && checkedButtonIds.isEmpty()) {
            View viewFindViewById = findViewById(i);
            if (viewFindViewById instanceof MaterialButton) {
                this.f2076g = true;
                ((MaterialButton) viewFindViewById).setChecked(true);
                this.f2076g = false;
            }
            this.f2079t = i;
            return false;
        }
        if (z && this.f2077h) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                View viewFindViewById2 = findViewById(it.next().intValue());
                if (viewFindViewById2 instanceof MaterialButton) {
                    this.f2076g = true;
                    ((MaterialButton) viewFindViewById2).setChecked(false);
                    this.f2076g = false;
                }
                m1600b();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2074e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f2075f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m1603e() {
        int i;
        a3d0 a3d0Var;
        euk eukVar;
        euk c2281q5;
        euk c2281q6;
        euk c2281q7;
        MaterialButtonToggleGroup materialButtonToggleGroup = this;
        int childCount = materialButtonToggleGroup.getChildCount();
        int firstVisibleChildIndex = materialButtonToggleGroup.getFirstVisibleChildIndex();
        int lastVisibleChildIndex = materialButtonToggleGroup.getLastVisibleChildIndex();
        int i2 = 0;
        while (i2 < childCount) {
            MaterialButton materialButton = (MaterialButton) materialButtonToggleGroup.getChildAt(i2);
            if (materialButton.getVisibility() == 8) {
                i = childCount;
            } else {
                dh01 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                fem femVar = shapeAppearanceModel.f48937a;
                fem femVar2 = shapeAppearanceModel.f48938b;
                fem femVar3 = shapeAppearanceModel.f48939c;
                fem femVar4 = shapeAppearanceModel.f48940d;
                crs crsVar = shapeAppearanceModel.f48945i;
                crs crsVar2 = shapeAppearanceModel.f48946j;
                crs crsVar3 = shapeAppearanceModel.f48947k;
                crs crsVar4 = shapeAppearanceModel.f48948l;
                a3d0 a3d0Var2 = (a3d0) materialButtonToggleGroup.f2070a.get(i2);
                if (firstVisibleChildIndex == lastVisibleChildIndex) {
                    i = childCount;
                } else {
                    boolean z = materialButtonToggleGroup.getOrientation() == 0;
                    C2281q5 c2281q8 = a3d0.f11932e;
                    if (i2 != firstVisibleChildIndex) {
                        i = childCount;
                        if (i2 != lastVisibleChildIndex) {
                            a3d0Var2 = null;
                        } else if (z) {
                            WeakHashMap weakHashMap = mec1.f142677a;
                            a3d0Var = getLayoutDirection() == 1 ? new a3d0(a3d0Var2.f11933a, a3d0Var2.f11936d, c2281q8, c2281q8) : new a3d0(c2281q8, c2281q8, a3d0Var2.f11934b, a3d0Var2.f11935c);
                        } else {
                            a3d0Var = new a3d0(c2281q8, a3d0Var2.f11936d, c2281q8, a3d0Var2.f11935c);
                        }
                    } else if (z) {
                        WeakHashMap weakHashMap2 = mec1.f142677a;
                        i = childCount;
                        a3d0Var = getLayoutDirection() == 1 ? new a3d0(c2281q8, c2281q8, a3d0Var2.f11934b, a3d0Var2.f11935c) : new a3d0(a3d0Var2.f11933a, a3d0Var2.f11936d, c2281q8, c2281q8);
                    } else {
                        i = childCount;
                        a3d0Var = new a3d0(a3d0Var2.f11933a, c2281q8, a3d0Var2.f11934b, c2281q8);
                    }
                    a3d0Var2 = a3d0Var;
                }
                if (a3d0Var2 == null) {
                    C2281q5 c2281q9 = new C2281q5(0.0f);
                    c2281q6 = new C2281q5(0.0f);
                    c2281q7 = new C2281q5(0.0f);
                    c2281q5 = new C2281q5(0.0f);
                    eukVar = c2281q9;
                } else {
                    eukVar = a3d0Var2.f11933a;
                    c2281q5 = a3d0Var2.f11936d;
                    c2281q6 = a3d0Var2.f11934b;
                    c2281q7 = a3d0Var2.f11935c;
                }
                dh01 dh01Var = new dh01();
                dh01Var.f48937a = femVar;
                dh01Var.f48938b = femVar2;
                dh01Var.f48939c = femVar3;
                dh01Var.f48940d = femVar4;
                dh01Var.f48941e = eukVar;
                dh01Var.f48942f = c2281q6;
                dh01Var.f48943g = c2281q7;
                dh01Var.f48944h = c2281q5;
                dh01Var.f48945i = crsVar;
                dh01Var.f48946j = crsVar2;
                dh01Var.f48947k = crsVar3;
                dh01Var.f48948l = crsVar4;
                materialButton.setShapeAppearanceModel(dh01Var);
            }
            i2++;
            materialButtonToggleGroup = this;
            firstVisibleChildIndex = firstVisibleChildIndex;
            childCount = i;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f2077h) {
            return this.f2079t;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.f2059O0) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f2075f;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.f2079t;
        if (i == -1 || (materialButton = (MaterialButton) findViewById(i)) == null) {
            return;
        }
        materialButton.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) yic1.m93704m(1, getVisibleButtonCount(), this.f2077h ? 1 : 2, false).f273079b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m1603e();
        m1599a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f2063e.remove(this.f2071b);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2070a.remove(iIndexOfChild);
        }
        m1603e();
        m1599a();
    }

    public void setSelectionRequired(boolean z) {
        this.f2078i = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f2077h != z) {
            this.f2077h = z;
            this.f2076g = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                materialButton.setChecked(false);
                materialButton.getId();
                m1600b();
            }
            this.f2076g = false;
            setCheckedId(-1);
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(vgg1.m85455K(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.f2070a = new ArrayList();
        this.f2071b = new z2d0(this);
        this.f2072c = new s780(this, 13);
        this.f2073d = new LinkedHashSet();
        this.f2074e = new kay(this, 1);
        this.f2076g = false;
        TypedArray typedArrayM28739t = bcg1.m28739t(getContext(), attributeSet, h1u0.f86748v, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM28739t.getBoolean(2, false));
        this.f2079t = typedArrayM28739t.getResourceId(0, -1);
        this.f2078i = typedArrayM28739t.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayM28739t.recycle();
        WeakHashMap weakHashMap = mec1.f142677a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
