package p204p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bk00 implements awr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f27800b;

    public /* synthetic */ bk00(Object obj, int i) {
        this.f27799a = i;
        this.f27800b = obj;
    }

    @Override // p204p.awr
    public final void dispose() {
        switch (this.f27799a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f27800b;
                synchronized (arrayList) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((awr) it.next()).dispose();
                        }
                        arrayList.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((View) this.f27800b).setOnClickListener(null);
                return;
        }
    }
}
