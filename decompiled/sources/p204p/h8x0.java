package p204p;

import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import com.spotify.base.java.logging.Logger;
import com.spotify.gamesservice.musicguesser.p071v1.CompleteGameRequest;
import com.spotify.gamesservice.musicguesser.p071v1.GameResults;
import com.spotify.gamesservice.musicguesser.p071v1.GameResultsPage;
import com.spotify.gamesservice.musicguesser.p071v1.GameResultsPageElements;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class h8x0 {

    /* JADX INFO: renamed from: a */
    public final dhi0 f88829a;

    /* JADX INFO: renamed from: b */
    public final esa0 f88830b;

    /* JADX INFO: renamed from: c */
    public final zl00 f88831c;

    /* JADX INFO: renamed from: d */
    public final yz80 f88832d;

    public h8x0(dhi0 dhi0Var, esa0 esa0Var, sp5 sp5Var, zl00 zl00Var, yz80 yz80Var) {
        this.f88829a = dhi0Var;
        this.f88830b = esa0Var;
        this.f88831c = zl00Var;
        this.f88832d = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153 A[LOOP:0: B:63:0x013e->B:68:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x021b  */
    /* JADX WARN: Code duplicated, block: B:94:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0182, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m46855a(h8x0 h8x0Var, l8x0 l8x0Var, ibk ibkVar) {
        f8x0 f8x0Var;
        o2x0 o2x0Var;
        Object obj;
        GameResultsPage gameResultsPage;
        GameResultsPage gameResultsPage2;
        String str;
        GameResultsPage gameResultsPage3;
        String strM11037o;
        GameResultsPage gameResultsPage4;
        String str2;
        String strM11064o;
        int i;
        zhy0 zhy0VarM11022q;
        aiy0 aiy0Var;
        char cCharAt;
        l8x0 l8x0Var2 = l8x0Var;
        zl00 zl00Var = h8x0Var.f88831c;
        dhi0 dhi0Var = h8x0Var.f88829a;
        if (ibkVar instanceof f8x0) {
            f8x0Var = (f8x0) ibkVar;
            int i2 = f8x0Var.f67123f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f8x0Var.f67123f = i2 - Integer.MIN_VALUE;
            } else {
                f8x0Var = new f8x0(h8x0Var, ibkVar);
            }
        } else {
            f8x0Var = new f8x0(h8x0Var, ibkVar);
        }
        Object objM36044b = f8x0Var.f67121d;
        int i3 = f8x0Var.f67123f;
        Character chValueOf = null;
        Object[] objArr = 0;
        Object obj2 = yuk.f276404a;
        switch (i3) {
            case 0:
                bga.m29073P(objM36044b);
                byte[] bArr = l8x0Var2.f130959d;
                CompleteGameRequest completeGameRequestM10987r = bArr != null ? CompleteGameRequest.m10987r(bArr) : null;
                String str3 = l8x0Var2.f130957b;
                if (completeGameRequestM10987r == null) {
                    if (str3 == null) {
                        throw new IllegalStateException("Either CompleteGameRequest or gameId is required");
                    }
                    f8x0Var.f67118a = l8x0Var2;
                    f8x0Var.f67123f = 2;
                    objM36044b = dhi0Var.m36044b(str3, f8x0Var);
                    if (objM36044b == obj2) {
                        return obj2;
                    }
                    o2x0Var = (o2x0) objM36044b;
                    obj = o2x0Var.f161172b;
                    if (obj != null) {
                        throw new IllegalArgumentException("Results response body was null");
                    }
                    gameResultsPage = (GameResultsPage) obj;
                    if (l8x0Var2.f130959d != null) {
                        f8x0Var.f67118a = null;
                        f8x0Var.f67119b = gameResultsPage;
                        f8x0Var.f67120c = null;
                        f8x0Var.f67123f = 3;
                        if (h8x0Var.m46857c(str, f8x0Var) == obj2) {
                            return obj2;
                        }
                    }
                    gameResultsPage2 = gameResultsPage;
                    esa0 esa0Var = h8x0Var.f88830b;
                    List listM46715L = h6f.m46715L(gameResultsPage2.m11027o().m11036n(), gameResultsPage2.m11027o().m11042u());
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage2;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 4;
                    objM36044b = njg1.m64633z(new aab0((Object) listM46715L, (Object) esa0Var, (fbk) (objArr == true ? 1 : 0), 0), f8x0Var);
                    if (objM36044b == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage2;
                    ((Boolean) objM36044b).getClass();
                    strM11037o = gameResultsPage3.m11027o().m11037o();
                    wj50.m88279p(strM11037o);
                    if (strM11037o.length() > 0) {
                        f8x0Var.f67118a = null;
                        f8x0Var.f67119b = gameResultsPage3;
                        f8x0Var.f67120c = strM11037o;
                        f8x0Var.f67123f = 5;
                        if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                            return obj2;
                        }
                        gameResultsPage4 = gameResultsPage3;
                        str2 = strM11037o;
                        wj50.m88279p(str2);
                        f8x0Var.f67118a = null;
                        f8x0Var.f67119b = gameResultsPage4;
                        f8x0Var.f67120c = null;
                        f8x0Var.f67123f = 6;
                        if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                            return obj2;
                        }
                        gameResultsPage3 = gameResultsPage4;
                    }
                    GameResults gameResultsM11028p = gameResultsPage3.m11028p();
                    GameResultsPageElements gameResultsPageElementsM11027o = gameResultsPage3.m11027o();
                    strM11064o = gameResultsPage3.m11029q().m11064o();
                    for (i = 0; i < strM11064o.length(); i++) {
                        cCharAt = strM11064o.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            chValueOf = Character.valueOf(cCharAt);
                            int iM96514B = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                            String strM11026n = gameResultsPage3.m11026n();
                            int iM11021p = gameResultsM11028p.m11021p();
                            int iM11020o = gameResultsM11028p.m11020o();
                            int iM11024s = gameResultsM11028p.m11024s();
                            int iM11025t = gameResultsM11028p.m11025t();
                            zhy0VarM11022q = gameResultsM11028p.m11022q();
                            switch (zhy0VarM11022q.ordinal()) {
                                case 1:
                                    aiy0Var = aiy0.f16106a;
                                    break;
                                case 2:
                                    aiy0Var = aiy0.f16108c;
                                    break;
                                case 3:
                                    aiy0Var = aiy0.f16109d;
                                    break;
                                case 4:
                                    aiy0Var = aiy0.f16110e;
                                    break;
                                case 5:
                                    aiy0Var = aiy0.f16111f;
                                    break;
                                case 6:
                                    aiy0Var = aiy0.f16107b;
                                    break;
                                default:
                                    throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                            }
                            return new m8x0(strM11026n, iM11021p, iM11020o, iM11024s, iM11025t, aiy0Var, gameResultsPageElementsM11027o.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B, gameResultsPageElementsM11027o.m11041t(), gameResultsPageElementsM11027o.m11038p(), gameResultsPageElementsM11027o.m11035E(), gameResultsPageElementsM11027o.m11034D(), gameResultsPageElementsM11027o.m11040s(), gameResultsPageElementsM11027o.m11047z(), gameResultsPageElementsM11027o.m11031A(), gameResultsPageElementsM11027o.m11046y(), gameResultsPageElementsM11027o.m11044w(), gameResultsPageElementsM11027o.m11043v(), gameResultsPageElementsM11027o.m11036n(), gameResultsPageElementsM11027o.m11042u(), gameResultsPageElementsM11027o.m11039r(), gameResultsPageElementsM11027o.m11037o(), gameResultsPageElementsM11027o.m11033C(), gameResultsPageElementsM11027o.m11032B());
                        }
                    }
                    int iM96514B2 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                    String strM11026n2 = gameResultsPage3.m11026n();
                    int iM11021p2 = gameResultsM11028p.m11021p();
                    int iM11020o2 = gameResultsM11028p.m11020o();
                    int iM11024s2 = gameResultsM11028p.m11024s();
                    int iM11025t2 = gameResultsM11028p.m11025t();
                    zhy0VarM11022q = gameResultsM11028p.m11022q();
                    switch (zhy0VarM11022q.ordinal()) {
                        case 1:
                            aiy0Var = aiy0.f16106a;
                            break;
                        case 2:
                            aiy0Var = aiy0.f16108c;
                            break;
                        case 3:
                            aiy0Var = aiy0.f16109d;
                            break;
                        case 4:
                            aiy0Var = aiy0.f16110e;
                            break;
                        case 5:
                            aiy0Var = aiy0.f16111f;
                            break;
                        case 6:
                            aiy0Var = aiy0.f16107b;
                            break;
                        default:
                            throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                    }
                    return new m8x0(strM11026n2, iM11021p2, iM11020o2, iM11024s2, iM11025t2, aiy0Var, gameResultsPageElementsM11027o.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B2, gameResultsPageElementsM11027o.m11041t(), gameResultsPageElementsM11027o.m11038p(), gameResultsPageElementsM11027o.m11035E(), gameResultsPageElementsM11027o.m11034D(), gameResultsPageElementsM11027o.m11040s(), gameResultsPageElementsM11027o.m11047z(), gameResultsPageElementsM11027o.m11031A(), gameResultsPageElementsM11027o.m11046y(), gameResultsPageElementsM11027o.m11044w(), gameResultsPageElementsM11027o.m11043v(), gameResultsPageElementsM11027o.m11036n(), gameResultsPageElementsM11027o.m11042u(), gameResultsPageElementsM11027o.m11039r(), gameResultsPageElementsM11027o.m11037o(), gameResultsPageElementsM11027o.m11033C(), gameResultsPageElementsM11027o.m11032B());
                }
                String strM10988p = completeGameRequestM10987r.m10988p();
                f8x0Var.f67118a = l8x0Var2;
                f8x0Var.f67123f = 1;
                objM36044b = dhi0Var.m36045c(strM10988p, completeGameRequestM10987r, f8x0Var);
                if (objM36044b == obj2) {
                    return obj2;
                }
                o2x0Var = (o2x0) objM36044b;
                obj = o2x0Var.f161172b;
                if (obj != null) {
                    throw new IllegalArgumentException("Results response body was null");
                }
                gameResultsPage = (GameResultsPage) obj;
                if (l8x0Var2.f130959d != null && (str = l8x0Var2.f130958c) != null) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 3;
                    if (h8x0Var.m46857c(str, f8x0Var) == obj2) {
                        return obj2;
                    }
                }
                gameResultsPage2 = gameResultsPage;
                try {
                    esa0 esa0Var2 = h8x0Var.f88830b;
                    List listM46715L2 = h6f.m46715L(gameResultsPage2.m11027o().m11036n(), gameResultsPage2.m11027o().m11042u());
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage2;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 4;
                    objM36044b = njg1.m64633z(new aab0((Object) listM46715L2, (Object) esa0Var2, (fbk) (objArr == true ? 1 : 0), 0), f8x0Var);
                    if (objM36044b == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage2;
                    ((Boolean) objM36044b).getClass();
                    strM11037o = gameResultsPage3.m11027o().m11037o();
                    wj50.m88279p(strM11037o);
                    if (strM11037o.length() > 0) {
                        f8x0Var.f67118a = null;
                        f8x0Var.f67119b = gameResultsPage3;
                        f8x0Var.f67120c = strM11037o;
                        f8x0Var.f67123f = 5;
                        if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                            return obj2;
                        }
                        gameResultsPage4 = gameResultsPage3;
                        str2 = strM11037o;
                        wj50.m88279p(str2);
                        f8x0Var.f67118a = null;
                        f8x0Var.f67119b = gameResultsPage4;
                        f8x0Var.f67120c = null;
                        f8x0Var.f67123f = 6;
                        if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                            return obj2;
                        }
                        gameResultsPage3 = gameResultsPage4;
                    }
                    GameResults gameResultsM11028p2 = gameResultsPage3.m11028p();
                    GameResultsPageElements gameResultsPageElementsM11027o2 = gameResultsPage3.m11027o();
                    strM11064o = gameResultsPage3.m11029q().m11064o();
                    while (i < strM11064o.length()) {
                        cCharAt = strM11064o.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            chValueOf = Character.valueOf(cCharAt);
                            int iM96514B3 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                            String strM11026n3 = gameResultsPage3.m11026n();
                            int iM11021p3 = gameResultsM11028p2.m11021p();
                            int iM11020o3 = gameResultsM11028p2.m11020o();
                            int iM11024s3 = gameResultsM11028p2.m11024s();
                            int iM11025t3 = gameResultsM11028p2.m11025t();
                            zhy0VarM11022q = gameResultsM11028p2.m11022q();
                            switch (zhy0VarM11022q.ordinal()) {
                                case 1:
                                    aiy0Var = aiy0.f16106a;
                                    break;
                                case 2:
                                    aiy0Var = aiy0.f16108c;
                                    break;
                                case 3:
                                    aiy0Var = aiy0.f16109d;
                                    break;
                                case 4:
                                    aiy0Var = aiy0.f16110e;
                                    break;
                                case 5:
                                    aiy0Var = aiy0.f16111f;
                                    break;
                                case 6:
                                    aiy0Var = aiy0.f16107b;
                                    break;
                                default:
                                    throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                            }
                            return new m8x0(strM11026n3, iM11021p3, iM11020o3, iM11024s3, iM11025t3, aiy0Var, gameResultsPageElementsM11027o2.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p2.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B3, gameResultsPageElementsM11027o2.m11041t(), gameResultsPageElementsM11027o2.m11038p(), gameResultsPageElementsM11027o2.m11035E(), gameResultsPageElementsM11027o2.m11034D(), gameResultsPageElementsM11027o2.m11040s(), gameResultsPageElementsM11027o2.m11047z(), gameResultsPageElementsM11027o2.m11031A(), gameResultsPageElementsM11027o2.m11046y(), gameResultsPageElementsM11027o2.m11044w(), gameResultsPageElementsM11027o2.m11043v(), gameResultsPageElementsM11027o2.m11036n(), gameResultsPageElementsM11027o2.m11042u(), gameResultsPageElementsM11027o2.m11039r(), gameResultsPageElementsM11027o2.m11037o(), gameResultsPageElementsM11027o2.m11033C(), gameResultsPageElementsM11027o2.m11032B());
                        }
                    }
                    int iM96514B4 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                    String strM11026n4 = gameResultsPage3.m11026n();
                    int iM11021p4 = gameResultsM11028p2.m11021p();
                    int iM11020o4 = gameResultsM11028p2.m11020o();
                    int iM11024s4 = gameResultsM11028p2.m11024s();
                    int iM11025t4 = gameResultsM11028p2.m11025t();
                    zhy0VarM11022q = gameResultsM11028p2.m11022q();
                    switch (zhy0VarM11022q.ordinal()) {
                        case 1:
                            aiy0Var = aiy0.f16106a;
                            break;
                        case 2:
                            aiy0Var = aiy0.f16108c;
                            break;
                        case 3:
                            aiy0Var = aiy0.f16109d;
                            break;
                        case 4:
                            aiy0Var = aiy0.f16110e;
                            break;
                        case 5:
                            aiy0Var = aiy0.f16111f;
                            break;
                        case 6:
                            aiy0Var = aiy0.f16107b;
                            break;
                        default:
                            throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                    }
                    return new m8x0(strM11026n4, iM11021p4, iM11020o4, iM11024s4, iM11025t4, aiy0Var, gameResultsPageElementsM11027o2.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p2.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B4, gameResultsPageElementsM11027o2.m11041t(), gameResultsPageElementsM11027o2.m11038p(), gameResultsPageElementsM11027o2.m11035E(), gameResultsPageElementsM11027o2.m11034D(), gameResultsPageElementsM11027o2.m11040s(), gameResultsPageElementsM11027o2.m11047z(), gameResultsPageElementsM11027o2.m11031A(), gameResultsPageElementsM11027o2.m11046y(), gameResultsPageElementsM11027o2.m11044w(), gameResultsPageElementsM11027o2.m11043v(), gameResultsPageElementsM11027o2.m11036n(), gameResultsPageElementsM11027o2.m11042u(), gameResultsPageElementsM11027o2.m11039r(), gameResultsPageElementsM11027o2.m11037o(), gameResultsPageElementsM11027o2.m11033C(), gameResultsPageElementsM11027o2.m11032B());
                } catch (Throwable unused) {
                    gameResultsPage3 = gameResultsPage2;
                }
                break;
            case 1:
                l8x0Var2 = f8x0Var.f67118a;
                bga.m29073P(objM36044b);
                o2x0Var = (o2x0) objM36044b;
                obj = o2x0Var.f161172b;
                if (obj != null) {
                    throw new IllegalArgumentException("Results response body was null");
                }
                gameResultsPage = (GameResultsPage) obj;
                if (l8x0Var2.f130959d != null) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 3;
                    if (h8x0Var.m46857c(str, f8x0Var) == obj2) {
                        return obj2;
                    }
                }
                gameResultsPage2 = gameResultsPage;
                esa0 esa0Var3 = h8x0Var.f88830b;
                List listM46715L3 = h6f.m46715L(gameResultsPage2.m11027o().m11036n(), gameResultsPage2.m11027o().m11042u());
                f8x0Var.f67118a = null;
                f8x0Var.f67119b = gameResultsPage2;
                f8x0Var.f67120c = null;
                f8x0Var.f67123f = 4;
                objM36044b = njg1.m64633z(new aab0((Object) listM46715L3, (Object) esa0Var3, (fbk) (objArr == true ? 1 : 0), 0), f8x0Var);
                if (objM36044b == obj2) {
                    return obj2;
                }
                gameResultsPage3 = gameResultsPage2;
                ((Boolean) objM36044b).getClass();
                strM11037o = gameResultsPage3.m11027o().m11037o();
                wj50.m88279p(strM11037o);
                if (strM11037o.length() > 0) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage3;
                    f8x0Var.f67120c = strM11037o;
                    f8x0Var.f67123f = 5;
                    if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage4 = gameResultsPage3;
                    str2 = strM11037o;
                    wj50.m88279p(str2);
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage4;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 6;
                    if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage4;
                }
                GameResults gameResultsM11028p3 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o3 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B5 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n5 = gameResultsPage3.m11026n();
                        int iM11021p5 = gameResultsM11028p3.m11021p();
                        int iM11020o5 = gameResultsM11028p3.m11020o();
                        int iM11024s5 = gameResultsM11028p3.m11024s();
                        int iM11025t5 = gameResultsM11028p3.m11025t();
                        zhy0VarM11022q = gameResultsM11028p3.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n5, iM11021p5, iM11020o5, iM11024s5, iM11025t5, aiy0Var, gameResultsPageElementsM11027o3.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p3.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B5, gameResultsPageElementsM11027o3.m11041t(), gameResultsPageElementsM11027o3.m11038p(), gameResultsPageElementsM11027o3.m11035E(), gameResultsPageElementsM11027o3.m11034D(), gameResultsPageElementsM11027o3.m11040s(), gameResultsPageElementsM11027o3.m11047z(), gameResultsPageElementsM11027o3.m11031A(), gameResultsPageElementsM11027o3.m11046y(), gameResultsPageElementsM11027o3.m11044w(), gameResultsPageElementsM11027o3.m11043v(), gameResultsPageElementsM11027o3.m11036n(), gameResultsPageElementsM11027o3.m11042u(), gameResultsPageElementsM11027o3.m11039r(), gameResultsPageElementsM11027o3.m11037o(), gameResultsPageElementsM11027o3.m11033C(), gameResultsPageElementsM11027o3.m11032B());
                    }
                }
                int iM96514B6 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n6 = gameResultsPage3.m11026n();
                int iM11021p6 = gameResultsM11028p3.m11021p();
                int iM11020o6 = gameResultsM11028p3.m11020o();
                int iM11024s6 = gameResultsM11028p3.m11024s();
                int iM11025t6 = gameResultsM11028p3.m11025t();
                zhy0VarM11022q = gameResultsM11028p3.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n6, iM11021p6, iM11020o6, iM11024s6, iM11025t6, aiy0Var, gameResultsPageElementsM11027o3.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p3.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B6, gameResultsPageElementsM11027o3.m11041t(), gameResultsPageElementsM11027o3.m11038p(), gameResultsPageElementsM11027o3.m11035E(), gameResultsPageElementsM11027o3.m11034D(), gameResultsPageElementsM11027o3.m11040s(), gameResultsPageElementsM11027o3.m11047z(), gameResultsPageElementsM11027o3.m11031A(), gameResultsPageElementsM11027o3.m11046y(), gameResultsPageElementsM11027o3.m11044w(), gameResultsPageElementsM11027o3.m11043v(), gameResultsPageElementsM11027o3.m11036n(), gameResultsPageElementsM11027o3.m11042u(), gameResultsPageElementsM11027o3.m11039r(), gameResultsPageElementsM11027o3.m11037o(), gameResultsPageElementsM11027o3.m11033C(), gameResultsPageElementsM11027o3.m11032B());
            case 2:
                l8x0Var2 = f8x0Var.f67118a;
                bga.m29073P(objM36044b);
                o2x0Var = (o2x0) objM36044b;
                obj = o2x0Var.f161172b;
                if (obj != null) {
                    throw new IllegalArgumentException("Results response body was null");
                }
                gameResultsPage = (GameResultsPage) obj;
                if (l8x0Var2.f130959d != null) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 3;
                    if (h8x0Var.m46857c(str, f8x0Var) == obj2) {
                        return obj2;
                    }
                }
                gameResultsPage2 = gameResultsPage;
                esa0 esa0Var4 = h8x0Var.f88830b;
                List listM46715L4 = h6f.m46715L(gameResultsPage2.m11027o().m11036n(), gameResultsPage2.m11027o().m11042u());
                f8x0Var.f67118a = null;
                f8x0Var.f67119b = gameResultsPage2;
                f8x0Var.f67120c = null;
                f8x0Var.f67123f = 4;
                objM36044b = njg1.m64633z(new aab0((Object) listM46715L4, (Object) esa0Var4, (fbk) (objArr == true ? 1 : 0), 0), f8x0Var);
                if (objM36044b == obj2) {
                    return obj2;
                }
                gameResultsPage3 = gameResultsPage2;
                ((Boolean) objM36044b).getClass();
                strM11037o = gameResultsPage3.m11027o().m11037o();
                wj50.m88279p(strM11037o);
                if (strM11037o.length() > 0) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage3;
                    f8x0Var.f67120c = strM11037o;
                    f8x0Var.f67123f = 5;
                    if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage4 = gameResultsPage3;
                    str2 = strM11037o;
                    wj50.m88279p(str2);
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage4;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 6;
                    if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage4;
                }
                GameResults gameResultsM11028p4 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o4 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B7 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n7 = gameResultsPage3.m11026n();
                        int iM11021p7 = gameResultsM11028p4.m11021p();
                        int iM11020o7 = gameResultsM11028p4.m11020o();
                        int iM11024s7 = gameResultsM11028p4.m11024s();
                        int iM11025t7 = gameResultsM11028p4.m11025t();
                        zhy0VarM11022q = gameResultsM11028p4.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n7, iM11021p7, iM11020o7, iM11024s7, iM11025t7, aiy0Var, gameResultsPageElementsM11027o4.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p4.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B7, gameResultsPageElementsM11027o4.m11041t(), gameResultsPageElementsM11027o4.m11038p(), gameResultsPageElementsM11027o4.m11035E(), gameResultsPageElementsM11027o4.m11034D(), gameResultsPageElementsM11027o4.m11040s(), gameResultsPageElementsM11027o4.m11047z(), gameResultsPageElementsM11027o4.m11031A(), gameResultsPageElementsM11027o4.m11046y(), gameResultsPageElementsM11027o4.m11044w(), gameResultsPageElementsM11027o4.m11043v(), gameResultsPageElementsM11027o4.m11036n(), gameResultsPageElementsM11027o4.m11042u(), gameResultsPageElementsM11027o4.m11039r(), gameResultsPageElementsM11027o4.m11037o(), gameResultsPageElementsM11027o4.m11033C(), gameResultsPageElementsM11027o4.m11032B());
                    }
                }
                int iM96514B8 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n8 = gameResultsPage3.m11026n();
                int iM11021p8 = gameResultsM11028p4.m11021p();
                int iM11020o8 = gameResultsM11028p4.m11020o();
                int iM11024s8 = gameResultsM11028p4.m11024s();
                int iM11025t8 = gameResultsM11028p4.m11025t();
                zhy0VarM11022q = gameResultsM11028p4.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n8, iM11021p8, iM11020o8, iM11024s8, iM11025t8, aiy0Var, gameResultsPageElementsM11027o4.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p4.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B8, gameResultsPageElementsM11027o4.m11041t(), gameResultsPageElementsM11027o4.m11038p(), gameResultsPageElementsM11027o4.m11035E(), gameResultsPageElementsM11027o4.m11034D(), gameResultsPageElementsM11027o4.m11040s(), gameResultsPageElementsM11027o4.m11047z(), gameResultsPageElementsM11027o4.m11031A(), gameResultsPageElementsM11027o4.m11046y(), gameResultsPageElementsM11027o4.m11044w(), gameResultsPageElementsM11027o4.m11043v(), gameResultsPageElementsM11027o4.m11036n(), gameResultsPageElementsM11027o4.m11042u(), gameResultsPageElementsM11027o4.m11039r(), gameResultsPageElementsM11027o4.m11037o(), gameResultsPageElementsM11027o4.m11033C(), gameResultsPageElementsM11027o4.m11032B());
            case 3:
                gameResultsPage2 = f8x0Var.f67119b;
                bga.m29073P(objM36044b);
                esa0 esa0Var5 = h8x0Var.f88830b;
                List listM46715L5 = h6f.m46715L(gameResultsPage2.m11027o().m11036n(), gameResultsPage2.m11027o().m11042u());
                f8x0Var.f67118a = null;
                f8x0Var.f67119b = gameResultsPage2;
                f8x0Var.f67120c = null;
                f8x0Var.f67123f = 4;
                objM36044b = njg1.m64633z(new aab0((Object) listM46715L5, (Object) esa0Var5, (fbk) (objArr == true ? 1 : 0), 0), f8x0Var);
                if (objM36044b == obj2) {
                    return obj2;
                }
                gameResultsPage3 = gameResultsPage2;
                ((Boolean) objM36044b).getClass();
                strM11037o = gameResultsPage3.m11027o().m11037o();
                wj50.m88279p(strM11037o);
                if (strM11037o.length() > 0) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage3;
                    f8x0Var.f67120c = strM11037o;
                    f8x0Var.f67123f = 5;
                    if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage4 = gameResultsPage3;
                    str2 = strM11037o;
                    wj50.m88279p(str2);
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage4;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 6;
                    if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage4;
                }
                GameResults gameResultsM11028p5 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o5 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B9 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n9 = gameResultsPage3.m11026n();
                        int iM11021p9 = gameResultsM11028p5.m11021p();
                        int iM11020o9 = gameResultsM11028p5.m11020o();
                        int iM11024s9 = gameResultsM11028p5.m11024s();
                        int iM11025t9 = gameResultsM11028p5.m11025t();
                        zhy0VarM11022q = gameResultsM11028p5.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n9, iM11021p9, iM11020o9, iM11024s9, iM11025t9, aiy0Var, gameResultsPageElementsM11027o5.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p5.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B9, gameResultsPageElementsM11027o5.m11041t(), gameResultsPageElementsM11027o5.m11038p(), gameResultsPageElementsM11027o5.m11035E(), gameResultsPageElementsM11027o5.m11034D(), gameResultsPageElementsM11027o5.m11040s(), gameResultsPageElementsM11027o5.m11047z(), gameResultsPageElementsM11027o5.m11031A(), gameResultsPageElementsM11027o5.m11046y(), gameResultsPageElementsM11027o5.m11044w(), gameResultsPageElementsM11027o5.m11043v(), gameResultsPageElementsM11027o5.m11036n(), gameResultsPageElementsM11027o5.m11042u(), gameResultsPageElementsM11027o5.m11039r(), gameResultsPageElementsM11027o5.m11037o(), gameResultsPageElementsM11027o5.m11033C(), gameResultsPageElementsM11027o5.m11032B());
                    }
                }
                int iM96514B10 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n10 = gameResultsPage3.m11026n();
                int iM11021p10 = gameResultsM11028p5.m11021p();
                int iM11020o10 = gameResultsM11028p5.m11020o();
                int iM11024s10 = gameResultsM11028p5.m11024s();
                int iM11025t10 = gameResultsM11028p5.m11025t();
                zhy0VarM11022q = gameResultsM11028p5.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n10, iM11021p10, iM11020o10, iM11024s10, iM11025t10, aiy0Var, gameResultsPageElementsM11027o5.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p5.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B10, gameResultsPageElementsM11027o5.m11041t(), gameResultsPageElementsM11027o5.m11038p(), gameResultsPageElementsM11027o5.m11035E(), gameResultsPageElementsM11027o5.m11034D(), gameResultsPageElementsM11027o5.m11040s(), gameResultsPageElementsM11027o5.m11047z(), gameResultsPageElementsM11027o5.m11031A(), gameResultsPageElementsM11027o5.m11046y(), gameResultsPageElementsM11027o5.m11044w(), gameResultsPageElementsM11027o5.m11043v(), gameResultsPageElementsM11027o5.m11036n(), gameResultsPageElementsM11027o5.m11042u(), gameResultsPageElementsM11027o5.m11039r(), gameResultsPageElementsM11027o5.m11037o(), gameResultsPageElementsM11027o5.m11033C(), gameResultsPageElementsM11027o5.m11032B());
            case 4:
                gameResultsPage3 = f8x0Var.f67119b;
                try {
                    bga.m29073P(objM36044b);
                    ((Boolean) objM36044b).getClass();
                    break;
                } catch (Throwable unused2) {
                }
                strM11037o = gameResultsPage3.m11027o().m11037o();
                wj50.m88279p(strM11037o);
                if (strM11037o.length() > 0) {
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage3;
                    f8x0Var.f67120c = strM11037o;
                    f8x0Var.f67123f = 5;
                    if (zl00Var.m96352d(strM11037o, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage4 = gameResultsPage3;
                    str2 = strM11037o;
                    wj50.m88279p(str2);
                    f8x0Var.f67118a = null;
                    f8x0Var.f67119b = gameResultsPage4;
                    f8x0Var.f67120c = null;
                    f8x0Var.f67123f = 6;
                    if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                        return obj2;
                    }
                    gameResultsPage3 = gameResultsPage4;
                }
                GameResults gameResultsM11028p6 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o6 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B11 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n11 = gameResultsPage3.m11026n();
                        int iM11021p11 = gameResultsM11028p6.m11021p();
                        int iM11020o11 = gameResultsM11028p6.m11020o();
                        int iM11024s11 = gameResultsM11028p6.m11024s();
                        int iM11025t11 = gameResultsM11028p6.m11025t();
                        zhy0VarM11022q = gameResultsM11028p6.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n11, iM11021p11, iM11020o11, iM11024s11, iM11025t11, aiy0Var, gameResultsPageElementsM11027o6.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p6.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B11, gameResultsPageElementsM11027o6.m11041t(), gameResultsPageElementsM11027o6.m11038p(), gameResultsPageElementsM11027o6.m11035E(), gameResultsPageElementsM11027o6.m11034D(), gameResultsPageElementsM11027o6.m11040s(), gameResultsPageElementsM11027o6.m11047z(), gameResultsPageElementsM11027o6.m11031A(), gameResultsPageElementsM11027o6.m11046y(), gameResultsPageElementsM11027o6.m11044w(), gameResultsPageElementsM11027o6.m11043v(), gameResultsPageElementsM11027o6.m11036n(), gameResultsPageElementsM11027o6.m11042u(), gameResultsPageElementsM11027o6.m11039r(), gameResultsPageElementsM11027o6.m11037o(), gameResultsPageElementsM11027o6.m11033C(), gameResultsPageElementsM11027o6.m11032B());
                    }
                }
                int iM96514B12 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n12 = gameResultsPage3.m11026n();
                int iM11021p12 = gameResultsM11028p6.m11021p();
                int iM11020o12 = gameResultsM11028p6.m11020o();
                int iM11024s12 = gameResultsM11028p6.m11024s();
                int iM11025t12 = gameResultsM11028p6.m11025t();
                zhy0VarM11022q = gameResultsM11028p6.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n12, iM11021p12, iM11020o12, iM11024s12, iM11025t12, aiy0Var, gameResultsPageElementsM11027o6.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p6.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B12, gameResultsPageElementsM11027o6.m11041t(), gameResultsPageElementsM11027o6.m11038p(), gameResultsPageElementsM11027o6.m11035E(), gameResultsPageElementsM11027o6.m11034D(), gameResultsPageElementsM11027o6.m11040s(), gameResultsPageElementsM11027o6.m11047z(), gameResultsPageElementsM11027o6.m11031A(), gameResultsPageElementsM11027o6.m11046y(), gameResultsPageElementsM11027o6.m11044w(), gameResultsPageElementsM11027o6.m11043v(), gameResultsPageElementsM11027o6.m11036n(), gameResultsPageElementsM11027o6.m11042u(), gameResultsPageElementsM11027o6.m11039r(), gameResultsPageElementsM11027o6.m11037o(), gameResultsPageElementsM11027o6.m11033C(), gameResultsPageElementsM11027o6.m11032B());
            case 5:
                str2 = f8x0Var.f67120c;
                gameResultsPage4 = f8x0Var.f67119b;
                bga.m29073P(objM36044b);
                wj50.m88279p(str2);
                f8x0Var.f67118a = null;
                f8x0Var.f67119b = gameResultsPage4;
                f8x0Var.f67120c = null;
                f8x0Var.f67123f = 6;
                if (zl00Var.m96351c(str2, f8x0Var) == obj2) {
                    return obj2;
                }
                gameResultsPage3 = gameResultsPage4;
                GameResults gameResultsM11028p7 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o7 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B13 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n13 = gameResultsPage3.m11026n();
                        int iM11021p13 = gameResultsM11028p7.m11021p();
                        int iM11020o13 = gameResultsM11028p7.m11020o();
                        int iM11024s13 = gameResultsM11028p7.m11024s();
                        int iM11025t13 = gameResultsM11028p7.m11025t();
                        zhy0VarM11022q = gameResultsM11028p7.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n13, iM11021p13, iM11020o13, iM11024s13, iM11025t13, aiy0Var, gameResultsPageElementsM11027o7.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p7.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B13, gameResultsPageElementsM11027o7.m11041t(), gameResultsPageElementsM11027o7.m11038p(), gameResultsPageElementsM11027o7.m11035E(), gameResultsPageElementsM11027o7.m11034D(), gameResultsPageElementsM11027o7.m11040s(), gameResultsPageElementsM11027o7.m11047z(), gameResultsPageElementsM11027o7.m11031A(), gameResultsPageElementsM11027o7.m11046y(), gameResultsPageElementsM11027o7.m11044w(), gameResultsPageElementsM11027o7.m11043v(), gameResultsPageElementsM11027o7.m11036n(), gameResultsPageElementsM11027o7.m11042u(), gameResultsPageElementsM11027o7.m11039r(), gameResultsPageElementsM11027o7.m11037o(), gameResultsPageElementsM11027o7.m11033C(), gameResultsPageElementsM11027o7.m11032B());
                    }
                }
                int iM96514B14 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n14 = gameResultsPage3.m11026n();
                int iM11021p14 = gameResultsM11028p7.m11021p();
                int iM11020o14 = gameResultsM11028p7.m11020o();
                int iM11024s14 = gameResultsM11028p7.m11024s();
                int iM11025t14 = gameResultsM11028p7.m11025t();
                zhy0VarM11022q = gameResultsM11028p7.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n14, iM11021p14, iM11020o14, iM11024s14, iM11025t14, aiy0Var, gameResultsPageElementsM11027o7.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p7.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B14, gameResultsPageElementsM11027o7.m11041t(), gameResultsPageElementsM11027o7.m11038p(), gameResultsPageElementsM11027o7.m11035E(), gameResultsPageElementsM11027o7.m11034D(), gameResultsPageElementsM11027o7.m11040s(), gameResultsPageElementsM11027o7.m11047z(), gameResultsPageElementsM11027o7.m11031A(), gameResultsPageElementsM11027o7.m11046y(), gameResultsPageElementsM11027o7.m11044w(), gameResultsPageElementsM11027o7.m11043v(), gameResultsPageElementsM11027o7.m11036n(), gameResultsPageElementsM11027o7.m11042u(), gameResultsPageElementsM11027o7.m11039r(), gameResultsPageElementsM11027o7.m11037o(), gameResultsPageElementsM11027o7.m11033C(), gameResultsPageElementsM11027o7.m11032B());
            case 6:
                gameResultsPage3 = f8x0Var.f67119b;
                bga.m29073P(objM36044b);
                GameResults gameResultsM11028p8 = gameResultsPage3.m11028p();
                GameResultsPageElements gameResultsPageElementsM11027o8 = gameResultsPage3.m11027o();
                strM11064o = gameResultsPage3.m11029q().m11064o();
                while (i < strM11064o.length()) {
                    cCharAt = strM11064o.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        chValueOf = Character.valueOf(cCharAt);
                        int iM96514B15 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                        String strM11026n15 = gameResultsPage3.m11026n();
                        int iM11021p15 = gameResultsM11028p8.m11021p();
                        int iM11020o15 = gameResultsM11028p8.m11020o();
                        int iM11024s15 = gameResultsM11028p8.m11024s();
                        int iM11025t15 = gameResultsM11028p8.m11025t();
                        zhy0VarM11022q = gameResultsM11028p8.m11022q();
                        switch (zhy0VarM11022q.ordinal()) {
                            case 1:
                                aiy0Var = aiy0.f16106a;
                                break;
                            case 2:
                                aiy0Var = aiy0.f16108c;
                                break;
                            case 3:
                                aiy0Var = aiy0.f16109d;
                                break;
                            case 4:
                                aiy0Var = aiy0.f16110e;
                                break;
                            case 5:
                                aiy0Var = aiy0.f16111f;
                                break;
                            case 6:
                                aiy0Var = aiy0.f16107b;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                        }
                        return new m8x0(strM11026n15, iM11021p15, iM11020o15, iM11024s15, iM11025t15, aiy0Var, gameResultsPageElementsM11027o8.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p8.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B15, gameResultsPageElementsM11027o8.m11041t(), gameResultsPageElementsM11027o8.m11038p(), gameResultsPageElementsM11027o8.m11035E(), gameResultsPageElementsM11027o8.m11034D(), gameResultsPageElementsM11027o8.m11040s(), gameResultsPageElementsM11027o8.m11047z(), gameResultsPageElementsM11027o8.m11031A(), gameResultsPageElementsM11027o8.m11046y(), gameResultsPageElementsM11027o8.m11044w(), gameResultsPageElementsM11027o8.m11043v(), gameResultsPageElementsM11027o8.m11036n(), gameResultsPageElementsM11027o8.m11042u(), gameResultsPageElementsM11027o8.m11039r(), gameResultsPageElementsM11027o8.m11037o(), gameResultsPageElementsM11027o8.m11033C(), gameResultsPageElementsM11027o8.m11032B());
                    }
                }
                int iM96514B16 = chValueOf != null ? zn91.m96514B(chValueOf.charValue()) : 0;
                String strM11026n16 = gameResultsPage3.m11026n();
                int iM11021p16 = gameResultsM11028p8.m11021p();
                int iM11020o16 = gameResultsM11028p8.m11020o();
                int iM11024s16 = gameResultsM11028p8.m11024s();
                int iM11025t16 = gameResultsM11028p8.m11025t();
                zhy0VarM11022q = gameResultsM11028p8.m11022q();
                switch (zhy0VarM11022q.ordinal()) {
                    case 1:
                        aiy0Var = aiy0.f16106a;
                        break;
                    case 2:
                        aiy0Var = aiy0.f16108c;
                        break;
                    case 3:
                        aiy0Var = aiy0.f16109d;
                        break;
                    case 4:
                        aiy0Var = aiy0.f16110e;
                        break;
                    case 5:
                        aiy0Var = aiy0.f16111f;
                        break;
                    case 6:
                        aiy0Var = aiy0.f16107b;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11022q).toString());
                }
                return new m8x0(strM11026n16, iM11021p16, iM11020o16, iM11024s16, iM11025t16, aiy0Var, gameResultsPageElementsM11027o8.m11045x(), MeasureFormat.getInstance(Locale.forLanguageTag(ihf1.m50635s()), MeasureFormat.FormatWidth.NARROW).format(new Measure(Long.valueOf(gameResultsM11028p8.m11023r() / ((long) 1000)), MeasureUnit.SECOND)), iM96514B16, gameResultsPageElementsM11027o8.m11041t(), gameResultsPageElementsM11027o8.m11038p(), gameResultsPageElementsM11027o8.m11035E(), gameResultsPageElementsM11027o8.m11034D(), gameResultsPageElementsM11027o8.m11040s(), gameResultsPageElementsM11027o8.m11047z(), gameResultsPageElementsM11027o8.m11031A(), gameResultsPageElementsM11027o8.m11046y(), gameResultsPageElementsM11027o8.m11044w(), gameResultsPageElementsM11027o8.m11043v(), gameResultsPageElementsM11027o8.m11036n(), gameResultsPageElementsM11027o8.m11042u(), gameResultsPageElementsM11027o8.m11039r(), gameResultsPageElementsM11027o8.m11037o(), gameResultsPageElementsM11027o8.m11033C(), gameResultsPageElementsM11027o8.m11032B());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public final u4a0 m46856b(l8x0 l8x0Var) {
        return new u4a0(new zmy(this, l8x0Var, null, 23), bk5.m29613h0(new v4a0[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m46857c(String str, ibk ibkVar) {
        g8x0 g8x0Var;
        if (ibkVar instanceof g8x0) {
            g8x0Var = (g8x0) ibkVar;
            int i = g8x0Var.f77622c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8x0Var.f77622c = i - Integer.MIN_VALUE;
            } else {
                g8x0Var = new g8x0(this, ibkVar);
            }
        } else {
            g8x0Var = new g8x0(this, ibkVar);
        }
        Object objM63326w = g8x0Var.f77620a;
        int i2 = g8x0Var.f77622c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM63326w);
                yz80 yz80Var = this.f88832d;
                rg61 rg61Var = rg61.f198871e1;
                g8x0Var.f77622c = 1;
                objM63326w = ((n090) yz80Var).m63326w(str, rg61Var, g8x0Var);
                yuk yukVar = yuk.f276404a;
                if (objM63326w == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63326w);
            }
            p2x0 p2x0Var = (p2x0) objM63326w;
            if (p2x0Var instanceof k2x0) {
                Logger.m3966b("Failed to sync playlist after game completion: " + ((k2x0) p2x0Var).f118699a, new Object[0]);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to sync playlist after game completion", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
