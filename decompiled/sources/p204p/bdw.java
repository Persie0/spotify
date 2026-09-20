package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bdw {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo25630a(Object obj, Object obj2);

    /* JADX INFO: renamed from: b */
    public abstract int mo25631b(Object obj);

    /* JADX INFO: renamed from: c */
    public final boolean m28859c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo25630a(obj, obj2);
    }
}
