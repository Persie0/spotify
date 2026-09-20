package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cgo {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f37752a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static pgo m32732a() {
        pgo pgoVar = (pgo) f37752a.get();
        if (pgoVar != null) {
            return pgoVar;
        }
        throw new IllegalStateException("DataPool accessed outside of data loading scope. Elements must be created within DataLoadingScope.withDataPool { } or attachDataElement { }.");
    }

    /* JADX INFO: renamed from: b */
    public static Object m32733b(pgo pgoVar, eh00 eh00Var) {
        ThreadLocal threadLocal = f37752a;
        pgo pgoVar2 = (pgo) threadLocal.get();
        threadLocal.set(pgoVar);
        try {
            Object objInvoke = eh00Var.invoke();
        } finally {
            if (pgoVar2 != null) {
                threadLocal.set(pgoVar2);
            } else {
                threadLocal.remove();
            }
        }
    }
}
