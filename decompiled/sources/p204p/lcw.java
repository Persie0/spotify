package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lcw implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final ucw f131994a;

    /* JADX INFO: renamed from: b */
    public final Set f131995b = Collections.singleton(gn80.EQUALIZER_SETTINGS);

    /* JADX INFO: renamed from: c */
    public final String f131996c = "Equalizer page";

    /* JADX INFO: renamed from: d */
    public final Class f131997d = ecw.class;

    public lcw(ucw ucwVar) {
        this.f131994a = ucwVar;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f131995b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return this.f131997d;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Set set = dd41.f47702f;
        String strM68854k = p1v.m68854k(intent);
        if (strM68854k == null) {
            strM68854k = "";
        }
        return new kcw(strM68854k);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return this.f131996c;
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f131994a.m82792b();
    }
}
