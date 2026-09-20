package p204p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface ogm0 {
    /* JADX INFO: renamed from: b */
    default Set mo24411b() {
        return gbu.f78413a;
    }

    /* JADX INFO: renamed from: c */
    Class mo24412c();

    /* JADX INFO: renamed from: d */
    Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var);

    /* JADX INFO: renamed from: e */
    default zzq0 mo24414e() {
        return uzq0.f235620a;
    }

    /* JADX INFO: renamed from: f */
    default Set mo28839f() {
        return gbu.f78413a;
    }

    String getDescription();

    default boolean isEnabled() {
        return true;
    }
}
