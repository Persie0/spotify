package p204p;

import android.content.Context;
import android.net.Uri;
import com.google.wear.Sdk;
import com.google.wear.services.remoteinteractions.RemoteInteractionsManager;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class udw0 implements xx30 {

    /* JADX INFO: renamed from: a */
    public final RemoteInteractionsManager f229341a;

    /* JADX INFO: renamed from: b */
    public final boolean f229342b;

    public udw0(Context context) {
        this.f229341a = (context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && bkd1.m29678b("WEAR_TIRAMISU_4")) ? (RemoteInteractionsManager) Sdk.getWearManager(context, RemoteInteractionsManager.class) : null;
        this.f229342b = context.getPackageManager().hasSystemFeature("android.hardware.type.watch") && bkd1.m29678b("WEAR_BAKLAVA_0");
    }

    /* JADX INFO: renamed from: a */
    public final void m82872a(Uri uri, List list, Executor executor, n9w0 n9w0Var) {
        if (!this.f229342b) {
            throw new UnsupportedOperationException("Should not call wear sdk when not supported.");
        }
        RemoteInteractionsManager remoteInteractionsManager = this.f229341a;
        wj50.m88279p(remoteInteractionsManager);
        remoteInteractionsManager.startRemoteActivity(uri, list, executor, n9w0Var);
    }
}
