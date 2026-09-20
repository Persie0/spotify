package p204p;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class tlv0 implements Map, pq60 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f221528a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f221529b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final ReentrantReadWriteLock f221530c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: a */
    public final void m81073a(k35 k35Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f221530c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ((AtomicInteger) this.f221529b.computeIfAbsent(k35Var, klr0.f123946c)).incrementAndGet();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81074b(k35 k35Var, pjo pjoVar) {
        LinkedHashMap linkedHashMap = this.f221528a;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f221530c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (!this.f221529b.containsKey(k35Var)) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            if ((linkedHashMap.get(k35Var) instanceof ojo) && !(pjoVar instanceof ojo)) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            linkedHashMap.put(k35Var, pjoVar);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81075c(k35 k35Var) {
        boolean z;
        LinkedHashMap linkedHashMap = this.f221529b;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f221530c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(k35Var);
            if (atomicInteger == null) {
                throw new IllegalStateException("The key " + k35Var + " is not active");
            }
            if (atomicInteger.decrementAndGet() == 0) {
                linkedHashMap.remove(k35Var);
                this.f221528a.remove(k35Var);
                z = true;
            } else {
                z = false;
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return z;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return this.f221529b.containsKey(obj);
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof pjo)) {
            return false;
        }
        pjo pjoVar = (pjo) obj;
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return this.f221528a.containsValue(pjoVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return g6f.m43736n1(this.f221528a.entrySet());
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            pjo pjoVar = (pjo) this.f221528a.get(obj);
            if (pjoVar == null) {
                pjoVar = this.f221529b.containsKey(obj) ? njo.f154639a : null;
            }
            return pjoVar;
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return this.f221529b.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return g6f.m43736n1(this.f221529b.keySet());
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return this.f221529b.size();
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ReentrantReadWriteLock.ReadLock lock = this.f221530c.readLock();
        lock.lock();
        try {
            return g6f.m43728j1(this.f221528a.values());
        } finally {
            lock.unlock();
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
