package p204p;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s9w0 {

    /* JADX INFO: renamed from: d */
    public static final s9w0 f207080d = new s9w0(new long[0], new RemoteViews[0], 1);

    /* JADX INFO: renamed from: a */
    public final long[] f207081a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f207082b;

    /* JADX INFO: renamed from: c */
    public final int f207083c;

    public s9w0(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.f207081a = jArr;
        this.f207082b = remoteViewsArr;
        this.f207083c = i;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = g6f.m43727j0(arrayList).size();
        if (size <= this.f207083c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f207083c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
