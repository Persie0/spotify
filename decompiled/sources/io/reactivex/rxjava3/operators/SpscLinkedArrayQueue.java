package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.internal.util.Pow2;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {

    /* JADX INFO: renamed from: i */
    public static final int f10297i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: t */
    public static final Object f10298t = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f10299a;

    /* JADX INFO: renamed from: b */
    public final int f10300b;

    /* JADX INFO: renamed from: c */
    public long f10301c;

    /* JADX INFO: renamed from: d */
    public final int f10302d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray f10303e;

    /* JADX INFO: renamed from: f */
    public final int f10304f;

    /* JADX INFO: renamed from: g */
    public AtomicReferenceArray f10305g;

    /* JADX INFO: renamed from: h */
    public final AtomicLong f10306h;

    public SpscLinkedArrayQueue(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f10299a = atomicLong;
        this.f10306h = new AtomicLong();
        int iM23770a = Pow2.m23770a(Math.max(8, i));
        int i2 = iM23770a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iM23770a + 1);
        this.f10303e = atomicReferenceArray;
        this.f10302d = i2;
        this.f10300b = Math.min(iM23770a / 4, f10297i);
        this.f10305g = atomicReferenceArray;
        this.f10304f = i2;
        this.f10301c = iM23770a - 2;
        atomicLong.lazySet(0L);
    }

    /* JADX INFO: renamed from: b */
    public final void m23779b(Serializable serializable, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f10303e;
        AtomicLong atomicLong = this.f10299a;
        long j = atomicLong.get();
        long j2 = 2 + j;
        int i = this.f10302d;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, obj);
            atomicReferenceArray.lazySet(i2, serializable);
            atomicLong.lazySet(j2);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f10303e = atomicReferenceArray2;
        int i3 = ((int) j) & i;
        atomicReferenceArray2.lazySet(i3 + 1, obj);
        atomicReferenceArray2.lazySet(i3, serializable);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f10298t);
        atomicLong.lazySet(j2);
    }

    /* JADX INFO: renamed from: c */
    public final Object m23780c() {
        AtomicReferenceArray atomicReferenceArray = this.f10305g;
        int i = (int) this.f10306h.get();
        int i2 = this.f10304f;
        int i3 = i & i2;
        Object obj = atomicReferenceArray.get(i3);
        if (obj != f10298t) {
            return obj;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.f10305g = atomicReferenceArray2;
        return atomicReferenceArray2.get(i3);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.f10299a.get() == this.f10306h.get();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f10303e;
        AtomicLong atomicLong = this.f10299a;
        long j = atomicLong.get();
        int i = this.f10302d;
        int i2 = ((int) j) & i;
        if (j < this.f10301c) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.f10300b) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f10301c = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f10303e = atomicReferenceArray2;
        this.f10301c = (j + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, f10298t);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f10305g;
        AtomicLong atomicLong = this.f10306h;
        long j = atomicLong.get();
        int i = this.f10304f;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == f10298t;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.f10305g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
