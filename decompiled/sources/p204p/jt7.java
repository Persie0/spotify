package p204p;

import android.content.Context;
import com.comscore.streaming.AdvertisementType;
import io.reactivex.rxjava3.core.Observable;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class jt7 implements ht7 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f115745e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f115746f;

    /* JADX INFO: renamed from: g */
    public static final u0q0 f115747g;

    /* JADX INFO: renamed from: h */
    public static final EnumSet f115748h;

    /* JADX INFO: renamed from: a */
    public final mt7 f115749a;

    /* JADX INFO: renamed from: b */
    public final x0q0 f115750b;

    /* JADX INFO: renamed from: c */
    public final wg61 f115751c;

    /* JADX INFO: renamed from: d */
    public final wg61 f115752d;

    static {
        si5 si5Var = fv31.f73628b;
        f115745e = si5Var.m78183U("PodcastAutoDownload.onboarding-snackbar-shown");
        f115746f = si5Var.m78183U("PodcastAutoDownload.video-download-dialog-shown");
        Boolean bool = Boolean.TRUE;
        f115747g = new u0q0(null, null, kkc0.m56695h0(pft0.m69840u("isBook", bool), pft0.m69840u("isMusicAndTalk", bool)), null, null, AdvertisementType.LIVE);
        f115748h = EnumSet.of(gn80.PODCAST_EPISODE, gn80.SHOW_EPISODE);
    }

    public jt7(Context context, wb11 wb11Var, Observable observable, qwx0 qwx0Var, mt7 mt7Var, x0q0 x0q0Var) {
        this.f115749a = mt7Var;
        this.f115750b = x0q0Var;
        this.f115751c = new wg61(new C2255pg(observable, wb11Var, context, 24));
        this.f115752d = new wg61(new so5(qwx0Var, 19));
    }
}
