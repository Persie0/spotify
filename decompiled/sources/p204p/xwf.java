package p204p;

import com.google.protobuf.Any;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xwf {
    /* JADX INFO: renamed from: a */
    public final Object m92284a(Any any) {
        try {
            return mo29740b().invoke(any);
        } catch (Throwable th) {
            na6.m63959g("Watch Feed parsing error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract gh00 mo29740b();
}
