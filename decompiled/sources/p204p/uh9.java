package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface uh9 {
    /* JADX INFO: renamed from: e */
    boolean mo60772e(String str);

    /* JADX INFO: renamed from: g */
    default u790 mo60773g(phd0 phd0Var) {
        byte[] bArr = phd0Var.f177617k;
        if (bArr != null) {
            return mo60775j(bArr);
        }
        Uri uri = phd0Var.f177620n;
        if (uri != null) {
            return mo60774h(uri);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    u790 mo60774h(Uri uri);

    /* JADX INFO: renamed from: j */
    u790 mo60775j(byte[] bArr);
}
