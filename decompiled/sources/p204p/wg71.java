package p204p;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class wg71 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f251002b = AtomicIntegerFieldUpdater.newUpdater(wg71.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public d6x[] f251003a;

    /* JADX INFO: renamed from: a */
    public final void m88009a(d6x d6xVar) {
        d6xVar.m35158c((e6x) this);
        d6x[] d6xVarArr = this.f251003a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f251002b;
        if (d6xVarArr == null) {
            d6xVarArr = new d6x[4];
            this.f251003a = d6xVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= d6xVarArr.length) {
            d6xVarArr = (d6x[]) Arrays.copyOf(d6xVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f251003a = d6xVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        d6xVarArr[i] = d6xVar;
        d6xVar.f45919b = i;
        m88011c(i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final d6x m88010b(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f251003a;
        wj50.m88279p(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f251002b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m88012d(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                d6x d6xVar = objArr2[i];
                wj50.m88279p(d6xVar);
                Object obj2 = objArr2[i5];
                wj50.m88279p(obj2);
                if (d6xVar.compareTo(obj2) < 0) {
                    m88012d(i, i5);
                    m88011c(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f251003a;
                        wj50.m88279p(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            wj50.m88279p(comparable3);
                            obj = objArr[i3];
                            wj50.m88279p(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        wj50.m88279p(comparable);
                        comparable2 = objArr[i4];
                        wj50.m88279p(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        m88012d(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f251003a;
                    wj50.m88279p(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        wj50.m88279p(comparable3);
                        obj = objArr[i3];
                        wj50.m88279p(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    wj50.m88279p(comparable);
                    comparable2 = objArr[i4];
                    wj50.m88279p(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    m88012d(i, i4);
                    i = i4;
                }
            }
        }
        d6x d6xVar2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        wj50.m88279p(d6xVar2);
        d6xVar2.m35158c(null);
        d6xVar2.f45919b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return d6xVar2;
    }

    /* JADX INFO: renamed from: c */
    public final void m88011c(int i) {
        while (i > 0) {
            d6x[] d6xVarArr = this.f251003a;
            wj50.m88279p(d6xVarArr);
            int i2 = (i - 1) / 2;
            d6x d6xVar = d6xVarArr[i2];
            wj50.m88279p(d6xVar);
            d6x d6xVar2 = d6xVarArr[i];
            wj50.m88279p(d6xVar2);
            if (d6xVar.compareTo(d6xVar2) <= 0) {
                return;
            }
            m88012d(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88012d(int i, int i2) {
        d6x[] d6xVarArr = this.f251003a;
        wj50.m88279p(d6xVarArr);
        d6x d6xVar = d6xVarArr[i2];
        wj50.m88279p(d6xVar);
        d6x d6xVar2 = d6xVarArr[i];
        wj50.m88279p(d6xVar2);
        d6xVarArr[i] = d6xVar;
        d6xVarArr[i2] = d6xVar2;
        d6xVar.f45919b = i;
        d6xVar2.f45919b = i2;
    }
}
