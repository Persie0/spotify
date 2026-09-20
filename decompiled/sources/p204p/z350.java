package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class z350 implements Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final int f278778a;

    /* JADX INFO: renamed from: b */
    public final int f278779b;

    /* JADX INFO: renamed from: c */
    public final int f278780c;

    public z350(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f278778a = i;
        this.f278779b = xtm0.m92097r(i, i2, i3);
        this.f278780c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z350)) {
            return false;
        }
        if (isEmpty() && ((z350) obj).isEmpty()) {
            return true;
        }
        z350 z350Var = (z350) obj;
        return this.f278778a == z350Var.f278778a && this.f278779b == z350Var.f278779b && this.f278780c == z350Var.f278780c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f278778a * 31) + this.f278779b) * 31) + this.f278780c;
    }

    public boolean isEmpty() {
        int i = this.f278780c;
        int i2 = this.f278779b;
        int i3 = this.f278778a;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a450(this.f278778a, this.f278779b, this.f278780c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f278779b;
        int i2 = this.f278778a;
        int i3 = this.f278780c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
