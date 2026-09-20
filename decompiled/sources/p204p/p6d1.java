package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p6d1 implements ogm0 {

    /* JADX INFO: renamed from: a */
    public final Context f174346a;

    /* JADX INFO: renamed from: b */
    public final Set f174347b = s601.m77310m0(gn80.VTEC_FEATURE, gn80.VTEC_FEATURE_MODAL, gn80.VTEC_FEATURE_WITH_DATA);

    public p6d1(Context context) {
        this.f174346a = context;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f174347b;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return m6d1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        gn80 gn80Var = dd41Var.f47709c;
        Uri uri = dd41Var.f47707a;
        boolean booleanQueryParameter = uri != null ? uri.getBooleanQueryParameter("enable_remote_debugging", false) : false;
        gn80 gn80Var2 = gn80.VTEC_FEATURE_WITH_DATA;
        String strM35717o = gn80Var == gn80Var2 ? dd41Var.m35717o(1) : dd41Var.m35712j();
        if (strM35717o == null) {
            strM35717o = "";
        }
        return new o6d1(e0b1.m37490b(this.f174346a) ? 3 : 1, strM35717o, gn80Var == gn80Var2 ? dd41Var.m35712j() : null, uri != null ? uri.getEncodedQuery() : null, booleanQueryParameter, gn80Var != gn80.VTEC_FEATURE_MODAL);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ zzq0 mo24414e() {
        return uzq0.f235620a;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Vtec feature";
    }
}
