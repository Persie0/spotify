package p204p;

import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import com.spotify.betamax.common.drm.DrmUtil$UnexpectedDrmException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lp/lhs;", "", "<init>", "()V", "Lp/jix;", "a", "()Lp/jix;", "src_main_java_com_spotify_betamax_common-common"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class lhs {

    /* JADX INFO: renamed from: a */
    public static final lhs f133641a = new lhs();

    private lhs() {
    }

    /* JADX INFO: renamed from: a */
    public static final jix m59004a() throws DrmUtil$UnexpectedDrmException {
        try {
            return khs.m56454b();
        } catch (MediaDrm.MediaDrmStateException e) {
            throw new DrmUtil$UnexpectedDrmException(e);
        } catch (MediaDrmResetException e2) {
            throw new DrmUtil$UnexpectedDrmException(e2);
        }
    }
}
