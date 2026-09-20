package p204p;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o4l implements ky61 {

    /* JADX INFO: renamed from: a */
    public final jqa0 f161705a;

    /* JADX INFO: renamed from: b */
    public final wg61 f161706b = new wg61(bpj.f29487O0);

    public o4l(jqa0 jqa0Var) {
        this.f161705a = jqa0Var;
    }

    @Override // p204p.ky61
    /* JADX INFO: renamed from: a */
    public final void mo53807a(List list) {
        e99 e99Var = new e99(26);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h2l h2lVar = (h2l) it.next();
            e99Var.m38230q(jq60.m54072r(h2lVar), jq60.m54073s(h2lVar));
        }
        ((FirebaseCrashlytics) this.f161706b.getValue()).setCustomKeys(e99Var.m38224e());
    }

    @Override // p204p.ky61
    /* JADX INFO: renamed from: b */
    public final void mo53808b(String str) {
        ((FirebaseCrashlytics) this.f161706b.getValue()).log(this.f161705a.m54084a(str));
    }

    @Override // p204p.ky61
    /* JADX INFO: renamed from: c */
    public final void mo53809c(Throwable th) {
        ((FirebaseCrashlytics) this.f161706b.getValue()).recordException(th);
    }

    @Override // p204p.ky61
    /* JADX INFO: renamed from: d */
    public final void mo53810d(h2l h2lVar) {
        ((FirebaseCrashlytics) this.f161706b.getValue()).setCustomKey(jq60.m54072r(h2lVar), jq60.m54073s(h2lVar));
    }
}
