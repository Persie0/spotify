package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vj40 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f241869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f241870c;

    public /* synthetic */ vj40(Context context, int i, int i2) {
        this.f241868a = i2;
        this.f241869b = i;
        this.f241870c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f241868a) {
            case 0:
                int i = this.f241869b;
                Context context = this.f241870c;
                if (!p2l.f173365a.contains(wj40.class)) {
                    try {
                        wj40.f251845a.m88245a(i, context.getPackageName());
                    } catch (Throwable th) {
                        p2l.m68953a(wj40.class, th);
                        return;
                    }
                    break;
                }
                break;
            default:
                int i2 = this.f241869b;
                Context context2 = this.f241870c;
                if (!p2l.f173365a.contains(wj40.class)) {
                    try {
                        wj40.f251845a.m88245a(i2, context2.getPackageName());
                    } catch (Throwable th2) {
                        p2l.m68953a(wj40.class, th2);
                    }
                    break;
                }
                break;
        }
    }
}
