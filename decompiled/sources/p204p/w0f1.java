package p204p;

import android.app.Application;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class w0f1 {

    /* JADX INFO: renamed from: a */
    public static final gl60 f246729a = q0f1.m71831e(new p4b1(12));

    /* JADX INFO: renamed from: a */
    public static x2b m86951a(Application application) {
        return new x2b(new File(application.getCacheDir(), "https_cache"), 41943040L);
    }
}
