package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class t1i0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final u1i0 f216281a;

    /* JADX INFO: renamed from: b */
    public final int f216282b;

    /* JADX INFO: renamed from: c */
    public final int f216283c;

    public t1i0(Context context, u1i0 u1i0Var, XmlResourceParser xmlResourceParser) {
        this.f216282b = -1;
        this.f216283c = 17;
        this.f216281a = u1i0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), b2u0.f22710n);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f216282b = typedArrayObtainStyledAttributes.getResourceId(index, this.f216282b);
            } else if (index == 0) {
                this.f216283c = typedArrayObtainStyledAttributes.getInt(index, this.f216283c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m79877a(MotionLayout motionLayout, int i, u1i0 u1i0Var) {
        boolean z;
        View viewFindViewById;
        int i2 = this.f216282b;
        View view = motionLayout;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
        }
        if (view == null) {
            view = viewFindViewById;
            return;
        }
        int i3 = u1i0Var.f225832d;
        int i4 = u1i0Var.f225831c;
        if (i3 == -1) {
            view = viewFindViewById;
            view.setOnClickListener(this);
            return;
        }
        int i5 = this.f216283c;
        int i6 = i5 & 1;
        boolean z2 = false;
        if (i6 == 0 || i != i3) {
            view = viewFindViewById;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & 4096) != 0 && i == i4) {
            z2 = true;
        }
        if (z3 || z2) {
            view.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u1i0 u1i0Var = this.f216281a;
        v1i0 v1i0Var = u1i0Var.f225838j;
        MotionLayout motionLayout = v1i0Var.f236369a;
        if (motionLayout.f664a1) {
            if (u1i0Var.f225832d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.m339N(u1i0Var.f225831c);
                    return;
                }
                u1i0 u1i0Var2 = new u1i0(v1i0Var, u1i0Var);
                u1i0Var2.f225832d = currentState;
                u1i0Var2.f225831c = u1i0Var.f225831c;
                motionLayout.setTransition(u1i0Var2);
                motionLayout.m345z(1.0f);
                motionLayout.f646M1 = null;
                return;
            }
            u1i0 u1i0Var3 = v1i0Var.f236371c;
            int i = this.f216283c;
            int i2 = i & 1;
            boolean z = false;
            boolean z2 = true;
            boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
            int i3 = i & 16;
            if (i3 == 0 && (i & 4096) == 0) {
                z2 = false;
            }
            if (z3 && z2) {
                if (u1i0Var3 != u1i0Var) {
                    motionLayout.setTransition(u1i0Var);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z2 = false;
                    z = z3;
                }
            } else {
                z = z3;
            }
            if (u1i0Var != u1i0Var3) {
                int i4 = u1i0Var.f225831c;
                int i5 = u1i0Var.f225832d;
                if (i5 != -1) {
                    int i6 = motionLayout.f660W0;
                    if (i6 != i5 && i6 != i4) {
                        return;
                    }
                } else if (motionLayout.f660W0 == i4) {
                    return;
                }
            }
            if (z && i2 != 0) {
                motionLayout.setTransition(u1i0Var);
                motionLayout.m345z(1.0f);
                motionLayout.f646M1 = null;
                return;
            }
            if (z2 && i3 != 0) {
                motionLayout.setTransition(u1i0Var);
                motionLayout.m345z(0.0f);
            } else if (z && (i & 256) != 0) {
                motionLayout.setTransition(u1i0Var);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z2 || (i & 4096) == 0) {
                    return;
                }
                motionLayout.setTransition(u1i0Var);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
