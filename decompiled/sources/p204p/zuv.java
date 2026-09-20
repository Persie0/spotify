package p204p;

import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zuv {

    /* JADX INFO: renamed from: a */
    public final wt80 f286540a;

    /* JADX INFO: renamed from: b */
    public final wg61 f286541b = new wg61(new ias(this, 5));

    /* JADX INFO: renamed from: c */
    public final wg61 f286542c = new wg61(new fts(this, 29));

    /* JADX INFO: renamed from: d */
    public final PlaylistRequestDecorationPolicy f286543d;

    /* JADX INFO: renamed from: e */
    public final PlaylistRequestDecorationPolicy f286544e;

    /* JADX INFO: renamed from: f */
    public final PlaylistRequestDecorationPolicy f286545f;

    public zuv(wt80 wt80Var) {
        this.f286540a = wt80Var;
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57354v(true);
        top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        vr50 vr50VarM18316q = ItemExtensionPolicy.m18316q();
        vr50VarM18316q.m86274r(hn80.PODCAST_CHAPTER);
        amp0VarM18396H.m26434m(Collections.singleton(vr50VarM18316q.build()));
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
        this.f286543d = playlistRequestDecorationPolicy;
        top0 top0Var = (top0) playlistRequestDecorationPolicy.toBuilder();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29506R();
        top0Var.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
        this.f286544e = (PlaylistRequestDecorationPolicy) top0Var.build();
        top0 top0VarM18421v2 = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h1 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h1.m29506R();
        top0VarM18421v2.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h1.build());
        amp0 amp0VarM18396H2 = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H2.m26433D(true);
        top0VarM18421v2.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H2.build());
        this.f286545f = (PlaylistRequestDecorationPolicy) top0VarM18421v2.build();
        top0 top0VarM18421v3 = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h2 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h2.m29495G();
        top0VarM18421v3.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h2.build());
    }

    /* JADX INFO: renamed from: e */
    public static tuv m97077e(p2x0 p2x0Var) {
        Long lM29808s0;
        Long lM29808s1;
        if (!(p2x0Var instanceof m2x0)) {
            return new tuv();
        }
        qu80 qu80Var = (qu80) ((m2x0) p2x0Var).f139474a;
        List<nw80> list = qu80Var.f192598d;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (nw80 nw80Var : list) {
            Map map = nw80Var.f159053g;
            String str = (String) map.get("has_creator_timestamps");
            boolean z = false;
            if (str != null && Boolean.parseBoolean(str)) {
                z = true;
            }
            String str2 = (String) map.get("chapter.start_position_in_milliseconds");
            long jLongValue = 0;
            long jLongValue2 = (str2 == null || (lM29808s1 = bm51.m29808s0(10, str2)) == null) ? 0L : lM29808s1.longValue();
            String str3 = (String) map.get("chapter.end_position_in_milliseconds");
            if (str3 != null && (lM29808s0 = bm51.m29808s0(10, str3)) != null) {
                jLongValue = lM29808s0.longValue();
            }
            boolean z2 = !z;
            arrayList.add(new ruv(nw80Var.f159049c, new mgz0(jLongValue2, z2), new mgz0(jLongValue, z2)));
        }
        String str4 = qu80Var.f192599e.f271257b;
        if (str4.length() <= 0) {
            str4 = null;
        }
        return new tuv(arrayList, str4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m97078a(String str, String str2, ibk ibkVar) {
        uuv uuvVar;
        Object next;
        if (ibkVar instanceof uuv) {
            uuvVar = (uuv) ibkVar;
            int i = uuvVar.f234267e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uuvVar.f234267e = i - Integer.MIN_VALUE;
            } else {
                uuvVar = new uuv(this, ibkVar);
            }
        } else {
            uuvVar = new uuv(this, ibkVar);
        }
        Object objM62841f = uuvVar.f234265c;
        int i2 = uuvVar.f234267e;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            Set set = dd41.f47702f;
            String strM35694A = r46.m74724S("podcast-chapters", str).m35694A();
            if (strM35694A == null) {
                throw new IllegalStateException("Invalid entity URI: ".concat(str).toString());
            }
            st80 st80Var = (st80) this.f286541b.getValue();
            uuvVar.f234263a = str;
            uuvVar.f234264b = str2;
            uuvVar.f234267e = 1;
            objM62841f = ((mu80) this.f286540a).m62841f(strM35694A, st80Var, uuvVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = uuvVar.f234264b;
            str = uuvVar.f234263a;
            bga.m29073P(objM62841f);
        }
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (!(p2x0Var instanceof m2x0)) {
            throw new IllegalStateException(("Failed to retrieve segments for entity " + str + ": " + p2x0Var).toString());
        }
        Iterator it = m97077e(p2x0Var).m81593a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((ruv) next).m76460a(), str2));
        ruv ruvVar = (ruv) next;
        if (ruvVar != null) {
            return ruvVar;
        }
        throw new IllegalStateException(("Segment " + str2 + " not found for entity " + str).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public final Object m97079b(String str, ibk ibkVar) {
        vuv vuvVar;
        String str2;
        if (ibkVar instanceof vuv) {
            vuvVar = (vuv) ibkVar;
            int i = vuvVar.f245084c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vuvVar.f245084c = i - Integer.MIN_VALUE;
            } else {
                vuvVar = new vuv(this, ibkVar);
            }
        } else {
            vuvVar = new vuv(this, ibkVar);
        }
        Object objM62841f = vuvVar.f245082a;
        int i2 = vuvVar.f245084c;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            Set set = dd41.f47702f;
            String strM35694A = r46.m74724S("entity-segment-context", str).m35694A();
            if (strM35694A != null) {
                st80 st80Var = new st80(this.f286545f, null, gbu.f78413a, false, new qt80(s601.m77310m0(in80.f103929t, in80.f103921b)), new b5u0(0, 1), null, 0, null, 458);
                vuvVar.f245084c = 1;
                objM62841f = ((mu80) this.f286540a).m62841f(strM35694A, st80Var, vuvVar);
                yuk yukVar = yuk.f276404a;
                if (objM62841f == yukVar) {
                    return yukVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM62841f);
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (p2x0Var instanceof m2x0) {
            qu80 qu80Var = (qu80) ((m2x0) p2x0Var).f139474a;
            nw80 nw80Var = (nw80) g6f.m43745s0(qu80Var.f192598d);
            if (nw80Var == null || (str2 = nw80Var.f159049c) == null || str2.length() == 0) {
                str2 = null;
            }
            String str3 = qu80Var.f192599e.f271257b;
            return new suv(str2, str3.length() != 0 ? str3 : null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m97080c(String str, ibk ibkVar) {
        wuv wuvVar;
        if (ibkVar instanceof wuv) {
            wuvVar = (wuv) ibkVar;
            int i = wuvVar.f255282c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wuvVar.f255282c = i - Integer.MIN_VALUE;
            } else {
                wuvVar = new wuv(this, ibkVar);
            }
        } else {
            wuvVar = new wuv(this, ibkVar);
        }
        Object objM97081d = wuvVar.f255280a;
        int i2 = wuvVar.f255282c;
        if (i2 == 0) {
            bga.m29073P(objM97081d);
            wuvVar.f255282c = 1;
            objM97081d = m97081d(str, wuvVar, false);
            Object obj = yuk.f276404a;
            if (objM97081d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM97081d);
        }
        return ((tuv) objM97081d).m81593a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m97081d(String str, ibk ibkVar, boolean z) {
        xuv xuvVar;
        zuv zuvVar;
        if (ibkVar instanceof xuv) {
            xuvVar = (xuv) ibkVar;
            int i = xuvVar.f266180d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuvVar.f266180d = i - Integer.MIN_VALUE;
            } else {
                xuvVar = new xuv(this, ibkVar);
            }
        } else {
            xuvVar = new xuv(this, ibkVar);
        }
        Object objM62841f = xuvVar.f266178b;
        int i2 = xuvVar.f266180d;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            Set set = dd41.f47702f;
            String strM35694A = r46.m74724S("podcast-chapters", str).m35694A();
            if (strM35694A == null) {
                return new tuv();
            }
            st80 st80Var = z ? (st80) this.f286542c.getValue() : (st80) this.f286541b.getValue();
            xuvVar.f266177a = this;
            xuvVar.f266180d = 1;
            objM62841f = ((mu80) this.f286540a).m62841f(strM35694A, st80Var, xuvVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
            zuvVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zuvVar = xuvVar.f266177a;
            bga.m29073P(objM62841f);
        }
        zuvVar.getClass();
        return m97077e((p2x0) objM62841f);
    }
}
