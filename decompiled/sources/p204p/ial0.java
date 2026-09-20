package p204p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ial0 {

    /* JADX INFO: renamed from: a */
    public static final ial0 f100273a = new ial0();

    /* JADX INFO: renamed from: b */
    public static final Set f100274b = bk5.m29624m1(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX INFO: renamed from: a */
    public static final boolean m50092a() {
        boolean zBooleanValue;
        Set set = p2l.f173365a;
        if (set.contains(ial0.class)) {
            return false;
        }
        try {
            Context contextM69343a = p8y.m69343a();
            zn91.m96564m0();
            if (contextM69343a.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false) || n0b1.m63382v()) {
                return false;
            }
            new0 new0Var = new0.f153138b;
            if (set.contains(new0.class)) {
                zBooleanValue = false;
            } else {
                try {
                    if (new0.f153140c == null) {
                        new0.f153140c = Boolean.valueOf(new0.f153138b.m64309a(p8y.m69343a()) != null);
                    }
                    Boolean bool = new0.f153140c;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                } catch (Throwable th) {
                    p2l.m68953a(new0.class, th);
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            p2l.m68953a(ial0.class, th2);
            return false;
        }
    }
}
