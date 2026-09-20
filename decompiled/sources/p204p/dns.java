package p204p;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dns {

    /* JADX INFO: renamed from: a */
    public static final HashMap f50875a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f50876b;

    static {
        cns cnsVar;
        HashMap map = new HashMap();
        f50875a = map;
        HashMap map2 = new HashMap();
        f50876b = map2;
        cns cnsVar2 = cns.f40076d;
        map.put(1L, cnsVar2);
        map2.put(cnsVar2, Collections.singletonList(1L));
        map.put(2L, cns.f40077e);
        map2.put((cns) map.get(2L), Collections.singletonList(2L));
        cns cnsVar3 = cns.f40078f;
        map.put(4L, cnsVar3);
        map2.put(cnsVar3, Collections.singletonList(4L));
        cns cnsVar4 = cns.f40079g;
        map.put(8L, cnsVar4);
        map2.put(cnsVar4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cnsVar = cns.f40080h;
            if (!zHasNext) {
                break;
            }
            f50875a.put((Long) it.next(), cnsVar);
        }
        f50876b.put(cnsVar, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            cns cnsVar5 = cns.f40081i;
            if (!zHasNext2) {
                f50876b.put(cnsVar5, listAsList2);
                return;
            } else {
                f50875a.put((Long) it2.next(), cnsVar5);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Long m36490a(cns cnsVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f50876b.get(cnsVar);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
