package p204p;

import com.spotify.allboarding.entrypoint.EntryPoint;

/* JADX INFO: loaded from: classes3.dex */
public final class qyv {
    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static EntryPoint m74230a(String str) {
        for (EntryPoint entryPoint : EntryPoint.values()) {
            if (wj50.m88271j(entryPoint.getUriSegment(), str)) {
                if (entryPoint == null) {
                    return EntryPoint.DEFAULT;
                }
                return entryPoint;
            }
        }
        entryPoint = null;
        if (entryPoint == null) {
            return EntryPoint.DEFAULT;
        }
        return entryPoint;
    }
}
