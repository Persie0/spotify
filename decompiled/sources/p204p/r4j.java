package p204p;

import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r4j {
    /* JADX INFO: renamed from: a */
    public static boolean m74757a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return false;
        }
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
