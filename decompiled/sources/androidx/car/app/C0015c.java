package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcelable;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0015c implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CarAppBinder f411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Parcelable f412c;

    public /* synthetic */ C0015c(CarAppBinder carAppBinder, Parcelable parcelable, int i) {
        this.f410a = i;
        this.f411b = carAppBinder;
        this.f412c = parcelable;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f410a) {
            case 0:
                return this.f411b.lambda$onConfigurationChanged$6((Configuration) this.f412c);
            default:
                return this.f411b.lambda$onNewIntent$5((Intent) this.f412c);
        }
    }
}
