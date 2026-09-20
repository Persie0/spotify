package p204p;

import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlist.proto.C1203a;
import com.spotify.playlist.proto.C1204b;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.Permission;
import com.spotify.playlist.proto.PermissionGrantDescription;
import com.spotify.playlist.proto.PlaylistRequest$Item;
import com.spotify.playlist.proto.SetBasePermissionRequest;
import com.spotify.playlist.proto.SetMemberPermissionRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import spotify.playlist.esperanto.proto.C2691b;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistQuery;
import spotify.playlist.esperanto.proto.PlaylistRange;

/* JADX INFO: loaded from: classes2.dex */
public final class n090 implements yz80 {

    /* JADX INFO: renamed from: a */
    public final k2t0 f148944a;

    /* JADX INFO: renamed from: b */
    public final yps f148945b;

    /* JADX INFO: renamed from: c */
    public final luk f148946c;

    /* JADX INFO: renamed from: d */
    public final sr6 f148947d;

    /* JADX INFO: renamed from: e */
    public final xnp0 f148948e;

    /* JADX INFO: renamed from: f */
    public final sr6 f148949f;

    static {
        new si5(15);
    }

    public n090(k2t0 k2t0Var, yps ypsVar, luk lukVar, sr6 sr6Var, xnp0 xnp0Var, sr6 sr6Var2) {
        this.f148944a = k2t0Var;
        this.f148945b = ypsVar;
        this.f148946c = lukVar;
        this.f148947d = sr6Var;
        this.f148948e = xnp0Var;
        this.f148949f = sr6Var2;
    }

