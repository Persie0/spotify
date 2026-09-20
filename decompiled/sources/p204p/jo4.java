package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class jo4 extends bvw0 {

    /* JADX INFO: renamed from: g */
    public static boolean f114292g;

    /* JADX INFO: renamed from: a */
    public static void m53859a(n94 n94Var, String str, Collection collection, deb1 deb1Var, int i, nt4 nt4Var, CronetException cronetException) {
        jo4 jo4Var = new jo4(str, collection, new eul(), i, nt4Var, cronetException);
        n94Var.getClass();
        ArrayList<deb1> arrayList = new ArrayList();
        synchronized (n94Var.f151701b) {
            arrayList.addAll(n94Var.f151701b.values());
        }
        if (deb1Var != null) {
            arrayList.add(deb1Var);
        }
        for (deb1 deb1Var2 : arrayList) {
            try {
                deb1Var2.f48050a.getExecutor().execute(new fr2(3, deb1Var2, jo4Var));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!f114292g) {
            f114292g = true;
        }
        return this.f31454c;
    }
}
