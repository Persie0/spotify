package p204p;

import android.database.Observable;

/* JADX INFO: loaded from: classes.dex */
public final class ijv0 extends Observable {
    /* JADX INFO: renamed from: a */
    public final boolean m50837a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* JADX INFO: renamed from: b */
    public final void m50838b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo29357a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50839c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo29361e(i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m50840d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo29359c(i, i2, obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m50841e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo29360d(i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m50842f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo29362f(i, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m50843g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((jjv0) ((Observable) this).mObservers.get(size)).mo53574g();
        }
    }
}
