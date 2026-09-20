package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f6j extends View {

    /* JADX INFO: renamed from: a */
    public int[] f66418a;

    /* JADX INFO: renamed from: b */
    public int f66419b;

    /* JADX INFO: renamed from: c */
    public final Context f66420c;

    /* JADX INFO: renamed from: d */
    public jq20 f66421d;

    /* JADX INFO: renamed from: e */
    public String f66422e;

    /* JADX INFO: renamed from: f */
    public String f66423f;

    /* JADX INFO: renamed from: g */
    public final HashMap f66424g;

    public f6j(Context context) {
        super(context);
        this.f66418a = new int[32];
        this.f66424g = new HashMap();
        this.f66420c = context;
        mo312i(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m40861a(String str) {
        String strTrim;
        int iM40867h;
        if (str == null || str.length() == 0 || this.f66420c == null || (iM40867h = m40867h((strTrim = str.trim()))) == 0) {
            return;
        }
        this.f66424g.put(Integer.valueOf(iM40867h), strTrim);
        m40862b(iM40867h);
    }

    /* JADX INFO: renamed from: b */
    public final void m40862b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f66419b + 1;
        int[] iArr = this.f66418a;
        if (i2 > iArr.length) {
            this.f66418a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f66418a;
        int i3 = this.f66419b;
        iArr2[i3] = i;
        this.f66419b = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m40863c(String str) {
        if (str == null || str.length() == 0 || this.f66420c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof h6j) && strTrim.equals(((h6j) layoutParams).f88127Y) && childAt.getId() != -1) {
                m40862b(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m40864d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m40865e((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: e */
    public final void m40865e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f66419b; i++) {
            View view = (View) constraintLayout.f733a.get(this.f66418a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m40866g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f66420c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f66418a, this.f66419b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX INFO: renamed from: h */
    public final int m40867h(String str) {
        int iM40866g;
        HashMap map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iM40866g = 0;
        } else {
            Object obj = (str == null || (map = constraintLayout.f730N0) == null || !map.containsKey(str)) ? null : constraintLayout.f730N0.get(str);
            if (obj instanceof Integer) {
                iM40866g = ((Integer) obj).intValue();
            } else {
                iM40866g = 0;
            }
        }
        if (iM40866g == 0 && constraintLayout != null) {
            iM40866g = m40866g(constraintLayout, str);
        }
        if (iM40866g == 0) {
            try {
                iM40866g = u0u0.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iM40866g != 0) {
            return iM40866g;
        }
        Context context = this.f66420c;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    /* JADX INFO: renamed from: i */
    public void mo312i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22698b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f66422e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f66423f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo313j(x6j x6jVar, jq20 jq20Var, z7j z7jVar, SparseArray sparseArray) {
        y6j y6jVar = x6jVar.f258686e;
        int[] iArr = y6jVar.f269840j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = y6jVar.f269842k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = y6jVar.f269842k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int iM40867h = m40867h(str2.trim());
                        if (iM40867h != 0) {
                            iArrCopyOf[i2] = iM40867h;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    y6jVar.f269840j0 = iArrCopyOf;
                } else {
                    y6jVar.f269840j0 = null;
                }
            }
        }
        jq20Var.f114775v0 = 0;
        Arrays.fill(jq20Var.f114774u0, (Object) null);
        if (y6jVar.f269840j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = y6jVar.f269840j0;
            if (i >= iArr2.length) {
                return;
            }
            v7j v7jVar = (v7j) sparseArray.get(iArr2[i]);
            if (v7jVar != null) {
                jq20Var.m54027W(v7jVar);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m40868m() {
        if (this.f66421d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof h6j) {
            ((h6j) layoutParams).f88160p0 = this.f66421d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f66422e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f66423f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f66422e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f66419b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m40861a(str.substring(i));
                return;
            } else {
                m40861a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f66423f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f66419b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m40863c(str.substring(i));
                return;
            } else {
                m40863c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f66422e = null;
        this.f66419b = 0;
        for (int i : iArr) {
            m40862b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f66422e == null) {
            m40862b(i);
        }
    }

    public f6j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66418a = new int[32];
        this.f66424g = new HashMap();
        this.f66420c = context;
        mo312i(attributeSet);
    }

    public f6j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f66418a = new int[32];
        this.f66424g = new HashMap();
        this.f66420c = context;
        mo312i(attributeSet);
    }

    /* JADX INFO: renamed from: l */
    public void mo364l() {
    }

    /* JADX INFO: renamed from: f */
    public void mo363f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: k */
    public void mo314k(v7j v7jVar, boolean z) {
    }
}
