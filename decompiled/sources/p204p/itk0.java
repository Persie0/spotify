package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class itk0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105623a;

    public /* synthetic */ itk0(int i) {
        this.f105623a = i;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        switch (this.f105623a) {
            case 0:
                return Collections.singleton(gn80.PREMIUM_DESTINATION_FLAVOR_PAGE);
            default:
                return gbu.f78413a;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f105623a) {
            case 0:
                return gtk0.class;
            default:
                return f341.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f105623a) {
            case 0:
                kgz kgzVar = (kgz) intent.getParcelableExtra("request");
                return new mgz(kgzVar != null ? Integer.valueOf(kgzVar.m56373g()) : null, kgzVar != null ? kgzVar.m56372c() : null);
            default:
                return new o341(intent.getIntExtra("initialSpeed", p3p0.PLAYBACK_SPEED_100.m69080a()));
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        switch (this.f105623a) {
            case 0:
                break;
        }
        return new wzq0(true);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f105623a) {
            case 0:
                return "A page for loading and displaying the offers flavor page";
            default:
                return "Playback speed control bottom sheet";
        }
    }
}
