package p204p;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h3h1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f87235a = Logger.getLogger(h3h1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f87236b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m46523a() {
        return f87236b.get();
    }
}
