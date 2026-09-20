package p204p;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class rb11 {

    /* JADX INFO: renamed from: b */
    public static final svf f197422b;

    /* JADX INFO: renamed from: a */
    public final Context f197423a;

    static {
        hvf hvfVarM79442a = svf.m79442a(rb11.class);
        hvfVarM79442a.m48826a(btq.m30467a(c8g0.class));
        hvfVarM79442a.m48826a(btq.m30467a(Context.class));
        hvfVarM79442a.f95702f = new sic1(3);
        f197422b = hvfVarM79442a.m48827b();
    }

    public rb11(Context context) {
        this.f197423a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m75130a() {
        String string = this.f197423a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f197423a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
