package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class zoa1 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f284743a;

    /* JADX INFO: renamed from: b */
    public final boolean f284744b;

    /* JADX INFO: renamed from: c */
    public final Set f284745c = Collections.singleton(gn80.IN_APP_USER_FEEDBACK);

    public zoa1(h4t0 h4t0Var, boolean z) {
        this.f284743a = h4t0Var;
        this.f284744b = z;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f284745c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return woa1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Bundle extras = intent.getExtras();
        return new yoa1(extras != null ? extras.getString("screenshotFilePath") : null);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(false);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "The bottomsheet entry point for the user feedback journey";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return !this.f284744b && ((dq4) this.f284743a.get()).m36598b();
    }
}
