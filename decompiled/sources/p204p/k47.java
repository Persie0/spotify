package p204p;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.Timestamp;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.party.mobile.p121v2.ListeningPartyMarketingCard;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class k47 implements j47, InterfaceC2207oa, gxi0, BiFunction, vd50, lh41, Function, Predicate, o481 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119115a;

    public /* synthetic */ k47(int i) {
        this.f119115a = i;
    }

    /* JADX INFO: renamed from: k */
    public static final s9k m55351k(String str) {
        fv31 fv31Var = pjp0.f178294e;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return new s9k(str);
                }
            } catch (SpotifyUriParserException unused) {
                edb.m38545A("Uri ", str, " is invalid/unsupported.");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static cbm0 m55352m(wfz wfzVar) {
        if (wfzVar == null) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            return xgg1.m90749Z4();
        }
        vfz vfzVar = wfzVar.f250930b;
        if (vfzVar instanceof sfz) {
            int iM38547C = edb.m38547C(((sfz) vfzVar).f208665a);
            if (iM38547C == 0) {
                AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_VIDEOS", "search/videos", 1744, "search");
            }
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
            return xgg1.m90662N1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1737, "search");
        }
        if (!(vfzVar instanceof tfz)) {
            if (!(vfzVar instanceof ufz)) {
                throw new NoWhenBranchMatchedException();
            }
            AtomicReferenceArray atomicReferenceArray4 = cbm0.f36163e;
            return xgg1.m90662N1("SEARCH_RECENT", "search/recent", 1741, "search");
        }
        switch (edb.m38547C(stg1.m79281v(((tfz) vfzVar).f220083a))) {
            case 0:
                AtomicReferenceArray atomicReferenceArray5 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_ARTISTS", "search/artists", 1725, "search");
            case 1:
                AtomicReferenceArray atomicReferenceArray6 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_SONGS", "search/songs", 1743, "search");
            case 2:
                AtomicReferenceArray atomicReferenceArray7 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_ALBUMS", "search/albums", 1724, "search");
            case 3:
                AtomicReferenceArray atomicReferenceArray8 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_PLAYLISTS", "search/playlists", 1736, "search");
            case 4:
                AtomicReferenceArray atomicReferenceArray9 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_GENRES", "search/genres", 1731, "search");
            case 5:
                AtomicReferenceArray atomicReferenceArray10 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_SHOWS", "search/shows", 1742, "search");
            case 6:
                AtomicReferenceArray atomicReferenceArray11 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_AUDIOS", "search/audios", 1727, "search");
            case 7:
                AtomicReferenceArray atomicReferenceArray12 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1737, "search");
            case 8:
                AtomicReferenceArray atomicReferenceArray13 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_PROFILES", "search/profiles", 1740, "search");
            case 9:
                AtomicReferenceArray atomicReferenceArray14 = cbm0.f36163e;
                return xgg1.m90662N1("SEARCH_AUDIOBOOKS", "search/audiobooks", 1726, "search");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static z2c m55353n(List list, nd6 nd6Var, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return new z2c(list, z, null, gbu.f78413a, nd6Var);
    }

    /* JADX INFO: renamed from: o */
    public static String m55354o(nuf nufVar) {
        int iOrdinal = nufVar.ordinal();
        if (iOrdinal == 0) {
            return "qac";
        }
        if (iOrdinal == 1) {
            return "submit";
        }
        if (iOrdinal == 2) {
            return "link";
        }
        if (iOrdinal == 3) {
            return "recommended_query";
        }
        if (iOrdinal == 4) {
            return "related_query";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[RETURN] */
    /* JADX INFO: renamed from: r */
    public static rac m55355r(Bundle bundle) {
        rac racVarM40166C;
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice castDeviceM1481M;
        rac racVar;
        if (bundle != null) {
            try {
                bundle.setClassLoader(rac.class.getClassLoader());
                if (bundle != null && (racVar = (rac) zn91.m96523K(bundle, "com.spotify.connect.EXTRA_CAST_DEVICE_INFO", rac.class)) != null) {
                    return racVar;
                }
                if (bundle == null && (castDeviceM1481M = CastDevice.m1481M(bundle)) != null) {
                    return ex60.m40166C(castDeviceM1481M);
                }
                if (bundle != null || (castDevice2 = (CastDevice) zn91.m96523K(bundle, "com.google.android.gms.dtdi.EXTRA_CAST_DEVICE", CastDevice.class)) == null) {
                    racVarM40166C = null;
                } else {
                    racVarM40166C = ex60.m40166C(castDevice2);
                }
                if (racVarM40166C == null) {
                    return racVarM40166C;
                }
                if (bundle != null && (castDevice = (CastDevice) zn91.m96523K(bundle, "com.google.android.gms.cast.EXTRA_CAST_DEVICE", CastDevice.class)) != null) {
                    return ex60.m40166C(castDevice);
                }
            } catch (Exception e) {
                Logger.m3966b("CastBasic->%s", edb.m38564m("toCastDeviceInfo failed: ", e.getMessage()));
            }
        } else {
            if (bundle != null) {
                return racVar;
            }
            if (bundle == null) {
            }
            if (bundle != null) {
                racVarM40166C = null;
            } else {
                racVarM40166C = null;
            }
            if (racVarM40166C == null) {
                return racVarM40166C;
            }
            if (bundle != null) {
                return ex60.m40166C(castDevice);
            }
        }
        return null;
    }

    @Override // p204p.j47
    /* JADX INFO: renamed from: a */
    public int mo52324a() {
        return 44100;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f119115a) {
            case 1:
                return ((ihi) obj).f102296c == u300.BLEND;
            case 15:
                Set set = dd41.f47702f;
                return r46.m74726U(((ihi) obj).f102294a).f47709c == gn80.LOCAL_FILES_ROOT;
            default:
                return ((ihi) obj).f102295b;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        tl11 tl11Var = (tl11) obj;
        List list = tl11Var.f221297b;
        int size = list.size();
        int i = tl11Var.f221300e;
        if (size > i) {
            size = i;
        }
        return tl11.m81029a(tl11Var, null, new m3w(size - list.size(), size), 991);
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: b */
    public File mo46107b() {
        return null;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: c */
    public i3l mo46108c() {
        return null;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        niy niyVar;
        if (i == 0) {
            niyVar = niy.FEED_ENTITY_SOURCE_UNSPECIFIED;
        } else if (i == 1) {
            niyVar = niy.FEED_ENTITY_SOURCE_DM;
        } else if (i != 2) {
            niyVar = i != 3 ? null : niy.FEED_ENTITY_SOURCE_FOLLOWING;
        } else {
            niyVar = niy.FEED_ENTITY_SOURCE_GROUP;
        }
        return niyVar == null ? niy.UNRECOGNIZED : niyVar;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: d */
    public File mo46109d() {
        return null;
    }

    @Override // p204p.j47
    /* JADX INFO: renamed from: e */
    public i47 mo52325e(int i, int i2) {
        return mo52326j(i, 44100, i2);
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: f */
    public File mo46110f() {
        return null;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: g */
    public File mo46111g() {
        return null;
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: h */
    public File mo46112h() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // p204p.lh41
    /* JADX INFO: renamed from: i */
    public StackTraceElement[] mo44656i(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // p204p.j47
    /* JADX INFO: renamed from: j */
    public i47 mo52326j(int i, int i2, int i3) {
        return new m47(new AudioRecord(i, i2, 16, 2, i3));
    }

    @Override // p204p.gxi0
    /* JADX INFO: renamed from: l */
    public File mo46113l() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0282  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0483  */
    /* JADX WARN: Code duplicated, block: B:285:0x0490  */
    /* JADX WARN: Code duplicated, block: B:288:0x049d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX INFO: renamed from: p */
    public yt60 m55356p(KeyEvent keyEvent) {
        yt60 yt60Var;
        yt60 yt60Var2;
        yt60 yt60Var3;
        int iM48395j = hrg1.m48395j(keyEvent);
        yt60 yt60Var4 = null;
        if (iM48395j == grg1.f83766c) {
            long jM29083e = bga.m29083e(keyEvent.getKeyCode());
            if (ut60.m83924a(jM29083e, ut60.f233811f)) {
                yt60Var = yt60.SELECT_LINE_LEFT;
            } else if (ut60.m83924a(jM29083e, ut60.f233812g)) {
                yt60Var = yt60.SELECT_LINE_RIGHT;
            } else if (ut60.m83924a(jM29083e, ut60.f233809d)) {
                yt60Var = yt60.SELECT_HOME;
            } else if (ut60.m83924a(jM29083e, ut60.f233810e)) {
                yt60Var = yt60.SELECT_END;
            } else {
                yt60Var = null;
            }
        } else if (iM48395j == 1) {
            long jM29083e2 = bga.m29083e(keyEvent.getKeyCode());
            if (ut60.m83924a(jM29083e2, ut60.f233811f)) {
                yt60Var = yt60.LINE_LEFT;
            } else if (ut60.m83924a(jM29083e2, ut60.f233812g)) {
                yt60Var = yt60.LINE_RIGHT;
            } else if (ut60.m83924a(jM29083e2, ut60.f233809d)) {
                yt60Var = yt60.HOME;
            } else if (ut60.m83924a(jM29083e2, ut60.f233810e)) {
                yt60Var = yt60.END;
            } else if (ut60.m83924a(jM29083e2, ut60.f233824s)) {
                yt60Var = yt60.DELETE_FROM_LINE_START;
            } else {
                yt60Var = null;
            }
        } else {
            yt60Var = null;
        }
        if (yt60Var != null) {
            return yt60Var;
        }
        wfx wfxVar = qfc1.f188167a;
        wfxVar.getClass();
        int iM48395j2 = hrg1.m48395j(keyEvent);
        long jM29083e3 = bga.m29083e(keyEvent.getKeyCode());
        boolean zM83924a = ut60.m83924a(jM29083e3, ut60.f233824s);
        yt60 yt60Var5 = yt60.NEW_LINE;
        yt60 yt60Var6 = yt60.DELETE_PREV_CHAR;
        if (zM83924a) {
            if (iM48395j2 == 0 || iM48395j2 == 8 || iM48395j2 == 12) {
                yt60Var2 = yt60Var6;
            } else if (iM48395j2 == 2 || iM48395j2 == 10) {
                yt60Var2 = yt60.DELETE_PREV_WORD;
            } else {
                yt60Var2 = null;
            }
        } else if ((ut60.m83924a(jM29083e3, ut60.f233823r) || ut60.m83924a(jM29083e3, ut60.f233795E)) && (iM48395j2 == 0 || iM48395j2 == 8 || iM48395j2 == 2 || iM48395j2 == 10)) {
            yt60Var2 = yt60Var5;
        } else {
            yt60Var2 = null;
        }
        if (yt60Var2 != null) {
            return yt60Var2;
        }
        int iM48395j3 = hrg1.m48395j(keyEvent);
        yt60 yt60Var7 = yt60.SELECT_LINE_START;
        yt60 yt60Var8 = yt60.SELECT_LINE_END;
        if (iM48395j3 == 10) {
            long jM29083e4 = bga.m29083e(keyEvent.getKeyCode());
            if (ut60.m83924a(jM29083e4, ut60.f233811f) || ut60.m83924a(jM29083e4, ut60.f233798H)) {
                yt60Var3 = yt60.SELECT_LEFT_WORD;
            } else if (ut60.m83924a(jM29083e4, ut60.f233812g) || ut60.m83924a(jM29083e4, ut60.f233799I)) {
                yt60Var3 = yt60.SELECT_RIGHT_WORD;
            } else if (ut60.m83924a(jM29083e4, ut60.f233809d) || ut60.m83924a(jM29083e4, ut60.f233796F)) {
                yt60Var3 = yt60.SELECT_PREV_PARAGRAPH;
            } else if (ut60.m83924a(jM29083e4, ut60.f233810e) || ut60.m83924a(jM29083e4, ut60.f233797G)) {
                yt60Var3 = yt60.SELECT_NEXT_PARAGRAPH;
            } else {
                yt60Var3 = null;
            }
        } else if (iM48395j3 == 2) {
            long jM29083e5 = bga.m29083e(keyEvent.getKeyCode());
            if (ut60.m83924a(jM29083e5, ut60.f233811f) || ut60.m83924a(jM29083e5, ut60.f233798H)) {
                yt60Var3 = yt60.LEFT_WORD;
            } else if (ut60.m83924a(jM29083e5, ut60.f233812g) || ut60.m83924a(jM29083e5, ut60.f233799I)) {
                yt60Var3 = yt60.RIGHT_WORD;
            } else if (ut60.m83924a(jM29083e5, ut60.f233809d) || ut60.m83924a(jM29083e5, ut60.f233796F)) {
                yt60Var3 = yt60.PREV_PARAGRAPH;
            } else if (ut60.m83924a(jM29083e5, ut60.f233810e) || ut60.m83924a(jM29083e5, ut60.f233797G)) {
                yt60Var3 = yt60.NEXT_PARAGRAPH;
            } else if (ut60.m83924a(jM29083e5, ut60.f233816k)) {
                yt60Var3 = yt60Var6;
            } else if (ut60.m83924a(jM29083e5, ut60.f233825t)) {
                yt60Var3 = yt60.DELETE_NEXT_WORD;
            } else if (ut60.m83924a(jM29083e5, ut60.f233792B)) {
                yt60Var3 = yt60.DESELECT;
            } else {
                yt60Var3 = null;
            }
        } else if (iM48395j3 == 8) {
            long jM29083e6 = bga.m29083e(keyEvent.getKeyCode());
            if (ut60.m83924a(jM29083e6, ut60.f233827v) || ut60.m83924a(jM29083e6, ut60.f233800J)) {
                yt60Var3 = yt60Var7;
            } else if (ut60.m83924a(jM29083e6, ut60.f233828w) || ut60.m83924a(jM29083e6, ut60.f233801K)) {
                yt60Var3 = yt60Var8;
            } else {
                yt60Var3 = null;
            }
        } else if (iM48395j3 == 1 && ut60.m83924a(bga.m29083e(keyEvent.getKeyCode()), ut60.f233825t)) {
            yt60Var3 = yt60.DELETE_TO_LINE_END;
        } else {
            yt60Var3 = null;
        }
        if (yt60Var3 != null) {
            return yt60Var3;
        }
        ((hcj0) wfxVar.f250920b).getClass();
        int iM48395j4 = hrg1.m48395j(keyEvent);
        if (grg1.m45498m(iM48395j4, 10)) {
            long jM39797o = erg1.m39797o(keyEvent);
            int i = ut60.f233805O;
            if (ut60.m83924a(jM39797o, yqg1.m94359V())) {
                yt60Var4 = yt60.REDO;
            }
        } else if (grg1.m45498m(iM48395j4, 2)) {
            long jM39797o2 = erg1.m39797o(keyEvent);
            int i2 = ut60.f233805O;
            if (ut60.m83924a(jM39797o2, yqg1.m94376n()) || ut60.m83924a(jM39797o2, yqg1.m94387y()) || ut60.m83924a(jM39797o2, yqg1.m94346I())) {
                yt60Var4 = yt60.COPY;
            } else if (ut60.m83924a(jM39797o2, yqg1.m94356S())) {
                yt60Var4 = yt60.PASTE;
            } else if (ut60.m83924a(jM39797o2, yqg1.m94357T())) {
                yt60Var4 = yt60.CUT;
            } else if (ut60.m83924a(jM39797o2, yqg1.m94373k())) {
                yt60Var4 = yt60.SELECT_ALL;
            } else if (ut60.m83924a(jM39797o2, yqg1.m94358U())) {
                yt60Var4 = yt60.REDO;
            } else if (ut60.m83924a(jM39797o2, yqg1.m94359V())) {
                yt60Var4 = yt60.UNDO;
            }
        } else if (grg1.m45498m(iM48395j4, 8)) {
            long jM39797o3 = erg1.m39797o(keyEvent);
            int i3 = ut60.f233805O;
            if (ut60.m83924a(jM39797o3, yqg1.m94382t()) || ut60.m83924a(jM39797o3, yqg1.m94342E())) {
                yt60Var4 = yt60.SELECT_LEFT_CHAR;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94383u()) || ut60.m83924a(jM39797o3, yqg1.m94343F())) {
                yt60Var4 = yt60.SELECT_RIGHT_CHAR;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94384v()) || ut60.m83924a(jM39797o3, yqg1.m94344G())) {
                yt60Var4 = yt60.SELECT_UP;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94381s()) || ut60.m83924a(jM39797o3, yqg1.m94341D())) {
                yt60Var4 = yt60.SELECT_DOWN;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94352O()) || ut60.m83924a(jM39797o3, yqg1.m94350M())) {
                yt60Var4 = yt60.SELECT_PAGE_UP;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94351N()) || ut60.m83924a(jM39797o3, yqg1.m94349L())) {
                yt60Var4 = yt60.SELECT_PAGE_DOWN;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94338A()) || ut60.m83924a(jM39797o3, yqg1.m94348K())) {
                yt60Var4 = yt60Var7;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94388z()) || ut60.m83924a(jM39797o3, yqg1.m94347J())) {
                yt60Var4 = yt60Var8;
            } else if (ut60.m83924a(jM39797o3, yqg1.m94387y()) || ut60.m83924a(jM39797o3, yqg1.m94346I())) {
                yt60Var4 = yt60.PASTE;
            }
        } else if (grg1.m45498m(iM48395j4, 0)) {
            long jM39797o4 = erg1.m39797o(keyEvent);
            int i4 = ut60.f233805O;
            if (ut60.m83924a(jM39797o4, yqg1.m94382t()) || ut60.m83924a(jM39797o4, yqg1.m94342E())) {
                yt60Var4 = yt60.LEFT_CHAR;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94383u()) || ut60.m83924a(jM39797o4, yqg1.m94343F())) {
                yt60Var4 = yt60.RIGHT_CHAR;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94384v()) || ut60.m83924a(jM39797o4, yqg1.m94344G())) {
                yt60Var4 = yt60.UP;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94381s()) || ut60.m83924a(jM39797o4, yqg1.m94341D())) {
                yt60Var4 = yt60.DOWN;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94380r())) {
                yt60Var4 = yt60.CENTER;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94352O()) || ut60.m83924a(jM39797o4, yqg1.m94350M())) {
                yt60Var4 = yt60.PAGE_UP;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94351N()) || ut60.m83924a(jM39797o4, yqg1.m94349L())) {
                yt60Var4 = yt60.PAGE_DOWN;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94338A()) || ut60.m83924a(jM39797o4, yqg1.m94348K())) {
                yt60Var4 = yt60.LINE_START;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94388z()) || ut60.m83924a(jM39797o4, yqg1.m94347J())) {
                yt60Var4 = yt60.LINE_END;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94385w()) || ut60.m83924a(jM39797o4, yqg1.m94345H())) {
                yt60Var4 = yt60Var5;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94375m())) {
                yt60Var4 = yt60Var6;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94379q())) {
                yt60Var4 = yt60.DELETE_NEXT_CHAR;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94353P())) {
                yt60Var4 = yt60.PASTE;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94378p())) {
                yt60Var4 = yt60.CUT;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94377o())) {
                yt60Var4 = yt60.COPY;
            } else if (ut60.m83924a(jM39797o4, yqg1.m94354Q())) {
                yt60Var4 = yt60.TAB;
            }
        }
        return yt60Var4;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX INFO: renamed from: q */
    public lh90 m55357q(ListeningPartyMarketingCard listeningPartyMarketingCard) {
        int i;
        String uri = listeningPartyMarketingCard.m16626p().getUri();
        int i2 = qnc0.f190563a[listeningPartyMarketingCard.m16627q().m16630o().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 == 2 || i2 == 3) {
                i = 1;
            } else if (i2 != 4) {
                i = 3;
            }
        } else {
            i = 1;
        }
        String imageUrl = listeningPartyMarketingCard.m16625o().getImageUrl();
        Timestamp timestampM16622p = listeningPartyMarketingCard.m16626p().m16622p();
        z050 z050VarM95041q6 = z050.m95041q6(timestampM16622p.m1969s(), timestampM16622p.m1968r());
        gze1 gze1VarM46197n = gze1.m46197n(TimeZone.getDefault().getID());
        z050VarM95041q6.getClass();
        return new lh90(i, uri, imageUrl, pze1.m71734n6(z050VarM95041q6, gze1VarM46197n).m71736m6(bno.f28902k), listeningPartyMarketingCard.m16625o().getName(), listeningPartyMarketingCard.m16626p().m16621o() && listeningPartyMarketingCard.m16624n().m16632o() == dj90.NON_PREMIUM, listeningPartyMarketingCard.m16626p().m16621o(), false);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return !re41.m75379a((PlayerState) obj);
    }

    public /* synthetic */ k47(int i, Object obj, Object obj2) {
        this.f119115a = i;
    }

    public /* synthetic */ k47(Object obj, int i) {
        this.f119115a = i;
    }

    public /* synthetic */ k47(boolean z) {
        this.f119115a = 7;
    }

    public k47(JSONObject jSONObject) {
        this.f119115a = 21;
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        List listM46715L = h6f.m46715L((kbw) obj, (kbw) obj2);
        if (!listM46715L.isEmpty()) {
            Iterator it = listM46715L.iterator();
            while (it.hasNext()) {
                if (!(((kbw) it.next()) instanceof ibw)) {
                    Iterator it2 = g6f.m43735n0(listM46715L, jbw.class).iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            next = new jbw(new lbw(((jbw) next).f110914a, ((jbw) it2.next()).f110914a));
                        }
                        return (kbw) next;
                    }
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
        }
        ArrayList arrayListM43735n0 = g6f.m43735n0(listM46715L, ibw.class);
        ibw ibwVar = new ibw("");
        Iterator it3 = arrayListM43735n0.iterator();
        while (it3.hasNext()) {
            ibwVar = new ibw(klh.m56834f(ibwVar.f100680a, ", ", ((ibw) it3.next()).f100680a));
        }
        return ibwVar;
    }

    public k47() {
        this.f119115a = 8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }
}
