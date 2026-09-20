package p204p;

import android.app.Application;
import android.content.Intent;

/* JADX INFO: loaded from: classes8.dex */
public final class hg5 implements yg0 {

    /* JADX INFO: renamed from: a */
    public final Application f91036a;

    public hg5(Application application) {
        this.f91036a = application;
    }

    @Override // p204p.yg0
    /* JADX INFO: renamed from: a */
    public final void mo35747a(Intent intent) {
        intent.setFlags(805306368);
        this.f91036a.startActivity(intent, null);
    }
}
