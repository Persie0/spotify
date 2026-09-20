package p204p;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rqr implements Closeable {

    /* JADX INFO: renamed from: a */
    public final String f201872a;

    /* JADX INFO: renamed from: b */
    public final long f201873b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f201874c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wqr f201875d;

    public rqr(wqr wqrVar, String str, long j, ArrayList arrayList) {
        this.f201875d = wqrVar;
        this.f201872a = str;
        this.f201873b = j;
        this.f201874c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f201874c.iterator();
        while (it.hasNext()) {
            a0f1.m24341b((wt31) it.next());
        }
    }
}
