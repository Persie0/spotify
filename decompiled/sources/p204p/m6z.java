package p204p;

import android.view.View;
import androidx.car.app.model.Alert;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class m6z extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140600a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6z() {
        super(1);
        this.f140600a = 28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [p.n6f] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws Exception {
        String str;
        vsb1 tsb1Var;
        rcz rczVar;
        String str2;
        ig40 ig40VarM67576z;
        List list;
        mmj mmjVar;
        Object obj2;
        nmj nmjVar;
        int i;
        mn81 mn81Var;
        int i2 = this.f140600a;
        int i3 = 4;
        int i4 = 2;
        ?? r8 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        switch (i2) {
            case 0:
                ezx0 ezx0VarMo63454G1 = ((yyx0) obj).mo63454G1("UPDATE liked_songs_filter_tags_entity SET isSelected = 0");
                try {
                    ezx0VarMo63454G1.mo24841E1();
                    return w2a1Var;
                } finally {
                    ezx0VarMo63454G1.close();
                }
            case 1:
                ezx0 ezx0VarMo63454G2 = ((yyx0) obj).mo63454G1("SELECT id FROM liked_songs_filter_tags_entity");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ezx0VarMo63454G2.mo24841E1()) {
                        arrayList.add(ezx0VarMo63454G2.mo24844h1(0));
                    }
                    ezx0VarMo63454G2.close();
                    return arrayList;
                } catch (Throwable th) {
                    ezx0VarMo63454G2.close();
                    throw th;
                }
            case 2:
                ezx0 ezx0VarMo63454G3 = ((yyx0) obj).mo63454G1("SELECT * FROM liked_songs_filter_tags_entity");
                try {
                    int iM88306q = wjf1.m88306q(ezx0VarMo63454G3, "id");
                    int iM88306q2 = wjf1.m88306q(ezx0VarMo63454G3, ContextTrack.Metadata.KEY_TITLE);
                    int iM88306q3 = wjf1.m88306q(ezx0VarMo63454G3, "position");
                    int iM88306q4 = wjf1.m88306q(ezx0VarMo63454G3, "isSelected");
                    ArrayList arrayList2 = new ArrayList();
                    while (ezx0VarMo63454G3.mo24841E1()) {
                        arrayList2.add(new k6z(ezx0VarMo63454G3.mo24844h1(iM88306q), (int) ezx0VarMo63454G3.getLong(iM88306q3), ezx0VarMo63454G3.mo24844h1(iM88306q2), ((int) ezx0VarMo63454G3.getLong(iM88306q4)) != 0));
                    }
                    ezx0VarMo63454G3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    ezx0VarMo63454G3.close();
                    throw th2;
                }
            case 3:
                if (o410.f161513a[((b510) obj).ordinal()] == 1) {
                    return new m410(System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                if (z410.f279091a[((b510) obj).ordinal()] == 1) {
                    return new x410(System.currentTimeMillis());
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                ezx0 ezx0VarMo63454G4 = ((yyx0) obj).mo63454G1("DELETE FROM history");
                try {
                    ezx0VarMo63454G4.mo24841E1();
                    return w2a1Var;
                } finally {
                    ezx0VarMo63454G4.close();
                }
            case 6:
                ((fc30) obj).getClass();
                return Boolean.TRUE;
            case 7:
                u140 u140Var = ((v140) obj).f236247e;
                if (u140Var != null) {
                    return u140Var.f225679b;
                }
                return null;
            case 8:
                v140 v140Var = (v140) obj;
                u140 u140Var2 = v140Var.f236247e;
                if (u140Var2 != null && (str = u140Var2.f225679b) != null) {
                    return str;
                }
                t140 t140Var = (t140) g6f.m43745s0(v140Var.f236246d);
                if (t140Var == null) {
                    return null;
                }
                if (t140Var.f216154b.length() <= 0) {
                    t140Var = null;
                }
                if (t140Var != null) {
                    return t140Var.f216154b;
                }
                return null;
            case 9:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 10:
                return new up40(xp40.f264503a[edb.m38547C(((wp40) obj).f253672a)] == 1 ? 1 : 2);
            case 11:
                ybv ybvVar = ((ty80) obj).f224877f;
                pad1 pad1Var = (pad1) ybvVar.f271279x.mo30169a(pad1.class);
                sxg1 sxg1Var = pad1Var != null ? pad1Var.f175509a : null;
                kad1 kad1Var = sxg1Var instanceof kad1 ? (kad1) sxg1Var : null;
                if (kad1Var == null) {
                    return m5a0.f140173a;
                }
                String str3 = ybvVar.f271256a;
                oad1 oad1Var = kad1Var.f120867c;
                if (oad1Var.f163312a.length() == 0) {
                    tsb1Var = null;
                } else {
                    int iM38547C = edb.m38547C(oad1Var.f163313b);
                    if (iM38547C == 0) {
                        tsb1Var = new tsb1(oad1Var.f163314c, oad1Var.f163312a, oad1Var.f163315d);
                    } else {
                        if (iM38547C != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        tsb1Var = new usb1(oad1Var.f163314c, oad1Var.f163312a, oad1Var.f163315d);
                    }
                }
                String str4 = kad1Var.f120869e;
                cbd1 cbd1Var = new cbd1(new zbd1("", "", null, str4, kad1Var.f120868d.f89199a, null, null, null, 996), new bbd1(tsb1Var, "inline-entity-explorer-banner", true));
                String str5 = kad1Var.f120866b;
                gad1 gad1Var = kad1Var.f120872h;
                return new l5a0(new vt40(str5, kad1Var.f120870f, kad1Var.f120871g, str4, new edc1(new ddc1(cbd1Var, str5, "", (s9p0) null, str5, "", "", (String) null, (String) null, (n6f) (gad1Var != null ? gad1Var.f78039d : 0), 896), false), str3));
            case 12:
                return lu40.f136997a;
            case 13:
                scz sczVar = (scz) obj;
                String uri = sczVar.getUri();
                String strMo38089b = sczVar.mo38089b();
                rcz rczVar2 = rcz.Track;
                String uri2 = sczVar.getUri();
                if (tgv.m80784e(uri2)) {
                    rczVar = rcz.Episode;
                } else if (tgv.m80789j(uri2)) {
                    rczVar = rcz.Track;
                } else if (tgv.m80781b(uri2)) {
                    rczVar = rcz.Kallax;
                } else if (uri2 != null ? xoc1.f263950O.m83613a(uri2) : false) {
                    rczVar = rcz.Artist;
                } else if (uri2 != null ? xoc1.f263870E.m83613a(uri2) : false) {
                    rczVar = rcz.User;
                } else if (uri2 != null ? xoc1.f263891G4.m83613a(uri2) : false) {
                    rczVar = rcz.Author;
                } else if (tgv.m80782c(uri2)) {
                    rczVar = rcz.Playlist;
                } else if (tgv.m80786g(uri2)) {
                    rczVar = rcz.PodcastOrAudiobook;
                } else {
                    Set set = dd41.f47702f;
                    if (r46.m74708A(uri2, gn80.PRERELEASE)) {
                        rczVar = rcz.PreRelease;
                    } else if (tgv.m80780a(uri2)) {
                        rczVar = rcz.Album;
                    } else if (r46.m74709B(uri2, gn80.BROWSE_GENRES, gn80.BROWSE_HUBS)) {
                        rczVar = rcz.Genre;
                    } else if (r46.m74708A(uri2, gn80.VENUE)) {
                        rczVar = rcz.Venue;
                    } else {
                        if (!tgv.m80783d(uri2)) {
                            throw new IllegalArgumentException("Unsupported first-step entity URI: ".concat(uri2));
                        }
                        rczVar = rcz.PodcastChapter;
                    }
                }
                return new fdz(uri, strMo38089b, rczVar, sczVar.mo38088a(), new is9(lau.f131415a, false), sczVar.getPosition(), sczVar.getRequestId(), sczVar.mo38090c());
            case 14:
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof v140) {
                        arrayList3.add(obj3);
                    }
                }
                v140 v140Var2 = (v140) g6f.m43745s0(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof erc1) {
                        arrayList4.add(obj4);
                    }
                }
                erc1 erc1Var = (erc1) g6f.m43745s0(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof daj) {
                        arrayList5.add(obj5);
                    }
                }
                daj dajVar = (daj) g6f.m43745s0(arrayList5);
                if (v140Var2 == null) {
                    return cx81.f42952a;
                }
                u140 u140Var3 = v140Var2.f236247e;
                if (u140Var3 == null || (str2 = u140Var3.f225678a) == null) {
                    str2 = "";
                }
                m140 m140Var = new m140(str2, r8, i3, r8);
                String str6 = v140Var2.f236243a;
                if (dajVar == null || (list = dajVar.f47053d) == null) {
                    ig40VarM67576z = orn0.f168627d;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iOrdinal = ((baj) it.next()).ordinal();
                        if (iOrdinal == 1) {
                            mmjVar = mmj.f145170a;
                        } else if (iOrdinal != 2) {
                            obj2 = null;
                        } else {
                            nmjVar = nmj.f155445a;
                        }
                        if (obj2 != null) {
                            obj2 = mmjVar;
                            obj2 = nmjVar;
                            arrayList6.add(obj2);
                        } else {
                            obj2 = mmjVar;
                            obj2 = nmjVar;
                        }
                    }
                    ig40VarM67576z = opo.m67576z(arrayList6);
                }
                ig40 ig40Var = ig40VarM67576z;
                pvf1 t56Var = s76.f206285d;
                if (erc1Var != null) {
                    z240 z240Var = (z240) g6f.m43745s0(erc1Var.f62079a.f139524a);
                    String str7 = z240Var != null ? z240Var.f278475a.f198763a : null;
                    if (str7 != null) {
                        t56Var = new t56(str7);
                    }
                }
                return new bx81(m140Var, new d6w0(str6, null, null, null, ig40Var, 0, false, lv21.f137205b, false, null, null, null, t56Var, false, null, null, 0L, null, null, null, null, null, null, null, 16772968));
            case 15:
                kh80 kh80Var = (kh80) obj;
                return new lh80(kh80Var.f122547a, kh80Var.f122548b, kh80Var.f122549c, kh80Var.f122550d, kh80Var.f122551e);
            case 16:
                hi80 hi80Var = (hi80) obj;
                di80 di80Var = hi80Var.f91738a;
                if (di80Var instanceof fi80) {
                    return gn81.f82659a;
                }
                if (!(di80Var instanceof ei80)) {
                    throw new NoWhenBranchMatchedException();
                }
                ei80 ei80Var = (ei80) di80Var;
                x18 x18Var = hi80Var.f91739b;
                String str8 = ei80Var.f59803c;
                boolean z = ei80Var.f59807g;
                boolean z2 = ei80Var.f59808h;
                boolean z3 = ei80Var.f59809i;
                ?? r10 = ei80Var.f59811k;
                int iM38547C2 = edb.m38547C(ei80Var.f59812l);
                if (iM38547C2 != 0) {
                    if (iM38547C2 != 1) {
                        if (iM38547C2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i4 = 3;
                    }
                    i = i4;
                } else {
                    i = 1;
                }
                h66 h66Var = new h66(ei80Var.f59805e);
                qsj qsjVar = ei80Var.f59813m;
                mn81 jn81Var = hkr0.f92482T0;
                boolean z4 = ei80Var.f59809i;
                String str9 = ei80Var.f59806f;
                if (z4 && str9.length() != 0) {
                    String str10 = x18Var.f257084a;
                    Long l = x18Var.f257089f;
                    if (str9.equals(str10)) {
                        if (x18Var.f257087d) {
                            jn81Var = kn81.f124357a;
                        } else if (x18Var.f257086c) {
                            jn81Var = new jn81(l.longValue(), 0.0f);
                        } else if (x18Var.m89622a()) {
                            jn81Var = new jn81(l.longValue(), x18Var.f257088e.longValue() / l.longValue());
                        }
                    }
                    mn81Var = jn81Var;
                    z2 = z2;
                    z3 = z3;
                    return new hn81(str8, r10, h66Var, null, qsjVar, null, i, z3, z, z2, mn81Var, 2085080);
                }
                jn81Var = ln81.f135118a;
                mn81Var = jn81Var;
                return new hn81(str8, r10, h66Var, null, qsjVar, null, i, z3, z, z2, mn81Var, 2085080);
            case 17:
                String str11 = (String) ((hz80) obj).f96822X.get("artistUris");
                if (str11 != null) {
                    return (String) g6f.m43745s0(g6f.m43727j0(wl51.m88477a1(str11, new String[]{","}, 0, 6)));
                }
                return null;
            case 18:
                bk01 bk01Var = bk01.f27801a;
                uw70.m84090b((uw70) obj, Alert.DURATION_SHOW_INDEFINITELY, null, new fyf(new nmx(i3, 12), true, 2125258232), 6);
                return w2a1Var;
            case 19:
                throw null;
            case 20:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 21:
                ((View) obj).setTag(R.id.browse_adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 22:
                String str12 = ((ezs0) obj).f64461c;
                return null;
            case 23:
                String str13 = ((ezs0) obj).f64461c;
                return null;
            case 24:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 25:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 26:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 27:
                ((View) obj).setTag(R.id.adds_horizontal_padding, Boolean.TRUE);
                return w2a1Var;
            case 28:
                ezx0 ezx0VarMo63454G5 = ((yyx0) obj).mo63454G1("DELETE FROM messages");
                try {
                    ezx0VarMo63454G5.mo24841E1();
                    return w2a1Var;
                } finally {
                    ezx0VarMo63454G5.close();
                }
            default:
                return Collections.singletonMap(w2a1Var, Collections.singleton((String) obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6z(int i, int i2) {
        super(i);
        this.f140600a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6z(Object obj, int i) {
        super(1);
        this.f140600a = i;
    }
}
