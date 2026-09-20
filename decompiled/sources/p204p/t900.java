package p204p;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class t900 implements lyl {

    /* JADX INFO: renamed from: c */
    public static final boolean f218165c;

    /* JADX INFO: renamed from: a */
    public final UUID f218166a;

    /* JADX INFO: renamed from: b */
    public final byte[] f218167b;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f218165c = z;
    }

    public t900(UUID uuid, byte[] bArr) {
        this.f218166a = uuid;
        this.f218167b = bArr;
    }
}
