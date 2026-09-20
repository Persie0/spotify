package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p204p.h6j;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a */
    public boolean f743a;

    public Guideline(Context context) {
        super(context);
        this.f743a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f743a = z;
    }

    public void setGuidelineBegin(int i) {
        h6j h6jVar = (h6j) getLayoutParams();
        if (this.f743a && h6jVar.f88129a == i) {
            return;
        }
        h6jVar.f88129a = i;
        setLayoutParams(h6jVar);
    }

    public void setGuidelineEnd(int i) {
        h6j h6jVar = (h6j) getLayoutParams();
        if (this.f743a && h6jVar.f88131b == i) {
            return;
        }
        h6jVar.f88131b = i;
        setLayoutParams(h6jVar);
    }

    public void setGuidelinePercent(float f) {
        h6j h6jVar = (h6j) getLayoutParams();
        if (this.f743a && h6jVar.f88133c == f) {
            return;
        }
        h6jVar.f88133c = f;
        setLayoutParams(h6jVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f743a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f743a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f743a = true;
        super.setVisibility(8);
    }
}
