package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import p204p.f6j;
import p204p.h6j;

/* JADX INFO: loaded from: classes3.dex */
public class Group extends f6j {
    public Group(Context context) {
        super(context);
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: f */
    public final void mo363f(ConstraintLayout constraintLayout) {
        m40865e(constraintLayout);
    }

    @Override // p204p.f6j
    /* JADX INFO: renamed from: l */
    public final void mo364l() {
        h6j h6jVar = (h6j) getLayoutParams();
        h6jVar.f88160p0.m84872T(0);
        h6jVar.f88160p0.m84867O(0);
    }

    @Override // p204p.f6j, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m40864d();
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

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
