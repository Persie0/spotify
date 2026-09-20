package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class yip {

    /* JADX INFO: renamed from: a */
    public final Context f273183a;

    public yip(Context context) {
        Object obj = uj10.f230857d;
        this.f273183a = context;
    }

    /* JADX INFO: renamed from: a */
    public final vo10 m93826a() {
        Context context = this.f273183a;
        try {
            int iM85679c = uj10.f230858e.m85679c(context, vj10.f241853a);
            wo10.m88616b(context);
            m93827b(iM85679c);
            return m93827b(iM85679c);
        } catch (Exception e) {
            Logger.m3966b("Check for Google Play Services failed: %s", e);
            return new so10(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final vo10 m93827b(int i) {
        Object obj = uj10.f230857d;
        if (i == 0) {
            return new ro10(wo10.m88616b(this.f273183a));
        }
        if (wo10.m88621g(i)) {
            Logger.m3969e("Resolvable Google Play Services error", new Object[0]);
            return new uo10(i);
        }
        Logger.m3973i("Not resolvable Google Play Services error", new Object[0]);
        return new to10(i);
    }
}
