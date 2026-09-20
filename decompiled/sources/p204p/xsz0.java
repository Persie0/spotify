package p204p;

import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class xsz0 {

    /* JADX INFO: renamed from: a */
    public final l8x f265707a;

    /* JADX INFO: renamed from: b */
    public final HashMap f265708b = new HashMap();

    public xsz0(l8x l8xVar) {
        this.f265707a = l8xVar;
    }

    /* JADX INFO: renamed from: a */
    public final long m91995a(int i, String str, byte[] bArr) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            long jM91996b = m91996b(str, bArr);
            k8x k8xVar = new k8x();
            k8xVar.f120473a = str;
            k8xVar.f120475c = 1 + jM91996b;
            k8xVar.f120474b = bArr;
            l8x l8xVar = this.f265707a;
            nsf1.m65528n(l8xVar.f130954a, false, true, new tsv(21, l8xVar, k8xVar));
            return jM91996b;
        }
        if (iM38547C != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String strM77250i = s571.m77250i(str, new String(bArr, vuc.f244913a));
        HashMap map = this.f265708b;
        Object obj = map.get(strM77250i);
        if (obj == null) {
            obj = 1L;
        }
        long jLongValue = ((Number) obj).longValue();
        map.put(strM77250i, Long.valueOf(1 + jLongValue));
        return jLongValue;
    }

    /* JADX INFO: renamed from: b */
    public final long m91996b(String str, byte[] bArr) {
        long jLongValue = ((Number) nsf1.m65528n(this.f265707a.f130954a, true, false, new tsv(20, str, bArr))).longValue();
        if (jLongValue == 0) {
            return 1L;
        }
        return jLongValue;
    }
}
