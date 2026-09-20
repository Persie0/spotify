package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface pco {
    @zk00("dailymix/v5/dailymix_tracks/{stationUri}")
    /* JADX INFO: renamed from: a */
    Single<Object> m69596a(@ubn0("stationUri") String str, @pit0 Map<String, String> map);

    @zk00("dailymix/v5/dailymix_stations/{seed}?image_style=gradient_overlay")
    /* JADX INFO: renamed from: b */
    Single<Object> m69597b(@ubn0("seed") String str, @hit0("count") int i, @pit0 Map<String, String> map);
}
