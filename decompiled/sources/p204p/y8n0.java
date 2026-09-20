package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class y8n0 extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public final String f270321c;

    /* JADX INFO: renamed from: d */
    public final String f270322d;

    public y8n0(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.f270321c = str;
        this.f270322d = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX INFO: renamed from: t */
    public final String m93121t() {
        return this.f270321c;
    }

    /* JADX INFO: renamed from: u */
    public final String m93122u() {
        return this.f270322d;
    }
}
