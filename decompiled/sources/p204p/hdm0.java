package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hdm0 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Set f90162a = s601.m77310m0(gn80.PAGE_MATCH_INBOUND_SCAN, gn80.PAGE_MATCH_SUCCESS, gn80.PAGE_MATCH_ERROR, gn80.PAGE_MATCH_OUTBOUND_SCAN);

    /* JADX INFO: renamed from: b */
    public final Class f90163b = fdm0.class;

    /* JADX INFO: renamed from: c */
    public final String f90164c = "Page Match bottom sheet host page";

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f90162a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return this.f90163b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String strM35717o = dd41Var.m35717o(2);
        if (strM35717o == null) {
            strM35717o = "";
        }
        return new gdm0(dd41Var.m35714l(), strM35717o, "spotify:show:".concat(strM35717o));
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new xzq0(3, false, (nz4) kz4.f128008c);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return this.f90164c;
    }
}
