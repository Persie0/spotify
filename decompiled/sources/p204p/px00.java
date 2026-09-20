package p204p;

import android.graphics.Color;
import com.spotify.kidsentitybanning.banning.p086v1.BanStatusRequest;
import com.spotify.kidsentitybanning.banning.p086v1.BanStatusResponse;
import com.spotify.kidsentitybanning.banning.p086v1.ChildBanStatus;
import com.spotify.kidsentitybanning.banning.p086v1.UpdateBanStatusRequest;
import com.spotify.kidsentitybanning.banning.p086v1.UpdateBanStatusResponse;
import com.spotify.kidsentitybanning.search.p087v1.ListViewRequest;
import com.spotify.kidsentitybanning.search.p087v1.ListViewResponse;
import com.spotify.kidsentitybanning.search.p087v1.SearchRequest;
import com.spotify.kidsentitybanning.search.p087v1.SearchResponse;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class px00 {

    /* JADX INFO: renamed from: a */
    public final abs0 f182175a;

    /* JADX INFO: renamed from: b */
    public final yo7 f182176b;

    public px00(abs0 abs0Var, yo7 yo7Var) {
        this.f182175a = abs0Var;
        this.f182176b = yo7Var;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m71335c(BanStatusResponse banStatusResponse) {
        Integer numValueOf;
        ae50<i3e> ae50VarM12174n = banStatusResponse.m12174n();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM12174n, 10));
        for (i3e i3eVar : ae50VarM12174n) {
            String childId = i3eVar.getChildId();
            String name = i3eVar.getName();
            String avatar = i3eVar.getAvatar();
            boolean zMo12179g = i3eVar.mo12179g();
            if (i3eVar.hasColor()) {
                int color = i3eVar.getColor();
                numValueOf = Integer.valueOf(Color.argb(255, Color.red(color), Color.green(color), Color.blue(color)));
            } else {
                numValueOf = null;
            }
            arrayList.add(new gz00(numValueOf, childId, name, avatar, zMo12179g));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m71336i(UpdateBanStatusResponse updateBanStatusResponse, String str) {
        Set set = dd41.f47702f;
        gn80 gn80Var = r46.m74726U(str).f47709c;
        ae50<gva> ae50VarM12183n = updateBanStatusResponse.m12183n();
        ArrayList arrayList = new ArrayList();
        for (gva gvaVar : ae50VarM12183n) {
            wj50.m88279p(gvaVar);
            String strM56506o = kif1.m56506o(gvaVar, gn80Var);
            if (strM56506o != null) {
                arrayList.add(strM56506o);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m71337a(String str, String str2, Integer num, String str3, ibk ibkVar) {
        ix00 ix00Var;
        if (ibkVar instanceof ix00) {
            ix00Var = (ix00) ibkVar;
            int i = ix00Var.f106555g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ix00Var.f106555g = i - Integer.MIN_VALUE;
            } else {
                ix00Var = new ix00(this, ibkVar);
            }
        } else {
            ix00Var = new ix00(this, ibkVar);
        }
        ix00 ix00Var2 = ix00Var;
        Object objM96567o = ix00Var2.f106553e;
        int i2 = ix00Var2.f106555g;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM25380h = this.f182175a.m25380h();
            ix00Var2.f106549a = str;
            ix00Var2.f106550b = str2;
            ix00Var2.f106551c = num;
            ix00Var2.f106552d = str3;
            ix00Var2.f106555g = 1;
            objM96567o = zn91.m96567o(singleM25380h, ix00Var2);
            if (objM96567o != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
            return objM96567o;
        }
        str3 = ix00Var2.f106552d;
        num = ix00Var2.f106551c;
        str2 = ix00Var2.f106550b;
        str = ix00Var2.f106549a;
        bga.m29073P(objM96567o);
        hx00 hx00Var = (hx00) objM96567o;
        kzy0 kzy0VarM12200r = SearchRequest.m12200r();
        kzy0VarM12200r.m57767m(str);
        kzy0VarM12200r.m57770s(str2);
        if (num != null) {
            kzy0VarM12200r.m57768q(num.intValue());
        }
        if (str3 != null) {
            kzy0VarM12200r.m57769r(str3);
        }
        SearchRequest searchRequest = (SearchRequest) kzy0VarM12200r.build();
        ix00Var2.f106549a = null;
        ix00Var2.f106550b = null;
        ix00Var2.f106551c = null;
        ix00Var2.f106552d = null;
        ix00Var2.f106555g = 2;
        Object objM48957k = hx00.m48957k(hx00Var, searchRequest, null, ix00Var2, 2, null);
        return objM48957k == yukVar ? yukVar : objM48957k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r7 == r4) goto L21;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m71338b(String str, ibk ibkVar) {
        jx00 jx00Var;
        if (ibkVar instanceof jx00) {
            jx00Var = (jx00) ibkVar;
            int i = jx00Var.f116756d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx00Var.f116756d = i - Integer.MIN_VALUE;
            } else {
                jx00Var = new jx00(this, ibkVar);
            }
        } else {
            jx00Var = new jx00(this, ibkVar);
        }
        Object objM96567o = jx00Var.f116754b;
        int i2 = jx00Var.f116756d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = jx00Var.f116753a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return m71335c((BanStatusResponse) objM96567o);
        }
        bga.m29073P(objM96567o);
        Single singleM25380h = this.f182175a.m25380h();
        jx00Var.f116753a = str;
        jx00Var.f116756d = 1;
        objM96567o = zn91.m96567o(singleM25380h, jx00Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        ts8 ts8VarM12173o = BanStatusRequest.m12173o();
        ts8VarM12173o.m81394m(str);
        BanStatusRequest banStatusRequest = (BanStatusRequest) ts8VarM12173o.build();
        jx00Var.f116753a = null;
        jx00Var.f116756d = 2;
        objM96567o = ((hx00) objM96567o).m48963i(banStatusRequest, vnd1.f243077b, jx00Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r8 == r4) goto L21;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71339d(String str, k1n0 k1n0Var, ibk ibkVar) {
        kx00 kx00Var;
        if (ibkVar instanceof kx00) {
            kx00Var = (kx00) ibkVar;
            int i = kx00Var.f127288e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kx00Var.f127288e = i - Integer.MIN_VALUE;
            } else {
                kx00Var = new kx00(this, ibkVar);
            }
        } else {
            kx00Var = new kx00(this, ibkVar);
        }
        Object objM96567o = kx00Var.f127286c;
        int i2 = kx00Var.f127288e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                k1n0Var = kx00Var.f127285b;
                str = kx00Var.f127284a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return psg1.m70833I((ListViewResponse) objM96567o);
        }
        bga.m29073P(objM96567o);
        Single singleM25380h = this.f182175a.m25380h();
        kx00Var.f127284a = str;
        kx00Var.f127285b = k1n0Var;
        kx00Var.f127288e = 1;
        objM96567o = zn91.m96567o(singleM25380h, kx00Var);
        if (objM96567o != yukVar) {
        }
        return yukVar;
        s690 s690VarM12190p = ListViewRequest.m12190p();
        s690VarM12190p.m77320m(str);
        s690VarM12190p.m77321q(psg1.m70834J(k1n0Var));
        ListViewRequest listViewRequest = (ListViewRequest) s690VarM12190p.build();
        wj50.m88279p(listViewRequest);
        kx00Var.f127284a = null;
        kx00Var.f127285b = null;
        kx00Var.f127288e = 2;
        objM96567o = ((hx00) objM96567o).m48964l(listViewRequest, vnd1.f243077b, kx00Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r14 == r8) goto L26;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71340e(String str, String str2, Integer num, String str3, ibk ibkVar) {
        lx00 lx00Var;
        px00 px00Var;
        String str4;
        boolean zM12202o;
        if (ibkVar instanceof lx00) {
            lx00Var = (lx00) ibkVar;
            int i = lx00Var.f137686e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lx00Var.f137686e = i - Integer.MIN_VALUE;
            } else {
                lx00Var = new lx00(this, ibkVar);
            }
        } else {
            lx00Var = new lx00(this, ibkVar);
        }
        lx00 lx00Var2 = lx00Var;
        Object objM71337a = lx00Var2.f137684c;
        int i2 = lx00Var2.f137686e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM71337a);
            lx00Var2.f137686e = 1;
            px00Var = this;
            objM71337a = px00Var.m71337a(str, str2, num, str3, lx00Var2);
            if (objM71337a != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM71337a);
            px00Var = this;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zM12202o = lx00Var2.f137683b;
            str4 = lx00Var2.f137682a;
            bga.m29073P(objM71337a);
        }
        return new k0z0(str4, (List) objM71337a, zM12202o);
        SearchResponse searchResponse = (SearchResponse) objM71337a;
        String nextPageToken = searchResponse.getNextPageToken();
        wj50.m88279p(nextPageToken);
        if (nextPageToken.length() <= 0) {
            nextPageToken = null;
        }
        str4 = nextPageToken;
        zM12202o = searchResponse.m12202o();
        ae50 ae50VarM12201n = searchResponse.m12201n();
        lx00Var2.f137682a = str4;
        lx00Var2.f137683b = zM12202o;
        lx00Var2.f137686e = 2;
        objM71337a = px00Var.f182176b.m94272a(ae50VarM12201n, lx00Var2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m71341f(String str, String str2, Integer num, String str3, ibk ibkVar) {
        mx00 mx00Var;
        if (ibkVar instanceof mx00) {
            mx00Var = (mx00) ibkVar;
            int i = mx00Var.f147918c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx00Var.f147918c = i - Integer.MIN_VALUE;
            } else {
                mx00Var = new mx00(this, ibkVar);
            }
        } else {
            mx00Var = new mx00(this, ibkVar);
        }
        mx00 mx00Var2 = mx00Var;
        Object objM71337a = mx00Var2.f147916a;
        int i2 = mx00Var2.f147918c;
        if (i2 == 0) {
            bga.m29073P(objM71337a);
            mx00Var2.f147918c = 1;
            objM71337a = m71337a(str, str2, num, str3, mx00Var2);
            Object obj = yuk.f276404a;
            if (objM71337a == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM71337a);
        }
        return lrg1.m59814w((SearchResponse) objM71337a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r10 == r4) goto L25;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m71342g(String str, Map map, ibk ibkVar) {
        nx00 nx00Var;
        if (ibkVar instanceof nx00) {
            nx00Var = (nx00) ibkVar;
            int i = nx00Var.f159317e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nx00Var.f159317e = i - Integer.MIN_VALUE;
            } else {
                nx00Var = new nx00(this, ibkVar);
            }
        } else {
            nx00Var = new nx00(this, ibkVar);
        }
        Object objM96567o = nx00Var.f159315c;
        int i2 = nx00Var.f159317e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single singleM25380h = this.f182175a.m25380h();
            nx00Var.f159313a = str;
            nx00Var.f159314b = map;
            nx00Var.f159317e = 1;
            objM96567o = zn91.m96567o(singleM25380h, nx00Var);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            map = nx00Var.f159314b;
            str = nx00Var.f159313a;
            bga.m29073P(objM96567o);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = nx00Var.f159313a;
            bga.m29073P(objM96567o);
        }
        return m71336i((UpdateBanStatusResponse) objM96567o, str);
        hx00 hx00Var = (hx00) objM96567o;
        l7a1 l7a1VarM12182p = UpdateBanStatusRequest.m12182p();
        l7a1VarM12182p.m58414r(str);
        for (Map.Entry entry : map.entrySet()) {
            h3e h3eVarM12178q = ChildBanStatus.m12178q();
            h3eVarM12178q.m46521r((String) entry.getKey());
            h3eVarM12178q.m46520q(((Boolean) entry.getValue()).booleanValue());
            l7a1VarM12182p.m58412m((ChildBanStatus) h3eVarM12178q.build());
        }
        UpdateBanStatusRequest updateBanStatusRequest = (UpdateBanStatusRequest) l7a1VarM12182p.build();
        nx00Var.f159313a = str;
        nx00Var.f159314b = null;
        nx00Var.f159317e = 2;
        objM96567o = hx00Var.m48961g(updateBanStatusRequest, vnd1.f243077b, nx00Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r10 == r4) goto L21;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m71343h(String str, String str2, ss8 ss8Var, ibk ibkVar) {
        ox00 ox00Var;
        rs8 rs8VarM59454y;
        if (ibkVar instanceof ox00) {
            ox00Var = (ox00) ibkVar;
            int i = ox00Var.f170823f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox00Var.f170823f = i - Integer.MIN_VALUE;
            } else {
                ox00Var = new ox00(this, ibkVar);
            }
        } else {
            ox00Var = new ox00(this, ibkVar);
        }
        Object objM96567o = ox00Var.f170821d;
        int i2 = ox00Var.f170823f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            rs8VarM59454y = lmg1.m59454y(ss8Var);
            Single singleM25380h = this.f182175a.m25380h();
            ox00Var.f170818a = str;
            ox00Var.f170819b = str2;
            ox00Var.f170820c = rs8VarM59454y;
            ox00Var.f170823f = 1;
            objM96567o = zn91.m96567o(singleM25380h, ox00Var);
            if (objM96567o != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            rs8 rs8Var = ox00Var.f170820c;
            str2 = ox00Var.f170819b;
            String str3 = ox00Var.f170818a;
            bga.m29073P(objM96567o);
            rs8VarM59454y = rs8Var;
            str = str3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = ox00Var.f170818a;
            bga.m29073P(objM96567o);
        }
        return m71336i((UpdateBanStatusResponse) objM96567o, str);
        l7a1 l7a1VarM12182p = UpdateBanStatusRequest.m12182p();
        l7a1VarM12182p.m58414r(str);
        h3e h3eVarM12178q = ChildBanStatus.m12178q();
        h3eVarM12178q.m46521r(str2);
        h3eVarM12178q.m46519m(rs8VarM59454y);
        l7a1VarM12182p.m58413q(h3eVarM12178q);
        UpdateBanStatusRequest updateBanStatusRequest = (UpdateBanStatusRequest) l7a1VarM12182p.build();
        wj50.m88279p(updateBanStatusRequest);
        ox00Var.f170818a = str;
        ox00Var.f170819b = null;
        ox00Var.f170820c = null;
        ox00Var.f170823f = 2;
        objM96567o = ((hx00) objM96567o).m48961g(updateBanStatusRequest, vnd1.f243077b, ox00Var);
    }
}
