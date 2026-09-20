package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class tg70 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f220134a = Collections.singleton(gn80.TRANSCRIPT_LANGUAGE_PICKER);

    /* JADX INFO: renamed from: b */
    public final Set f220135b = Collections.singleton(h491.f87473d);

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f220134a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return bg70.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String stringExtra = intent.getStringExtra("episode_uri");
        if (stringExtra != null) {
            return new qg70(stringExtra);
        }
        throw new IllegalArgumentException("Missing required extra: episode_uri");
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(true);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return this.f220135b;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Transcript translation language picker bottom sheet";
    }
}
