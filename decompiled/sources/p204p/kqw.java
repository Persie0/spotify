package p204p;

import com.google.protobuf.BytesValue;
import com.spotify.connect.castbasic.core.model.DiscoveredDevice;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$ConnectionErrorRequest;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$DeviceId;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$PutDeviceRequest;
import com.spotify.connect.discovery.cast.esperanto.proto.CastMessages$Response;

/* JADX INFO: loaded from: classes.dex */
public final class kqw {

    /* JADX INFO: renamed from: a */
    public final nbc f125463a;

    /* JADX INFO: renamed from: b */
    public final hk60 f125464b;

    /* JADX INFO: renamed from: c */
    public final Object f125465c = kkc0.m56695h0(pft0.m69840u(fwu0.UNKNOWN, 24), pft0.m69840u(fwu0.CAST_INTERNAL_ERROR, 6), pft0.m69840u(fwu0.CASTING_STOPPED, 5), pft0.m69840u(fwu0.APPLICATION_NOT_RUNNING, 2), pft0.m69840u(fwu0.SESSION_START_FAILED, 21), pft0.m69840u(fwu0.SESSION_RESUME_FAILED, 20), pft0.m69840u(fwu0.CAST_SOCKET_ERROR, 7), pft0.m69840u(fwu0.TIMEOUT, 23), pft0.m69840u(fwu0.NETWORK_ERROR, 14), pft0.m69840u(fwu0.CASTING_ROUTE_CHANGED, 4), pft0.m69840u(fwu0.APPLICATION_LAUNCH_ERROR, 0), pft0.m69840u(fwu0.CANCELLED, 3));

    public kqw(nbc nbcVar, hk60 hk60Var) {
        this.f125463a = nbcVar;
        this.f125464b = hk60Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m57123a(int i, String str, ibk ibkVar) {
        zac zacVarM7289q = CastMessages$ConnectionErrorRequest.m7289q();
        Integer num = (Integer) this.f125465c.get(mug1.m62870o(i));
        zacVarM7289q.m95769q(num != null ? num.intValue() : 17);
        zacVarM7289q.m95770r(i);
        if (str != null) {
            zacVarM7289q.m95768m(str);
        }
        Object objM64069b = this.f125463a.m64069b((CastMessages$ConnectionErrorRequest) zacVarM7289q.build(), ibkVar);
        return objM64069b == yuk.f276404a ? objM64069b : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m57124b(String str, ibk ibkVar) {
        dqw dqwVar;
        if (ibkVar instanceof dqw) {
            dqwVar = (dqw) ibkVar;
            int i = dqwVar.f52094c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqwVar.f52094c = i - Integer.MIN_VALUE;
            } else {
                dqwVar = new dqw(this, ibkVar);
            }
        } else {
            dqwVar = new dqw(this, ibkVar);
        }
        Object objM64070c = dqwVar.f52092a;
        int i2 = dqwVar.f52094c;
        if (i2 == 0) {
            bga.m29073P(objM64070c);
            abc abcVarM7291o = CastMessages$DeviceId.m7291o();
            abcVarM7291o.m25347m(str);
            CastMessages$DeviceId castMessages$DeviceId = (CastMessages$DeviceId) abcVarM7291o.build();
            dqwVar.f52094c = 1;
            objM64070c = this.f125463a.m64070c(castMessages$DeviceId, dqwVar);
            yuk yukVar = yuk.f276404a;
            if (objM64070c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM64070c);
        }
        ((CastMessages$Response) objM64070c).m7297n().toString();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Enum m57125c(String str, ibk ibkVar) {
        eqw eqwVar;
        if (ibkVar instanceof eqw) {
            eqwVar = (eqw) ibkVar;
            int i = eqwVar.f61966c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqwVar.f61966c = i - Integer.MIN_VALUE;
            } else {
                eqwVar = new eqw(this, ibkVar);
            }
        } else {
            eqwVar = new eqw(this, ibkVar);
        }
        Object objM64068a = eqwVar.f61964a;
        int i2 = eqwVar.f61966c;
        if (i2 == 0) {
            bga.m29073P(objM64068a);
            abc abcVarM7291o = CastMessages$DeviceId.m7291o();
            abcVarM7291o.m25347m(str);
            CastMessages$DeviceId castMessages$DeviceId = (CastMessages$DeviceId) abcVarM7291o.build();
            eqwVar.f61966c = 1;
            objM64068a = this.f125463a.m64068a(castMessages$DeviceId, eqwVar);
            yuk yukVar = yuk.f276404a;
            if (objM64068a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM64068a);
        }
        CastMessages$Response castMessages$Response = (CastMessages$Response) objM64068a;
        castMessages$Response.m7297n().toString();
        return castMessages$Response.m7297n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m57126d(DiscoveredDevice discoveredDevice, ibk ibkVar) {
        fqw fqwVar;
        if (ibkVar instanceof fqw) {
            fqwVar = (fqw) ibkVar;
            int i = fqwVar.f72294c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqwVar.f72294c = i - Integer.MIN_VALUE;
            } else {
                fqwVar = new fqw(this, ibkVar);
            }
        } else {
            fqwVar = new fqw(this, ibkVar);
        }
        Object objM64071d = fqwVar.f72292a;
        int i2 = fqwVar.f72294c;
        if (i2 == 0) {
            bga.m29073P(objM64071d);
            String json = this.f125464b.toJson(discoveredDevice);
            bbc bbcVarM7295p = CastMessages$PutDeviceRequest.m7295p();
            bbcVarM7295p.m28629m(discoveredDevice.deviceId);
            bbcVarM7295p.m28630q(gva.m45888f(json));
            CastMessages$PutDeviceRequest castMessages$PutDeviceRequest = (CastMessages$PutDeviceRequest) bbcVarM7295p.build();
            "PutDevice request: ".concat(json);
            wj50.m88279p(castMessages$PutDeviceRequest);
            fqwVar.f72294c = 1;
            objM64071d = this.f125463a.m64071d(castMessages$PutDeviceRequest, fqwVar);
            yuk yukVar = yuk.f276404a;
            if (objM64071d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM64071d);
        }
        ((CastMessages$Response) objM64071d).m7297n().toString();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m57127e(String str, ibk ibkVar) {
        gqw gqwVar;
        if (ibkVar instanceof gqw) {
            gqwVar = (gqw) ibkVar;
            int i = gqwVar.f83565c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gqwVar.f83565c = i - Integer.MIN_VALUE;
            } else {
                gqwVar = new gqw(this, ibkVar);
            }
        } else {
            gqwVar = new gqw(this, ibkVar);
        }
        Object objM64072e = gqwVar.f83563a;
        int i2 = gqwVar.f83565c;
        if (i2 == 0) {
            bga.m29073P(objM64072e);
            lva lvaVarM1921p = BytesValue.m1921p();
            lvaVarM1921p.m60073m(gva.m45888f(str));
            BytesValue bytesValue = (BytesValue) lvaVarM1921p.build();
            gqwVar.f83565c = 1;
            objM64072e = this.f125463a.m64072e(bytesValue, gqwVar);
            yuk yukVar = yuk.f276404a;
            if (objM64072e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM64072e);
        }
        ((CastMessages$Response) objM64072e).m7297n().toString();
        return w2a1.f247311a;
    }
}
