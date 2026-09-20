package p204p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z450 implements x450 {
    @Override // p204p.x450
    /* JADX INFO: renamed from: a */
    public final String mo89837a(Uri uri) {
        if (uri.isOpaque()) {
            Logger.m3966b("Got non-absolute install referrer: " + this, new Object[0]);
            return "";
        }
        ArrayList arrayList = new ArrayList();
        String queryParameter = uri.getQueryParameter("utm_campaign");
        if (queryParameter != null) {
            arrayList.add("utm_campaign=".concat(queryParameter));
        }
        String queryParameter2 = uri.getQueryParameter("utm_medium");
        if (queryParameter2 != null) {
            arrayList.add("utm_medium=".concat(queryParameter2));
        }
        String queryParameter3 = uri.getQueryParameter("utm_source");
        if (queryParameter3 != null) {
            arrayList.add("utm_source=".concat(queryParameter3));
        }
        return g6f.m43753y0(arrayList, "&", null, null, null, 62);
    }

    @Override // p204p.x450
    /* JADX INFO: renamed from: b */
    public final boolean mo89838b(Uri uri) {
        if (uri.isHierarchical()) {
            return (uri.getQueryParameter("utm_campaign") == null && uri.getQueryParameter("utm_medium") == null && uri.getQueryParameter("utm_source") == null) ? false : true;
        }
        return false;
    }
}
