package p204p;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.kidsaccount.api.p083v2.proto.InitChildAccountConfigResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class oh3 implements i5w0, Function, bh61, vd50, BiFunction, hxr0, yh00, pad0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165326a;

    public /* synthetic */ oh3(int i) {
        this.f165326a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m66918e(String str) {
        Pattern pattern = ihc.f102233a;
        try {
            df41 df41Var = new gf41(str).f79270c;
            return (df41Var == df41.UNKNOWN || df41Var == df41.EMPTY) ? false : true;
        } catch (SpotifyUriParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.dw50] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.dw50] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: f */
    public static ph3 m66919f(ph3 ph3Var) {
        jz80 jz80Var = ph3Var.f177454b;
        ?? r1 = jz80Var.f117620c;
        b450 b450Var = jz80Var.f117619b.f87906a;
        boolean z = r1 instanceof i6a0;
        cw50 cw50Var = cw50.f42648a;
        ?? wv50Var = cw50Var;
        if (z && !(r1 instanceof wv50)) {
            if (r1 instanceof aw50) {
                wv50Var = cw50Var;
                wv50Var = r1;
            } else {
                boolean zIsEmpty = b450Var.isEmpty();
                int i = b450Var.f278779b;
                int i2 = b450Var.f278778a;
                if (!zIsEmpty) {
                    i6a0 i6a0Var = (i6a0) r1;
                    if (!i6a0Var.mo27290g().isEmpty() && i6a0Var.mo27290g().f278778a <= i2 && i6a0Var.mo27290g().f278779b >= i) {
                        wv50Var = cw50Var;
                        wv50Var = cw50Var;
                        wv50Var = cw50Var;
                        wv50Var = cw50Var;
                        wv50Var = cw50Var;
                        int i3 = i2 - i6a0Var.mo27290g().f278778a;
                        int i4 = i - i6a0Var.mo27290g().f278778a;
                        int iM38693x = eem.m38693x(r1);
                        i6a0 i6a0Var2 = (i6a0) r1;
                        wv50Var = new wv50(iM38693x, i6a0Var2.getCount(), b450Var, i6a0Var2.getItems().subList(i3, i4 + 1), i6a0Var2.mo27291h(), i6a0Var2.getFilters(), i6a0Var2.mo27292j());
                    }
                }
            }
        }
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        wv50Var = cw50Var;
        return ph3.m69935g(ph3Var, null, jz80.m54849c(jz80Var, null, null, wv50Var, null, 59), null, 5);
    }

    /* JADX INFO: renamed from: g */
    public static MediaCodec m66920g(yho yhoVar) throws IOException {
        String str = ((tad0) yhoVar.f272927b).f218544a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX INFO: renamed from: h */
    public static ph3 m66921h(oe70 oe70Var, ibj ibjVar, int i, List list, wr31 wr31Var, xi3 xi3Var, int i2, i1v0 i1v0Var, List list2, int i3) {
        List list3 = (i3 & 8) != 0 ? lau.f131415a : list;
        wr31 wr31Var2 = (i3 & 16) != 0 ? wr31.f254255b : wr31Var;
        xi3 xi3Var2 = (i3 & 32) != 0 ? xi3.f261754b : xi3Var;
        j1v0 j1v0Var = (i3 & 256) != 0 ? g1v0.f75757a : i1v0Var;
        List listM29620k1 = (i3 & 512) != 0 ? bk5.m29620k1(wr31.values()) : list2;
        gvl0 gvl0Var = new gvl0(oe70Var, xi3Var2, wr31Var2, list3, ibjVar, false);
        b450 b450Var = b450.f23226d;
        return new ph3(listM29620k1, new jz80(gvl0Var, new h5u0(b450Var, b450Var, 0), cw50.f42648a, i, i2, j1v0Var), new fa80(nau.f152117a));
    }

    /* JADX INFO: renamed from: i */
    public static pkq m66922i(d6a1 d6a1Var, boolean z) {
        boolean zM78634e;
        if (d6a1Var instanceof pkq) {
            return (pkq) d6a1Var;
        }
        d6a1Var.mo36063C0();
        if ((d6a1Var.mo36063C0().mo25169G() instanceof bo91) || (d6a1Var instanceof kij0)) {
            qge qgeVarMo25169G = d6a1Var.mo36063C0().mo25169G();
            co91 co91Var = qgeVarMo25169G instanceof co91 ? (co91) qgeVarMo25169G : null;
            zM78634e = true;
            if (co91Var == null || co91Var.f40211Z) {
                zM78634e = (z && (d6a1Var.mo36063C0().mo25169G() instanceof bo91)) ? so91.m78634e(d6a1Var) : true ^ qjg1.m72919k(unq0.f232220N0.m83588f0(), kvf1.m57480r(d6a1Var), in91.f103932d);
            }
        } else {
            zM78634e = false;
        }
        if (!zM78634e) {
            return null;
        }
        if (d6a1Var instanceof dhz) {
            dhz dhzVar = (dhz) d6a1Var;
            wj50.m88271j(dhzVar.f49189b.mo36063C0(), dhzVar.f49190c.mo36063C0());
        }
        return new pkq(kvf1.m57480r(d6a1Var).mo35109G0(false), z);
    }

    /* JADX INFO: renamed from: j */
    public static List m66923j(int i, int i2, ArrayList arrayList, go70 go70Var) {
        pqm0 pqm0Var;
        float f = go70Var.f82902c;
        float f2 = go70Var.f82901b;
        if (i == 0 || i2 == 0) {
            return lau.f131415a;
        }
        Float fValueOf = Float.valueOf(0.0f);
        int size = arrayList.size();
        int i3 = 2;
        int i4 = 1;
        if (size == 1) {
            pqm0Var = new pqm0(new Float[]{Float.valueOf(f2)}, new Float[]{Float.valueOf(f)});
        } else if (size == 2) {
            pqm0Var = new pqm0(new Float[]{Float.valueOf(-f2), Float.valueOf(f2)}, new Float[]{Float.valueOf(-f), Float.valueOf(f)});
        } else {
            if (size != 3) {
                throw new IllegalStateException();
            }
            pqm0Var = new pqm0(new Float[]{Float.valueOf(-f2), fValueOf, Float.valueOf(f2)}, new Float[]{Float.valueOf(-f), fValueOf, Float.valueOf(f)});
        }
        Float[] fArr = (Float[]) pqm0Var.f180350a;
        Float[] fArr2 = (Float[]) pqm0Var.f180351b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        int i5 = 0;
        for (Object obj : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                h6f.m46722S();
                throw null;
            }
            int iM38547C = edb.m38547C(((knd0) obj).f124392c);
            float fFloatValue = (iM38547C == 0 || iM38547C == i4) ? fArr[i5].floatValue() : iM38547C != i3 ? 0.0f : fArr2[i5].floatValue();
            double radians = Math.toRadians(fFloatValue);
            double dAbs = Math.abs(Math.cos(radians));
            double dAbs2 = Math.abs(Math.sin(radians));
            double d = i;
            double d2 = i2;
            float fMin = Math.min(i / Integer.valueOf((int) ((d2 * dAbs2) + (d * dAbs))).intValue(), i2 / Integer.valueOf((int) ((d2 * dAbs) + (dAbs2 * d))).intValue());
            if (Float.isNaN(fMin) || Float.isInfinite(fMin)) {
                fMin = 1.0f;
            }
            arrayList2.add(new vfd0(fFloatValue, fMin));
            i5 = i6;
            i3 = 2;
            i4 = 1;
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            float f3 = ((vfd0) next).f240955b;
            do {
                Object next2 = it.next();
                float f4 = ((vfd0) next2).f240955b;
                if (Float.compare(f3, f4) > 0) {
                    next = next2;
                    f3 = f4;
                }
            } while (it.hasNext());
        }
        float f5 = ((vfd0) next).f240955b;
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new vfd0(((vfd0) it2.next()).f240954a, f5));
        }
        return arrayList3;
    }

    @Override // p204p.hxr0
    /* JADX INFO: renamed from: a */
    public void mo49038a(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        String strM35712j;
        b7n0 b7n0Var;
        switch (this.f165326a) {
            case 19:
                z510 z510Var = (z510) obj;
                op20 op20Var = (op20) obj2;
                y510 y510Var = y510.f269305a;
                boolean zM88271j = wj50.m88271j(z510Var, y510Var);
                op20 op20Var2 = op20.f167738a;
                if (!zM88271j && op20Var == op20Var2) {
                    return f0j.f64674c;
                }
                if (wj50.m88271j(z510Var, y510Var)) {
                    return op20Var == op20Var2 ? f0j.f64673b : f0j.f64675d;
                }
                return f0j.f64672a;
            default:
                b7n0 b7n0Var2 = (b7n0) obj;
                PlayerState playerState = (PlayerState) obj2;
                String strContextUri = playerState.contextUri();
                Set set = dd41.f47702f;
                dd41 dd41VarM74726U = r46.m74726U(strContextUri);
                if (dd41VarM74726U.f47709c != gn80.LIVE_ROOM) {
                    dd41VarM74726U = null;
                }
                if (dd41VarM74726U == null || (strM35712j = dd41VarM74726U.m35712j()) == null) {
                    strM35712j = null;
                }
                if (strM35712j == null) {
                    he41 he41VarM30579c = bup0.f31192a.m30579c(strContextUri);
                    xtp0 xtp0Var = he41VarM30579c instanceof xtp0 ? (xtp0) he41VarM30579c : null;
                    if (xtp0Var == null) {
                        strM35712j = null;
                    } else {
                        if (!xtp0Var.f265907a.equals("listening-party") || xtp0Var.f265908b.length() <= 0) {
                            xtp0Var = null;
                        }
                        if (xtp0Var != null) {
                            strM35712j = xtp0Var.f265908b;
                        } else {
                            strM35712j = null;
                        }
                    }
                }
                String strConcat = strM35712j != null ? "spotify:room:".concat(strM35712j) : null;
                d7n0 d7n0Var = b7n0Var2.f24349a;
                boolean z = d7n0Var instanceof c7n0;
                c7n0 c7n0Var = c7n0.f34950a;
                if (z) {
                    return (strConcat == null || !xud.m92146m(playerState)) ? new b7n0(c7n0Var) : new b7n0(new x6n0(strConcat), Collections.singletonList(new y6n0(strConcat)));
                }
                if (!(d7n0Var instanceof x6n0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strConcat == null || xud.m92144k(playerState)) {
                    b7n0Var = new b7n0(c7n0Var, Collections.singletonList(new z6n0(((x6n0) d7n0Var).f258717a)));
                } else {
                    String str = ((x6n0) d7n0Var).f258717a;
                    if (!strConcat.equals(str)) {
                        return xud.m92146m(playerState) ? new b7n0(new x6n0(strConcat), h6f.m46715L(new z6n0(str), new y6n0(strConcat))) : new b7n0(c7n0Var, Collections.singletonList(new z6n0(str)));
                    }
                    b7n0Var = new b7n0(d7n0Var);
                }
                return b7n0Var;
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return n5w0.f150633a;
        }
        if (h9xVar.equals(e9x.f57549a)) {
            return o5w0.f162141a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // p204p.pad0
    /* JADX INFO: renamed from: c */
    public qad0 mo25661c(yho yhoVar) throws Throwable {
        MediaCodec mediaCodecM66920g = null;
        try {
            mediaCodecM66920g = m66920g(yhoVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) yhoVar.f272930e;
            mediaCodecM66920g.configure((MediaFormat) yhoVar.f272928c, surface, (MediaCrypto) yhoVar.f272931f, (surface == null && ((tad0) yhoVar.f272927b).f218551h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM66920g.start();
            Trace.endSection();
            return new yg61(mediaCodecM66920g, (kab0) yhoVar.f272932g);
        } catch (IOException e) {
            e = e;
            if (mediaCodecM66920g != null) {
                mediaCodecM66920g.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecM66920g != null) {
                mediaCodecM66920g.release();
            }
            throw e;
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        jop0 jop0Var;
        switch (this.f165326a) {
            case 13:
                mje mjeVarM61981a = mje.m61981a(i);
                return mjeVarM61981a == null ? mje.UNRECOGNIZED : mjeVarM61981a;
            default:
                switch (i) {
                    case 0:
                        jop0Var = jop0.NO_FILTER;
                        break;
                    case 1:
                        jop0Var = jop0.AVAILABLE;
                        break;
                    case 2:
                        jop0Var = jop0.AVAILABLE_OFFLINE;
                        break;
                    case 3:
                        jop0Var = jop0.ARTIST_NOT_BANNED;
                        break;
                    case 4:
                        jop0Var = jop0.NOT_BANNED;
                        break;
                    case 5:
                        jop0Var = jop0.NOT_EXPLICIT;
                        break;
                    case 6:
                        jop0Var = jop0.NOT_EPISODE;
                        break;
                    case 7:
                        jop0Var = jop0.NOT_RECOMMENDATION;
                        break;
                    case 8:
                        jop0Var = jop0.UNPLAYED;
                        break;
                    case 9:
                        jop0Var = jop0.IN_PROGRESS;
                        break;
                    case 10:
                        jop0Var = jop0.NOT_FULLY_PLAYED;
                        break;
                    case 11:
                        jop0Var = jop0.NOT_EPISODE_TRAILER;
                        break;
                    case 12:
                        jop0Var = jop0.RECOMMENDATION;
                        break;
                    case 13:
                        jop0Var = jop0.VIDEO_CONTENT;
                        break;
                    case 14:
                        jop0Var = jop0.NOT_VIDEO_CONTENT;
                        break;
                    case 15:
                        jop0Var = jop0.FINISHED;
                        break;
                    case 16:
                        jop0Var = jop0.NOT_LOCAL_TRACK;
                        break;
                    case 17:
                        jop0Var = jop0.NOT_PAYWALLED;
                        break;
                    case 18:
                        jop0Var = jop0.NOT_FULLY_PLAYED_OR_IN_PROGRESS;
                        break;
                    default:
                        jop0Var = null;
                        break;
                }
                return jop0Var == null ? jop0.UNRECOGNIZED : jop0Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m66924d(pa40 pa40Var, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-923634012);
        int i2 = (xq00Var.m91766g(pa40Var) ? 4 : 2) | i | (xq00Var.m91766g(fxh0Var) ? 32 : 16) | (xq00Var.m91770i(gh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            el51.m39334d(pa40Var, fxh0Var, gh00Var, xq00Var, i2 & 1022);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y5z((Object) this, (Object) pa40Var, fxh0Var, (Object) gh00Var, i, 14);
        }
    }

    public /* synthetic */ oh3(Object obj, int i) {
        this.f165326a = i;
    }

    public /* synthetic */ oh3(son sonVar, otn otnVar, int i) {
        this.f165326a = i;
    }

    public /* synthetic */ oh3(boolean z) {
        this.f165326a = 8;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        agr0 agr0Var;
        switch (this.f165326a) {
            case 2:
                return kz9.f128046h.get(obj);
            case 10:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof xul0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((xul0) obj3).mo49279c()) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return C2244p5.f174033a;
                }
                return (xul0) arrayList2.get(0);
            case 15:
                InitChildAccountConfigResponse initChildAccountConfigResponse = (InitChildAccountConfigResponse) obj;
                boolean zM12088n = initChildAccountConfigResponse.m12088n();
                boolean zM12089o = initChildAccountConfigResponse.m12089o();
                String dateOfBirthMinDate = initChildAccountConfigResponse.getDateOfBirthMinDate();
                String dateOfBirthMaxDate = initChildAccountConfigResponse.getDateOfBirthMaxDate();
                boolean available = initChildAccountConfigResponse.m12090p().getAvailable();
                lzm0 fzm0Var = kzm0.f128164a;
                lzm0 fzm0Var2 = available ? new fzm0(initChildAccountConfigResponse.m12090p().getValue()) : fzm0Var;
                if (initChildAccountConfigResponse.m12091q().getAvailable()) {
                    fzm0Var = new fzm0(initChildAccountConfigResponse.m12091q().getValue());
                }
                d0n0 d0n0Var = new d0n0(fzm0Var2, fzm0Var);
                int iOrdinal = initChildAccountConfigResponse.m12092r().ordinal();
                if (iOrdinal == 0) {
                    agr0Var = agr0.f15482a;
                } else if (iOrdinal == 1) {
                    agr0Var = agr0.f15483b;
                } else if (iOrdinal == 2) {
                    agr0Var = agr0.f15484c;
                } else if (iOrdinal == 3) {
                    agr0Var = agr0.f15485d;
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    agr0Var = agr0.f15482a;
                } else {
                    agr0Var = agr0.f15486e;
                }
                return new bii(zM12088n, zM12089o, dateOfBirthMinDate, dateOfBirthMaxDate, d0n0Var, agr0Var);
            case 25:
                return i3z0.f98356h.get(obj);
            default:
                pqm0 pqm0Var = (pqm0) obj;
                return ik81.m50926h((PlayerState) pqm0Var.f180350a, ((Boolean) pqm0Var.f180351b).booleanValue(), true);
        }
    }
}
