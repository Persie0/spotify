package p204p;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public final class xep extends on3 {
    @Override // p204p.on3
    /* JADX INFO: renamed from: j */
    public final Signature[] mo67395j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
