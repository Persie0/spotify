package p204p;

import com.google.protobuf.Empty;
import com.spotify.offline_esperanto.proto.EsOffline$SetOfflinePlaybackAllowedRequest;
import com.spotify.offline_esperanto.proto.EsOffline$SetOfflinePlaybackAllowedResponse;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes9.dex */
public final class k0l0 extends lg01 {

    /* JADX INFO: renamed from: c */
    public static final long f118118c;

    /* JADX INFO: renamed from: a */
    public final fwk0 f118119a;

    /* JADX INFO: renamed from: b */
    public final vjz f118120b;

    static {
        hvi0 hvi0Var = cks.f39079b;
        f118118c = jwg1.m54449D(1, ils.SECONDS);
    }

    public k0l0(fwk0 fwk0Var) {
        this.f118119a = fwk0Var;
        this.f118120b = new vjz(new lcw0(new px70(k0e1.m54985d(fwk0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeOfflinePlaybackStatus", Empty.m1933n()).map(y3z.f269014S0)), 22), 21), new far0(3, 6, null), 2);
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f118120b;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        i0l0 i0l0Var;
        Boolean bool2;
        boolean z2;
        fd01 fd01Var;
        if (fbkVar instanceof i0l0) {
            i0l0Var = (i0l0) fbkVar;
            int i = i0l0Var.f97265e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0l0Var.f97265e = i - Integer.MIN_VALUE;
            } else {
                i0l0Var = new i0l0(this, (ibk) fbkVar);
            }
        } else {
            i0l0Var = new i0l0(this, (ibk) fbkVar);
        }
        Object objM96567o = i0l0Var.f97263c;
        int i2 = i0l0Var.f97265e;
        boolean zBooleanValue = false;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            lmw lmwVarM16207o = EsOffline$SetOfflinePlaybackAllowedRequest.m16207o();
            lmwVarM16207o.m59465m(z);
            SingleSource map = this.f118119a.callSingle("spotify.offline_esperanto.proto.Offline", "SetOfflinePlaybackAllowed", (EsOffline$SetOfflinePlaybackAllowedRequest) lmwVarM16207o.build()).map(isy.f105339S0);
            i0l0Var.f97261a = bool;
            i0l0Var.f97262b = z;
            i0l0Var.f97265e = 1;
            objM96567o = zn91.m96567o(map, i0l0Var);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = i0l0Var.f97262b;
            bool = i0l0Var.f97261a;
            bga.m29073P(objM96567o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = i0l0Var.f97262b;
            bool2 = i0l0Var.f97261a;
            bga.m29073P(objM96567o);
        }
        fd01Var = (fd01) objM96567o;
        if (fd01Var == null) {
            return fd01Var;
        }
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else if (z2) {
            zBooleanValue = true;
        }
        return new ed01(Boolean.valueOf(zBooleanValue));
        boolean z3 = z;
        fbk fbkVar2 = null;
        if (!((EsOffline$SetOfflinePlaybackAllowedResponse) objM96567o).m16209n()) {
            return new dd01(0, null);
        }
        hj1 hj1Var = new hj1(this, z3, new plv0(), fbkVar2, 25);
        i0l0Var.f97261a = bool;
        i0l0Var.f97262b = z3;
        i0l0Var.f97265e = 2;
        objM96567o = s1h1.m76981v(f118118c, hj1Var, i0l0Var);
        if (objM96567o != yukVar) {
            bool2 = bool;
            z2 = z3;
            fd01Var = (fd01) objM96567o;
            if (fd01Var == null) {
                return fd01Var;
            }
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else if (z2) {
                zBooleanValue = true;
            }
            return new ed01(Boolean.valueOf(zBooleanValue));
        }
        return yukVar;
    }
}
