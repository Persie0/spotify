package p204p;

import android.net.Uri;
import com.spotify.allboarding.model.p019v1.proto.SearchItem;
import com.spotify.allboarding.model.p019v1.proto.SearchResponse;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$TokenExchangeResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import com.spotify.tap.p163go.socket.SocketIo$CommandReadException;
import com.spotify.tap.p163go.socket.SocketIo$ConnectionException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class jxq0 implements Predicate, Function, com.spotify.mobius.functions.Function, BiFunction, Init, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117205a;

    /* JADX INFO: renamed from: b */
    public static final jxq0 f117194b = new jxq0(0);

    /* JADX INFO: renamed from: c */
    public static final jxq0 f117196c = new jxq0(1);

    /* JADX INFO: renamed from: d */
    public static final jxq0 f117198d = new jxq0(2);

    /* JADX INFO: renamed from: e */
    public static final jxq0 f117199e = new jxq0(3);

    /* JADX INFO: renamed from: f */
    public static final jxq0 f117200f = new jxq0(4);

    /* JADX INFO: renamed from: g */
    public static final jxq0 f117201g = new jxq0(5);

    /* JADX INFO: renamed from: h */
    public static final jxq0 f117202h = new jxq0(6);

    /* JADX INFO: renamed from: i */
    public static final jxq0 f117203i = new jxq0(7);

    /* JADX INFO: renamed from: t */
    public static final jxq0 f117204t = new jxq0(8);

    /* JADX INFO: renamed from: X */
    public static final jxq0 f117187X = new jxq0(9);

    /* JADX INFO: renamed from: Y */
    public static final jxq0 f117189Y = new jxq0(10);

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ jxq0 f117191Z = new jxq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final ysk f117175L0 = new ysk(Boolean.TRUE, 27);

    /* JADX INFO: renamed from: M0 */
    public static final jxq0 f117176M0 = new jxq0(12);

    /* JADX INFO: renamed from: N0 */
    public static final jxq0 f117177N0 = new jxq0(13);

    /* JADX INFO: renamed from: O0 */
    public static final jxq0 f117178O0 = new jxq0(14);

    /* JADX INFO: renamed from: P0 */
    public static final jxq0 f117179P0 = new jxq0(15);

    /* JADX INFO: renamed from: Q0 */
    public static final jxq0 f117180Q0 = new jxq0(16);

    /* JADX INFO: renamed from: R0 */
    public static final jxq0 f117181R0 = new jxq0(17);

    /* JADX INFO: renamed from: S0 */
    public static final jxq0 f117182S0 = new jxq0(18);

    /* JADX INFO: renamed from: T0 */
    public static final jxq0 f117183T0 = new jxq0(19);

    /* JADX INFO: renamed from: U0 */
    public static final jxq0 f117184U0 = new jxq0(20);

    /* JADX INFO: renamed from: V0 */
    public static final jxq0 f117185V0 = new jxq0(21);

    /* JADX INFO: renamed from: W0 */
    public static final jxq0 f117186W0 = new jxq0(22);

    /* JADX INFO: renamed from: X0 */
    public static final jxq0 f117188X0 = new jxq0(23);

    /* JADX INFO: renamed from: Y0 */
    public static final jxq0 f117190Y0 = new jxq0(24);

    /* JADX INFO: renamed from: Z0 */
    public static final jxq0 f117192Z0 = new jxq0(25);

    /* JADX INFO: renamed from: a1 */
    public static final jxq0 f117193a1 = new jxq0(26);

    /* JADX INFO: renamed from: b1 */
    public static final jxq0 f117195b1 = new jxq0(27);

    /* JADX INFO: renamed from: c1 */
    public static final jxq0 f117197c1 = new jxq0(28);

    public /* synthetic */ jxq0(int i) {
        this.f117205a = i;
    }

    /* JADX INFO: renamed from: a */
    public String m54723a(fh0 fh0Var) {
        Object obj = fh0Var.f69512f.get("coverImageUrl");
        if (obj != null) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i;
        switch (this.f117205a) {
            case 1:
                return Boolean.valueOf(dxf1.m37244s("apply-child-content-restrictions", (Map) obj));
            case 2:
                return q9t0.f186664a;
            case 3:
            case 4:
            case 11:
            case 14:
            case 17:
            case 21:
            case 22:
            default:
                return ((e301) obj).f55571a;
            case 5:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Assisted Curation Recs Loader: failed to load recs: %s", th.getMessage());
                return lau.f131415a;
            case 6:
                v3a0 v3a0Var = (v3a0) obj;
                if (v3a0Var instanceof m3a0) {
                    mu90 mu90Var = (mu90) ((m3a0) v3a0Var).f139579a;
                    if (mu90Var instanceof lu90) {
                        return new tv90((lu90) mu90Var);
                    }
                }
                return sv90.f214366a;
            case 7:
                return new mwe1(false);
            case 8:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof k2x0) {
                    return Completable.m23286j(new Throwable(((k2x0) p2x0Var).f118699a.mo27977b()));
                }
                if (!(p2x0Var instanceof m2x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return CompletableEmpty.f7437a;
            case 9:
                List<SearchItem> itemsList = ((SearchResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
                for (SearchItem searchItem : itemsList) {
                    wj50.m88279p(searchItem);
                    int iOrdinal = searchItem.m3140r().ordinal();
                    int i2 = 2;
                    if (iOrdinal == 1) {
                        i = i2;
                    } else if (iOrdinal != 2) {
                        i = 1;
                    } else {
                        i2 = 3;
                        i = i2;
                    }
                    b221 b221VarM92477v = xzg1.m92477v(searchItem.m3136n());
                    String uri = searchItem.getUri();
                    String title = searchItem.getTitle();
                    String value = searchItem.m3139q().getValue();
                    String str = "";
                    if (value == null) {
                        value = "";
                    }
                    String value2 = searchItem.m3137o().getValue();
                    if (value2 != null) {
                        str = value2;
                    }
                    arrayList.add(new n0z0(i, b221VarM92477v, uri, title, value, str, searchItem.m3138p()));
                }
                return new s6x0(arrayList);
            case 10:
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof SocketIo$ConnectionException) || (th2 instanceof SocketIo$CommandReadException)) {
                    return Observable.empty();
                }
                Logger.m3967c(th2, "Go: Error in Session", new Object[0]);
                wj50.m88279p(th2);
                return Observable.error(th2);
            case 12:
                return da3.f46966a;
            case 13:
                return new c421((ra2) obj);
            case 15:
                return new u331(Boolean.valueOf(((o221) obj).f160923a));
            case 16:
                return xh31.f261429a;
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return StatusResponseOuterClass$StatusResponse.m21630p(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 19:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsTokenExchange$TokenExchangeResponse.m3651q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange.TokenExchangeResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 20:
                return new zl81((int) ((Long) obj).longValue(), 1);
            case 23:
                j9c1 j9c1Var = (j9c1) ((Optional) obj).orElse(null);
                return Optional.ofNullable(j9c1Var != null ? npg1.m65337r(j9c1Var) : null);
            case 24:
                return xul0.m92201d(((Uri) obj).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX INFO: renamed from: b */
    public vnc0 m54724b(fh0 fh0Var) {
        gqc0 gqc0Var;
        int i;
        String str = fh0Var.f69506a;
        Map map = fh0Var.f69512f;
        Object obj = map.get("header");
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str2 = (String) obj;
        String str3 = (String) map.get("subheader");
        Object obj2 = map.get("coverImageUrl");
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str4 = (String) obj2;
        Object obj3 = map.get(ContextTrack.Metadata.KEY_TITLE);
        if (obj3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str5 = (String) obj3;
        Object obj4 = map.get(ContextTrack.Metadata.KEY_SUBTITLE);
        if (obj4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str6 = (String) obj4;
        Object obj5 = map.get("primaryArtistUri");
        if (obj5 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str7 = (String) obj5;
        Object obj6 = map.get("ctaText");
        if (obj6 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str8 = (String) obj6;
        Object obj7 = map.get("footer");
        if (obj7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str9 = (String) obj7;
        String str10 = (String) map.get("footerCta");
        Object obj8 = map.get("promotionUri");
        if (obj8 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str11 = (String) obj8;
        Object obj9 = map.get("albumUri");
        if (obj9 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str12 = (String) obj9;
        Object obj10 = map.get("lineitem_id");
        if (obj10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str13 = (String) obj10;
        Object obj11 = map.get("optoutText");
        if (obj11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str14 = (String) obj11;
        Object obj12 = map.get("optoutTextCta");
        if (obj12 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str15 = (String) obj12;
        Object obj13 = map.get("primaryArtistUri");
        if (obj13 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str16 = (String) obj13;
        Object obj14 = map.get("optoutArtistCta");
        if (obj14 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str17 = (String) obj14;
        Object obj15 = map.get("optoutMarqueeCta");
        if (obj15 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        zrl0 zrl0Var = new zrl0(str14, str15, str16, str17, (String) obj15);
        String str18 = (String) map.get("backgroundColor");
        String str19 = (String) map.get("textColorType");
        if (str19 == null || str19.length() == 0) {
            gqc0Var = null;
        } else {
            gqc0[] gqc0VarArrValues = gqc0.values();
            int length = gqc0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    throw new IllegalArgumentException("There exists no Marquee Text Type for id: ".concat(str19));
                }
                int i3 = length;
                gqc0Var = gqc0VarArrValues[i2];
                int i4 = i2;
                if (str19.equalsIgnoreCase(gqc0Var.f83438a)) {
                    break;
                }
                i2 = i4 + 1;
                length = i3;
            }
        }
        String str20 = (String) map.get("visuals");
        String str21 = (String) map.get("userInHoldout");
        if (str21 == null) {
            i = 1;
        } else {
            String str22 = str21.length() > 0 ? str21 : null;
            if (str22 != null) {
                i = Boolean.parseBoolean(str22) ? 3 : 2;
            } else {
                i = 1;
            }
        }
        String str23 = (String) map.get("assignmentMethods");
        if (str23 == null) {
            str23 = "";
        }
        String str24 = str23;
        String str25 = (String) map.get("isSingle");
        return new vnc0(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, zrl0Var, str18, gqc0Var, str20, i, str24, str25 != null ? Boolean.parseBoolean(str25) : false);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f117205a) {
            case 21:
                return First.m15575c((svh0) obj, Collections.singleton(xgt.f261373a));
            default:
                dxe1 dxe1Var = (dxe1) obj;
                w0k0 w0k0Var = (w0k0) g6f.m43745s0(dxe1Var.f53946d);
                String str = w0k0Var != null ? w0k0Var.f246750b : null;
                return First.m15575c(dxe1Var, (str == null || str.length() == 0) ? gbu.f78413a : Collections.singleton(new rve1(new vxw0(str))));
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !igg1.m50541t(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new kya1(str4, str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f117205a) {
            case 0:
                return !((iqx) ((gqx) obj)).f104863f;
            case 3:
                return !((Map) obj).isEmpty();
            default:
                return ((qho) obj) instanceof oho;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        PlayerState playerState = (PlayerState) obj;
        return new ym21((am81) obj2, playerState.restrictions(), (String) playerState.playbackId().mo49283h());
    }
}
