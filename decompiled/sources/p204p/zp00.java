package p204p;

import com.spotify.gamesservice.musicguesser.p071v1.Game;
import com.spotify.gamesservice.musicguesser.p071v1.GameMetadata;
import com.spotify.gamesservice.musicguesser.p071v1.GamePageElements;
import com.spotify.gamesservice.musicguesser.p071v1.GetGameResponse;
import com.spotify.gamesservice.musicguesser.p071v1.Question;
import com.spotify.gamesservice.musicguesser.p071v1.ScoreThresholdMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class zp00 {

    /* JADX INFO: renamed from: a */
    public final e940 f284892a;

    /* JADX INFO: renamed from: b */
    public final esa0 f284893b;

    /* JADX INFO: renamed from: c */
    public final w8q0 f284894c;

    /* JADX INFO: renamed from: d */
    public final zl00 f284895d;

    /* JADX INFO: renamed from: e */
    public final dhi0 f284896e;

    public zp00(xre xreVar, e940 e940Var, esa0 esa0Var, w8q0 w8q0Var, zl00 zl00Var, dhi0 dhi0Var) {
        this.f284892a = e940Var;
        this.f284893b = esa0Var;
        this.f284894c = w8q0Var;
        this.f284895d = zl00Var;
        this.f284896e = dhi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x030d  */
    /* JADX WARN: Code duplicated, block: B:106:0x031d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0344  */
    /* JADX WARN: Code duplicated, block: B:111:0x0346  */
    /* JADX WARN: Code duplicated, block: B:112:0x0348  */
    /* JADX WARN: Code duplicated, block: B:113:0x034a  */
    /* JADX WARN: Code duplicated, block: B:114:0x034c  */
    /* JADX WARN: Code duplicated, block: B:115:0x034e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0368  */
    /* JADX WARN: Code duplicated, block: B:121:0x036f  */
    /* JADX WARN: Code duplicated, block: B:124:0x038c  */
    /* JADX WARN: Code duplicated, block: B:127:0x039c  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:144:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b9 A[LOOP:1: B:56:0x01b3->B:58:0x01b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0206  */
    /* JADX WARN: Code duplicated, block: B:65:0x0235  */
    /* JADX WARN: Code duplicated, block: B:69:0x0262  */
    /* JADX WARN: Code duplicated, block: B:70:0x0264  */
    /* JADX WARN: Code duplicated, block: B:71:0x0266  */
    /* JADX WARN: Code duplicated, block: B:72:0x0268  */
    /* JADX WARN: Code duplicated, block: B:73:0x026a  */
    /* JADX WARN: Code duplicated, block: B:77:0x028c  */
    /* JADX WARN: Code duplicated, block: B:80:0x029c  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f9  */
    /* JADX INFO: renamed from: a */
    public static final Object m96656a(zp00 zp00Var, String str, ibk ibkVar) {
        yp00 yp00Var;
        String str2;
        String str3;
        GetGameResponse getGameResponse;
        Map map;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        Iterator it;
        boolean zHasNext;
        aiy0 aiy0Var;
        aiy0 aiy0Var2;
        aiy0 aiy0Var3;
        aiy0 aiy0Var4;
        aiy0 aiy0Var5;
        aiy0 aiy0Var6;
        GamePageElements gamePageElementsM11053p;
        String str4;
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2;
        x9m0 x9m0Var;
        int i;
        long jCurrentTimeMillis;
        Iterator<E> it2;
        int iM11002n;
        int iM11002n2;
        zhy0 zhy0VarM11062n;
        aiy0 aiy0Var7;
        int iM31820L;
        zhy0 zhy0VarM11062n2;
        aiy0 aiy0Var8;
        zhy0 zhy0VarM11004p;
        ArrayList arrayList3;
        String str5 = str;
        if (ibkVar instanceof yp00) {
            yp00Var = (yp00) ibkVar;
            int i2 = yp00Var.f274788f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yp00Var.f274788f = i2 - Integer.MIN_VALUE;
            } else {
                yp00Var = new yp00(zp00Var, ibkVar);
            }
        } else {
            yp00Var = new yp00(zp00Var, ibkVar);
        }
        yp00 yp00Var2 = yp00Var;
        Object objM36043a = yp00Var2.f274786d;
        int i3 = yp00Var2.f274788f;
        int i4 = 10;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM36043a);
            if (wl51.m88460J0(str5)) {
                throw new IllegalArgumentException("MusicGuesser:Gameplay: missing game ID");
            }
            dhi0 dhi0Var = zp00Var.f284896e;
            yp00Var2.f274783a = str5;
            yp00Var2.f274788f = 1;
            objM36043a = dhi0Var.m36043a(str5, yp00Var2);
            if (objM36043a != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            str5 = yp00Var2.f274783a;
            bga.m29073P(objM36043a);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = yp00Var2.f274785c;
            getGameResponse = yp00Var2.f274784b;
            String str6 = yp00Var2.f274783a;
            bga.m29073P(objM36043a);
            str2 = str6;
        }
        yk91 yk91Var = (yk91) objM36043a;
        map = (Map) yk91Var.f273650a;
        zBooleanValue = ((Boolean) yk91Var.f273651b).booleanValue();
        zBooleanValue2 = ((Boolean) yk91Var.f273652c).booleanValue();
        ae50<Question> ae50VarM10999p = getGameResponse.m11051n().m10999p();
        arrayList = new ArrayList(i6f.m49804T(ae50VarM10999p, 10));
        for (Question question : ae50VarM10999p) {
            String strM11010o = ((GameMetadata.TrackMetadata) kkc0.m56692e0(question.m11056p(), getGameResponse.m11052o().m11007p())).m11010o();
            wj50.m88279p(strM11010o);
            String str7 = (String) kkc0.m56692e0(strM11010o, map);
            ae50<String> ae50VarM11055o = question.m11055o();
            arrayList3 = new ArrayList(i6f.m49804T(ae50VarM11055o, i4));
            for (String str8 : ae50VarM11055o) {
                GameMetadata.ArtistMetadata artistMetadata = (GameMetadata.ArtistMetadata) kkc0.m56692e0(str8, getGameResponse.m11052o().m11006n());
                wj50.m88279p(str8);
                arrayList3.add(new m6e(str8, artistMetadata.getDisplayName(), artistMetadata.getImageUrl()));
                zBooleanValue2 = zBooleanValue2;
            }
            arrayList.add(new xit0(strM11010o, str7, question.m11054n(), arrayList3));
            zBooleanValue2 = zBooleanValue2;
            i4 = 10;
        }
        z = zBooleanValue2;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("No questions found in game data");
        }
        ae50 ae50VarM11001o = getGameResponse.m11051n().m10998n().m11001o();
        arrayList2 = new ArrayList(i6f.m49804T(ae50VarM11001o, 10));
        it = ae50VarM11001o.iterator();
        while (true) {
            zHasNext = it.hasNext();
            aiy0Var = aiy0.f16106a;
            aiy0Var2 = aiy0.f16108c;
            aiy0Var3 = aiy0.f16109d;
            aiy0Var4 = aiy0.f16110e;
            aiy0Var5 = aiy0.f16111f;
            aiy0Var6 = aiy0.f16107b;
            if (zHasNext) {
                GetGameResponse getGameResponse2 = getGameResponse;
                gamePageElementsM11053p = getGameResponse2.m11053p();
                str4 = (String) map.get(str3);
                if (str4 == null) {
                    str4 = "";
                }
                String str9 = str4;
                String strM11013o = gamePageElementsM11053p.m11013o();
                String strM11012n = gamePageElementsM11053p.m11012n();
                if (zBooleanValue) {
                    ae50<ScoreThresholdMap> ae50VarM11016s = gamePageElementsM11053p.m11016s();
                    iM31820L = c95.m31820L(i6f.m49804T(ae50VarM11016s, 10));
                    if (iM31820L < 16) {
                        iM31820L = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM31820L);
                    for (ScoreThresholdMap scoreThresholdMap : ae50VarM11016s) {
                        zhy0VarM11062n2 = scoreThresholdMap.m11062n();
                        switch (zhy0VarM11062n2.ordinal()) {
                            case 1:
                                aiy0Var8 = aiy0Var;
                                break;
                            case 2:
                                aiy0Var8 = aiy0Var2;
                                break;
                            case 3:
                                aiy0Var8 = aiy0Var3;
                                break;
                            case 4:
                                aiy0Var8 = aiy0Var4;
                                break;
                            case 5:
                                aiy0Var8 = aiy0Var5;
                                break;
                            case 6:
                                aiy0Var8 = aiy0Var6;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11062n2).toString());
                        }
                        linkedHashMap.put(aiy0Var8, scoreThresholdMap.getValue());
                    }
                } else {
                    linkedHashMap = nau.f152117a;
                }
                Map map2 = linkedHashMap;
                ae50<ScoreThresholdMap> ae50VarM11017t = gamePageElementsM11053p.m11017t();
                int iM31820L2 = c95.m31820L(i6f.m49804T(ae50VarM11017t, 10));
                linkedHashMap2 = new LinkedHashMap(iM31820L2 >= 16 ? iM31820L2 : 16);
                for (ScoreThresholdMap scoreThresholdMap2 : ae50VarM11017t) {
                    zhy0VarM11062n = scoreThresholdMap2.m11062n();
                    switch (zhy0VarM11062n.ordinal()) {
                        case 1:
                            aiy0Var7 = aiy0Var;
                            break;
                        case 2:
                            aiy0Var7 = aiy0Var2;
                            break;
                        case 3:
                            aiy0Var7 = aiy0Var3;
                            break;
                        case 4:
                            aiy0Var7 = aiy0Var4;
                            break;
                        case 5:
                            aiy0Var7 = aiy0Var5;
                            break;
                        case 6:
                            aiy0Var7 = aiy0Var6;
                            break;
                        default:
                            throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11062n).toString());
                    }
                    linkedHashMap2.put(aiy0Var7, scoreThresholdMap2.getValue());
                }
                x9m0Var = new x9m0(strM11013o, strM11012n, map2, linkedHashMap2, gamePageElementsM11053p.m11014p(), gamePageElementsM11053p.m11018u(), str9);
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                it2 = getGameResponse2.m11051n().m10998n().m11001o().iterator();
                if (it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                iM11002n = ((Game.Config.ScoreCriteria) it2.next()).m11002n();
                while (it2.hasNext()) {
                    iM11002n2 = ((Game.Config.ScoreCriteria) it2.next()).m11002n();
                    if (iM11002n < iM11002n2) {
                        iM11002n = iM11002n2;
                    }
                }
                return new aq00(str2, arrayList, arrayList2, 0, i, jCurrentTimeMillis, x9m0Var, iM11002n, lau.f131415a);
            }
            Game.Config.ScoreCriteria scoreCriteria = (Game.Config.ScoreCriteria) it.next();
            Iterator it3 = it;
            GetGameResponse getGameResponse3 = getGameResponse;
            zhy0VarM11004p = scoreCriteria.m11004p();
            switch (zhy0VarM11004p.ordinal()) {
                case 1:
                    break;
                case 2:
                    aiy0Var = aiy0Var2;
                    break;
                case 3:
                    aiy0Var = aiy0Var3;
                    break;
                case 4:
                    aiy0Var = aiy0Var4;
                    break;
                case 5:
                    aiy0Var = aiy0Var5;
                    break;
                case 6:
                    aiy0Var = aiy0Var6;
                    break;
                default:
                    throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11004p).toString());
            }
            arrayList2.add(new ciy0(aiy0Var, scoreCriteria.m11003o(), scoreCriteria.m11002n()));
            it = it3;
            getGameResponse = getGameResponse3;
        }
        str2 = str5;
        o2x0 o2x0Var = (o2x0) objM36043a;
        if (!o2x0Var.f161171a.f149852O0) {
            throw new IllegalStateException(("Failed to load game state: " + o2x0Var.f161171a.f149860d).toString());
        }
        GetGameResponse getGameResponse4 = (GetGameResponse) o2x0Var.f161172b;
        if (getGameResponse4 == null) {
            throw new IllegalStateException("Empty response body");
        }
        ae50 ae50VarM10999p2 = getGameResponse4.m11051n().m10999p();
        ArrayList arrayList4 = new ArrayList(i6f.m49804T(ae50VarM10999p2, 10));
        Iterator<E> it4 = ae50VarM10999p2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((GameMetadata.TrackMetadata) kkc0.m56692e0(((Question) it4.next()).m11056p(), getGameResponse4.m11052o().m11007p())).m11010o());
        }
        ae50 ae50VarM11016s2 = getGameResponse4.m11053p().m11016s();
        ArrayList arrayList5 = new ArrayList(i6f.m49804T(ae50VarM11016s2, 10));
        Iterator<E> it5 = ae50VarM11016s2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((ScoreThresholdMap) it5.next()).getValue());
        }
        ae50 ae50VarM10999p3 = getGameResponse4.m11051n().m10999p();
        ArrayList arrayList6 = new ArrayList();
        Iterator<E> it6 = ae50VarM10999p3.iterator();
        while (it6.hasNext()) {
            j6f.m52564V(((Question) it6.next()).m11055o(), arrayList6);
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            GameMetadata.ArtistMetadata artistMetadata2 = (GameMetadata.ArtistMetadata) getGameResponse4.m11052o().m11006n().get((String) it7.next());
            String imageUrl = artistMetadata2 != null ? artistMetadata2.getImageUrl() : null;
            if (imageUrl != null) {
                arrayList7.add(imageUrl);
            }
        }
        String strM11015q = getGameResponse4.m11053p().m11015q();
        c5i c5iVar = new c5i(strM11015q, arrayList4, zp00Var, arrayList5, getGameResponse4, arrayList7, null);
        yp00Var2.f274783a = str2;
        yp00Var2.f274784b = getGameResponse4;
        yp00Var2.f274785c = strM11015q;
        yp00Var2.f274788f = 2;
        Object objM56684z = kk40.m56684z(c5iVar, yp00Var2);
        if (objM56684z != yukVar) {
            objM36043a = objM56684z;
            str3 = strM11015q;
            getGameResponse = getGameResponse4;
            yk91 yk91Var2 = (yk91) objM36043a;
            map = (Map) yk91Var2.f273650a;
            zBooleanValue = ((Boolean) yk91Var2.f273651b).booleanValue();
            zBooleanValue2 = ((Boolean) yk91Var2.f273652c).booleanValue();
            ae50<Question> ae50VarM10999p4 = getGameResponse.m11051n().m10999p();
            arrayList = new ArrayList(i6f.m49804T(ae50VarM10999p4, 10));
            while (r5.hasNext()) {
                String strM11010o2 = ((GameMetadata.TrackMetadata) kkc0.m56692e0(question.m11056p(), getGameResponse.m11052o().m11007p())).m11010o();
                wj50.m88279p(strM11010o2);
                String str10 = (String) kkc0.m56692e0(strM11010o2, map);
                ae50<String> ae50VarM11055o2 = question.m11055o();
                arrayList3 = new ArrayList(i6f.m49804T(ae50VarM11055o2, i4));
                while (r9.hasNext()) {
                    GameMetadata.ArtistMetadata artistMetadata3 = (GameMetadata.ArtistMetadata) kkc0.m56692e0(str8, getGameResponse.m11052o().m11006n());
                    wj50.m88279p(str8);
                    arrayList3.add(new m6e(str8, artistMetadata3.getDisplayName(), artistMetadata3.getImageUrl()));
                    zBooleanValue2 = zBooleanValue2;
                }
                arrayList.add(new xit0(strM11010o2, str10, question.m11054n(), arrayList3));
                zBooleanValue2 = zBooleanValue2;
                i4 = 10;
            }
            z = zBooleanValue2;
            if (!arrayList.isEmpty()) {
                throw new IllegalStateException("No questions found in game data");
            }
            ae50 ae50VarM11001o2 = getGameResponse.m11051n().m10998n().m11001o();
            arrayList2 = new ArrayList(i6f.m49804T(ae50VarM11001o2, 10));
            it = ae50VarM11001o2.iterator();
            while (true) {
                zHasNext = it.hasNext();
                aiy0Var = aiy0.f16106a;
                aiy0Var2 = aiy0.f16108c;
                aiy0Var3 = aiy0.f16109d;
                aiy0Var4 = aiy0.f16110e;
                aiy0Var5 = aiy0.f16111f;
                aiy0Var6 = aiy0.f16107b;
                if (zHasNext) {
                    GetGameResponse getGameResponse5 = getGameResponse;
                    gamePageElementsM11053p = getGameResponse5.m11053p();
                    str4 = (String) map.get(str3);
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str11 = str4;
                    String strM11013o2 = gamePageElementsM11053p.m11013o();
                    String strM11012n2 = gamePageElementsM11053p.m11012n();
                    if (zBooleanValue) {
                        ae50<ScoreThresholdMap> ae50VarM11016s3 = gamePageElementsM11053p.m11016s();
                        iM31820L = c95.m31820L(i6f.m49804T(ae50VarM11016s3, 10));
                        if (iM31820L < 16) {
                            iM31820L = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM31820L);
                        while (r2.hasNext()) {
                            zhy0VarM11062n2 = scoreThresholdMap.m11062n();
                            switch (zhy0VarM11062n2.ordinal()) {
                                case 1:
                                    aiy0Var8 = aiy0Var;
                                    break;
                                case 2:
                                    aiy0Var8 = aiy0Var2;
                                    break;
                                case 3:
                                    aiy0Var8 = aiy0Var3;
                                    break;
                                case 4:
                                    aiy0Var8 = aiy0Var4;
                                    break;
                                case 5:
                                    aiy0Var8 = aiy0Var5;
                                    break;
                                case 6:
                                    aiy0Var8 = aiy0Var6;
                                    break;
                                default:
                                    throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11062n2).toString());
                            }
                            linkedHashMap.put(aiy0Var8, scoreThresholdMap.getValue());
                        }
                    } else {
                        linkedHashMap = nau.f152117a;
                    }
                    Map map3 = linkedHashMap;
                    ae50<ScoreThresholdMap> ae50VarM11017t2 = gamePageElementsM11053p.m11017t();
                    int iM31820L3 = c95.m31820L(i6f.m49804T(ae50VarM11017t2, 10));
                    linkedHashMap2 = new LinkedHashMap(iM31820L3 >= 16 ? iM31820L3 : 16);
                    while (r0.hasNext()) {
                        zhy0VarM11062n = scoreThresholdMap2.m11062n();
                        switch (zhy0VarM11062n.ordinal()) {
                            case 1:
                                aiy0Var7 = aiy0Var;
                                break;
                            case 2:
                                aiy0Var7 = aiy0Var2;
                                break;
                            case 3:
                                aiy0Var7 = aiy0Var3;
                                break;
                            case 4:
                                aiy0Var7 = aiy0Var4;
                                break;
                            case 5:
                                aiy0Var7 = aiy0Var5;
                                break;
                            case 6:
                                aiy0Var7 = aiy0Var6;
                                break;
                            default:
                                throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11062n).toString());
                        }
                        linkedHashMap2.put(aiy0Var7, scoreThresholdMap2.getValue());
                    }
                    x9m0Var = new x9m0(strM11013o2, strM11012n2, map3, linkedHashMap2, gamePageElementsM11053p.m11014p(), gamePageElementsM11053p.m11018u(), str11);
                    if (z) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    it2 = getGameResponse5.m11051n().m10998n().m11001o().iterator();
                    if (it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    iM11002n = ((Game.Config.ScoreCriteria) it2.next()).m11002n();
                    while (it2.hasNext()) {
                        iM11002n2 = ((Game.Config.ScoreCriteria) it2.next()).m11002n();
                        if (iM11002n < iM11002n2) {
                            iM11002n = iM11002n2;
                        }
                    }
                    return new aq00(str2, arrayList, arrayList2, 0, i, jCurrentTimeMillis, x9m0Var, iM11002n, lau.f131415a);
                }
                Game.Config.ScoreCriteria scoreCriteria2 = (Game.Config.ScoreCriteria) it.next();
                Iterator it8 = it;
                GetGameResponse getGameResponse6 = getGameResponse;
                zhy0VarM11004p = scoreCriteria2.m11004p();
                switch (zhy0VarM11004p.ordinal()) {
                    case 1:
                        break;
                    case 2:
                        aiy0Var = aiy0Var2;
                        break;
                    case 3:
                        aiy0Var = aiy0Var3;
                        break;
                    case 4:
                        aiy0Var = aiy0Var4;
                        break;
                    case 5:
                        aiy0Var = aiy0Var5;
                        break;
                    case 6:
                        aiy0Var = aiy0Var6;
                        break;
                    default:
                        throw new IllegalStateException(("Unrecognized score threshold: " + zhy0VarM11004p).toString());
                }
                arrayList2.add(new ciy0(aiy0Var, scoreCriteria2.m11003o(), scoreCriteria2.m11002n()));
                it = it8;
                getGameResponse = getGameResponse6;
            }
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: b */
    public final u4a0 m96657b(String str) {
        return new u4a0(new zmy(this, str, null, 3), bk5.m29613h0(new v4a0[0]));
    }
}
