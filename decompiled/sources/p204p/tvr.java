package p204p;

import android.os.Process;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class tvr implements lhy0 {

    /* JADX INFO: renamed from: a */
    public static final tvr f224219a = new tvr();

    /* JADX INFO: renamed from: b */
    public static final Set f224220b = Collections.singleton("Zero");

    @Override // p204p.lhy0
    /* JADX INFO: renamed from: a */
    public final Object mo59007a(String str, eh00 eh00Var) {
        if (!f224220b.contains(str)) {
            return eh00Var.invoke();
        }
        int iMyTid = Process.myTid();
        try {
            int threadPriority = Process.getThreadPriority(iMyTid);
            if (threadPriority <= -4) {
                return eh00Var.invoke();
            }
            try {
                Process.setThreadPriority(iMyTid, -4);
                return eh00Var.invoke();
            } finally {
                try {
                    Process.setThreadPriority(iMyTid, threadPriority);
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            return eh00Var.invoke();
        }
    }
}
