package p204p;

import android.app.ApplicationExitInfo;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ura implements t95 {

    /* JADX INFO: renamed from: a */
    public final Set f233310a;

    public ura(Set set) {
        this.f233310a = set;
    }

    @Override // p204p.t95
    /* JADX INFO: renamed from: a */
    public final void mo47858a(ApplicationExitInfo applicationExitInfo) {
        Iterator it = this.f233310a.iterator();
        while (it.hasNext()) {
            ((t95) it.next()).mo47858a(applicationExitInfo);
        }
    }
}
