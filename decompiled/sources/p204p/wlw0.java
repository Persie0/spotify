package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class wlw0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public long f252632b = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final ArrayList f252631a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f252632b, ((wlw0) obj).f252632b);
    }
}
