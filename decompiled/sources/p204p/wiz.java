package p204p;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes11.dex */
public final class wiz extends ahy0 {
    @Override // p204p.eg60
    /* JADX INFO: renamed from: U */
    public final boolean mo38782U(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return m38778Q(th);
    }
}
