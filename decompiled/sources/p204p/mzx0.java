package p204p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class mzx0 implements fbk, zuk {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f148834b = AtomicReferenceFieldUpdater.newUpdater(mzx0.class, Object.class, "result");

    /* JADX INFO: renamed from: a */
    public final fbk f148835a;
    private volatile Object result;

    public mzx0(fbk fbkVar, yuk yukVar) {
        this.f148835a = fbkVar;
        this.result = yukVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m63268a() throws Throwable {
        yuk yukVar = yuk.f276404a;
        Object obj = this.result;
        yuk yukVar2 = yuk.f276405b;
        if (obj == yukVar2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f148834b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yukVar2, yukVar)) {
                if (atomicReferenceFieldUpdater.get(this) != yukVar2) {
                    obj = this.result;
                }
            }
            return yukVar;
        }
        if (obj == yuk.f276406c) {
            return yukVar;
        }
        if (obj instanceof c6x0) {
            throw ((c6x0) obj).f34640a;
        }
        return obj;
    }

    @Override // p204p.zuk
    public final zuk getCallerFrame() {
        fbk fbkVar = this.f148835a;
        if (fbkVar instanceof zuk) {
            return (zuk) fbkVar;
        }
        return null;
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return this.f148835a.getContext();
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            yuk yukVar = yuk.f276405b;
            if (obj2 == yukVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f148834b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, yukVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != yukVar) {
                    }
                }
                return;
            }
            yuk yukVar2 = yuk.f276404a;
            if (obj2 != yukVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f148834b;
            yuk yukVar3 = yuk.f276406c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, yukVar2, yukVar3)) {
                    this.f148835a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == yukVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f148835a;
    }

    public mzx0(fbk fbkVar) {
        this(fbkVar, yuk.f276405b);
    }
}
