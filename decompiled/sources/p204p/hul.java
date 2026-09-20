package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes.dex */
public final class hul implements kdl0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f95415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f95416b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f95417c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReference f95418d;

    public hul(Context context, boolean z, File file, AtomicReference atomicReference) {
        this.f95415a = context;
        this.f95416b = z;
        this.f95417c = file;
        this.f95418d = atomicReference;
    }

    @Override // p204p.kdl0
    public final void onSuccess(Object obj) {
        Context context = this.f95415a;
        try {
            List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
            Logger.m3969e("CronetRuntime: available providers (%d):", Integer.valueOf(allProviders.size()));
            for (CronetProvider cronetProvider : allProviders) {
                Logger.m3969e("CronetRuntime:   %s (version=%s, enabled=%s)", cronetProvider.getName(), cronetProvider.getVersion(), Boolean.valueOf(cronetProvider.isEnabled()));
            }
            this.f95418d.set(new CronetEngine.Builder(context).enableQuic(this.f95416b).setStoragePath(this.f95417c.getAbsolutePath()).enableHttpCache(3, 5242880L).build());
            Logger.m3969e("CronetRuntime: engine created", new Object[0]);
        } catch (Exception e) {
            m6b.m60995j("CronetRuntime: engine creation failed: ", e.getMessage());
        }
    }
}
