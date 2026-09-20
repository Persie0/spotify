package p204p;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class acp implements vti {

    /* JADX INFO: renamed from: a */
    public final lwr f14403a = new lwr();

    /* JADX INFO: renamed from: b */
    public final Handler f14404b;

    /* JADX INFO: renamed from: c */
    public View f14405c;

    public acp(Context context) {
        this.f14404b = new Handler(context.getApplicationContext().getMainLooper());
    }

    @Override // p204p.vti
    /* JADX INFO: renamed from: a */
    public final void mo25480a(View view) {
        this.f14405c = view;
    }

    @Override // p204p.vti
    /* JADX INFO: renamed from: b */
    public final void mo25481b() {
    }
}
