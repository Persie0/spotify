package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class fg40 extends bf40 {

    /* JADX INFO: renamed from: d */
    public Object[] f69215d;

    /* JADX INFO: renamed from: e */
    public int f69216e;

    @Override // p204p.cf40
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ cf40 mo32618a(Object obj) {
        m41574g(obj);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public fg40 m41574g(Object obj) {
        obj.getClass();
        if (this.f69215d != null) {
            int iM47403m = hg40.m47403m(this.f26544b);
            Object[] objArr = this.f69215d;
            if (iM47403m <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM30840q = bxg1.m30840q(iHashCode);
                while (true) {
                    int i = iM30840q & length;
                    Object[] objArr2 = this.f69215d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f69216e += iHashCode;
                        m28985c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM30840q = i + 1;
                }
            }
        }
        this.f69215d = null;
        m28985c(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fg40 m41575h(Iterable iterable) {
        iterable.getClass();
        if (this.f69215d == null) {
            m28987e(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m41574g(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public hg40 m41576i() {
        hg40 hg40VarM47404n;
        int i = this.f26544b;
        if (i == 0) {
            int i2 = hg40.f91023c;
            return ftv0.f73317t;
        }
        if (i == 1) {
            Object obj = this.f26543a[0];
            Objects.requireNonNull(obj);
            int i3 = hg40.f91023c;
            return new zh21(obj);
        }
        if (this.f69215d == null || hg40.m47403m(i) != this.f69215d.length) {
            hg40VarM47404n = hg40.m47404n(this.f26544b, this.f26543a);
            this.f26544b = hg40VarM47404n.size();
        } else {
            int i4 = this.f26544b;
            Object[] objArrCopyOf = this.f26543a;
            int length = objArrCopyOf.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            int i5 = this.f69216e;
            Object[] objArr = this.f69215d;
            hg40VarM47404n = new ftv0(i5, objArr.length - 1, this.f26544b, objArrCopyOf, objArr);
        }
        this.f26545c = true;
        this.f69215d = null;
        return hg40VarM47404n;
    }
}
