package p204p;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e6q0 {

    /* JADX INFO: renamed from: a */
    public final Object f56704a;

    /* JADX INFO: renamed from: b */
    public final C1668ai f56705b;

    /* JADX INFO: renamed from: c */
    public final int f56706c;

    /* JADX INFO: renamed from: d */
    public final int f56707d;

    /* JADX INFO: renamed from: e */
    public final int f56708e;

    /* JADX INFO: renamed from: f */
    public int f56709f;

    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    public e6q0(List list, C1668ai c1668ai) {
        MotionEvent motionEventM37955a;
        this.f56704a = list;
        this.f56705b = c1668ai;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.f56706c = (i < 29 || (motionEventM37955a = m37955a()) == null) ? 0 : motionEventM37955a.getClassification();
        MotionEvent motionEventM37955a2 = m37955a();
        this.f56707d = motionEventM37955a2 != null ? motionEventM37955a2.getButtonState() : 0;
        MotionEvent motionEventM37955a3 = m37955a();
        this.f56708e = motionEventM37955a3 != null ? motionEventM37955a3.getMetaState() : 0;
        MotionEvent motionEventM37955a4 = m37955a();
        if (motionEventM37955a4 != null) {
            boolean z = i >= 29 && motionEventM37955a4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventM37955a4.getClassification() == 5;
            int actionMasked = motionEventM37955a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                } else {
                    i2 = 2;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            } else {
                i2 = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    k6q0 k6q0Var = (k6q0) list.get(i2);
                    if (ex60.m40178l(k6q0Var)) {
                        i2 = 2;
                    } else if (ex60.m40176j(k6q0Var)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.f56709f = i2;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m37955a() {
        C1668ai c1668ai = this.f56705b;
        if (c1668ai != null) {
            return c1668ai.m26016B();
        }
        return null;
    }
}
