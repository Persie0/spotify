package p204p;

import java.nio.ByteOrder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mzg1 {

    /* JADX INFO: renamed from: a */
    public static final Enum f148705a;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = p204p.bzg1.f32495a;
     */
    static {
        Enum r0;
        try {
            if (Objects.equals(System.getProperty("os.arch"), "amd64")) {
                r0 = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? jzg1.f117728a : jzg1.f117729b;
            } else {
                r0 = bzg1.f32495a;
            }
        } catch (Throwable unused) {
            r0 = bzg1.f32495a;
        }
        f148705a = r0;
    }
}
