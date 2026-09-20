package p204p;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t4b1 extends u4b1 {

    /* JADX INFO: renamed from: a */
    public final Matrix f216961a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f216962b;

    /* JADX INFO: renamed from: c */
    public float f216963c;

    /* JADX INFO: renamed from: d */
    public float f216964d;

    /* JADX INFO: renamed from: e */
    public float f216965e;

    /* JADX INFO: renamed from: f */
    public float f216966f;

    /* JADX INFO: renamed from: g */
    public float f216967g;

    /* JADX INFO: renamed from: h */
    public float f216968h;

    /* JADX INFO: renamed from: i */
    public float f216969i;

    /* JADX INFO: renamed from: j */
    public final Matrix f216970j;

    /* JADX INFO: renamed from: k */
    public String f216971k;

    public t4b1() {
        this.f216961a = new Matrix();
        this.f216962b = new ArrayList();
        this.f216963c = 0.0f;
        this.f216964d = 0.0f;
        this.f216965e = 0.0f;
        this.f216966f = 1.0f;
        this.f216967g = 1.0f;
        this.f216968h = 0.0f;
        this.f216969i = 0.0f;
        this.f216970j = new Matrix();
        this.f216971k = null;
    }

    @Override // p204p.u4b1
    /* JADX INFO: renamed from: a */
    public final boolean mo77192a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f216962b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((u4b1) arrayList.get(i)).mo77192a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p204p.u4b1
    /* JADX INFO: renamed from: b */
    public final boolean mo77193b(int[] iArr) {
        int i = 0;
        boolean zMo77193b = false;
        while (true) {
            ArrayList arrayList = this.f216962b;
            if (i >= arrayList.size()) {
                return zMo77193b;
            }
            zMo77193b |= ((u4b1) arrayList.get(i)).mo77193b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m80059c() {
        Matrix matrix = this.f216970j;
        matrix.reset();
        matrix.postTranslate(-this.f216964d, -this.f216965e);
        matrix.postScale(this.f216966f, this.f216967g);
        matrix.postRotate(this.f216963c, 0.0f, 0.0f);
        matrix.postTranslate(this.f216968h + this.f216964d, this.f216969i + this.f216965e);
    }

    public String getGroupName() {
        return this.f216971k;
    }

    public Matrix getLocalMatrix() {
        return this.f216970j;
    }

    public float getPivotX() {
        return this.f216964d;
    }

    public float getPivotY() {
        return this.f216965e;
    }

    public float getRotation() {
        return this.f216963c;
    }

    public float getScaleX() {
        return this.f216966f;
    }

    public float getScaleY() {
        return this.f216967g;
    }

    public float getTranslateX() {
        return this.f216968h;
    }

    public float getTranslateY() {
        return this.f216969i;
    }

    public void setPivotX(float f) {
        if (f != this.f216964d) {
            this.f216964d = f;
            m80059c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f216965e) {
            this.f216965e = f;
            m80059c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f216963c) {
            this.f216963c = f;
            m80059c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f216966f) {
            this.f216966f = f;
            m80059c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f216967g) {
            this.f216967g = f;
            m80059c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f216968h) {
            this.f216968h = f;
            m80059c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f216969i) {
            this.f216969i = f;
            m80059c();
        }
    }

    public t4b1(t4b1 t4b1Var, uj5 uj5Var) {
        v4b1 r4b1Var;
        this.f216961a = new Matrix();
        this.f216962b = new ArrayList();
        this.f216963c = 0.0f;
        this.f216964d = 0.0f;
        this.f216965e = 0.0f;
        this.f216966f = 1.0f;
        this.f216967g = 1.0f;
        this.f216968h = 0.0f;
        this.f216969i = 0.0f;
        Matrix matrix = new Matrix();
        this.f216970j = matrix;
        this.f216971k = null;
        this.f216963c = t4b1Var.f216963c;
        this.f216964d = t4b1Var.f216964d;
        this.f216965e = t4b1Var.f216965e;
        this.f216966f = t4b1Var.f216966f;
        this.f216967g = t4b1Var.f216967g;
        this.f216968h = t4b1Var.f216968h;
        this.f216969i = t4b1Var.f216969i;
        String str = t4b1Var.f216971k;
        this.f216971k = str;
        if (str != null) {
            uj5Var.put(str, this);
        }
        matrix.set(t4b1Var.f216970j);
        ArrayList arrayList = t4b1Var.f216962b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof t4b1) {
                this.f216962b.add(new t4b1((t4b1) obj, uj5Var));
            } else {
                if (obj instanceof s4b1) {
                    r4b1Var = new s4b1((s4b1) obj);
                } else if (obj instanceof r4b1) {
                    r4b1Var = new r4b1((r4b1) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f216962b.add(r4b1Var);
                Object obj2 = r4b1Var.f237111b;
                if (obj2 != null) {
                    uj5Var.put(obj2, r4b1Var);
                }
            }
        }
    }
}
