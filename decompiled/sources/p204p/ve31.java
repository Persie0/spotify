package p204p;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes10.dex */
public final class ve31 {

    /* JADX INFO: renamed from: a */
    public final xre f240590a;

    /* JADX INFO: renamed from: b */
    public final Resources f240591b;

    public ve31(Context context, xre xreVar) {
        this.f240590a = xreVar;
        this.f240591b = context.getResources();
    }

    /* JADX INFO: renamed from: a */
    public final String m85273a(double d, int i) {
        return this.f240591b.getString(i, d % ((double) 1) == 0.0d ? String.valueOf((int) d) : String.valueOf(d));
    }

    /* JADX INFO: renamed from: b */
    public final String m85274b(int i, long j) {
        return this.f240591b.getQuantityString(i, (int) j, Long.valueOf(j));
    }
}
