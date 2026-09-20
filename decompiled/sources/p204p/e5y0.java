package p204p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class e5y0 implements evb0 {

    /* JADX INFO: renamed from: a */
    public final kl1 f56496a;

    public e5y0(kl1 kl1Var) {
        this.f56496a = kl1Var;
    }

    @Override // p204p.evb0
    /* JADX INFO: renamed from: a */
    public final void mo37838a(Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Uri uri = Uri.parse(dataString);
            kl1 kl1Var = this.f56496a;
            kl1Var.getClass();
            if (kl1.m56794b(uri)) {
                kl1Var.f123773g = uri;
            }
        }
    }
}
