package p204p;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zxa1 implements o2d0 {

    /* JADX INFO: renamed from: a */
    public static final zxa1 f287263a = new zxa1();

    /* JADX INFO: renamed from: b */
    public static final List f287264b = h6f.m46715L("spotify.com", "www.spotify.com");

    @Override // p204p.o2d0
    public final String description() {
        return "Matches urls in the form https://[spotify.com|www.spotify.com]/listeningstats/*";
    }

    @Override // p204p.o2d0
    public final boolean match(Object obj) {
        List list;
        Uri data = ((pnx0) ((lnx0) obj)).f179540a.getData();
        if (data != null && ((list = f287264b) == null || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (wj50.m88271j((String) it.next(), data.getHost())) {
                    if ((data.getPathSegments().size() < 1 || !wj50.m88271j(data.getPathSegments().get(0), "listeningstats")) && (data.getPathSegments().size() < 2 || !wj50.m88271j(data.getPathSegments().get(1), "listeningstats"))) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
