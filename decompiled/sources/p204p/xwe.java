package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.connect.esperanto.proto.VolumeMessages$VolumeResponse;
import com.spotify.metadata.proto.Metadata$Artist;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class xwe implements Predicate, BiFunction, Init, Function, tn61, i7o0, giv, x3x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266674a;

    /* JADX INFO: renamed from: b */
    public static final xwe f266663b = new xwe(0);

    /* JADX INFO: renamed from: c */
    public static final xwe f266665c = new xwe(1);

    /* JADX INFO: renamed from: d */
    public static final xwe f266667d = new xwe(2);

    /* JADX INFO: renamed from: e */
    public static final xwe f266668e = new xwe(3);

    /* JADX INFO: renamed from: f */
    public static final xwe f266669f = new xwe(4);

    /* JADX INFO: renamed from: g */
    public static final xwe f266670g = new xwe(5);

    /* JADX INFO: renamed from: h */
    public static final xwe f266671h = new xwe(6);

    /* JADX INFO: renamed from: i */
    public static final xwe f266672i = new xwe(7);

    /* JADX INFO: renamed from: t */
    public static final xwe f266673t = new xwe(8);

    /* JADX INFO: renamed from: X */
    public static final xwe f266656X = new xwe(9);

    /* JADX INFO: renamed from: Y */
    public static final xwe f266658Y = new xwe(10);

    /* JADX INFO: renamed from: Z */
    public static final xwe f266660Z = new xwe(11);

    /* JADX INFO: renamed from: L0 */
    public static final xwe f266644L0 = new xwe(12);

    /* JADX INFO: renamed from: M0 */
    public static final xwe f266645M0 = new xwe(13);

    /* JADX INFO: renamed from: N0 */
    public static final xwe f266646N0 = new xwe(14);

    /* JADX INFO: renamed from: O0 */
    public static final xwe f266647O0 = new xwe(15);

    /* JADX INFO: renamed from: P0 */
    public static final xwe f266648P0 = new xwe(16);

    /* JADX INFO: renamed from: Q0 */
    public static final xwe f266649Q0 = new xwe(17);

    /* JADX INFO: renamed from: R0 */
    public static final xwe f266650R0 = new xwe(18);

    /* JADX INFO: renamed from: S0 */
    public static final xwe f266651S0 = new xwe(19);

    /* JADX INFO: renamed from: T0 */
    public static final xwe f266652T0 = new xwe(20);

    /* JADX INFO: renamed from: U0 */
    public static final xwe f266653U0 = new xwe(21);

    /* JADX INFO: renamed from: V0 */
    public static final xwe f266654V0 = new xwe(22);

    /* JADX INFO: renamed from: W0 */
    public static final xwe f266655W0 = new xwe(23);

    /* JADX INFO: renamed from: X0 */
    public static final xwe f266657X0 = new xwe(24);

    /* JADX INFO: renamed from: Y0 */
    public static final xwe f266659Y0 = new xwe(25);

    /* JADX INFO: renamed from: Z0 */
    public static final xwe f266661Z0 = new xwe(26);

    /* JADX INFO: renamed from: a1 */
    public static final xwe f266662a1 = new xwe(27);

    /* JADX INFO: renamed from: b1 */
    public static final xwe f266664b1 = new xwe(28);

    /* JADX INFO: renamed from: c1 */
    public static final xwe f266666c1 = new xwe(29);

    public /* synthetic */ xwe(int i) {
        this.f266674a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m92282b(m3x m3xVar, View view, View view2) {
        if (p2l.f173365a.contains(xwe.class)) {
            return;
        }
        try {
            String str = m3xVar.f139771a;
            sp5 sp5Var = cxe.f43008f;
            Bundle bundleM78853s = sp5.m78853s(m3xVar, view, view2);
            f266663b.m92283c(bundleM78853s);
            p8y.m69345c().execute(new fr2(28, str, bundleM78853s));
        } catch (Throwable th) {
            p2l.m68953a(xwe.class, th);
        }
    }

    @Override // p204p.i7o0
    /* JADX INFO: renamed from: a */
    public h7o0 mo40751a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new ipr(context, layoutInflater, viewGroup);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f266674a) {
            case 4:
                return kg2.f122279a;
            case 5:
            case 7:
            case 8:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            default:
                return (gmr0) ((xul0) obj).mo49278b();
            case 6:
                return Integer.valueOf(((zk4) obj).f283631a);
            case 9:
                return new y1y(false, false);
            case 10:
                return new w48((n3z) obj);
            case 11:
                return new wu51((x6x0) obj);
            case 12:
                jby0 jby0Var = (jby0) obj;
                return new ocy0(jby0Var.f110922b, jby0Var.f110923c);
            case 15:
                return ((r0f) obj).f194480a;
            case 18:
                return Boolean.valueOf(dxf1.m37244s("obfuscate-restricted-tracks", (Map) obj));
            case 20:
                return p1j0.f173119a;
            case 21:
                return Integer.valueOf(((Status) obj).m6851n());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m92283c(Bundle bundle) {
        Locale locale;
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                double dDoubleValue = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String strGroup = matcher.group(0);
                        try {
                            locale = p8y.m69343a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        dDoubleValue = NumberFormat.getNumberInstance(locale).parse(strGroup).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                bundle.putDouble("_valueToSum", dDoubleValue);
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f266674a) {
            case 3:
                return First.m15574b((kr1) obj);
            case 4:
            default:
                return First.m15574b((n0t) obj);
            case 5:
                ad3 ad3Var = (ad3) obj;
                wj50.m88279p(ad3Var);
                return First.m15575c(ad3Var, Collections.singleton(dc3.f47410a));
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f266674a) {
            case 1:
                qho qhoVar = (qho) obj;
                return (qhoVar instanceof oho) && ((oho) qhoVar).f165512a != null;
            case 8:
                return ((xul0) obj).mo49279c();
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return !((iqx) ((gqx) obj)).f104863f;
            case 16:
                return ((e301) obj).f55571a.length() > 0;
            case 17:
                return !((e301) obj).f55573c;
            case 23:
                return ((VolumeMessages$VolumeResponse) obj).m7446p() == hpf.OK;
            default:
                h6w h6wVar = (h6w) obj;
                return (h6wVar instanceof g6w) && ((g6w) h6wVar).f77127b;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f266674a) {
            case 2:
                return new pqm0((x02) obj, (Long) obj2);
            case 7:
                return new pqm0((Metadata$Artist) obj, (List) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
