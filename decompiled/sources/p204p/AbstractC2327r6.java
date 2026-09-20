package p204p;

import java.util.Iterator;

/* JADX INFO: renamed from: p.r6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2327r6 implements rr60 {
    /* JADX INFO: renamed from: a */
    public abstract Object mo61921a();

    /* JADX INFO: renamed from: b */
    public abstract int mo61922b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Iterator mo60861c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract int mo24520d(Object obj);

    @Override // p204p.rr60
    public Object deserialize(fro froVar) {
        return m74832e(froVar, null);
    }

    /* JADX INFO: renamed from: e */
    public final Object m74832e(fro froVar, Object obj) {
        Object objMo24522g = obj != null ? mo24522g(obj) : mo61921a();
        int iMo61922b = mo61922b(objMo24522g);
        frh frhVarMo29814b = froVar.mo29814b(getDescriptor());
        frhVarMo29814b.getClass();
        while (true) {
            int iMo29816p = frhVarMo29814b.mo29816p(getDescriptor());
            if (iMo29816p == -1) {
                frhVarMo29814b.mo29813a(getDescriptor());
                return mo61923h(objMo24522g);
            }
            mo24521f(frhVarMo29814b, iMo29816p + iMo61922b, objMo24522g);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo24521f(frh frhVar, int i, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Object mo24522g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo61923h(Object obj);
}
