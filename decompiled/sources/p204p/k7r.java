package p204p;

import com.google.protobuf.Empty;
import com.spotify.esperanto.esperanto.ServiceBase;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes.dex */
public final class k7r implements ServiceBase {

    /* JADX INFO: renamed from: a */
    public final e9r f120180a;

    public k7r(e9r e9rVar) {
        this.f120180a = e9rVar;
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        if (!str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
        }
        if (!str2.equals("RequestLocationSilently")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        wj50.m88279p(Empty.m1936q(bArr));
        return vjf1.m85770t(dau.f47107a, new xuo(this, null, 25)).map(l6q.f130443V0);
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        if (str.equals("spotify.device_location_service.proto.DeviceLocationService")) {
            throw new RuntimeException(dq60.m36615o("Attempted to access unknown method. [", str, ":", str2, "]"));
        }
        throw new RuntimeException(s571.m77251j("Attempted to access mismatched [", str, "], but this service is [spotify.device_location_service.proto.DeviceLocationService]"));
    }

    @Override // com.spotify.esperanto.esperanto.ServiceBase
    public final String getName() {
        return "spotify.device_location_service.proto.DeviceLocationService";
    }
}
