package p204p;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class wj5 extends tj5 {

    /* JADX INFO: renamed from: a */
    public Object[] f251847a;

    /* JADX INFO: renamed from: b */
    public int f251848b;

    @Override // p204p.tj5
    /* JADX INFO: renamed from: a */
    public final int mo80970a() {
        return this.f251848b;
    }

    @Override // p204p.tj5
    /* JADX INFO: renamed from: b */
    public final void mo80971b(int i, o25 o25Var) {
        Object[] objArr = this.f251847a;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            this.f251847a = Arrays.copyOf(this.f251847a, length);
        }
        Object[] objArr2 = this.f251847a;
        if (objArr2[i] == null) {
            this.f251848b++;
        }
        objArr2[i] = o25Var;
    }

    @Override // p204p.tj5
    public final Object get(int i) {
        return bk5.m29587J0(i, this.f251847a);
    }

    @Override // p204p.tj5, java.lang.Iterable
    public final Iterator iterator() {
        return new vj5(this);
    }
}
