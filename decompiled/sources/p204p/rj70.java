package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class rj70 implements evb0 {

    /* JADX INFO: renamed from: a */
    public final kv91 f199731a;

    /* JADX INFO: renamed from: b */
    public final ahg0 f199732b = new ahg0(3);

    public rj70(kv91 kv91Var) {
        this.f199731a = kv91Var;
    }

    @Override // p204p.evb0
    /* JADX INFO: renamed from: a */
    public final void mo37838a(Intent intent) {
        String dataString;
        if (!intent.getBooleanExtra("customshortcut.lastvisitedpage", false) || (dataString = intent.getDataString()) == null) {
            return;
        }
        this.f199731a.mo57453r(this.f199732b.m25951i().m90246a(dataString), null);
    }
}
