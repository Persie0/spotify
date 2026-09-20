package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.download.esperanto.proto.EsDownload$RequestDataResponse;
import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class new0 implements BiFunction, Function, g3e, yh00, Predicate, rem, tn61 {

    /* JADX INFO: renamed from: c */
    public static Boolean f153140c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153149a;

    /* JADX INFO: renamed from: b */
    public static final new0 f153138b = new new0(0);

    /* JADX INFO: renamed from: d */
    public static final new0 f153142d = new new0(1);

    /* JADX INFO: renamed from: e */
    public static final new0 f153143e = new new0(2);

    /* JADX INFO: renamed from: f */
    public static final new0 f153144f = new new0(3);

    /* JADX INFO: renamed from: g */
    public static final new0 f153145g = new new0(4);

    /* JADX INFO: renamed from: h */
    public static final new0 f153146h = new new0(5);

    /* JADX INFO: renamed from: i */
    public static final new0 f153147i = new new0(6);

    /* JADX INFO: renamed from: t */
    public static final new0 f153148t = new new0(7);

    /* JADX INFO: renamed from: X */
    public static final wod1 f153131X = new wod1(2);

    /* JADX INFO: renamed from: Y */
    public static final new0 f153133Y = new new0(9);

    /* JADX INFO: renamed from: Z */
    public static final new0 f153135Z = new new0(10);

    /* JADX INFO: renamed from: L0 */
    public static final new0 f153119L0 = new new0(11);

    /* JADX INFO: renamed from: M0 */
    public static final new0 f153120M0 = new new0(12);

    /* JADX INFO: renamed from: N0 */
    public static final new0 f153121N0 = new new0(13);

    /* JADX INFO: renamed from: O0 */
    public static final new0 f153122O0 = new new0(14);

    /* JADX INFO: renamed from: P0 */
    public static final new0 f153123P0 = new new0(15);

    /* JADX INFO: renamed from: Q0 */
    public static final new0 f153124Q0 = new new0(16);

    /* JADX INFO: renamed from: R0 */
    public static final new0 f153125R0 = new new0(18);

    /* JADX INFO: renamed from: S0 */
    public static final new0 f153126S0 = new new0(19);

    /* JADX INFO: renamed from: T0 */
    public static final new0 f153127T0 = new new0(20);

    /* JADX INFO: renamed from: U0 */
    public static final new0 f153128U0 = new new0(21);

    /* JADX INFO: renamed from: V0 */
    public static final new0 f153129V0 = new new0(22);

    /* JADX INFO: renamed from: W0 */
    public static final new0 f153130W0 = new new0(23);

    /* JADX INFO: renamed from: X0 */
    public static final new0 f153132X0 = new new0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final new0 f153134Y0 = new new0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final new0 f153136Z0 = new new0(26);

    /* JADX INFO: renamed from: a1 */
    public static final new0 f153137a1 = new new0(27);

    /* JADX INFO: renamed from: b1 */
    public static final new0 f153139b1 = new new0(28);

    /* JADX INFO: renamed from: c1 */
    public static final new0 f153141c1 = new new0(29);

    public /* synthetic */ new0(int i) {
        this.f153149a = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m64308b(n6i n6iVar) {
        return ((Boolean) ((wg61) n6iVar.f150892c).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public Intent m64309a(Context context) {
        if (!p2l.f173365a.contains(this)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent intent = new Intent("ReceiverService");
                    intent.setPackage("com.facebook.katana");
                    if (packageManager.resolveService(intent, 0) != null && s8y.m77538a(context, "com.facebook.katana")) {
                        return intent;
                    }
                    Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage("com.facebook.wakizashi");
                    if (packageManager.resolveService(intent2, 0) != null && s8y.m77538a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(this, th);
                return null;
            }
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f153149a) {
            case 4:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 5:
                return Boolean.valueOf(((t84) obj).f217957b);
            case 6:
                return ((xh5) obj).f261445a;
            case 7:
            case 8:
            case 10:
            case 14:
            case 17:
            case 21:
            case 24:
            case 27:
            default:
                return new fbb0(((Boolean) obj).booleanValue());
            case 9:
                return new CompletableFromAction(new it7((hv31) obj, 0));
            case 11:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 12:
                return ((qst) ((sst) obj)).f192180b;
            case 13:
                xaw xawVar = (xaw) g6f.m43745s0((List) obj);
                String str = xawVar != null ? xawVar.f259792s : null;
                return str == null ? "" : str;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return Status.m6850p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 16:
                return (String) ((xul0) obj).mo49278b();
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsContextPlayerError$ContextPlayerError.m17682o(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerError.ContextPlayerError: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 19:
                fel felVar = (fel) obj;
                boolean z = felVar.f68791g;
                sdl sdlVar = felVar.f68792h;
                return new i96(z, sdlVar.f208034a, sdlVar.f208035b, felVar.f68793i);
            case 20:
                return a3w0.f12077a;
            case 22:
                Logger.m3967c((Throwable) obj, "Failed to resolve list tracks for queue", new Object[0]);
                return qu1.f192540e;
            case 23:
                return (api) ((xul0) obj).mo49278b();
            case 25:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsDownload$RequestDataResponse.m9541t(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.RequestDataResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 26:
                return new ztw((GetSpotifyCheckoutPageResponse) obj);
            case 28:
                return Long.valueOf(((EsPrefs$Value) obj).m19528s());
        }
    }

    /* JADX INFO: renamed from: c */
    public int m64310c(String str, int i, List list) {
        if (p2l.f173365a.contains(this)) {
            return 0;
        }
        try {
            Context contextM69343a = p8y.m69343a();
            Intent intentM64309a = m64309a(contextM69343a);
            int i2 = 2;
            if (intentM64309a == null) {
                return 2;
            }
            mew0 mew0Var = new mew0();
            try {
                if (!contextM69343a.bindService(intentM64309a, mew0Var, 1)) {
                    return 3;
                }
                try {
                    try {
                        mew0Var.f142877a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = mew0Var.f142878b;
                        if (iBinder != null) {
                            wx30 wx30VarM86631C = vx30.m86631C(iBinder);
                            Bundle bundleM58819c = lew0.m58819c(str, i, list);
                            if (bundleM58819c != null) {
                                ((ux30) wx30VarM86631C).m84129C(bundleM58819c);
                                bundleM58819c.toString();
                            }
                            i2 = 1;
                        }
                        contextM69343a.unbindService(mew0Var);
                        return i2;
                    } catch (InterruptedException unused) {
                        p8y p8yVar = p8y.f175080a;
                        contextM69343a.unbindService(mew0Var);
                        return 3;
                    }
                } catch (RemoteException unused2) {
                    p8y p8yVar2 = p8y.f175080a;
                    contextM69343a.unbindService(mew0Var);
                    return 3;
                }
            } catch (Throwable th) {
                contextM69343a.unbindService(mew0Var);
                p8y p8yVar3 = p8y.f175080a;
                throw th;
            }
        } catch (Throwable th2) {
            p2l.m68953a(this, th2);
            return 0;
        }
    }

    @Override // p204p.rem
    /* JADX INFO: renamed from: f */
    public Iterable mo30748f(Object obj) {
        int i = txq.f224744a;
        Collection collectionMo32019p = ((s3b1) obj).mo32019p();
        ArrayList arrayList = new ArrayList(i6f.m49804T(collectionMo32019p, 10));
        Iterator it = ((ArrayList) collectionMo32019p).iterator();
        while (it.hasNext()) {
            arrayList.add(((s3b1) it.next()).mo27377a());
        }
        return arrayList;
    }

    @Override // p204p.g3e
    /* JADX INFO: renamed from: l */
    public fiz mo28356l(boolean z) {
        return new ysk(Boolean.valueOf(z), 27);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f153149a) {
            case 1:
                gmr0 gmr0Var = (gmr0) obj;
                List<j2e> list = (List) obj2;
                ArrayList arrayList = new ArrayList();
                String str = gmr0Var.f81451b;
                String str2 = gmr0Var.f81455f;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new C1748co(null, str, str2));
                for (j2e j2eVar : list) {
                    String str3 = j2eVar.f108014a;
                    String str4 = j2eVar.f108015b;
                    String str5 = j2eVar.f108016c;
                    boolean z = j2eVar.f108017d;
                    arrayList.add(new C1712bo(j2eVar.f108019f, str3, str4, str5, j2eVar.f108018e, z, j2eVar.f108020g));
                }
                return arrayList;
            case 2:
                return new pqm0((String) obj, (Restrictions) obj2);
            case 3:
                return new pqm0((PlayerState) obj, (pf40) obj2);
            default:
                return new fd8((ed8) obj2, ((fd8) obj).f68396b);
        }
    }
}
