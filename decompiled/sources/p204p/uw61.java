package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uw61 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f234589a = Collections.singleton(gn80.TASTE_PROFILE);

    /* JADX INFO: renamed from: b */
    public final Set f234590b = Collections.singleton(qv61.f192919d);

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f234589a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return tw61.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        return ttm0.f223644a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return this.f234590b;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Taste Profile page showing user listening insights";
    }
}
