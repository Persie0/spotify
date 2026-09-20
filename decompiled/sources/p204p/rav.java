package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class rav implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f197388a;

    /* JADX INFO: renamed from: b */
    public final boolean f197389b;

    /* JADX INFO: renamed from: c */
    public final Set f197390c = Collections.singleton(gn80.STICKERS_ENHANCED_SHARE_CARD);

    public rav(boolean z, boolean z2) {
        this.f197388a = z;
        this.f197389b = z2;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f197390c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return t9v.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String stringExtra = intent.getStringExtra("trackURI");
        String str = stringExtra == null ? "" : stringExtra;
        long longExtra = intent.getLongExtra("timestamp", 0L);
        String stringExtra2 = intent.getStringExtra("cacheId");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        List integerArrayListExtra = intent.getIntegerArrayListExtra("selectedLineIndices");
        if (integerArrayListExtra == null) {
            integerArrayListExtra = lau.f131415a;
        }
        return new qav(str, longExtra, str2, integerArrayListExtra);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new xzq0(1, false, 6);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Enhanced Share Card page";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f197388a || this.f197389b;
    }
}
