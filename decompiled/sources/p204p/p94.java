package p204p;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class p94 {

    /* JADX INFO: renamed from: a */
    public final Context f175148a;

    /* JADX INFO: renamed from: b */
    public String f175149b;

    public p94(Context context) {
        this.f175148a = context;
    }

    /* JADX INFO: renamed from: a */
    public final String m69356a() {
        String str = this.f175149b;
        if (str != null) {
            return str;
        }
        String string = Settings.Secure.getString(this.f175148a.getContentResolver(), "android_id");
        this.f175149b = string;
        return string;
    }
}
