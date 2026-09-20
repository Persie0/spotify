package p204p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.bluetooth.categorizer.BluetoothCategorizer;
import com.spotify.bluetooth.categorizer.CategorizerResponse;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class jz9 implements BluetoothCategorizer {

    /* JADX INFO: renamed from: i */
    public static final fv31 f117624i = fv31.f73628b.m78182S("known_bluetooth_devices_v2");

    /* JADX INFO: renamed from: j */
    public static final long f117625j = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: a */
    public final xre f117626a;

    /* JADX INFO: renamed from: b */
    public final dwx f117627b;

    /* JADX INFO: renamed from: c */
    public final fk60 f117628c;

    /* JADX INFO: renamed from: d */
    public final luk f117629d;

    /* JADX INFO: renamed from: e */
    public final c9k f117630e;

    /* JADX INFO: renamed from: f */
    public final c9k f117631f;

    /* JADX INFO: renamed from: g */
    public final hv31 f117632g;

    /* JADX INFO: renamed from: h */
    public final pn80 f117633h = new pn80(ql51.f189738a, s970.Companion.serializer());

    public jz9(Context context, xre xreVar, dwx dwxVar, wb11 wb11Var, fk60 fk60Var, luk lukVar, luk lukVar2) {
        this.f117626a = xreVar;
        this.f117627b = dwxVar;
        this.f117628c = fk60Var;
        this.f117629d = lukVar;
        this.f117630e = dq60.m36621u(lukVar2);
        this.f117631f = dq60.m36621u(lukVar);
        this.f117632g = wb11Var.mo35843c(context);
    }

    /* JADX INFO: renamed from: a */
    public static final void m54851a(jz9 jz9Var, String str, CategorizerResponse categorizerResponse) {
        LinkedHashMap linkedHashMapM56709v0 = kkc0.m56709v0(jz9Var.m54852b());
        r970 r970Var = s970.Companion;
        ((wy3) jz9Var.f117626a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r970Var.getClass();
        linkedHashMapM56709v0.put(str, new s970(categorizerResponse, jCurrentTimeMillis));
        String strM41881b = jz9Var.f117628c.m41881b(jz9Var.f117633h, linkedHashMapM56709v0);
        lv31 lv31VarEdit = jz9Var.f117632g.edit();
        lv31VarEdit.m60051d(f117624i, strM41881b);
        lv31VarEdit.m60054g();
    }

    /* JADX INFO: renamed from: b */
    public final Map m54852b() {
        nau nauVar = nau.f152117a;
        String strMo48710e = this.f117632g.mo48710e(f117624i, "");
        String str = strMo48710e != null ? strMo48710e : "";
        try {
            return str.length() == 0 ? nauVar : (Map) this.f117628c.m41880a(str, this.f117633h);
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38564m("Failed to parse cached devices - ", qpv0.f191387a.mo54112b(e.getClass()).mo29111F()), new Object[0]);
            return nauVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.bluetooth.categorizer.BluetoothCategorizer
    public final Object categorize(String str, fbk fbkVar) {
        iz9 iz9Var;
        if (fbkVar instanceof iz9) {
            iz9Var = (iz9) fbkVar;
            int i = iz9Var.f107173d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iz9Var.f107173d = i - Integer.MIN_VALUE;
            } else {
                iz9Var = new iz9(this, fbkVar);
            }
        } else {
            iz9Var = new iz9(this, fbkVar);
        }
        Object objM96567o = iz9Var.f107171b;
        int i2 = iz9Var.f107173d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single<CategorizerResponse> singleLookup = this.f117627b.lookup(str);
                iz9Var.f107170a = str;
                iz9Var.f107173d = 1;
                objM96567o = zn91.m96567o(singleLookup, iz9Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = iz9Var.f107170a;
                bga.m29073P(objM96567o);
            }
            Objects.toString((CategorizerResponse) objM96567o);
            return (CategorizerResponse) objM96567o;
        } catch (Exception e) {
            Logger.m3967c(e, edb.m38566o("Network call failed for device: ", str, " - ", qpv0.f191387a.mo54112b(e.getClass()).mo29111F()), new Object[0]);
            if ((e instanceof IOException) || (e instanceof HttpException)) {
                return null;
            }
            throw e;
        }
    }

    @Override // com.spotify.bluetooth.categorizer.BluetoothCategorizer
    public final fiz categorizeAndUpdateCaches(ExternalAccessoryDescription externalAccessoryDescription) {
        return categorizeAndUpdateCaches(externalAccessoryDescription.name);
    }

    @Override // com.spotify.bluetooth.categorizer.BluetoothCategorizer
    public final void stop() {
        kk40.m56680v(this.f117630e, null);
        kk40.m56680v(this.f117631f, null);
    }

    @Override // com.spotify.bluetooth.categorizer.BluetoothCategorizer
    public final fiz categorizeAndUpdateCaches(String str) {
        return nxf1.m65833l(new wj0(str, this, (fbk) null, 14));
    }
}
