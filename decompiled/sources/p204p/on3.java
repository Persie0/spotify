package p204p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentfilter.p052v1.ContentFilter;
import com.spotify.contentfilter.p052v1.ContentFilters;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class on3 implements Predicate, InterfaceC2207oa, iuk, Function, vd50, fk00, e411, zg61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167144a;

    public on3() {
        this.f167144a = 20;
        e7n0 e7n0Var = e7n0.f56962h;
    }

    /* JADX INFO: renamed from: b */
    public static final float m67383b(on3 on3Var, float f, boolean z) {
        on3Var.getClass();
        return z ? -f : f;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m67384c(Context context, String str) {
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("android", 64);
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.m3966b("MBS: Package %s is not found", "android");
            packageInfo = null;
        }
        if ((packageInfo != null ? packageInfo.signatures : null) != null) {
            Signature[] signatureArr = packageInfo.signatures;
            wj50.m88279p(signatureArr);
            if (signatureArr.length != 0) {
                try {
                    packageInfo2 = context.getPackageManager().getPackageInfo(str, 64);
                } catch (PackageManager.NameNotFoundException unused2) {
                    Logger.m3966b("MBS: Package %s is not found", str);
                    packageInfo2 = null;
                }
                if ((packageInfo2 != null ? packageInfo2.signatures : null) != null) {
                    Signature[] signatureArr2 = packageInfo2.signatures;
                    wj50.m88279p(signatureArr2);
                    if (signatureArr2.length != 0) {
                        Signature[] signatureArr3 = packageInfo2.signatures;
                        wj50.m88279p(signatureArr3);
                        int length = signatureArr3.length;
                        Signature[] signatureArr4 = packageInfo.signatures;
                        wj50.m88279p(signatureArr4);
                        if (length == signatureArr4.length) {
                            Signature[] signatureArr5 = packageInfo2.signatures;
                            wj50.m88279p(signatureArr5);
                            int length2 = signatureArr5.length;
                            for (int i = 0; i < length2; i++) {
                                Signature[] signatureArr6 = packageInfo.signatures;
                                wj50.m88279p(signatureArr6);
                                Signature signature = signatureArr6[i];
                                Signature[] signatureArr7 = packageInfo2.signatures;
                                wj50.m88279p(signatureArr7);
                                if (wj50.m88271j(signature, signatureArr7[i])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m67385d(tbn0 tbn0Var) {
        tbn0 tbn0Var2 = f1x0.f64997f;
        return !bm51.m29796g0(tbn0Var.m80400b(), ".class", true);
    }

    /* JADX INFO: renamed from: e */
    public static fv31 m67386e(lv3 lv3Var) {
        return fv31.f73628b.m78181M(s571.m77250i(m67393p(lv3Var), ":consumed"));
    }

    /* JADX INFO: renamed from: f */
    public static fv31 m67387f(lv3 lv3Var) {
        return fv31.f73628b.m78181M(s571.m77250i(m67393p(lv3Var), ":count"));
    }

    /* JADX INFO: renamed from: h */
    public static fv31 m67388h(lv3 lv3Var) {
        return fv31.f73628b.m78181M(s571.m77250i(m67393p(lv3Var), ":date"));
    }

    /* JADX INFO: renamed from: i */
    public static u570 m67389i(s570 s570Var) {
        String str = s570Var.f205739a;
        eg7 eg7Var = new eg7(str, s570Var.f205740b.getBytes(vuc.f244917e));
        p570 p570Var = s570Var.f205741c;
        return new u570(new wi7(str, p570Var != null ? new C1856fd(p570Var.f174092a, p570Var.f174093b, p570Var.f174094c) : null, eg7Var), s570Var.f205742d, s570Var.f205743e, s570Var.f205744f, s570Var.f205745g, s570Var.f205746h);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m67390k(String str) {
        if (str == null) {
            return false;
        }
        Set set = dd41.f47702f;
        return r46.m74709B(str, gn80.ARTIST, gn80.ARTIST_AUTOPLAY, gn80.ARTIST_RADIO, gn80.LIVE_EVENT);
    }

    /* JADX INFO: renamed from: m */
    public static tbn0 m67391m(tbn0 tbn0Var, tbn0 tbn0Var2) {
        return f1x0.f64997f.m80403e(wl51.m88469S0(tbn0Var.f218908a.m51759r(), tbn0Var2.f218908a.m51759r()).replace('\\', '/'));
    }

    /* JADX INFO: renamed from: o */
    public static s570 m67392o(u570 u570Var) {
        wi7 wi7Var = u570Var.f226927a;
        eg7 eg7Var = wi7Var.f251544c;
        if (!(eg7Var instanceof eg7)) {
            eg7Var = null;
        }
        byte[] bArr = eg7Var != null ? eg7Var.f59235b : null;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr, vuc.f244917e);
        String str2 = wi7Var.f251542a;
        C1856fd c1856fd = wi7Var.f251543b;
        return new s570(str2, str, c1856fd != null ? new p570(c1856fd.f68281a, c1856fd.f68282b, c1856fd.f68283c) : null, u570Var.f226928b, u570Var.f226929c, u570Var.f226930d, u570Var.f226931e, u570Var.f226932f);
    }

    /* JADX INFO: renamed from: p */
    public static String m67393p(lv3 lv3Var) {
        return "audiobook_onboarding:bottom_sheet:".concat(lv3Var.f137209a);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.CELEBRITY_BLEND;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f167144a) {
            case 9:
                return new jsy0(false);
            case 12:
                ae50 ae50VarM7998n = ((ContentFilters) obj).m7998n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM7998n, 10));
                int i = 0;
                for (Object obj2 : ae50VarM7998n) {
                    int i2 = i + 1;
                    if (i < 0) {
                        h6f.m46722S();
                        throw null;
                    }
                    ContentFilter contentFilter = (ContentFilter) obj2;
                    wj50.m88279p(contentFilter);
                    arrayList.add(new j6z(contentFilter.m7997n(), i, contentFilter.getTitle(), false));
                    i = i2;
                }
                return arrayList;
            case 20:
                return e7n0.f56962h.get(obj);
            default:
                pqm0 pqm0Var = (pqm0) obj;
                return ik81.m50926h((PlayerState) pqm0Var.f180350a, ((Boolean) pqm0Var.f180351b).booleanValue(), false);
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        w5r w5rVar;
        switch (this.f167144a) {
            case 11:
                slw slwVarM78506a = slw.m78506a(i);
                return slwVarM78506a == null ? slw.UNRECOGNIZED : slwVarM78506a;
            case 12:
            default:
                hn80 hn80VarM47999a = hn80.m47999a(i);
                return hn80VarM47999a == null ? hn80.UNRECOGNIZED : hn80VarM47999a;
            case 13:
                if (i == 0) {
                    w5rVar = w5r.DEVICE_CAPABILITY_UNSPECIFIED;
                } else if (i == 1) {
                    w5rVar = w5r.DEVICE_CAPABILITY_INLINE_UPSELL;
                } else if (i != 2) {
                    w5rVar = i != 3 ? null : w5r.DEVICE_CAPABILITY_GENERIC_CONSIDERATION_PAGE;
                } else {
                    w5rVar = w5r.DEVICE_CAPABILITY_BOTTOMSHEET_UPSELL;
                }
                return w5rVar == null ? w5r.UNRECOGNIZED : w5rVar;
        }
    }

    @Override // p204p.e411
    /* JADX INFO: renamed from: g */
    public Object mo37705g(eo01 eo01Var, fbk fbkVar) {
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: j */
    public Signature[] mo67395j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX INFO: renamed from: l */
    public long m67396l(long j) {
        return -1L;
    }

    /* JADX INFO: renamed from: n */
    public dil m67397n(qla1 qla1Var) {
        String str = null;
        String str2 = qla1Var != null ? qla1Var.f189802a : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = qla1Var != null ? qla1Var.f189804c : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = qla1Var != null ? qla1Var.f189803b : null;
        if (str4 == null) {
            str4 = "";
        }
        if (qla1Var != null && ((str = qla1Var.f189807f) == null || str.length() == 0)) {
            str = qla1Var.f189806e;
        }
        return new dil(str2, str4, str3, str != null ? str : "");
    }

    @Override // p204p.fk00
    public void onFailure(Throwable th) {
        na6.m63971s("Failed to connect the media notification controller");
    }

    @Override // p204p.fk00
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((Set) ((pqm0) obj).f180351b).contains("social_radar");
    }

    public String toString() {
        switch (this.f167144a) {
            case 4:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ on3(int i) {
        this.f167144a = i;
    }

    public /* synthetic */ on3(Object obj, int i) {
        this.f167144a = i;
    }

    public /* synthetic */ on3(boolean z) {
        this.f167144a = 18;
    }

    public on3(son sonVar, otn otnVar) {
        this.f167144a = 6;
    }

    @Override // p204p.zg61
    /* JADX INFO: renamed from: a */
    public void mo67394a(ovy ovyVar) {
    }
}
