package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rse1 implements ogm0 {
    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return gbu.f78413a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return kse1.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        return new mse1(intent.getIntExtra("VIEW_ID_TO_ALIGN_TOP_WITH_EXTRA", -1));
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: e */
    public final zzq0 mo24414e() {
        return new wzq0(true);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "";
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return true;
    }
}
