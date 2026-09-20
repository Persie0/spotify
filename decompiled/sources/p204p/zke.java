package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.impl.models.PluginIntegrationStatus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zke implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ale f283726a;

    public zke(ale aleVar) {
        this.f283726a = aleVar;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        ale aleVar = this.f283726a;
        ArrayList arrayList = aleVar.f16859Y;
        arrayList.clear();
        arrayList.add(aleVar.f16861b);
        arrayList.add(aleVar.f16862c);
        arrayList.add(aleVar.f16863d);
        arrayList.add(aleVar.f16864e);
        arrayList.add(aleVar.f16865f);
        arrayList.add(aleVar.f16866g);
        arrayList.add(aleVar.f16867h);
        aleVar.f16869t.f84959a.put(aleVar.f16860a.getLocalClassName(), new WeakReference(aleVar.f16858X));
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        ale aleVar = this.f283726a;
        Iterator it = aleVar.f16859Y.iterator();
        while (it.hasNext()) {
            ((hy8) it.next()).m49126f();
        }
        aleVar.f16860a.f31643a.mo31988d(this);
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        ale aleVar = this.f283726a;
        for (hy8 hy8Var : aleVar.f16859Y) {
            Logger.m3969e("ClientMessagingPlatform: UI Plugin: UI Hidden for formatType: " + hy8Var.f96490e, new Object[0]);
            hy8Var.f96494i.m60129c();
        }
        aleVar.f16868i.m89417a(aleVar.f16860a.getLocalClassName(), PluginIntegrationStatus.DETACHED);
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        ale aleVar = this.f283726a;
        r55 r55Var = aleVar.f16860a;
        Iterator it = aleVar.f16859Y.iterator();
        while (it.hasNext()) {
            ((hy8) it.next()).m49127g(r55Var);
        }
        aleVar.f16868i.m89417a(r55Var.getLocalClassName(), PluginIntegrationStatus.ATTACHED);
    }
}
