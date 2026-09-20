package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zuc {

    /* JADX INFO: renamed from: a */
    public float f286405a;

    /* JADX INFO: renamed from: b */
    public float f286406b;

    /* JADX INFO: renamed from: c */
    public float f286407c;

    /* JADX INFO: renamed from: d */
    public float f286408d;

    /* JADX INFO: renamed from: e */
    public float f286409e;

    /* JADX INFO: renamed from: f */
    public float f286410f;

    /* JADX INFO: renamed from: g */
    public float f286411g;

    /* JADX INFO: renamed from: h */
    public float f286412h;

    /* JADX INFO: renamed from: i */
    public ArrayList f286413i;

    /* JADX INFO: renamed from: a */
    public final void m97015a() {
        qu30 qu30Var;
        qu30 qu30Var2;
        ArrayList<qu30> arrayList = this.f286413i;
        if (arrayList == null) {
            return;
        }
        this.f286405a = -3.4028235E38f;
        this.f286406b = Float.MAX_VALUE;
        this.f286407c = -3.4028235E38f;
        this.f286408d = Float.MAX_VALUE;
        for (qu30 qu30Var3 : arrayList) {
            float f = this.f286405a;
            ax8 ax8Var = (ax8) qu30Var3;
            float f2 = ax8Var.f20798p;
            if (f < f2) {
                this.f286405a = f2;
            }
            float f3 = this.f286406b;
            float f4 = ax8Var.f20799q;
            if (f3 > f4) {
                this.f286406b = f4;
            }
            float f5 = this.f286407c;
            float f6 = ax8Var.f20800r;
            if (f5 < f6) {
                this.f286407c = f6;
            }
            float f7 = this.f286408d;
            float f8 = ax8Var.f20801s;
            if (f7 > f8) {
                this.f286408d = f8;
            }
            if (((ax8) qu30Var3).f20786d == 1) {
                if (this.f286409e < f2) {
                    this.f286409e = f2;
                }
                if (this.f286410f > f4) {
                    this.f286410f = f4;
                }
            } else {
                if (this.f286411g < f2) {
                    this.f286411g = f2;
                }
                if (this.f286412h > f4) {
                    this.f286412h = f4;
                }
            }
        }
        this.f286409e = -3.4028235E38f;
        this.f286410f = Float.MAX_VALUE;
        this.f286411g = -3.4028235E38f;
        this.f286412h = Float.MAX_VALUE;
        Iterator it = arrayList.iterator();
        do {
            qu30Var = null;
            if (!it.hasNext()) {
                qu30Var2 = null;
                break;
            }
            qu30Var2 = (qu30) it.next();
        } while (((ax8) qu30Var2).f20786d != 1);
        if (qu30Var2 != null) {
            ax8 ax8Var2 = (ax8) qu30Var2;
            this.f286409e = ax8Var2.f20798p;
            this.f286410f = ax8Var2.f20799q;
            for (qu30 qu30Var4 : arrayList) {
                if (((ax8) qu30Var4).f20786d == 1) {
                    ax8 ax8Var3 = (ax8) qu30Var4;
                    float f9 = ax8Var3.f20799q;
                    if (f9 < this.f286410f) {
                        this.f286410f = f9;
                    }
                    float f10 = ax8Var3.f20798p;
                    if (f10 > this.f286409e) {
                        this.f286409e = f10;
                    }
                }
            }
        }
        for (qu30 qu30Var5 : arrayList) {
            if (((ax8) qu30Var5).f20786d == 2) {
                qu30Var = qu30Var5;
                break;
            }
        }
        if (qu30Var != null) {
            ax8 ax8Var4 = (ax8) qu30Var;
            this.f286411g = ax8Var4.f20798p;
            this.f286412h = ax8Var4.f20799q;
            for (qu30 qu30Var6 : arrayList) {
                if (((ax8) qu30Var6).f20786d == 2) {
                    ax8 ax8Var5 = (ax8) qu30Var6;
                    float f11 = ax8Var5.f20799q;
                    if (f11 < this.f286412h) {
                        this.f286412h = f11;
                    }
                    float f12 = ax8Var5.f20798p;
                    if (f12 > this.f286411g) {
                        this.f286411g = f12;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final qu30 m97016b(int i) {
        ArrayList arrayList = this.f286413i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (qu30) arrayList.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final int m97017c() {
        ArrayList arrayList = this.f286413i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final int m97018d() {
        Iterator it = this.f286413i.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((ax8) ((qu30) it.next())).f20797o.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: e */
    public final float m97019e(int i) {
        if (i == 1) {
            float f = this.f286409e;
            return f == -3.4028235E38f ? this.f286411g : f;
        }
        float f2 = this.f286411g;
        return f2 == -3.4028235E38f ? this.f286409e : f2;
    }

    /* JADX INFO: renamed from: f */
    public final float m97020f(int i) {
        if (i == 1) {
            float f = this.f286410f;
            return f == Float.MAX_VALUE ? this.f286412h : f;
        }
        float f2 = this.f286412h;
        return f2 == Float.MAX_VALUE ? this.f286410f : f2;
    }
}
