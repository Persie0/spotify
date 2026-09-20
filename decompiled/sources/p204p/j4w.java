package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class j4w implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f108803a = Collections.singleton(gn80.COLLECTION_YOUR_EPISODES_SETTINGS_AUTO_DOWNLOAD_LIMIT);

    /* JADX INFO: renamed from: b */
    public final String f108804b = "Settings page for podcast auto-download episode limits";

    /* JADX INFO: renamed from: c */
    public final Class f108805c = a4w.class;

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f108803a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return this.f108805c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k == null) {
            strM68854k = "";
        }
        return new i4w(strM68854k);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return this.f108804b;
    }
}
