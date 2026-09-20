package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.spotify.music.R;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class yfk extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f272276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfk(Object obj, int i) {
        super(0);
        this.f272275a = i;
        this.f272276b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Object c6x0Var;
        switch (this.f272275a) {
            case 0:
                return new cjc0((dut) ((tqm) ((p22) this.f272276b).f173215d).get(), aak.f13868V0);
            case 1:
                return (ry8) ((i4t0) ((xik) this.f272276b).f261889d).get();
            case 2:
                ((CookieManager) this.f272276b).removeAllCookies(null);
                return w2a1.f247311a;
            case 3:
                return (kv91) ((zqk) this.f272276b).f285413a.get();
            case 4:
                Resources resources = ((qrk) this.f272276b).f191876a.getContext().getResources();
                return Integer.valueOf((resources.getDimensionPixelSize(R.dimen.core_bottom_sheet_grapple_margin_vertical) * 2) + resources.getDimensionPixelSize(R.dimen.core_bottom_sheet_grapple_height));
            case 5:
                Object obj = w2a1.f247311a;
                try {
                    Thread.sleep(TimeUnit.SECONDS.toMillis(4L));
                    c6x0Var = obj;
                } catch (Throwable th) {
                    c6x0Var = new c6x0(th);
                }
                bsk bskVar = (bsk) this.f272276b;
                if (!(c6x0Var instanceof c6x0)) {
                    bskVar.invoke();
                }
                return obj;
            case 6:
                dsk dskVar = (dsk) this.f272276b;
                bji bjiVar = dskVar.f52593b;
                if (bjiVar != null) {
                    return (dsk) bjiVar.mo29483e(new c3f(dskVar, 6));
                }
                return null;
            case 7:
                ((AtomicBoolean) ((twy) this.f272276b).f224516h).set(false);
                return w2a1.f247311a;
            case 8:
                return ((ovf) ((wg61) ((kq0) this.f272276b).f125180b).getValue()).getView();
            case 9:
                return ((bxk) this.f272276b).f31876X.mo24514e();
            case 10:
                Object systemService = ((Context) ((jj1) this.f272276b).f112858b).getSystemService("accessibility");
                if (systemService instanceof AccessibilityManager) {
                    return (AccessibilityManager) systemService;
                }
                return null;
            case 11:
                return ((r7i0) ((i4t0) ((azp0) this.f272276b).f21664b).get()).mo43757c(false);
            case 12:
                Bitmap bitmap = ((jzk) this.f272276b).f117743a.f106714b;
                if (bitmap == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        n0e1.m63430g(byteArrayOutputStream, th2);
                        throw th3;
                    }
                }
            case 13:
                er70 er70Var = ((CoverScreenWidgetProvider) this.f272276b).f183374d;
                if (er70Var != null) {
                    return kkc0.m56706s0(((dtd1) er70Var.get()).f52801a);
                }
                wj50.m88260d0("bitmapCache");
                throw null;
            case 14:
                return ((qfl) this.f272276b).f188232N0;
            case 15:
                return (cq6) ((C1778dh) this.f272276b).f48930c;
            case 16:
                return (z5m0) ((tqm) this.f272276b).get();
            case 17:
                ((hek) this.f272276b).invoke(null);
                return w2a1.f247311a;
            case 18:
                ((jsa) this.f272276b).m54220j(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
                return w2a1.f247311a;
            case 19:
                ((qq8) this.f272276b).m73505m(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return w2a1.f247311a;
            case 20:
                return s571.m77251j("{\"http_engine\":\"", ((iul) ((ycc) this.f272276b).f271453b).f105993f ? "cronetH3" : "cronet", "\"}");
            case 21:
                m1m m1mVar = (m1m) this.f272276b;
                te0 te0Var = m1mVar.f139030b;
                k6i k6iVar = new k6i(1, m1mVar, m1m.class, "loadData", "loadData(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Maybe;", 0, 0, 15);
                l1m l1mVar = l1m.f128754h;
                jqv0 jqv0Var = qpv0.f191387a;
                return te0Var.m80523a(k6iVar, l1mVar, jqv0Var.mo54112b(String.class), jqv0Var.mo54112b(gzv.class));
            case 22:
                return new m6m((o6m) this.f272276b, 1);
            case 23:
                return new m6m((p6m) this.f272276b, 2);
            case 24:
                return new m6m((r6m) this.f272276b, 3);
            case 25:
                return new m6m((s6m) this.f272276b, 4);
            case 26:
                i7m i7mVar = (i7m) this.f272276b;
                return i7m.m49874b(i7mVar, i7mVar.f99582a.mo31750k());
            case 27:
                return new u9m((xf11) this.f272276b);
            case 28:
                return (kv91) ((tqm) ((cdn) this.f272276b).f36916c).get();
            default:
                rho rhoVar = (rho) this.f272276b;
                return new gj80(rhoVar.f199261a.getString(R.string.data_saver_indicator_slow_connection_message), new dj80(rhoVar.f199261a.getString(R.string.data_saver_indicator_exit_message)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfk(csk cskVar, bsk bskVar) {
        super(0);
        this.f272275a = 5;
        this.f272276b = bskVar;
    }
}
