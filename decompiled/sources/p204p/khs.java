package p204p;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.drm.DrmUtil$UnexpectedDrmException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public abstract class khs {

    /* JADX INFO: renamed from: a */
    public static final UUID f122716a;

    /* JADX INFO: renamed from: b */
    public static final UUID f122717b;

    static {
        UUID uuidFromString = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
        f122716a = uuidFromString;
        f122717b = UUID.fromString("d4a32b78-46e3-4a7b-9f2c-7e1b5c8d0e9a");
        Collections.singleton(uuidFromString);
    }

    /* JADX INFO: renamed from: a */
    public static jix m56453a() {
        String str = ".";
        UUID uuid = f122716a;
        int i = 2;
        while (i > 0) {
            i--;
            try {
                return lhs.m59004a();
            } catch (UnsupportedDrmException e) {
                Logger.m3967c(e, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + str, new Object[0]);
                return new sp5(9);
            } catch (DrmUtil$UnexpectedDrmException unused) {
            } catch (Exception e2) {
                Logger.m3967c(e2, "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + str, new Object[0]);
                return new sp5(9);
            }
        }
        return new sp5(9);
    }

    /* JADX INFO: renamed from: b */
    public static v900 m56454b() throws UnsupportedDrmException {
        try {
            v900 v900Var = new v900(f122716a);
            MediaDrm mediaDrm = v900Var.f238811b;
            if (!"L3".equals(mediaDrm.getPropertyString("securityLevel"))) {
                mediaDrm.setPropertyString("securityLevel", "L3");
            }
            return v900Var;
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(e2);
        }
    }
}
