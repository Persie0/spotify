package p204p;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zbl extends x5l {

    /* JADX INFO: renamed from: a */
    public final String f281344a;

    public zbl(String str) {
        this.f281344a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }

    /* JADX INFO: renamed from: a */
    public final String m95846a() {
        return this.f281344a;
    }
}
