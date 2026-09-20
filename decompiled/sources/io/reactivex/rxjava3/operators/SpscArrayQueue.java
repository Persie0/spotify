package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {

    /* JADX INFO: renamed from: f */
    public static final Integer f10291f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a */
    public final int f10292a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f10293b;

    /* JADX INFO: renamed from: c */
    public long f10294c;

    /* JADX INFO: renamed from: d */
    public final AtomicLong f10295d;

    /* JADX INFO: renamed from: e */
    public final int f10296e;

    public SpscArrayQueue(int i) {
        super(Pow2.m23770a(i));
        this.f10292a = length() - 1;
        this.f10293b = new AtomicLong();
        this.f10295d = new AtomicLong();
        this.f10296e = Math.min(i / 4, f10291f.intValue());
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
        return this.f10293b.get() == this.f10295d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f10293b;
        long j = atomicLong.get();
        int i = this.f10292a;
        int i2 = ((int) j) & i;
        if (j >= this.f10294c) {
            long j2 = ((long) this.f10296e) + j;
            if (get(i & ((int) j2)) == null) {
                this.f10294c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.f10295d;
        long j = atomicLong.get();
        int i = ((int) j) & this.f10292a;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
