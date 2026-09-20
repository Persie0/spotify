package p204p;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class qqd0 {

    /* JADX INFO: renamed from: a */
    public final tqd0 f191543a;

    public qqd0(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f191543a = new tqd0(str, i, i2);
            return;
        }
        sqd0 sqd0Var = new sqd0(str, i, i2);
        rqd0.m76229a(i, i2, str);
        this.f191543a = sqd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m73515a() {
        return this.f191543a.f222800a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqd0)) {
            return false;
        }
        return this.f191543a.equals(((qqd0) obj).f191543a);
    }

    public final int hashCode() {
        return this.f191543a.hashCode();
    }

    public qqd0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM78945a = sqd0.m78945a(remoteUserInfo);
        if (strM78945a != null) {
            if (!TextUtils.isEmpty(strM78945a)) {
                this.f191543a = new sqd0(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
