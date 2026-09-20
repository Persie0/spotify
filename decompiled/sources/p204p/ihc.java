package p204p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ihc implements hhc {

    /* JADX INFO: renamed from: a */
    public static final Pattern f102233a;

    /* JADX INFO: renamed from: b */
    public static final Pattern f102234b;

    static {
        new oh3(3);
        Set setM77310m0 = s601.m77310m0("scdn.co", "spotifycdn.com");
        ArrayList arrayList = new ArrayList(i6f.m49804T(setM77310m0, 10));
        Iterator it = setM77310m0.iterator();
        while (it.hasNext()) {
            arrayList.add("(^|\\.)" + Pattern.quote((String) it.next()) + "$");
        }
        f102233a = Pattern.compile(g6f.m43753y0(arrayList, "|", null, null, null, 62));
        f102234b = Pattern.compile("[/@:?#\\\\\\s]");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m50607a(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            if (bm51.m29803n0(path, "/", false)) {
                path = path.substring(1);
            }
            if (oh3.m66918e(path)) {
                return true;
            }
        }
        String queryParameter = uri.getQueryParameter("cdn");
        if (queryParameter == null || queryParameter.length() == 0 || f102234b.matcher(queryParameter).find()) {
            return false;
        }
        return f102233a.matcher(queryParameter).find();
    }
}
