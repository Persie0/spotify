package p204p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class zf60 implements in40 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f282240b = AtomicIntegerFieldUpdater.newUpdater(zf60.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f282241c = AtomicReferenceFieldUpdater.newUpdater(zf60.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f282242d = AtomicReferenceFieldUpdater.newUpdater(zf60.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final dnj0 f282243a;

    public zf60(dnj0 dnj0Var, Throwable th) {
        this.f282243a = dnj0Var;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m96000a(Throwable th) {
        Throwable thM96001c = m96001c();
        if (thM96001c == null) {
            f282241c.set(this, th);
            return;
        }
        if (th == thM96001c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f282242d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(s571.m77249h(obj, "State is "));
            }
            ((ArrayList) obj).add(th);
        } else {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }
    }

    @Override // p204p.in40
    /* JADX INFO: renamed from: b */
    public final dnj0 mo36480b() {
        return this.f282243a;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m96001c() {
        return (Throwable) f282241c.get(this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m96002d() {
        return m96001c() != null;
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m96003e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f282242d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(s571.m77249h(obj, "State is "));
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM96001c = m96001c();
        if (thM96001c != null) {
            arrayList.add(0, thM96001c);
        }
        if (th != null && !th.equals(thM96001c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, i091.f97177e);
        return arrayList;
    }

    @Override // p204p.in40
    public final boolean isActive() {
        return m96001c() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m96002d());
        sb.append(", completing=");
        sb.append(f282240b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m96001c());
        sb.append(", exceptions=");
        sb.append(f282242d.get(this));
        sb.append(", list=");
        sb.append(this.f282243a);
        sb.append(']');
        return sb.toString();
    }
}
