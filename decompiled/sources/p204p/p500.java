package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes3.dex */
public final class p500 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f174036a;

    /* JADX INFO: renamed from: b */
    public final View f174037b;

    /* JADX INFO: renamed from: c */
    public boolean f174038c;

    /* JADX INFO: renamed from: d */
    public boolean f174039d;

    /* JADX INFO: renamed from: e */
    public boolean f174040e;

    public p500(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f174040e = true;
        this.f174036a = viewGroup;
        this.f174037b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f174040e = true;
        if (this.f174038c) {
            return !this.f174039d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f174038c = true;
            inl0.m51135a(this.f174036a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f174038c;
        ViewGroup viewGroup = this.f174036a;
        if (z || !this.f174040e) {
            viewGroup.endViewTransition(this.f174037b);
            this.f174039d = true;
        } else {
            this.f174040e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f174040e = true;
        if (this.f174038c) {
            return !this.f174039d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f174038c = true;
            inl0.m51135a(this.f174036a, this);
        }
        return true;
    }
}
