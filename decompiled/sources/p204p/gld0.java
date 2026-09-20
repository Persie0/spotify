package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class gld0 implements iji {

    /* JADX INFO: renamed from: b */
    public static final Set f81058b = bk5.m29624m1(new String[]{"com.android.systemui.aod", "com.android.systemui", "com.spotify.music.notification"});

    /* JADX INFO: renamed from: a */
    public final w9x0 f81059a;

    public gld0(w9x0 w9x0Var) {
        this.f81059a = w9x0Var;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return f81058b.contains(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return this.f81059a.mo42270a(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: h */
    public final String mo45126h(String str, yjx0 yjx0Var) {
        if (str.equals("com.android.systemui") && yjx0Var.f273497f) {
            return "com.android.systemui.recent";
        }
        return null;
    }
}
