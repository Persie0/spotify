package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import p204p.b2u0;
import p204p.giz;
import p204p.jq20;
import p204p.upc1;
import p204p.v7j;
import p204p.vpc1;
import p204p.x6j;
import p204p.z7j;

/* JADX INFO: loaded from: classes3.dex */
public class Flow extends upc1 {

    /* JADX INFO: renamed from: t */
    public giz f551t;

    public Flow(Context context) {
        super(context);
    }

    @Override // p204p.upc1, p204p.f6j
    /* JADX INFO: renamed from: i */
    public final void mo312i(AttributeSet attributeSet) {
        super.mo312i(attributeSet);
        this.f551t = new giz();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22698b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f551t.f80294Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    giz gizVar = this.f551t;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gizVar.f243666w0 = dimensionPixelSize;
                    gizVar.f243667x0 = dimensionPixelSize;
                    gizVar.f243668y0 = dimensionPixelSize;
                    gizVar.f243669z0 = dimensionPixelSize;
                } else if (index == 18) {
                    giz gizVar2 = this.f551t;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gizVar2.f243668y0 = dimensionPixelSize2;
                    gizVar2.f243659A0 = dimensionPixelSize2;
                    gizVar2.f243660B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f551t.f243669z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f551t.f243659A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f551t.f243666w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f551t.f243660B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f551t.f243667x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f551t.f80292X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f551t.f80276H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f551t.f80277I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f551t.f80278J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f551t.f80280L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f551t.f80279K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f551t.f80281M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f551t.f80282N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f551t.f80284P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f551t.f80286R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f551t.f80285Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f551t.f80287S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f551t.f80283O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f551t.f80290V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f551t.f80291W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f551t.f80288T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f551t.f80289U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f551t.f80293Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f66421d = this.f551t;
        m40868m();
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: j */
    public final void mo313j(x6j x6jVar, jq20 jq20Var, z7j z7jVar, SparseArray sparseArray) {
        super.mo313j(x6jVar, jq20Var, z7jVar, sparseArray);
        if (jq20Var instanceof giz) {
            giz gizVar = (giz) jq20Var;
            int i = z7jVar.f88124V;
            if (i != -1) {
                gizVar.f80294Z0 = i;
            }
        }
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: k */
    public final void mo314k(v7j v7jVar, boolean z) {
        giz gizVar = this.f551t;
        int i = gizVar.f243668y0;
        if (i > 0 || gizVar.f243669z0 > 0) {
            if (z) {
                gizVar.f243659A0 = gizVar.f243669z0;
                gizVar.f243660B0 = i;
            } else {
                gizVar.f243659A0 = i;
                gizVar.f243660B0 = gizVar.f243669z0;
            }
        }
    }

    @Override // p204p.upc1
    /* JADX INFO: renamed from: n */
    public final void mo315n(vpc1 vpc1Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (vpc1Var == null) {
            setMeasuredDimension(0, 0);
        } else {
            vpc1Var.mo35147Z(mode, size, mode2, size2);
            setMeasuredDimension(vpc1Var.f243662D0, vpc1Var.f243663E0);
        }
    }

    @Override // p204p.f6j, android.view.View
    public final void onMeasure(int i, int i2) {
        mo315n(this.f551t, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f551t.f80284P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f551t.f80278J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f551t.f80285Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f551t.f80279K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f551t.f80290V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f551t.f80282N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f551t.f80288T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f551t.f80276H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f551t.f80286R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f551t.f80280L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f551t.f80287S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f551t.f80281M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f551t.f80293Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f551t.f80294Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        giz gizVar = this.f551t;
        gizVar.f243666w0 = i;
        gizVar.f243667x0 = i;
        gizVar.f243668y0 = i;
        gizVar.f243669z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f551t.f243667x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f551t.f243659A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f551t.f243660B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f551t.f243666w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f551t.f80291W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f551t.f80283O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f551t.f80289U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f551t.f80277I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f551t.f80292X0 = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
