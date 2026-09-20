package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class irh extends a600 {

    /* JADX INFO: renamed from: b */
    public final Object f104990b;

    public irh(Map map) {
        this.f104990b = map;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.a600
    /* JADX INFO: renamed from: a */
    public final i500 mo24828a(ClassLoader classLoader, String str) {
        Class clsM24827c = a600.m24827c(classLoader, str);
        a800 a800Var = (a800) this.f104990b.get(clsM24827c);
        try {
            return a800Var != null ? a800Var.mo25006a() : super.mo24828a(classLoader, str);
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length + 2;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
            for (int i = 0; i < length; i++) {
                stackTraceElementArr[i] = null;
            }
            System.arraycopy(stackTrace, 0, stackTraceElementArr, 2, stackTrace.length);
            stackTraceElementArr[0] = new StackTraceElement(clsM24827c.getName(), "", "", 0);
            stackTraceElementArr[1] = new StackTraceElement("[[ Failed to instantiate fragment ↑↑ ]] ", "", "", 0);
            th.setStackTrace(stackTraceElementArr);
            if (a800Var != null) {
                throw th;
            }
            na6.m63969q(th);
            return new i500();
        }
    }
}
