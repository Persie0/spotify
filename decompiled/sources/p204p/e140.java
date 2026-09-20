package p204p;

import com.spotify.offline.offlineplugin_proto.C1080f;
import com.spotify.offline.offlineplugin_proto.EnumC1081g;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e140 {
    /* JADX INFO: renamed from: a */
    public static final uf81 m37518a(String str, EnumC1081g enumC1081g) {
        C1080f c1080fM16056q = EsOfflinePlugin$IdentifyResponse.Result.m16056q();
        c1080fM16056q.m16071q(enumC1081g);
        EsOfflinePlugin$IdentifyResponse.Result result = (EsOfflinePlugin$IdentifyResponse.Result) c1080fM16056q.build();
        wj50.m88279p(result);
        return new uf81(str, result);
    }

    /* JADX INFO: renamed from: b */
    public static final Single m37519b(EsOfflinePlugin$IdentifyCommand esOfflinePlugin$IdentifyCommand, cjb0 cjb0Var, Scheduler scheduler) {
        return Observable.defer(new y040(esOfflinePlugin$IdentifyCommand)).subscribeOn(scheduler).map(z040.f277953a).flatMap(new cdv(cjb0Var, 18), 8).observeOn(scheduler).collect(a140.f11322b, b140.f22210a).map(laz.f131468f);
    }
}
