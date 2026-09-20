package p204p;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class ezm0 {

    /* JADX INFO: renamed from: a */
    public final iv91 f64418a;

    /* JADX INFO: renamed from: b */
    public final lbm0 f64419b;

    public ezm0(iv91 iv91Var, lbm0 lbm0Var) {
        this.f64418a = iv91Var;
        this.f64419b = lbm0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m40400a(String str, String str2, xxm0 xxm0Var) {
        String str3;
        int iOrdinal = xxm0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            str3 = "change-to-managed-account";
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "create-managed-account";
        }
        Uri.Builder builderAppendPath = Uri.parse(str).buildUpon().appendPath(str3);
        if (str2.length() > 0) {
            builderAppendPath = builderAppendPath.appendQueryParameter("session", str2);
        }
        return builderAppendPath.appendQueryParameter("source", xxm0Var.m92338a()).build().toString();
    }
}
