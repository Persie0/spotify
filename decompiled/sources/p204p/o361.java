package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o361 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final boolean f161294a;

    /* JADX INFO: renamed from: b */
    public final Set f161295b = s601.m77310m0(gn80.LISTENING_STATS, gn80.LISTENING_STATS_V2);

    public o361(boolean z) {
        this.f161294a = z;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f161295b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return l361.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        Long lM29808s0;
        String strM35712j = dd41Var.m35712j();
        return new n361((strM35712j == null || (lM29808s0 = bm51.m29808s0(10, strM35712j)) == null) ? 0L : lM29808s0.longValue());
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Summary Page (Listening Stats)";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f161294a;
    }
}
