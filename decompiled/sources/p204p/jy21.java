package p204p;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class jy21 {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f117273a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f117274b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final rje m54773a(int i) {
        return (rje) this.f117274b.get(Integer.valueOf(i));
    }
}
