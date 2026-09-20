package com.spotify.encoremobile.widgets;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import p204p.RunnableC2210od;
import p204p.inl0;
import p204p.lqb;
import p204p.mqb;
import p204p.p2u0;
import p204p.z65;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class CancellableSeekBar extends z65 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f3830i = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3831b;

    /* JADX INFO: renamed from: c */
    public boolean f3832c;

    /* JADX INFO: renamed from: d */
    public boolean f3833d;

    /* JADX INFO: renamed from: e */
    public int f3834e;

    /* JADX INFO: renamed from: f */
    public mqb f3835f;

    /* JADX INFO: renamed from: g */
    public float f3836g;

    /* JADX INFO: renamed from: h */
    public final Object f3837h;

    public CancellableSeekBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m9691a() {
        if (this.f3832c) {
            onTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
            this.f3831b = true;
            this.f3832c = false;
            synchronized (this.f3837h) {
                setProgress(this.f3834e);
            }
            mqb mqbVar = this.f3835f;
            if (mqbVar != null) {
                mqbVar.mo59732a(this);
            }
        }
    }

    public float getCancelDistance() {
        return this.f3836g;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        inl0.m51135a(this, new RunnableC2210od(this, 18));
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        try {
            this.f3833d = true;
            int action = motionEvent.getAction();
            if (this.f3831b) {
                if (action == 1 || action == 3) {
                    this.f3831b = false;
                    this.f3832c = false;
                }
                this.f3833d = false;
                return true;
            }
            if (action == 0) {
                this.f3832c = true;
                synchronized (this.f3837h) {
                    this.f3834e = getProgress();
                }
            }
            if (motionEvent.getY() >= (-this.f3836g) && motionEvent.getY() <= getHeight() + this.f3836g) {
                if (action == 1) {
                    this.f3832c = false;
                }
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                this.f3833d = false;
                return zOnTouchEvent;
            }
            this.f3831b = true;
            motionEvent.setAction(3);
            mqb mqbVar = this.f3835f;
            if (mqbVar != null) {
                mqbVar.f146235b = true;
            }
            boolean zOnTouchEvent2 = super.onTouchEvent(motionEvent);
            synchronized (this.f3837h) {
                setProgress(this.f3834e);
            }
            mqb mqbVar2 = this.f3835f;
            if (mqbVar2 != null) {
                mqbVar2.mo59732a(this);
            }
            this.f3833d = false;
            return zOnTouchEvent2;
        } catch (Throwable th) {
            this.f3833d = false;
            throw th;
        }
    }

    public void setCancelDistance(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.f3836g = f;
    }

    public void setOnSeekBarChangeListener(lqb lqbVar) {
        if (lqbVar == null) {
            this.f3835f = null;
        } else {
            this.f3835f = new mqb(lqbVar, 0);
        }
        super.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.f3835f);
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        try {
            if (this.f3833d || !this.f3832c || this.f3831b) {
                super.setProgress(i);
            } else {
                this.f3834e = i;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3837h = new Object();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p2u0.f173433a);
        this.f3836g = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        if (onSeekBarChangeListener == null) {
            this.f3835f = null;
        } else {
            this.f3835f = new mqb(onSeekBarChangeListener, 0);
        }
        super.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this.f3835f);
    }
}
