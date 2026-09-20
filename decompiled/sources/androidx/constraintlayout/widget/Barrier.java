package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import p204p.b2u0;
import p204p.f6j;
import p204p.ix8;
import p204p.jq20;
import p204p.v7j;
import p204p.w7j;
import p204p.x6j;
import p204p.y6j;
import p204p.z7j;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends f6j {

    /* JADX INFO: renamed from: h */
    public int f724h;

    /* JADX INFO: renamed from: i */
    public int f725i;

    /* JADX INFO: renamed from: t */
    public ix8 f726t;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f726t.f106617x0;
    }

    public int getMargin() {
        return this.f726t.f106618y0;
    }

    public int getType() {
        return this.f724h;
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: i */
    public final void mo312i(AttributeSet attributeSet) {
        super.mo312i(attributeSet);
        this.f726t = new ix8();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22698b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f726t.f106617x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f726t.f106618y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f66421d = this.f726t;
        m40868m();
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: j */
    public final void mo313j(x6j x6jVar, jq20 jq20Var, z7j z7jVar, SparseArray sparseArray) {
        super.mo313j(x6jVar, jq20Var, z7jVar, sparseArray);
        y6j y6jVar = x6jVar.f258686e;
        if (jq20Var instanceof ix8) {
            ix8 ix8Var = (ix8) jq20Var;
            m353n(ix8Var, y6jVar.f269834g0, ((w7j) jq20Var.f238221V).f248713z0);
            ix8Var.f106617x0 = y6jVar.f269850o0;
            ix8Var.f106618y0 = y6jVar.f269836h0;
        }
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: k */
    public final void mo314k(v7j v7jVar, boolean z) {
        m353n(v7jVar, this.f724h, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m353n(v7j v7jVar, int i, boolean z) {
        this.f725i = i;
        if (z) {
            int i2 = this.f724h;
            if (i2 == 5) {
                this.f725i = 1;
            } else if (i2 == 6) {
                this.f725i = 0;
            }
        } else {
            int i3 = this.f724h;
            if (i3 == 5) {
                this.f725i = 0;
            } else if (i3 == 6) {
                this.f725i = 1;
            }
        }
        if (v7jVar instanceof ix8) {
            ((ix8) v7jVar).f106616w0 = this.f725i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f726t.f106617x0 = z;
    }

    public void setDpMargin(int i) {
        this.f726t.f106618y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f726t.f106618y0 = i;
    }

    public void setType(int i) {
        this.f724h = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
