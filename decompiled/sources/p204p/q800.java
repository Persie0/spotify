package p204p;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q800 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f186203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f186204c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f186205d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f186206e;

    public q800(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f186202a = i;
        this.f186203b = arrayList;
        this.f186204c = arrayList2;
        this.f186205d = arrayList3;
        this.f186206e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f186202a; i++) {
            View view = (View) this.f186203b.get(i);
            String str = (String) this.f186204c.get(i);
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32551o(view, str);
            cec1.m32551o((View) this.f186205d.get(i), (String) this.f186206e.get(i));
        }
    }
}
