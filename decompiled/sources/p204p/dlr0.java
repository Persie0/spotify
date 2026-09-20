package p204p;

import android.os.Bundle;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import com.spotify.watchfeedentrypoints.api.p188v1.DiscoveryFromSeedResponse;
import com.spotify.watchfeedentrypoints.component.item.p190v1.WatchFeedVideoCarouselComponent;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes10.dex */
public final class dlr0 implements Predicate, Function, yxf, BiPredicate, tpk, com.spotify.mobius.functions.Function, tn61, Function5, yh00, ddl, cy51, InterfaceC1698bb {

    /* JADX INFO: renamed from: Z0 */
    public static final dlr0 f50335Z0;

    /* JADX INFO: renamed from: a1 */
    public static final dlr0 f50336a1;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50348a;

    /* JADX INFO: renamed from: b */
    public static final dlr0 f50337b = new dlr0(0);

    /* JADX INFO: renamed from: c */
    public static final dlr0 f50339c = new dlr0(1);

    /* JADX INFO: renamed from: d */
    public static final dlr0 f50341d = new dlr0(2);

    /* JADX INFO: renamed from: e */
    public static final dlr0 f50342e = new dlr0(3);

    /* JADX INFO: renamed from: f */
    public static final dlr0 f50343f = new dlr0(4);

    /* JADX INFO: renamed from: g */
    public static final dlr0 f50344g = new dlr0(5);

    /* JADX INFO: renamed from: h */
    public static final dlr0 f50345h = new dlr0(6);

    /* JADX INFO: renamed from: i */
    public static final dlr0 f50346i = new dlr0(7);

    /* JADX INFO: renamed from: t */
    public static final dlr0 f50347t = new dlr0(8);

    /* JADX INFO: renamed from: X */
    public static final dlr0 f50330X = new dlr0(9);

    /* JADX INFO: renamed from: Y */
    public static final dlr0 f50332Y = new dlr0(10);

    /* JADX INFO: renamed from: Z */
    public static final dlr0 f50334Z = new dlr0(11);

    /* JADX INFO: renamed from: L0 */
    public static final dlr0 f50318L0 = new dlr0(12);

    /* JADX INFO: renamed from: M0 */
    public static final dlr0 f50319M0 = new dlr0(13);

    /* JADX INFO: renamed from: N0 */
    public static final dlr0 f50320N0 = new dlr0(14);

    /* JADX INFO: renamed from: O0 */
    public static final dlr0 f50321O0 = new dlr0(15);

    /* JADX INFO: renamed from: P0 */
    public static final dlr0 f50322P0 = new dlr0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final dlr0 f50323Q0 = new dlr0(17);

    /* JADX INFO: renamed from: R0 */
    public static final dlr0 f50324R0 = new dlr0(18);

    /* JADX INFO: renamed from: S0 */
    public static final dlr0 f50325S0 = new dlr0(19);

    /* JADX INFO: renamed from: T0 */
    public static final dlr0 f50326T0 = new dlr0(20);

    /* JADX INFO: renamed from: U0 */
    public static final dlr0 f50327U0 = new dlr0(21);

    /* JADX INFO: renamed from: V0 */
    public static final dlr0 f50328V0 = new dlr0(22);

    /* JADX INFO: renamed from: W0 */
    public static final dlr0 f50329W0 = new dlr0(23);

    /* JADX INFO: renamed from: X0 */
    public static final dlr0 f50331X0 = new dlr0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final dlr0 f50333Y0 = new dlr0(25);

    /* JADX INFO: renamed from: b1 */
    public static final dlr0 f50338b1 = new dlr0(27);

    /* JADX INFO: renamed from: c1 */
    public static final /* synthetic */ dlr0 f50340c1 = new dlr0(28);

    static {
        int i = 26;
        f50335Z0 = new dlr0(i);
        f50336a1 = new dlr0(i);
    }

