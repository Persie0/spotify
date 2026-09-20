package p204p;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final class bb6 implements er70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Application f25441a;

    public bb6(Application application) {
        this.f25441a = application;
    }

    @Override // p204p.er70
    public final Object get() {
        return pxy.m71565Y(this.f25441a.getFilesDir(), "asset-loader");
    }
}
