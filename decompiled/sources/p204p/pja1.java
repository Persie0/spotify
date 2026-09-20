package p204p;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class pja1 {

    /* JADX INFO: renamed from: a */
    public static final Set f178217a = bk5.m29624m1(new String[]{"http", pka1.f178421b});

    /* JADX INFO: renamed from: b */
    public static final Set f178218b = bk5.m29624m1(new urv0[]{new urv0("spotify\\.com"), new urv0("www\\.spotify\\.com"), new urv0(".*\\.spotify\\.com$")});

    /* JADX INFO: renamed from: a */
    public static final boolean m70136a(Uri uri) {
        String host = uri.getHost();
        if (host != null && g6f.m43725i0(f178217a, uri.getScheme())) {
            Set set = f178218b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((urv0) it.next()).m83873e(host)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
