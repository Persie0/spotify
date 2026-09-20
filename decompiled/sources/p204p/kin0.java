package p204p;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class kin0 extends mic1 {

    /* JADX INFO: renamed from: b */
    public final x8y0 f123020b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedDeque f123021c = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: d */
    public final Object f123022d = new Object();

    public kin0(x8y0 x8y0Var) {
        this.f123020b = x8y0Var;
        ArrayList arrayList = (ArrayList) x8y0Var.m90232b("navigation.pending_intents");
        if (arrayList != null) {
            ClassLoader classLoader = kin0.class.getClassLoader();
            if (classLoader == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Intent) it.next()).setExtrasClassLoader(classLoader);
            }
            this.f123021c.addAll(arrayList);
        }
    }
}
