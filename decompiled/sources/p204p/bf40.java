package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf40 extends cf40 {

    /* JADX INFO: renamed from: a */
    public Object[] f26543a;

    /* JADX INFO: renamed from: b */
    public int f26544b;

    /* JADX INFO: renamed from: c */
    public boolean f26545c;

    public bf40(int i) {
        ddg1.m35736g(i, "initialCapacity");
        this.f26543a = new Object[i];
        this.f26544b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m28985c(Object obj) {
        obj.getClass();
        m28988f(1);
        Object[] objArr = this.f26543a;
        int i = this.f26544b;
        this.f26544b = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m28986d(Object... objArr) {
        int length = objArr.length;
        jhl0.m53415i(length, objArr);
        m28988f(length);
        System.arraycopy(objArr, 0, this.f26543a, this.f26544b, length);
        this.f26544b += length;
    }

    /* JADX INFO: renamed from: e */
    public final void m28987e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m28988f(collection.size());
            if (collection instanceof ef40) {
                this.f26544b = ((ef40) collection).mo38715b(this.f26544b, this.f26543a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo32618a(it.next());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m28988f(int i) {
        Object[] objArr = this.f26543a;
        int iM32617b = cf40.m32617b(objArr.length, this.f26544b + i);
        if (iM32617b > objArr.length || this.f26545c) {
            this.f26543a = Arrays.copyOf(this.f26543a, iM32617b);
            this.f26545c = false;
        }
    }
}
