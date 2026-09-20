package p204p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nzk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f160102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzk0(Object obj, int i) {
        super(0);
        this.f160101a = i;
        this.f160102b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, p.fr70] */
    @Override // p204p.eh00
    public final Object invoke() {
        String string;
        Object c6x0Var;
        int i = this.f160101a;
        w2a1 w2a1Var = w2a1.f247311a;
        ?? r4 = this.f160102b;
        switch (i) {
            case 0:
                long j = pzk0.f183720g;
                Activity activity = ((pzk0) r4).f183721a;
                return new jzk0(j, false, new gj80(activity.getString(R.string.offline_limited_experience_indicator_no_internet_connection), new dj80(activity.getString(R.string.offline_limited_experience_indicator_back_online))));
            case 1:
                guh0 guh0Var = (guh0) r4;
                return Observable.combineLatest((Observable) ((wg61) guh0Var.f84483g).getValue(), (Observable) ((wg61) guh0Var.f84485i).getValue(), (Observable) ((wg61) guh0Var.f84484h).getValue(), hvi0.f95735e).onErrorReturn(dzx.f54773S0).startWithItem(Boolean.FALSE).distinctUntilChanged();
            case 2:
                return z2h1.m95219z((qy8) ((vvk0) ((h1l0) r4).f86657c).invoke(), null, null, 7);
            case 3:
                return q1l0.m71924a((q1l0) r4, s601.m77310m0(qpe1.f191284a, qpe1.f191286c, qpe1.f191287d));
            case 4:
                ((b7l0) r4).m28388d();
                return w2a1Var;
            case 5:
                tfl0 tfl0Var = (tfl0) r4;
                bji bjiVar = tfl0Var.f220014c;
                if (bjiVar != null) {
                    return (tfl0) bjiVar.mo29483e(new au3(tfl0Var, 14));
                }
                return null;
            case 6:
                yk0.m93950b((yk0) r4).mo24870b();
                return w2a1Var;
            case 7:
                return ykn.m93998n((ykn) r4);
            case 8:
                return ((mam0) r4).f141612a;
            case 9:
                return (String) ((fcm0) r4).f68147a.invoke();
            case 10:
                Bundle bundle = ((wgm0) r4).f98701f;
                if (bundle == null || (string = bundle.getString("page_key")) == null) {
                    throw new IllegalArgumentException("Missing page_key");
                }
                return string;
            case 11:
                return (b250) r4;
            case 12:
                yk0.m93951c((yk0) r4).mo24870b();
                return w2a1Var;
            case 13:
                return mgg1.m61714i(r4).mo34134w();
            case 14:
                return ((vmo0) r4).f242888e.m25127i();
            case 15:
                q0p0 q0p0Var = (q0p0) r4;
                q0p0Var.f184055t = (p8p0) q0p0Var.f184046a.get();
                q0p0Var.f184043X = (map0) q0p0Var.f184047b.get();
                return w2a1Var;
            case 16:
                return (kv91) ((r1q0) r4).f194895a.get();
            case 17:
                List listM29886a = ((bmr0) r4).m29886a();
                ArrayList arrayList = new ArrayList();
                Iterator it = listM29886a.iterator();
                while (it.hasNext()) {
                    try {
                        Uri uri = Uri.parse((String) it.next());
                        String scheme = uri.getScheme();
                        String host = uri.getHost();
                        c6x0Var = (scheme != null && host != null) ? scheme + "://" + host : null;
                    } catch (Throwable th) {
                        c6x0Var = new c6x0(th);
                    }
                    if (c6x0Var instanceof c6x0) {
                        c6x0Var = null;
                    }
                    String str = (String) c6x0Var;
                    if (str != null) {
                        arrayList.add(str);
                    }
                    break;
                }
                return arrayList;
            case 18:
                return h1k.m46460a(((nbs0) r4).f152343c);
            case 19:
                return ((scs0) r4).f207792b.m25127i();
            case 20:
                return kss0.m57250a((kss0) r4).m93573c(h6f.m46715L(bps0.f29602a, aps0.f18006a));
            case 21:
                m8t0 m8t0Var = (m8t0) r4;
                bji bjiVar2 = m8t0Var.f141125b;
                if (bjiVar2 != null) {
                    return (m8t0) bjiVar2.mo29483e(new au3(m8t0Var, 16));
                }
                return null;
            case 22:
                l5u0 l5u0Var = (l5u0) r4;
                return Integer.valueOf(l5u0Var.f130010b.hashCode() + (l5u0Var.f130009a.hashCode() * 31));
            case 23:
                ((a8v0) r4).m25055d(w7v0.f248792b);
                return w2a1Var;
            case 24:
                wmd0 wmd0Var = ((rmx0) r4).f200646l;
                return Boolean.valueOf(wmd0Var != null ? wmd0Var.m88559f() : false);
            case 25:
                return k0e1.m54985d(((cyx0) r4).f43404d);
            case 26:
                rth rthVar = new rth();
                rthVar.m76393n(pka1.f178421b);
                rthVar.m76389j("image-upload.spotify.com");
                return (ld40) ((RetrofitMaker) r4).createCustomHostService(ld40.class, rthVar.m76382c());
            case 27:
                ((ObservableEmitter) r4).onNext(dhy0.f49188a);
                return w2a1Var;
            case 28:
                ((hly0) r4).f92767a = gly0.f81217c;
                return w2a1Var;
            default:
                return (r7i0) ((rlv0) r4).f200373a;
        }
    }
}
