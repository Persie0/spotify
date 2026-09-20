package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ft0 extends pzo0 {
    @Override // p204p.pzo0
    /* JADX INFO: renamed from: a */
    default ozo0 mo32013a(yzo0 yzo0Var, noo0 noo0Var, ujx ujxVar, String str) {
        dt0 dt0Var;
        Map mapMetadata = yzo0Var.metadata();
        String str2 = (String) mapMetadata.get(ContextTrack.Metadata.KEY_AD_ID);
        if (str2 == null) {
            dt0Var = null;
        } else {
            String str3 = (String) mapMetadata.get("duration");
            dt0Var = new dt0(str3 != null ? bm51.m29808s0(10, str3) : null, str2, (String) mapMetadata.get(ContextTrack.Metadata.KEY_MEDIA_MANIFEST_ID));
        }
        if (dt0Var == null) {
            return null;
        }
        return mo26717w(dt0Var, new et0(yzo0Var, noo0Var, ujxVar));
    }

    /* JADX INFO: renamed from: w */
    ozo0 mo26717w(dt0 dt0Var, et0 et0Var);
}
