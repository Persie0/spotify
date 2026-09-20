package p204p;

import kotlin.NoWhenBranchMatchedException;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes8.dex */
public final class dzj {

    /* JADX INFO: renamed from: a */
    public final z9j0 f54682a;

    public dzj(z9j0 z9j0Var) {
        this.f54682a = z9j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m37470a(int i) {
        String str;
        voc1 voc1Var = xoc1.f264033Z1;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            str = "content_windowing:early_access";
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "content_windowing:early_access_after_release";
        }
        return voc1Var + "?displayReason=" + URLEncoder.encode(str, "UTF-8");
    }
}
