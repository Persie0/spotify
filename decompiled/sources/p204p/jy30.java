package p204p;

import com.spotify.player.model.ContextTrack;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Param;
import io.ably.lib.types.RecoveryKeyContext;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public abstract class jy30 {

    /* JADX INFO: renamed from: a */
    public final ClientOptions f117278a;

    /* JADX INFO: renamed from: b */
    public String f117279b;

    /* JADX INFO: renamed from: c */
    public int f117280c;

    /* JADX INFO: renamed from: d */
    public String f117281d;

    /* JADX INFO: renamed from: e */
    public boolean f117282e = true;

    /* JADX INFO: renamed from: f */
    public final C1761d0 f117283f;

    public jy30(ClientOptions clientOptions, C1761d0 c1761d0) {
        this.f117278a = clientOptions;
        this.f117283f = c1761d0;
    }

    /* JADX INFO: renamed from: a */
    public final Param[] m54775a(Param[] paramArr) {
        RecoveryKeyContext recoveryKeyContextDecode;
        ArrayList arrayList = new ArrayList(Arrays.asList(paramArr));
        arrayList.add(new Param("v", "2"));
        ClientOptions clientOptions = this.f117278a;
        arrayList.add(new Param("format", clientOptions.useBinaryProtocol ? "msgpack" : "json"));
        if (!clientOptions.echoMessages) {
            arrayList.add(new Param("echo", "false"));
        }
        if (!tx8.m81895j(this.f117281d)) {
            arrayList.add(new Param(ContextTrack.TrackAction.RESUME, this.f117281d));
        } else if (!tx8.m81895j(clientOptions.recover) && (recoveryKeyContextDecode = RecoveryKeyContext.decode(clientOptions.recover)) != null) {
            arrayList.add(new Param("recover", recoveryKeyContextDecode.getConnectionKey()));
        }
        String str = clientOptions.clientId;
        if (str != null) {
            arrayList.add(new Param(kyx.f127931b, str));
        }
        if (!this.f117282e) {
            arrayList.add(new Param("heartbeats", "false"));
        }
        Param[] paramArr2 = clientOptions.transportParams;
        if (paramArr2 != null) {
            arrayList.addAll(Arrays.asList(paramArr2));
        }
        arrayList.add(new Param("agent", tx8.m81886a(clientOptions.agents, this.f117283f)));
        tx8.m81888c("p.ky30", "getConnectParams: params = " + arrayList);
        return (Param[]) arrayList.toArray(new Param[arrayList.size()]);
    }
}
