package p204p;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final class fjx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f70419a;

    /* JADX INFO: renamed from: b */
    public final ejx f70420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gjx f70421c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, p.ejx] */
    public fjx(gjx gjxVar, Context context) {
        this.f70421c = gjxVar;
        this.f70419a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: p.ejx
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                gjx gjxVar2 = this.f60316a.f70421c;
                if (gjxVar2.f80623k0) {
                    return;
                }
                gjxVar2.m45013w1(1, 19, Integer.valueOf(i));
            }
        };
        this.f70420b = r0;
        context.registerDeviceIdChangeListener(new xgi(gjxVar.f80643v.m44723a(gjxVar.f80640t, null), 1), r0);
    }

    /* JADX INFO: renamed from: a */
    public static void m41859a(fjx fjxVar) {
        Context context = (Context) fjxVar.f70419a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(fjxVar.f70420b);
    }
}
