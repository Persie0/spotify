package p204p;

import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface wt80 {
    /* JADX INFO: renamed from: b */
    static Object m88912b(wt80 wt80Var, String str, st80 st80Var, EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptions, EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions, Map map, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, rz80 rz80Var, fbk fbkVar, int i) {
        st80 st80Var2;
        if ((i & 2) != 0) {
            st80Var2 = new st80(null, null, null, false, null, null, null, 0, null, 511);
        } else {
            st80Var2 = st80Var;
        }
        EsPreparePlayOptions$PreparePlayOptions esPreparePlayOptions$PreparePlayOptionsM17829C = (i & 4) != 0 ? EsPreparePlayOptions$PreparePlayOptions.m17829C() : esPreparePlayOptions$PreparePlayOptions;
        mu80 mu80Var = (mu80) wt80Var;
        return x0h1.m89557A(mu80Var.f147269c, new eu80(esLoggingParams$LoggingParams, str, mu80Var, (i & 32) != 0 ? nau.f152117a : map, st80Var2, esPlayOrigin$PlayOrigin, (i & 16) != 0 ? EsPlayOptions$PlayOptions.m17802r() : esPlayOptions$PlayOptions, esPreparePlayOptions$PreparePlayOptionsM17829C, (i & 128) != 0 ? null : rz80Var, null), fbkVar);
    }
}
