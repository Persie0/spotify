package p204p;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class lqz implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f136162a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f136163b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f136164c;

    /* JADX INFO: renamed from: d */
    public final vb5 f136165d;

    public lqz(boolean z, vb5 vb5Var) {
        this.f136164c = z;
        this.f136165d = vb5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f136165d.getClass();
        Rect rect = this.f136162a;
        vb5.m85120u(obj, rect);
        Rect rect2 = this.f136163b;
        vb5.m85120u(obj2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f136164c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
