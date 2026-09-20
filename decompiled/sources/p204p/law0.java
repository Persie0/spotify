package p204p;

import com.spotify.esperanto.esperanto.ServiceBase;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$BoolResponse;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$EnumResponse;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$IntResponse;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfig$LookupRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class law0 implements ServiceBase {

    /* JADX INFO: renamed from: a */
    public final u0x0 f131439a;

    public law0(u0x0 u0x0Var) {
        this.f131439a = u0x0Var;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.remote_config.esperanto.proto.RemoteConfig")) {
            throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.remote_config.esperanto.proto.RemoteConfig]"));
        }
        boolean zEquals = str2.equals("lookupBool");
        u0x0 u0x0Var = this.f131439a;
        if (zEquals) {
            EsRemoteConfig$LookupRequest esRemoteConfig$LookupRequestM20401p = EsRemoteConfig$LookupRequest.m20401p(bArr);
            wj50.m88279p(esRemoteConfig$LookupRequestM20401p);
            ynw ynwVarM20395o = EsRemoteConfig$BoolResponse.m20395o();
            Boolean bool = u0x0Var.mo30984c(esRemoteConfig$LookupRequestM20401p.m20402o(), esRemoteConfig$LookupRequestM20401p.getName()).f131571c;
            if (bool != null) {
                ynwVarM20395o.m94263m(bool.booleanValue());
            }
            return ((EsRemoteConfig$BoolResponse) ynwVarM20395o.build()).toByteArray();
        }
        if (str2.equals("lookupInt")) {
            EsRemoteConfig$LookupRequest esRemoteConfig$LookupRequestM20401p2 = EsRemoteConfig$LookupRequest.m20401p(bArr);
            wj50.m88279p(esRemoteConfig$LookupRequestM20401p2);
            aow aowVarM20399o = EsRemoteConfig$IntResponse.m20399o();
            Integer num = u0x0Var.mo30984c(esRemoteConfig$LookupRequestM20401p2.m20402o(), esRemoteConfig$LookupRequestM20401p2.getName()).f131572d;
            if (num != null) {
                aowVarM20399o.m26625m(num.intValue());
            }
            return ((EsRemoteConfig$IntResponse) aowVarM20399o.build()).toByteArray();
        }
        if (!str2.equals("lookupEnum")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        EsRemoteConfig$LookupRequest esRemoteConfig$LookupRequestM20401p3 = EsRemoteConfig$LookupRequest.m20401p(bArr);
        wj50.m88279p(esRemoteConfig$LookupRequestM20401p3);
        znw znwVarM20397o = EsRemoteConfig$EnumResponse.m20397o();
        String str3 = u0x0Var.mo30984c(esRemoteConfig$LookupRequestM20401p3.m20402o(), esRemoteConfig$LookupRequestM20401p3.getName()).f131573e;
        if (str3 != null) {
            znwVarM20397o.m96598m(str3);
        }
        return ((EsRemoteConfig$EnumResponse) znwVarM20397o.build()).toByteArray();
    }

    @Override // com.spotify.esperanto.esperanto.ServiceBase
    public final String getName() {
        return "spotify.remote_config.esperanto.proto.RemoteConfig";
    }
}