    /* JADX INFO: renamed from: e */
    public static final wz80 m63307e(n090 n090Var, PermissionGrantDescription permissionGrantDescription) {
        lnn0 lnn0VarM44441c;
        k2t0 k2t0Var = n090Var.f148944a;
        Permission permissionM18530r = permissionGrantDescription.m18523o().m18530r();
        if (permissionM18530r.m18517u()) {
            lnn0VarM44441c = ((ge00) k2t0Var).m44441c(permissionM18530r.m18515s());
        } else {
            lnn0VarM44441c = null;
        }
        if (lnn0VarM44441c == null) {
            return null;
        }
        int i = 0;
        if (permissionM18530r.m18518v()) {
            nnn0 nnn0VarM18516t = permissionM18530r.m18516t();
            ((ge00) k2t0Var).getClass();
            int iOrdinal = nnn0VarM18516t.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
            }
        }
        int i2 = i == 0 ? -1 : zz80.f287922a[edb.m38547C(i)];
        if (i2 == -1) {
            return new tz80(lnn0VarM44441c);
        }
        if (i2 == 1) {
            return new uz80(lnn0VarM44441c);
        }
        if (i2 == 2) {
            return new tz80(lnn0VarM44441c);
        }
        if (i2 == 3) {
            return vz80.f246413a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: x */
    public static SaveSource m63308x(qz80 qz80Var) {
        f7y0 f7y0VarM12901q = SaveSource.m12901q();
        f7y0VarM12901q.m40993m(qz80Var.m74299a().f279709a);
        return (SaveSource) f7y0VarM12901q.build();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m63309f(String str, List list, String str2, String str3, qz80 qz80Var, ibk ibkVar) {
        b090 b090Var;
        String str4;
        ModificationRequest modificationRequest;
        if (ibkVar instanceof b090) {
            b090Var = (b090) ibkVar;
            int i = b090Var.f21805e;
            if ((i & Integer.MIN_VALUE) != 0) {
                b090Var.f21805e = i - Integer.MIN_VALUE;
            } else {
                b090Var = new b090(this, ibkVar);
            }
        } else {
            b090Var = new b090(this, ibkVar);
        }
        b090 b090Var2 = b090Var;
        Object obj = b090Var2.f21803c;
        int i2 = b090Var2.f21805e;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("You need to add at least one item when adding items.");
            }
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("add");
            c1204bM18488B.m18683q(list);
            if (qz80Var != null) {
                c1204bM18488B.m18681D(m63308x(qz80Var));
            }
            ModificationRequest modificationRequest2 = (ModificationRequest) c1204bM18488B.build();
            b090Var2.f21801a = str;
            b090Var2.f21802b = modificationRequest2;
            b090Var2.f21805e = 1;
            if (m63313j(str, str2, list, str3, b090Var2) != obj2) {
                str4 = str;
                modificationRequest = modificationRequest2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        ModificationRequest modificationRequest3 = b090Var2.f21802b;
        String str5 = b090Var2.f21801a;
        bga.m29073P(obj);
        modificationRequest = modificationRequest3;
        str4 = str5;
        wj50.m88279p(modificationRequest);
        b090Var2.f21801a = null;
        b090Var2.f21802b = null;
        b090Var2.f21805e = 2;
        Object objM89557A = x0h1.m89557A(this.f148946c, new e090(this, str4, modificationRequest, null, 0), b090Var2);
        return objM89557A == obj2 ? obj2 : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: g */
    public final Object m63310g(String str, List list, String str2, String str3, String str4, qz80 qz80Var, ibk ibkVar) throws Throwable {
        c090 c090Var;
        String str5;
        ModificationRequest modificationRequest;
        if (ibkVar instanceof c090) {
            c090Var = (c090) ibkVar;
            int i = c090Var.f32721e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c090Var.f32721e = i - Integer.MIN_VALUE;
            } else {
                c090Var = new c090(this, ibkVar);
            }
        } else {
            c090Var = new c090(this, ibkVar);
        }
        c090 c090Var2 = c090Var;
        Object obj = c090Var2.f32719c;
        int i2 = c090Var2.f32721e;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("You need to add at least one item when adding items.");
            }
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("add");
            c1204bM18488B.m18686t(str2);
            c1204bM18488B.m18683q(list);
            if (qz80Var != null) {
                c1204bM18488B.m18681D(m63308x(qz80Var));
            }
            ModificationRequest modificationRequest2 = (ModificationRequest) c1204bM18488B.build();
            c090Var2.f32717a = str;
            c090Var2.f32718b = modificationRequest2;
            c090Var2.f32721e = 1;
            if (m63313j(str, str3, list, str4, c090Var2) != obj2) {
                str5 = str;
                modificationRequest = modificationRequest2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        modificationRequest = c090Var2.f32718b;
        str5 = c090Var2.f32717a;
        bga.m29073P(obj);
        wj50.m88279p(modificationRequest);
        c090Var2.f32717a = null;
        c090Var2.f32718b = null;
        c090Var2.f32721e = 2;
        Object objM89557A = x0h1.m89557A(this.f148946c, new e090(this, str5, modificationRequest, null, 0), c090Var2);
        return objM89557A == obj2 ? obj2 : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: h */
    public final Object m63311h(String str, List list, String str2, String str3, String str4, qz80 qz80Var, ibk ibkVar) throws Throwable {
        d090 d090Var;
        String str5;
        ModificationRequest modificationRequest;
        if (ibkVar instanceof d090) {
            d090Var = (d090) ibkVar;
            int i = d090Var.f43820e;
            if ((i & Integer.MIN_VALUE) != 0) {
                d090Var.f43820e = i - Integer.MIN_VALUE;
            } else {
                d090Var = new d090(this, ibkVar);
            }
        } else {
            d090Var = new d090(this, ibkVar);
        }
        d090 d090Var2 = d090Var;
        Object obj = d090Var2.f43818c;
        int i2 = d090Var2.f43820e;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("You need to add at least one item when adding items.");
            }
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("add");
            c1204bM18488B.m18689w(str2);
            c1204bM18488B.m18683q(list);
            if (qz80Var != null) {
                c1204bM18488B.m18681D(m63308x(qz80Var));
            }
            ModificationRequest modificationRequest2 = (ModificationRequest) c1204bM18488B.build();
            d090Var2.f43816a = str;
            d090Var2.f43817b = modificationRequest2;
            d090Var2.f43820e = 1;
            if (m63313j(str, str3, list, str4, d090Var2) != obj2) {
                str5 = str;
                modificationRequest = modificationRequest2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        modificationRequest = d090Var2.f43817b;
        str5 = d090Var2.f43816a;
        bga.m29073P(obj);
        wj50.m88279p(modificationRequest);
        d090Var2.f43816a = null;
        d090Var2.f43817b = null;
        d090Var2.f43820e = 2;
        Object objM89557A = x0h1.m89557A(this.f148946c, new e090(this, str5, modificationRequest, null, 0), d090Var2);
        return objM89557A == obj2 ? obj2 : objM89557A;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m63312i(String str, ibk ibkVar) {
        h090 h090Var;
        Object c6x0Var;
        df41 df41Var;
        if (ibkVar instanceof h090) {
            h090Var = (h090) ibkVar;
            int i = h090Var.f86184c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h090Var.f86184c = i - Integer.MIN_VALUE;
            } else {
                h090Var = new h090(this, ibkVar);
            }
        } else {
            h090Var = new h090(this, ibkVar);
        }
        Object objM79081p = h090Var.f86182a;
        int i2 = h090Var.f86184c;
        boolean z = true;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM79081p);
                try {
                    df41Var = new gf41(str).f79270c;
                } catch (SpotifyUriParserException unused) {
                    df41Var = df41.UNKNOWN;
                }
                wj50.m88279p(df41Var);
                int iOrdinal = df41Var.ordinal();
                if (iOrdinal == 12 || iOrdinal == 13) {
                    sr6 sr6Var = this.f148949f;
                    pkp0 pkp0VarM97669q = PlaylistGetRequest.m97669q();
                    pkp0VarM97669q.m70226t(str);
                    C2691b c2691bM97733I = PlaylistQuery.m97733I();
                    lop0 lop0VarM97755p = PlaylistRange.m97755p();
                    lop0VarM97755p.m59579q(0);
                    lop0VarM97755p.m59578m(0);
                    c2691bM97733I.m97805z(lop0VarM97755p);
                    pkp0VarM97669q.m70224r(c2691bM97733I);
                    top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
                    bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
                    bjp0VarM18365h0.m29496H();
                    top0VarM18421v.m81216x(bjp0VarM18365h0);
                    pkp0VarM97669q.m70223q(top0VarM18421v);
                    PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) pkp0VarM97669q.build();
                    h090Var.f86184c = 1;
                    objM79081p = sr6Var.m79081p(playlistGetRequest, h090Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM79081p == yukVar) {
                        return yukVar;
                    }
                }
                return qyg1.m74178H(zBooleanValue);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM79081p);
            if (((PlaylistGetResponse) objM79081p).m97673o().m18630C().m18615q().m18554s().length() != 0) {
                z = false;
            }
            c6x0Var = qyg1.m74178H(z);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Object objM74178H = qyg1.m74178H(false);
        if (c6x0Var instanceof c6x0) {
            c6x0Var = objM74178H;
        }
        zBooleanValue = ((Boolean) c6x0Var).booleanValue();
        return qyg1.m74178H(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m63313j(String str, String str2, List list, String str3, ibk ibkVar) {
        j090 j090Var;
        if (ibkVar instanceof j090) {
            j090Var = (j090) ibkVar;
            int i = j090Var.f107397g;
            if ((i & Integer.MIN_VALUE) != 0) {
                j090Var.f107397g = i - Integer.MIN_VALUE;
            } else {
                j090Var = new j090(this, ibkVar);
            }
        } else {
            j090Var = new j090(this, ibkVar);
        }
        Object objM63312i = j090Var.f107395e;
        int i2 = j090Var.f107397g;
        if (i2 == 0) {
            bga.m29073P(objM63312i);
            j090Var.f107391a = str;
            j090Var.f107392b = str2;
            j090Var.f107393c = list;
            j090Var.f107394d = str3;
            j090Var.f107397g = 1;
            objM63312i = m63312i(str, j090Var);
            Object obj = yuk.f276404a;
            if (objM63312i == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = j090Var.f107394d;
            list = j090Var.f107393c;
            str2 = j090Var.f107392b;
            str = j090Var.f107391a;
            bga.m29073P(objM63312i);
        }
        String str4 = str;
        String str5 = str2;
        List list2 = list;
        String str6 = str3;
        if (((Boolean) objM63312i).booleanValue()) {
            this.f148945b.m94314d(str4, str5, false, str6, list2);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m63314k(String str, List list, String str2, ibk ibkVar) {
        C1204b c1204bM18488B = ModificationRequest.m18488B();
        c1204bM18488B.m18679B("move");
        c1204bM18488B.m18682m(list);
        if (str2 == null) {
            str2 = "end";
        }
        c1204bM18488B.m18686t(str2);
        ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
        wj50.m88279p(modificationRequest);
        Object objM63315l = m63315l(str, modificationRequest, ibkVar);
        return objM63315l == yuk.f276404a ? objM63315l : (p2x0) objM63315l;
    }

    /* JADX INFO: renamed from: l */
    public final Object m63315l(String str, ModificationRequest modificationRequest, ibk ibkVar) {
        return x0h1.m89557A(this.f148946c, new e090(this, str, modificationRequest, null, 1), ibkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (r8 == r4) goto L25;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m63316m(String str, ibk ibkVar) {
        k090 k090Var;
        if (ibkVar instanceof k090) {
            k090Var = (k090) ibkVar;
            int i = k090Var.f117938d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k090Var.f117938d = i - Integer.MIN_VALUE;
            } else {
                k090Var = new k090(this, ibkVar);
            }
        } else {
            k090Var = new k090(this, ibkVar);
        }
        Object objM79081p = k090Var.f117936b;
        int i2 = k090Var.f117938d;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = k090Var.f117935a;
                bga.m29073P(objM79081p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM79081p);
            }
            return (p2x0) objM79081p;
        }
        bga.m29073P(objM79081p);
        pkp0 pkp0VarM97669q = PlaylistGetRequest.m97669q();
        pkp0VarM97669q.m70226t(str);
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57344B();
        top0VarM18421v.m81218z(ktp0VarM18427E);
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72947y();
        top0VarM18421v.m81212t(qjp0VarM18379C);
        pkp0VarM97669q.m70222m((PlaylistRequestDecorationPolicy) top0VarM18421v.build());
        C2691b c2691bM97733I = PlaylistQuery.m97733I();
        c2691bM97733I.m97790B(true);
        c2691bM97733I.m97801v(true);
        c2691bM97733I.m97800u();
        pkp0VarM97669q.m70224r(c2691bM97733I);
        PlaylistGetRequest playlistGetRequest = (PlaylistGetRequest) pkp0VarM97669q.build();
        k090Var.f117935a = str;
        k090Var.f117938d = 1;
        objM79081p = this.f148949f.m79081p(playlistGetRequest, k090Var);
        if (objM79081p != obj) {
        }
        return obj;
        ae50 ae50VarM18646w = ((PlaylistGetResponse) objM79081p).m97673o().m18646w();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM18646w, 10));
        Iterator<E> it = ae50VarM18646w.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlaylistRequest$Item) it.next()).m18594w());
        }
        k090Var.f117935a = null;
        k090Var.f117938d = 2;
        objM79081p = m63318o(str, arrayList, k090Var);
    }

    /* JADX INFO: renamed from: n */
    public final Object m63317n(String str, List list, ibk ibkVar) {
        C1204b c1204bM18488B = ModificationRequest.m18488B();
        c1204bM18488B.m18679B("remove");
        c1204bM18488B.m18683q(list);
        ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
        wj50.m88279p(modificationRequest);
        Object objM63315l = m63315l(str, modificationRequest, ibkVar);
        return objM63315l == yuk.f276404a ? objM63315l : (p2x0) objM63315l;
    }

    /* JADX INFO: renamed from: o */
    public final Object m63318o(String str, List list, ibk ibkVar) {
        C1204b c1204bM18488B = ModificationRequest.m18488B();
        c1204bM18488B.m18679B("remove");
        c1204bM18488B.m18682m(list);
        ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
        wj50.m88279p(modificationRequest);
        Object objM63315l = m63315l(str, modificationRequest, ibkVar);
        return objM63315l == yuk.f276404a ? objM63315l : (p2x0) objM63315l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m63319p(String str, String str2, List list, String str3, String str4, ibk ibkVar) {
        l090 l090Var;
        ModificationRequest modificationRequest;
        String str5;
        if (ibkVar instanceof l090) {
            l090Var = (l090) ibkVar;
            int i = l090Var.f128337e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l090Var.f128337e = i - Integer.MIN_VALUE;
            } else {
                l090Var = new l090(this, ibkVar);
            }
        } else {
            l090Var = new l090(this, ibkVar);
        }
        l090 l090Var2 = l090Var;
        Object obj = l090Var2.f128335c;
        int i2 = l090Var2.f128337e;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("You need to add at least one item when replacing.");
            }
            C1204b c1204bM18488B = ModificationRequest.m18488B();
            c1204bM18488B.m18679B("replace");
            c1204bM18488B.m18683q(list);
            c1204bM18488B.m18692z(str2);
            modificationRequest = (ModificationRequest) c1204bM18488B.build();
            l090Var2.f128333a = str;
            l090Var2.f128334b = modificationRequest;
            l090Var2.f128337e = 1;
            str5 = str;
            if (m63313j(str5, str3, list, str4, l090Var2) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        ModificationRequest modificationRequest2 = l090Var2.f128334b;
        str5 = l090Var2.f128333a;
        bga.m29073P(obj);
        modificationRequest = modificationRequest2;
        wj50.m88279p(modificationRequest);
        l090Var2.f128333a = null;
        l090Var2.f128334b = null;
        l090Var2.f128337e = 2;
        Object objM63315l = m63315l(str5, modificationRequest, l090Var2);
        return objM63315l == obj2 ? obj2 : objM63315l;
    }

    /* JADX INFO: renamed from: q */
    public final Object m63320q(List list, lnn0 lnn0Var, Integer num, ibk ibkVar) {
        w401 w401VarM18657p = SetBasePermissionRequest.m18657p();
        w401VarM18657p.m87118m(si5.m78173p(lnn0Var));
        w401VarM18657p.m87119q(num.intValue());
        return x0h1.m89557A(this.f148946c, new i090(this, list, w401VarM18657p, (fbk) null, 1), ibkVar);
    }

    /* JADX INFO: renamed from: r */
    public final Object m63321r(String str, String str2, boolean z, boolean z2, ibk ibkVar) {
        return x0h1.m89557A(this.f148946c, new m090(this, str, z, str2, z2, null), ibkVar);
    }

    /* JADX INFO: renamed from: s */
    public final Object m63322s(String str, String str2, lnn0 lnn0Var, Integer num, mb61 mb61Var) {
        o501 o501VarM18662r = SetMemberPermissionRequest.m18662r();
        o501VarM18662r.m66263q(str);
        o501VarM18662r.m66265s(str2);
        if (lnn0Var != null) {
            o501VarM18662r.m66262m(si5.m78173p(lnn0Var));
        }
        o501VarM18662r.m66264r(num.intValue());
        return x0h1.m89557A(this.f148946c, new i090(this, o501VarM18662r, str, (fbk) null, 3), mb61Var);
    }

    /* JADX INFO: renamed from: t */
    public final Object m63323t(String str, C1203a c1203a, ibk ibkVar) {
        C1204b c1204bM18488B = ModificationRequest.m18488B();
        c1204bM18488B.m18679B("set");
        c1204bM18488B.m18687u(c1203a);
        ModificationRequest modificationRequest = (ModificationRequest) c1204bM18488B.build();
        wj50.m88279p(modificationRequest);
        Object objM63315l = m63315l(str, modificationRequest, ibkVar);
        return objM63315l == yuk.f276404a ? objM63315l : (p2x0) objM63315l;
    }

    /* JADX INFO: renamed from: u */
    public final Object m63324u(String str, List list, List list2, fbk fbkVar) {
        return x0h1.m89557A(this.f148946c, new m320(23, this, str, list, list2, null), fbkVar);
    }

    /* JADX INFO: renamed from: v */
    public final Object m63325v(String str, String str2, String str3, gva gvaVar, ibk ibkVar) {
        return x0h1.m89557A(this.f148946c, new m320(24, this, str, str2, geg1.m44518y(new pqm0(str3, gvaVar)), null), ibkVar);
    }

    /* JADX INFO: renamed from: w */
    public final Object m63326w(String str, rg61 rg61Var, fbk fbkVar) {
        return x0h1.m89557A(this.f148946c, new g090(this, geg1.m44518y(str), null, 1), fbkVar);
    }
}
