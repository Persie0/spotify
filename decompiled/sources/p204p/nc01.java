package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nc01 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f152389a = Collections.singleton(gn80.COLLECTION_YOUR_EPISODES_SETTINGS_AUTO_DOWNLOAD);

    /* JADX INFO: renamed from: b */
    public final String f152390b = "Settings page for podcast auto-downloads";

    /* JADX INFO: renamed from: c */
    public final Class f152391c = mb01.class;

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f152389a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return this.f152391c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k == null) {
            strM68854k = "";
        }
        return new ic01(strM68854k, e301Var.f55571a);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return this.f152390b;
    }
}
