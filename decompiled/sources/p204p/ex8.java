package p204p;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class ex8 extends evc {

    /* JADX INFO: renamed from: L0 */
    public long f63700L0;

    /* JADX INFO: renamed from: M0 */
    public erb0 f63701M0;

    /* JADX INFO: renamed from: N0 */
    public erb0 f63702N0;

    /* JADX INFO: renamed from: O0 */
    public float f63703O0;

    /* JADX INFO: renamed from: P0 */
    public float f63704P0;

    /* JADX INFO: renamed from: X */
    public float f63705X;

    /* JADX INFO: renamed from: Y */
    public ax8 f63706Y;

    /* JADX INFO: renamed from: Z */
    public VelocityTracker f63707Z;

    /* JADX INFO: renamed from: e */
    public Matrix f63708e;

    /* JADX INFO: renamed from: f */
    public Matrix f63709f;

    /* JADX INFO: renamed from: g */
    public erb0 f63710g;

    /* JADX INFO: renamed from: h */
    public erb0 f63711h;

    /* JADX INFO: renamed from: i */
    public float f63712i;

    /* JADX INFO: renamed from: t */
    public float f63713t;

    /* JADX INFO: renamed from: e */
    public static float m40194e(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: a */
    public final erb0 m40195a(float f, float f2) {
        xw8 xw8Var = this.f63203d;
        pkc1 viewPortHandler = xw8Var.getViewPortHandler();
        float f3 = f - viewPortHandler.f178432b.left;
        m40196b();
        return erb0.m39774b(f3, -((xw8Var.getMeasuredHeight() - f2) - (viewPortHandler.f178434d - viewPortHandler.f178432b.bottom)));
    }

    /* JADX INFO: renamed from: b */
    public final void m40196b() {
        xw8 xw8Var = this.f63203d;
        if (this.f63706Y == null) {
            xw8Var.f53889s1.getClass();
            xw8Var.f53890t1.getClass();
        }
        ax8 ax8Var = this.f63706Y;
        if (ax8Var != null) {
            xw8Var.m37199g(ax8Var.f20786d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m40197c(MotionEvent motionEvent) {
        this.f63708e.set(this.f63709f);
        this.f63203d.getOnChartGestureListener();
        m40196b();
        float x = motionEvent.getX();
        erb0 erb0Var = this.f63710g;
        this.f63708e.postTranslate(x - erb0Var.f62074b, motionEvent.getY() - erb0Var.f62075c);
    }

    /* JADX INFO: renamed from: d */
    public final void m40198d(MotionEvent motionEvent) {
        this.f63709f.set(this.f63708e);
        erb0 erb0Var = this.f63710g;
        erb0Var.f62074b = motionEvent.getX();
        erb0Var.f62075c = motionEvent.getY();
        xw8 xw8Var = this.f63203d;
        bs20 bs20VarMo92132b = xw8Var.mo92132b(motionEvent.getX(), motionEvent.getY());
        this.f63706Y = bs20VarMo92132b != null ? (ax8) ((fx8) xw8Var.f266064b).m97016b(bs20VarMo92132b.f30220e) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        xw8 xw8Var = this.f63203d;
        xw8Var.getOnChartGestureListener();
        if (xw8Var.f53877g1 && ((fx8) xw8Var.getData()).m97018d() > 0) {
            erb0 erb0VarM40195a = m40195a(motionEvent.getX(), motionEvent.getY());
            float f = xw8Var.f53880j1 ? 1.4f : 1.0f;
            float f2 = xw8Var.f53881k1 ? 1.4f : 1.0f;
            float f3 = erb0VarM40195a.f62074b;
            float f4 = erb0VarM40195a.f62075c;
            pkc1 pkc1Var = xw8Var.f266054S0;
            Matrix matrix = xw8Var.f53870A1;
            pkc1Var.getClass();
            matrix.reset();
            matrix.set(pkc1Var.f178431a);
            matrix.postScale(f, f2, f3, -f4);
            pkc1Var.m70188d(matrix, xw8Var, false);
            xw8Var.mo37196a();
            xw8Var.postInvalidate();
            boolean z = xw8Var.f266062a;
            erb0.f62073d.m45275c(erb0VarM40195a);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f63203d.getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f63203d.getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        xw8 xw8Var = this.f63203d;
        xw8Var.getOnChartGestureListener();
        if (!xw8Var.f266066c) {
            return false;
        }
        bs20 bs20VarMo92132b = xw8Var.mo92132b(motionEvent.getX(), motionEvent.getY());
        if (bs20VarMo92132b == null || bs20VarMo92132b.m30344a(this.f63201b)) {
            xw8Var.m92133c(null);
            this.f63201b = null;
        } else {
            xw8Var.m92133c(bs20VarMo92132b);
            this.f63201b = bs20VarMo92132b;
        }
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x018f  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        bs20 bs20VarMo92132b;
        VelocityTracker velocityTracker;
        erb0 erb0Var = this.f63702N0;
        erb0 erb0Var2 = this.f63701M0;
        erb0 erb0Var3 = this.f63710g;
        erb0 erb0Var4 = this.f63711h;
        dx8 dx8Var = this.f63203d;
        if (this.f63707Z == null) {
            this.f63707Z = VelocityTracker.obtain();
        }
        this.f63707Z.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f63707Z) != null) {
            velocityTracker.recycle();
            this.f63707Z = null;
        }
        if (this.f63200a == 0) {
            this.f63202c.onTouchEvent(motionEvent);
        }
        if (!dx8Var.f53879i1 && !dx8Var.f53880j1 && !dx8Var.f53881k1) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            int i = 0;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.f63707Z;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, u0b1.f225437c);
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > u0b1.f225436b || Math.abs(yVelocity) > u0b1.f225436b) && this.f63200a == 1 && dx8Var.f266068d) {
                    erb0Var.f62074b = 0.0f;
                    erb0Var.f62075c = 0.0f;
                    this.f63700L0 = AnimationUtils.currentAnimationTimeMillis();
                    erb0Var2.f62074b = motionEvent.getX();
                    erb0Var2.f62075c = motionEvent.getY();
                    erb0Var.f62074b = xVelocity;
                    erb0Var.f62075c = yVelocity;
                    dx8Var.postInvalidateOnAnimation();
                }
                int i2 = this.f63200a;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    dx8Var.mo37196a();
                    dx8Var.postInvalidate();
                }
                this.f63200a = 0;
                ViewParent parent = dx8Var.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f63707Z;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f63707Z = null;
                }
                dx8Var.getOnChartGestureListener();
            } else if (action == 2) {
                int i3 = this.f63200a;
                if (i3 == 1) {
                    ViewParent parent2 = dx8Var.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    m40197c(motionEvent);
                } else {
                    if (i3 == 2 || i3 == 3 || i3 == 4) {
                        ViewParent parent3 = dx8Var.getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        if (dx8Var.f53880j1 || dx8Var.f53881k1) {
                            Matrix matrix = this.f63709f;
                            if (motionEvent.getPointerCount() >= 2) {
                                dx8Var.getOnChartGestureListener();
                                float fM40194e = m40194e(motionEvent);
                                if (fM40194e > this.f63704P0) {
                                    erb0 erb0VarM40195a = m40195a(erb0Var4.f62074b, erb0Var4.f62075c);
                                    pkc1 viewPortHandler = dx8Var.getViewPortHandler();
                                    int i4 = this.f63200a;
                                    if (i4 == 4) {
                                        float f = fM40194e / this.f63705X;
                                        boolean z = f < 1.0f;
                                        boolean z2 = !z ? viewPortHandler.f178439i >= viewPortHandler.f178438h : viewPortHandler.f178439i <= viewPortHandler.f178437g;
                                        if (!z ? viewPortHandler.f178440j < viewPortHandler.f178436f : viewPortHandler.f178440j > viewPortHandler.f178435e) {
                                            i = 1;
                                        }
                                        float f2 = dx8Var.f53880j1 ? f : 1.0f;
                                        float f3 = dx8Var.f53881k1 ? f : 1.0f;
                                        if (i != 0 || z2) {
                                            this.f63708e.set(matrix);
                                            this.f63708e.postScale(f2, f3, erb0VarM40195a.f62074b, erb0VarM40195a.f62075c);
                                        }
                                    } else if (i4 == 2 && dx8Var.f53880j1) {
                                        float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.f63712i;
                                        if (fAbs >= 1.0f ? viewPortHandler.f178439i < viewPortHandler.f178438h : viewPortHandler.f178439i > viewPortHandler.f178437g) {
                                            this.f63708e.set(matrix);
                                            this.f63708e.postScale(fAbs, 1.0f, erb0VarM40195a.f62074b, erb0VarM40195a.f62075c);
                                        }
                                    } else if (i4 == 3 && dx8Var.f53881k1) {
                                        float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.f63713t;
                                        if (fAbs2 >= 1.0f ? viewPortHandler.f178440j < viewPortHandler.f178436f : viewPortHandler.f178440j > viewPortHandler.f178435e) {
                                            this.f63708e.set(matrix);
                                            this.f63708e.postScale(1.0f, fAbs2, erb0VarM40195a.f62074b, erb0VarM40195a.f62075c);
                                        }
                                    }
                                    erb0.f62073d.m45275c(erb0VarM40195a);
                                }
                            }
                        }
                    } else if (i3 == 0) {
                        float x = motionEvent.getX() - erb0Var3.f62074b;
                        float y = motionEvent.getY() - erb0Var3.f62075c;
                        if (Math.abs((float) Math.sqrt((y * y) + (x * x))) > this.f63703O0) {
                            pkc1 pkc1Var = dx8Var.f266054S0;
                            if (pkc1Var.f178442l <= 0.0f && pkc1Var.f178443m <= 0.0f) {
                                float f4 = pkc1Var.f178439i;
                                float f5 = pkc1Var.f178437g;
                                if (f4 <= f5 && f5 <= 1.0f) {
                                    float f6 = pkc1Var.f178440j;
                                    float f7 = pkc1Var.f178435e;
                                    if (f6 > f7 || f7 > 1.0f) {
                                        if (dx8Var.f53879i1) {
                                            this.f63200a = 1;
                                        } else if (dx8Var.f53878h1) {
                                            this.f63201b = bs20VarMo92132b;
                                            dx8Var.m92133c(bs20VarMo92132b);
                                        }
                                    } else if (dx8Var.f53878h1) {
                                        this.f63201b = bs20VarMo92132b;
                                        dx8Var.m92133c(bs20VarMo92132b);
                                    }
                                } else if (dx8Var.f53879i1) {
                                    this.f63200a = 1;
                                } else if (dx8Var.f53878h1 && (bs20VarMo92132b = dx8Var.mo92132b(motionEvent.getX(), motionEvent.getY())) != null && !bs20VarMo92132b.m30344a(this.f63201b)) {
                                    this.f63201b = bs20VarMo92132b;
                                    dx8Var.m92133c(bs20VarMo92132b);
                                }
                            } else if (dx8Var.f53879i1) {
                                this.f63200a = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.f63200a = 0;
                dx8Var.getOnChartGestureListener();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker4 = this.f63707Z;
                    velocityTracker4.computeCurrentVelocity(1000, u0b1.f225437c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float xVelocity2 = velocityTracker4.getXVelocity(pointerId2);
                    float yVelocity2 = velocityTracker4.getYVelocity(pointerId2);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        if (i != actionIndex) {
                            int pointerId3 = motionEvent.getPointerId(i);
                            if ((velocityTracker4.getYVelocity(pointerId3) * yVelocity2) + (velocityTracker4.getXVelocity(pointerId3) * xVelocity2) < 0.0f) {
                                velocityTracker4.clear();
                                break;
                            }
                        }
                        i++;
                    }
                    this.f63200a = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent4 = dx8Var.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(true);
                }
                m40198d(motionEvent);
                this.f63712i = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.f63713t = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fM40194e2 = m40194e(motionEvent);
                this.f63705X = fM40194e2;
                if (fM40194e2 > 10.0f) {
                    if (dx8Var.f53876f1) {
                        this.f63200a = 4;
                    } else {
                        boolean z3 = dx8Var.f53880j1;
                        if (z3 != dx8Var.f53881k1) {
                            this.f63200a = z3 ? 2 : 3;
                        } else {
                            this.f63200a = this.f63712i > this.f63713t ? 2 : 3;
                        }
                    }
                }
                float x2 = motionEvent.getX(1) + motionEvent.getX(0);
                float y2 = motionEvent.getY(1) + motionEvent.getY(0);
                erb0Var4.f62074b = x2 / 2.0f;
                erb0Var4.f62075c = y2 / 2.0f;
            }
        } else {
            dx8Var.getOnChartGestureListener();
            erb0Var.f62074b = 0.0f;
            erb0Var.f62075c = 0.0f;
            m40198d(motionEvent);
        }
        pkc1 viewPortHandler2 = dx8Var.getViewPortHandler();
        Matrix matrix2 = this.f63708e;
        viewPortHandler2.m70188d(matrix2, dx8Var, true);
        this.f63708e = matrix2;
        return true;
    }
}
