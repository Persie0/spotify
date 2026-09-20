package p196j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.time.a */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1510a extends AbstractC1419g implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final C1510a f10630b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a */
    public final ZoneId f10631a;

    static {
        System.currentTimeMillis();
        f10630b = new C1510a(ZoneOffset.UTC);
    }

    public C1510a(ZoneId zoneId) {
        this.f10631a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1510a) {
            return this.f10631a.equals(((C1510a) obj).f10631a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10631a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f10631a + "]";
    }
}
