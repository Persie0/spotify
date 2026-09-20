package p204p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class ujx {

    /* JADX INFO: renamed from: a */
    public final hmm0 f231170a;

    /* JADX INFO: renamed from: b */
    public final Handler f231171b;

    /* JADX INFO: renamed from: c */
    public final Map f231172c = n1h1.m63506p();

    public ujx(hmm0 hmm0Var, Handler handler) {
        this.f231170a = hmm0Var;
        this.f231171b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final in71 m83296a(long j, v4p0 v4p0Var) {
        long j2 = ((long) 15) * 1000;
        int i = ((int) (j / j2)) + 1;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = ((long) i2) * j2;
        }
        return m83297b(jArr, false, v4p0Var);
    }

    /* JADX INFO: renamed from: b */
    public final in71 m83297b(long[] jArr, boolean z, v4p0 v4p0Var) {
        if (jArr.length == 0) {
            return null;
        }
        in71 in71Var = new in71();
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            if (j >= 0) {
                arrayList.add(Long.valueOf(j));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            String strM29801l0 = bm51.m29801l0(UUID.randomUUID().toString(), "-", "");
            in71Var.f103887a.add(strM29801l0);
            boolean z2 = z;
            this.f231170a.invoke(new sjx(this, strM29801l0, v4p0Var, z2, jLongValue));
            z = z2;
        }
        return in71Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m83298c(in71 in71Var) {
        this.f231170a.invoke(new tjx(in71Var, this, 0));
    }
}
