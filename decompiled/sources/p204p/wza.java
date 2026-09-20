package p204p;

import android.app.Application;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class wza {

    /* JADX INFO: renamed from: a */
    public final BehaviorSubject f256543a = BehaviorSubject.m23796g(nau.f152117a);

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap.KeySetView f256544b = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f256545c = new LinkedHashMap();

    public wza(Application application) {
        application.registerActivityLifecycleCallbacks(new vza(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public final void m89417a(String str, PluginIntegrationStatus pluginIntegrationStatus) {
        int i = uza.f235452a[pluginIntegrationStatus.ordinal()];
        LinkedHashMap linkedHashMap = this.f256545c;
        if (i == 1) {
            linkedHashMap.remove(str);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(str, pluginIntegrationStatus);
        }
        this.f256543a.onNext(linkedHashMap);
    }
}
