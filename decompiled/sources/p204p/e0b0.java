package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class e0b0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f54931a;

    /* JADX INFO: renamed from: b */
    public final rta0 f54932b;

    /* JADX INFO: renamed from: c */
    public final d4e f54933c;

    public e0b0(i4t0 i4t0Var, pnq0 pnq0Var, rta0 rta0Var, d4e d4eVar) {
        this.f54931a = i4t0Var;
        this.f54932b = rta0Var;
        this.f54933c = d4eVar;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m37487a(e0b0 e0b0Var, Context context, Intent intent, boolean z, Uri uri, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            uri = null;
        }
        if ((i3 & 16) != 0) {
            i = 268468224;
        }
        boolean z2 = (i3 & 32) != 0;
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        if (e0b0Var.m37488b(i2, uri)) {
            return pnq0.m70449b(context, i);
        }
        return e0b0Var.f54932b.m76377b(context, intent, z, uri, i, z2, i2 == 3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37488b(int i, Uri uri) {
        return (i == 2 || i == 3 || !((InterfaceC1823eq) this.f54931a.get()).mo39717i() || ufg1.m83017s(uri) || ((e4e) this.f54933c).m37771b() != null) ? false : true;
    }
}
