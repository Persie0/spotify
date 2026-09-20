package p204p;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.connect.esperanto.proto.VolumeMessages$VolumeResponse;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import p196j$.util.Base64;
import spotify.mdata.proto.Mdata$LocalBatchedExtensionResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class t6x0 implements Init, Predicate, q500, BiFunction, Function, q1k, tn61, w1j0, zn70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217648a;

    /* JADX INFO: renamed from: b */
    public static final t6x0 f217638b = new t6x0(1);

    /* JADX INFO: renamed from: c */
    public static final t6x0 f217640c = new t6x0(2);

    /* JADX INFO: renamed from: d */
    public static final t6x0 f217641d = new t6x0(3);

    /* JADX INFO: renamed from: e */
    public static final t6x0 f217642e = new t6x0(4);

    /* JADX INFO: renamed from: f */
    public static final t6x0 f217643f = new t6x0(5);

    /* JADX INFO: renamed from: g */
    public static final t6x0 f217644g = new t6x0(6);

    /* JADX INFO: renamed from: h */
    public static final t6x0 f217645h = new t6x0(7);

    /* JADX INFO: renamed from: i */
    public static final t6x0 f217646i = new t6x0(8);

    /* JADX INFO: renamed from: t */
    public static final ia7 f217647t = new ia7(3);

    /* JADX INFO: renamed from: X */
    public static final t6x0 f217631X = new t6x0(10);

    /* JADX INFO: renamed from: Y */
    public static final t6x0 f217633Y = new t6x0(11);

    /* JADX INFO: renamed from: Z */
    public static final t6x0 f217635Z = new t6x0(12);

    /* JADX INFO: renamed from: L0 */
    public static final t6x0 f217619L0 = new t6x0(13);

    /* JADX INFO: renamed from: M0 */
    public static final t6x0 f217620M0 = new t6x0(14);

    /* JADX INFO: renamed from: N0 */
    public static final t6x0 f217621N0 = new t6x0(15);

    /* JADX INFO: renamed from: O0 */
    public static final t6x0 f217622O0 = new t6x0(16);

    /* JADX INFO: renamed from: P0 */
    public static final t6x0 f217623P0 = new t6x0(17);

    /* JADX INFO: renamed from: Q0 */
    public static final t6x0 f217624Q0 = new t6x0(18);

    /* JADX INFO: renamed from: R0 */
    public static final t6x0 f217625R0 = new t6x0(19);

    /* JADX INFO: renamed from: S0 */
    public static final t6x0 f217626S0 = new t6x0(20);

    /* JADX INFO: renamed from: T0 */
    public static final t6x0 f217627T0 = new t6x0(21);

    /* JADX INFO: renamed from: U0 */
    public static final t6x0 f217628U0 = new t6x0(22);

    /* JADX INFO: renamed from: V0 */
    public static final t6x0 f217629V0 = new t6x0(23);

    /* JADX INFO: renamed from: W0 */
    public static final t6x0 f217630W0 = new t6x0(24);

    /* JADX INFO: renamed from: X0 */
    public static final t6x0 f217632X0 = new t6x0(25);

    /* JADX INFO: renamed from: Y0 */
    public static final t6x0 f217634Y0 = new t6x0(26);

    /* JADX INFO: renamed from: Z0 */
    public static final t6x0 f217636Z0 = new t6x0(27);

    /* JADX INFO: renamed from: a1 */
    public static final t6x0 f217637a1 = new t6x0(28);

    /* JADX INFO: renamed from: b1 */
    public static final t6x0 f217639b1 = new t6x0(29);

    public /* synthetic */ t6x0(int i) {
        this.f217648a = i;
    }

    @Override // p204p.q500
    /* JADX INFO: renamed from: a */
    public Bundle mo42945a(Intent intent, dd41 dd41Var, e301 e301Var) {
        Bundle extras = intent.getExtras();
        return extras == null ? new Bundle() : extras;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean zM45947s;
        switch (this.f217648a) {
            case 7:
                return new xhc(((Boolean) obj).booleanValue());
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoItemsResponse.m6874o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return VolumeMessages$VolumeResponse.m7444r(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.connect.esperanto.proto.VolumeMessages.VolumeResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 15:
                Double d = ((egr) obj).f59380a;
                return Double.valueOf(d != null ? d.doubleValue() : -1.0d);
            case 21:
                try {
                    zM45947s = gwg1.m45947s((String) obj);
                    break;
                } catch (ConvertProductStateValueException unused) {
                    zM45947s = false;
                }
                return Boolean.valueOf(zM45947s);
            case 22:
                return ru10.valueOf((String) obj);
            case 24:
                return new x960((yc8) obj);
            case 27:
                return geg1.m44518y(new drc0(((joc0) obj).f114386a));
            default:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Mdata$LocalBatchedExtensionResponse.m97628n(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.mdata.proto.Mdata.LocalBatchedExtensionResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
        }
    }

    @Override // p204p.q1k
    /* JADX INFO: renamed from: b */
    public xv41 mo52223b() {
        return jag1.m52819d(nau.f152117a);
    }

    @Override // p204p.zn70
    /* JADX INFO: renamed from: c */
    public Object mo36519c(rx10 rx10Var, fbk fbkVar) {
        long j = rx10Var.f203459u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Canvas canvas2 = ly3.f137948a;
        ky3 ky3Var = new ky3();
        ky3Var.f127640a = canvas;
        rx10Var.m76594c(ky3Var, null);
        return bitmapCreateBitmap;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((y11) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        return tm4.m81100x(ed50.class, new hd50(dataString, intent.getBooleanExtra("age_assurance_flow_completed", false)), new xzq0(3, false, 6));
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f217648a) {
            case 2:
                return ((dyb) obj) != dyb.PROJECTED;
            case 3:
                return ((afa0) obj) == afa0.f15106b;
            case 4:
                dm7 dm7Var = (dm7) obj;
                return (dm7Var instanceof am7) || (dm7Var instanceof cm7);
            case 14:
                return ((xul0) obj).mo49279c();
            case 20:
                return ((e301) obj).f55572b;
            case 26:
                return ((e301) obj).f55572b;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f217648a) {
            case 6:
                return Boolean.valueOf(((CacheState) obj) == CacheState.LOADED && ((Boolean) obj2).booleanValue());
            default:
                return (xul0) obj2;
        }
    }
}
