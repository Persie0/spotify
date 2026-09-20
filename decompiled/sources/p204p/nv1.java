package p204p;

import com.google.android.gms.internal.meet_coactivities.zzfa;
import com.google.android.gms.internal.meet_coactivities.zzij;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public abstract class nv1 {

    /* JADX INFO: renamed from: a */
    public static final Object f158755a = new Object();

    /* JADX INFO: renamed from: b */
    public static Optional f158756b = Optional.empty();

    /* JADX INFO: renamed from: c */
    public static Optional f158757c = Optional.empty();

    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, p.mv1] */
    /* JADX INFO: renamed from: a */
    public static mv1 m65711a(Optional optional, Optional optional2) {
        ?? r8;
        synchronized (f158755a) {
            try {
                if (!f158756b.isPresent()) {
                    f158756b = Optional.of(new zzfa(135083966748L, optional, optional2, zzij.zzb()));
                    f158757c = Optional.of(135083966748L);
                } else if (!((Long) f158757c.get()).equals(135083966748L)) {
                    throw new IllegalArgumentException("Unexpected change in cloud project number.");
                }
                r8 = f158756b.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        return r8;
    }
}
