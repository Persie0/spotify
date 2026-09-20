package p204p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ServiceBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes6.dex */
public final class nn4 implements ServiceBase {

    /* JADX INFO: renamed from: a */
    public final gcu0 f156321a;

    /* JADX INFO: renamed from: b */
    public final luk f156322b;

    public nn4(gcu0 gcu0Var, utk utkVar) {
        this.f156321a = gcu0Var;
        this.f156322b = utkVar;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
        }
        if (!str2.equals("reachability")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        wj50.m88279p(Empty.m1936q(bArr));
        return k0e1.m54988g(cyf1.m34374j(new C2481v3(this.f156321a.mo44322d(), 29), this.f156322b), dau.f47107a).map(pnq0.f179506f);
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor]"));
    }

    @Override // com.spotify.esperanto.esperanto.ServiceBase
    public final String getName() {
        return "spotify.connectivity.reachability.esperanto.proto.ReachabilityMonitor";
    }
}
