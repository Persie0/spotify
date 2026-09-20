package p204p;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2l {

    /* JADX INFO: renamed from: a */
    public static final Set f173365a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static boolean f173366b;

    /* JADX INFO: renamed from: a */
    public static final void m68953a(Object obj, Throwable th) {
        if (f173366b) {
            f173365a.add(obj);
            p8y p8yVar = p8y.f175080a;
            if (dwa1.m37142c()) {
                m2h1.m60591q(th);
                dxf1.m37240n(th, p150.f172953e).m74456b();
            }
        }
    }
}
