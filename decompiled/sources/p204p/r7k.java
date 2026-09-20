package p204p;

import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class r7k extends ClientBase {
    /* JADX INFO: renamed from: a */
    public final Single m74950a(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest) {
        return callSingle("spotify.player.esperanto.proto.ContextPlayer", "SetOptions", esSetOptions$SetOptionsRequest).map(mc40.f142035P0);
    }
}
