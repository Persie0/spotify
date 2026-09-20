package p204p;

import com.spotify.offline_esperanto.proto.EsOffline$Context;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$Device;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tjc0 {
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX INFO: renamed from: a */
    public static final f5r m80979a(EsOffline$Device esOffline$Device) {
        b5r b5rVar;
        String name = esOffline$Device.getName();
        if (name.length() == 0) {
            String clientId = esOffline$Device.getClientId();
            int iHashCode = clientId.hashCode();
            if (iHashCode != -1914237170) {
                if (iHashCode != -542408173) {
                    if (iHashCode == -218043280 && clientId.equals("8625198a5ee54c7aa603cd4714d3e639")) {
                        name = "Mighty";
                    } else {
                        name = "";
                    }
                } else if (clientId.equals("88197451c42e4c5d96b00be2e4e30713")) {
                    name = "Samsung Galaxy Watch";
                } else {
                    name = "";
                }
            } else if (clientId.equals("0f053e0244a44e94933c24a5d99b4ef7")) {
                name = "Garmin";
            } else {
                name = "";
            }
        }
        int iM16109t = esOffline$Device.m16109t();
        b5r b5rVar2 = b5r.SMARTWATCH;
        b5r b5rVar3 = b5r.UNKNOWN;
        if (iM16109t != 0) {
            if (iM16109t == 1) {
                b5rVar2 = b5r.COMPUTER;
            } else if (iM16109t == 2) {
                b5rVar2 = b5r.TABLET;
            } else if (iM16109t == 3) {
                b5rVar2 = b5r.SMARTPHONE;
            } else if (iM16109t == 12) {
                b5rVar2 = b5r.AUTOMOBILE;
            } else if (iM16109t != 13) {
                b5rVar = b5rVar3;
            }
            b5rVar = b5rVar2;
        } else {
            String clientId2 = esOffline$Device.getClientId();
            if (clientId2 != null) {
                if ((r11 = clientId2.hashCode()) != -1914237170) {
                }
            }
            b5rVar = b5rVar3;
        }
        return new f5r(name, b5rVar, esOffline$Device.getDeviceId(), esOffline$Device.m16104n(), esOffline$Device.m16108s());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX INFO: renamed from: b */
    public static final v1l0 m80980b(EsOffline$GetContextsResponse esOffline$GetContextsResponse) {
        ae50<EsOffline$ContextInfo> ae50VarM16145p = esOffline$GetContextsResponse.m16145p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16145p, 10));
        for (EsOffline$ContextInfo esOffline$ContextInfo : ae50VarM16145p) {
            String uri = esOffline$ContextInfo.m16096o().getUri();
            wlw wlwVarM16094q = esOffline$ContextInfo.m16096o().m16094q();
            int iOrdinal = wlwVarM16094q.ordinal();
            int i = 1;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i = 2;
                    if (iOrdinal == 2) {
                        i = 6;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            i = 5;
                        } else if (iOrdinal != 5) {
                            na6.m63957e("Invalid availability string: " + wlwVarM16094q);
                            i = 8;
                        } else {
                            i = 6;
                        }
                    }
                } else {
                    i = 8;
                }
            }
            arrayList.add(new u1l0(uri, i));
        }
        return new v1l0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[PHI: r3
      0x0023: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:5:0x0013, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    public static final a1x0 m80981c(EsOffline$Context esOffline$Context) {
        int iM16093p = (int) esOffline$Context.m16093p();
        int iOrdinal = esOffline$Context.m16094q().ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            int i2 = 2;
            if (iOrdinal != 2) {
                i2 = 5;
                if (iOrdinal == 3) {
                    i = i2;
                } else if (iOrdinal == 4) {
                    i = 4;
                } else if (iOrdinal == 5) {
                    i = 3;
                }
            } else {
                i = i2;
            }
        } else {
            i = 6;
        }
        return new a1x0(iM16093p, i);
    }
}