    public /* synthetic */ dlr0(int i) {
        this.f50348a = i;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        Set set = dd41.f47702f;
        return r46.m74726U(((wb21) obj).f249681b).f47709c == gn80.ALBUM;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        AbstractC1806e9 fme1Var;
        switch (this.f50348a) {
            case 1:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Failed to load profile for user", new Object[0]);
                return new b9a0(th);
            case 2:
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 17:
            case 19:
            case 23:
            default:
                rt7 rt7Var = (rt7) obj;
                if (rt7Var.equals(pt7.f181064a)) {
                    fme1Var = eme1.f60898c;
                } else {
                    if (!(rt7Var instanceof qt7)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fme1Var = new fme1(((qt7) rt7Var).f192306a);
                }
                return (kb01) fme1Var.f57320b;
            case 5:
                return Boolean.valueOf(e72.m37992Z((ContextTrack) obj));
            case 7:
                return Boolean.FALSE;
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 11:
                Object obj2 = ((gv31) obj).f84602a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 12:
                zv11 zv11Var = (zv11) obj;
                xul0 xul0Var = zv11Var.f286588c;
                i2p0 i2p0Var = (i2p0) xul0Var.mo49283h();
                if ((i2p0Var != null ? i2p0Var.f97908a : null) == null) {
                    z = false;
                } else {
                    i2p0 i2p0Var2 = (i2p0) xul0Var.mo49283h();
                    if ((i2p0Var2 != null ? i2p0Var2.f97909b : null) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return new p8y0(z ? ((i2p0) xul0Var.mo49278b()).f97908a : (Boolean) zv11Var.f286586a.mo49283h(), z ? ((i2p0) xul0Var.mo49278b()).f97909b : (Boolean) zv11Var.f286587b.mo49283h());
            case 13:
                return new o421((c9n0) obj);
            case 14:
                return Collections.singletonList((t031) obj);
            case 15:
                return new vhj0((Throwable) obj, null);
            case 16:
                return p1j0.f173119a;
            case 18:
                return Boolean.valueOf(((ezk) obj).f64406a);
            case 20:
                return ((bv81) obj).f31305a.f170447b;
            case 21:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new sot0(message);
            case 22:
                return (npb1) obj;
            case 24:
                DiscoveryFromSeedResponse discoveryFromSeedResponse = (DiscoveryFromSeedResponse) obj;
                Any anyM22940n = discoveryFromSeedResponse.m22940n();
                return wj50.m88271j(anyM22940n != null ? anyM22940n.m1912q() : null, "type.googleapis.com/spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCarouselComponent") ? new jed1(WatchFeedVideoCarouselComponent.m22988n(discoveryFromSeedResponse.m22940n().m1913r())) : new ied1(edb.m38564m("Unknown type: ", discoveryFromSeedResponse.m22940n().m1912q()));
        }
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = ntx0.f158444h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? bga.m29102x(bundle) : bga.m29102x(null);
    }

    @Override // io.reactivex.rxjava3.functions.Function5
    /* JADX INFO: renamed from: e */
    public Object mo23410e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ig81 ig81Var = (ig81) obj2;
        return new bg81((ContextTrack) obj, ig81Var.f101929d, ig81Var.f101926a, ig81Var.f101927b, ig81Var.f101928c, (osj) obj3, ((Boolean) obj4).booleanValue(), (bz31) obj5);
    }

    @Override // p204p.tpk
    /* JADX INFO: renamed from: k */
    public Object mo26363k(Object obj) {
        return Boolean.valueOf(((p3x0) obj).m69093g());
    }

    @Override // p204p.yxf
    /* JADX INFO: renamed from: m */
    public j15 mo36390m(xq00 xq00Var) {
        xq00Var.m91771i0(-706445892);
        g15 g15Var = new g15();
        xq00Var.m91771i0(-289668149);
        int iM43338n = g15Var.m43338n(new ew31(leu.m58815a(xq00Var).f112824b.f138763g, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
        try {
            g15Var.m43331g(k0e1.m54977L(R.string.settings_item_quality_option_lossless_bitrate_line_1, xq00Var));
            g15Var.m43335k(iM43338n);
            xq00Var.m91788r(false);
            g15Var.m43331g("\n");
            g15Var.m43331g(k0e1.m54977L(R.string.settings_item_quality_option_lossless_bitrate_line_2, xq00Var));
            j15 j15VarM43339o = g15Var.m43339o();
            xq00Var.m91788r(false);
            return j15VarM43339o;
        } catch (Throwable th) {
            g15Var.m43335k(iM43338n);
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        yk91 yk91Var = (yk91) obj;
        yk91 yk91Var2 = (yk91) obj2;
        return wj50.m88271j((String) yk91Var.f273652c, (String) yk91Var2.f273652c) && wj50.m88271j((String) yk91Var.f273651b, (String) yk91Var2.f273651b);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f50348a) {
            case 0:
                pqm0 pqm0Var = (pqm0) obj;
                return ((String) pqm0Var.f180350a).length() == 0 && ((String) pqm0Var.f180351b).length() > 0;
            case 1:
            case 2:
            default:
                return ((Throwable) obj) instanceof NullTransportException;
            case 3:
                return !((iqx) ((gqx) obj)).f104863f;
            case 4:
                return !((iqx) ((gqx) obj)).f104863f;
        }
    }
}
