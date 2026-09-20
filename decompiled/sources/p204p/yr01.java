package p204p;

import android.net.Uri;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yr01 {

    /* JADX INFO: renamed from: a */
    public static final Set f275353a = bk5.m29624m1(new String[]{"wrapped", "shareformat"});

    /* JADX INFO: renamed from: a */
    public static final void m94402a(dd41 dd41Var) {
        Uri uri = dd41Var.f47707a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        Set set = f275353a;
        if (pathSegments == null || pathSegments.size() <= 0 || !set.contains(pathSegments.get(0))) {
            throw new IllegalArgumentException(edb.m38566o("Uri ", dd41Var.m35694A(), " cannot be used as a share format id. Allowed ones must be of the form ", g6f.m43753y0(set, ", ", null, null, mo01.f145524Y, 30)));
        }
    }
}
