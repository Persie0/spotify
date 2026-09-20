package p204p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface exe {
    /* JADX INFO: renamed from: d */
    f940 mo24608d();

    /* JADX INFO: renamed from: e */
    default void m40231e(Uri uri) {
        String string = uri.toString();
        List listM30496T = btz0.m30496T(urv0.m83870b(kso.f125981a, string));
        if (listM30496T.size() == 1) {
            string = ((r2d0) g6f.m43741q0(listM30496T)).f195127a.group();
        }
        mvu0 mvu0VarM48899d = ((hvu0) mo24608d()).m48899d();
        if (mvu0VarM48899d != null) {
            mvu0VarM48899d.m62968b(new pge0(string, nau.f152117a));
        }
    }
}
