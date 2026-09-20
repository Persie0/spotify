package p204p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class iay {

    /* JADX INFO: renamed from: a */
    public static final List f100364a = h6f.m46715L("spotify:list:track-samples:", "spotify:list:track-covers:", "spotify:list:track-sampled-in:", "spotify:list:artists-popular-collaborations:", "spotify:list:popular-release-segments:", "spotify:list:artist-connections:", "spotify:list:artist-connections-shelf:");

    /* JADX INFO: renamed from: a */
    public static final boolean m50105a(String str) {
        List list = f100364a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (bm51.m29803n0(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
