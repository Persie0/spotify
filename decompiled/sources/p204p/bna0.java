package p204p;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes11.dex */
public class bna0 implements y751 {

    /* JADX INFO: renamed from: d */
    public static final String f28742d;

    /* JADX INFO: renamed from: e */
    public static final sma0 f28743e;

    /* JADX INFO: renamed from: a */
    public final uc21 f28744a;

    /* JADX INFO: renamed from: b */
    public final r4z f28745b;

    /* JADX INFO: renamed from: c */
    public final String f28746c;

    static {
        String canonicalName = bna0.class.getCanonicalName();
        int iM88463M0 = wl51.m88463M0(canonicalName, ".", 0, 6);
        f28742d = iM88463M0 == -1 ? "" : canonicalName.substring(0, iM88463M0);
        f28743e = new sma0("NO_LOCKS", l6q.f130446X0);
    }

    public bna0(String str) {
        this(str, new f0m(new ReentrantLock(), 17));
    }

    /* JADX INFO: renamed from: e */
    public static void m29935e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(f28742d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    /* JADX INFO: renamed from: a */
    public final yma0 m29936a(eh00 eh00Var) {
        return new yma0(this, eh00Var);
    }

    /* JADX INFO: renamed from: b */
    public final vma0 m29937b(gh00 gh00Var) {
        return new vma0(this, new ConcurrentHashMap(3, 1.0f, 2), gh00Var, 1);
    }

    /* JADX INFO: renamed from: c */
    public final nwo m29938c(gh00 gh00Var) {
        return new nwo(this, new ConcurrentHashMap(3, 1.0f, 2), gh00Var, 2);
    }

    /* JADX INFO: renamed from: d */
    public ana0 mo29939d(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : klh.m56833e(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        m29935e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return dq60.m36616p(this.f28746c, ")", sb);
    }

    public bna0(String str, uc21 uc21Var) {
        r4z r4zVar = r4z.f195891Y;
        this.f28744a = uc21Var;
        this.f28745b = r4zVar;
        this.f28746c = str;
    }
}
