package p204p;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class upc1 extends f6j {

    /* JADX INFO: renamed from: h */
    public boolean f232633h;

    /* JADX INFO: renamed from: i */
    public boolean f232634i;

    @Override // p204p.f6j
    /* JADX INFO: renamed from: f */
    public final void mo363f(ConstraintLayout constraintLayout) {
        m40865e(constraintLayout);
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: i */
    public void mo312i(AttributeSet attributeSet) {
        super.mo312i(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22698b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f232633h = true;
                } else if (index == 22) {
                    this.f232634i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo315n(vpc1 vpc1Var, int i, int i2);

    @Override // p204p.f6j, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f232633h || this.f232634i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f66419b; i++) {
                    View view = (View) constraintLayout.f733a.get(this.f66418a[i]);
                    if (view != null) {
                        if (this.f232633h) {
                            view.setVisibility(visibility);
                        }
                        if (this.f232634i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m40864d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m40864d();
    }
}
