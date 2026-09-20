package p204p;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m5t0 extends AbstractC1895gf {

    /* JADX INFO: renamed from: c */
    public final String f140284c;

    public m5t0(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f140284c = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
    }

    /* JADX INFO: renamed from: t */
    public final String m60888t() {
        return this.f140284c;
    }
}
