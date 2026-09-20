package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class nn50 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156331a;

    /* JADX INFO: renamed from: b */
    public final boolean f156332b;

    /* JADX INFO: renamed from: c */
    public final Set f156333c;

    public nn50(boolean z, int i) {
        this.f156331a = i;
        switch (i) {
            case 1:
                this.f156332b = z;
                this.f156333c = Collections.singleton(yw00.f276814d);
                break;
            case 2:
                this.f156332b = z;
                this.f156333c = Collections.singleton(cx00.f42877d);
                break;
            case 3:
                this.f156332b = z;
                this.f156333c = Collections.singleton(bx00.f31758d);
                break;
            default:
                this.f156332b = z;
                this.f156333c = Collections.singleton(xw00.f266551d);
                break;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        switch (this.f156331a) {
            case 0:
                return kn50.class;
            case 1:
                return xz70.class;
            case 2:
                return txm0.class;
            default:
                return at01.class;
        }
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        switch (this.f156331a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ttm0.f223644a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        switch (this.f156331a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return new wzq0(false);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        switch (this.f156331a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f156333c;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        switch (this.f156331a) {
            case 0:
                return "A page to choose an account linking invite method";
            case 1:
                return "A page with more information about account linking";
            case 2:
                return "A page to share the parental consent request for account linking";
            default:
                return "A page to share an account linking invite link";
        }
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        switch (this.f156331a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f156332b;
    }
}
