package p204p;

import android.util.Base64;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.playlistreaction.p128v1.ListReactionsResponse;
import com.spotify.playlistreaction.p128v1.ReactionListDisplay;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class lmp0 implements adu0 {

    /* JADX INFO: renamed from: h */
    public static final PlaylistRequestDecorationPolicy f134999h;

    /* JADX INFO: renamed from: a */
    public final xfp0 f135000a;

    /* JADX INFO: renamed from: b */
    public final vkr f135001b;

    /* JADX INFO: renamed from: c */
    public final wt80 f135002c;

    /* JADX INFO: renamed from: d */
    public final e8i0 f135003d;

    /* JADX INFO: renamed from: e */
    public final wln f135004e;

    /* JADX INFO: renamed from: f */
    public final boolean f135005f;

    /* JADX INFO: renamed from: g */
    public final List f135006g = ldu0.f132355a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26440v();
        top0VarM18421v.m81213u((PlaylistItemDecorationPolicy) amp0VarM18396H.build());
        ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
        ktp0VarM18427E.m57345C();
        top0VarM18421v.m81217y((PlaylistTrackDecorationPolicy) ktp0VarM18427E.build());
        qjp0 qjp0VarM18379C = PlaylistEpisodeDecorationPolicy.m18379C();
        qjp0VarM18379C.m72936B();
        top0VarM18421v.m81211s((PlaylistEpisodeDecorationPolicy) qjp0VarM18379C.build());
        f134999h = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public lmp0(xfp0 xfp0Var, m57 m57Var, vkr vkrVar, wt80 wt80Var, e8i0 e8i0Var, wln wlnVar) {
        this.f135000a = xfp0Var;
        this.f135001b = vkrVar;
        this.f135002c = wt80Var;
        this.f135003d = e8i0Var;
        this.f135004e = wlnVar;
        this.f135005f = xfp0Var.f261057e;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: a */
    public final boolean mo25622a() {
        return this.f135005f;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: b */
    public final Object mo25623b(ju61 ju61Var, String str, mb61 mb61Var) {
        Object objM85916a = this.f135001b.m85916a(ju61Var.f116039b, ju61Var.f116038a, str, mb61Var);
        return objM85916a == yuk.f276404a ? objM85916a : w2a1.f247311a;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: c */
    public final List mo25624c() {
        return this.f135006g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r5.f135001b.m85918c(r1, r6, r7, r0) == r4) goto L23;
     */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo25625d(ju61 ju61Var, fbk fbkVar) {
        kmp0 kmp0Var;
        if (fbkVar instanceof kmp0) {
            kmp0Var = (kmp0) fbkVar;
            int i = kmp0Var.f124196d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmp0Var.f124196d = i - Integer.MIN_VALUE;
            } else {
                kmp0Var = new kmp0(this, (ibk) fbkVar);
            }
        } else {
            kmp0Var = new kmp0(this, (ibk) fbkVar);
        }
        Object objM59457i = kmp0Var.f124194b;
        int i2 = kmp0Var.f124196d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM59457i);
            kmp0Var.f124193a = ju61Var;
            kmp0Var.f124196d = 1;
            objM59457i = m59457i(ju61Var, kmp0Var);
            if (objM59457i != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ju61Var = kmp0Var.f124193a;
            bga.m29073P(objM59457i);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59457i);
        }
        return w2a1.f247311a;
        String str = (String) objM59457i;
        if (str != null) {
            String str2 = ju61Var.f116039b;
            String str3 = ju61Var.f116038a;
            kmp0Var.f124193a = null;
            kmp0Var.f124196d = 2;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r12 == r4) goto L37;
     */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo25626e(ju61 ju61Var, String str, String str2, ibk ibkVar) throws UnsupportedEncodingException {
        hmp0 hmp0Var;
        if (ibkVar instanceof hmp0) {
            hmp0Var = (hmp0) ibkVar;
            int i = hmp0Var.f93019d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmp0Var.f93019d = i - Integer.MIN_VALUE;
            } else {
                hmp0Var = new hmp0(this, ibkVar);
            }
        } else {
            hmp0Var = new hmp0(this, ibkVar);
        }
        Object objM59458j = hmp0Var.f93017b;
        int i2 = hmp0Var.f93019d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM59458j);
            hmp0Var.f93016a = str;
            hmp0Var.f93019d = 1;
            objM59458j = m59458j(ju61Var, hmp0Var);
            if (objM59458j != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str = hmp0Var.f93016a;
            bga.m29073P(objM59458j);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59458j);
        }
        return new dpm0((List) objM59458j, "");
        Iterable iterable = (List) objM59458j;
        if (iterable == null) {
            iterable = lau.f131415a;
        }
        ArrayList<ddu0> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (str != null ? wj50.m88271j(((ddu0) obj).f47870a, str) : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (ddu0 ddu0Var : arrayList) {
            arrayList2.add(new pua1(new nua1("", wl51.m88469S0(ddu0Var.f47872c.f36950a, "spotify:user:"), ""), ddu0Var.f47870a, ddu0Var.f47871b));
        }
        hmp0Var.f93016a = null;
        hmp0Var.f93019d = 2;
        objM59458j = this.f135003d.m38109a(arrayList2, hmp0Var);
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: f */
    public final boolean mo25627f(ju61 ju61Var) {
        if (!this.f135000a.f261054b) {
            return false;
        }
        Set set = dd41.f47702f;
        he41 he41Var = r46.m74726U(ju61Var.f116039b).f47710d;
        return wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.adu0
    /* JADX INFO: renamed from: g */
    public final Serializable mo25628g(ju61 ju61Var, ibk ibkVar) {
        imp0 imp0Var;
        if (ibkVar instanceof imp0) {
            imp0Var = (imp0) ibkVar;
            int i = imp0Var.f103766c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imp0Var.f103766c = i - Integer.MIN_VALUE;
            } else {
                imp0Var = new imp0(this, ibkVar);
            }
        } else {
            imp0Var = new imp0(this, ibkVar);
        }
        Object objM59458j = imp0Var.f103764a;
        int i2 = imp0Var.f103766c;
        if (i2 == 0) {
            bga.m29073P(objM59458j);
            imp0Var.f103766c = 1;
            objM59458j = m59458j(ju61Var, imp0Var);
            yuk yukVar = yuk.f276404a;
            if (objM59458j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59458j);
        }
        List list = (List) objM59458j;
        if (list == null) {
            list = lau.f131415a;
        }
        Map mapM54469s = jwg1.m54469s(new dj10(3, list));
        ArrayList arrayList = new ArrayList(mapM54469s.size());
        for (Map.Entry entry : mapM54469s.entrySet()) {
            arrayList.add(new xcu0((String) entry.getKey(), ((Number) entry.getValue()).intValue()));
        }
        return arrayList;
    }

    @Override // p204p.adu0
    /* JADX INFO: renamed from: h */
    public final pk20 mo25629h(ju61 ju61Var, klu0 klu0Var) {
        zlp0 zlp0Var;
        wln wlnVar = this.f135004e;
        switch (wlnVar.f252586a) {
            case 0:
                vfn vfnVar = (vfn) wlnVar.f252587b;
                wt80 wt80Var = (wt80) vfnVar.f241004b.f211598O6.get();
                nmn nmnVar = (nmn) vfnVar.f241006d;
                zlp0Var = new zlp0(wt80Var, (z9j0) nmnVar.f155773U0.get(), (xln) nmnVar.f155962gc.get());
                break;
            default:
                otn otnVar = (otn) ((vfn) wlnVar.f252587b).f241006d;
                zlp0Var = new zlp0((wt80) otnVar.f169389M0.get(), (z9j0) otnVar.f169565X.get(), (xln) otnVar.f169454Q1.get());
                break;
        }
        return new pk20(new qlp0(ju61Var.f116039b, ju61Var.f116038a, klu0Var), zlp0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m59457i(ju61 ju61Var, ibk ibkVar) {
        gmp0 gmp0Var;
        nw80 nw80Var;
        ceu0 ceu0VarM60837q;
        if (ibkVar instanceof gmp0) {
            gmp0Var = (gmp0) ibkVar;
            int i = gmp0Var.f81443c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmp0Var.f81443c = i - Integer.MIN_VALUE;
            } else {
                gmp0Var = new gmp0(this, ibkVar);
            }
        } else {
            gmp0Var = new gmp0(this, ibkVar);
        }
        Object objM62843h = gmp0Var.f81441a;
        int i2 = gmp0Var.f81443c;
        if (i2 == 0) {
            bga.m29073P(objM62843h);
            String str = ju61Var.f116039b;
            String str2 = ju61Var.f116038a;
            gmp0Var.f81443c = 1;
            objM62843h = ((mu80) this.f135002c).m62843h(str, str2, f134999h, gmp0Var);
            yuk yukVar = yuk.f276404a;
            if (objM62843h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62843h);
        }
        p2x0 p2x0Var = (p2x0) objM62843h;
        if (p2x0Var == null || (nw80Var = (nw80) p2x0Var.m68970c()) == null || (ceu0VarM60837q = m57.m60837q(nw80Var.f159053g)) == null) {
            return null;
        }
        return ceu0VarM60837q.f37178a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Serializable m59458j(ju61 ju61Var, ibk ibkVar) {
        jmp0 jmp0Var;
        nw80 nw80Var;
        String str;
        if (ibkVar instanceof jmp0) {
            jmp0Var = (jmp0) ibkVar;
            int i = jmp0Var.f113925c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmp0Var.f113925c = i - Integer.MIN_VALUE;
            } else {
                jmp0Var = new jmp0(this, ibkVar);
            }
        } else {
            jmp0Var = new jmp0(this, ibkVar);
        }
        Object objM62843h = jmp0Var.f113923a;
        int i2 = jmp0Var.f113925c;
        if (i2 == 0) {
            bga.m29073P(objM62843h);
            String str2 = ju61Var.f116039b;
            String str3 = ju61Var.f116038a;
            jmp0Var.f113925c = 1;
            objM62843h = ((mu80) this.f135002c).m62843h(str2, str3, f134999h, jmp0Var);
            yuk yukVar = yuk.f276404a;
            if (objM62843h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62843h);
        }
        p2x0 p2x0Var = (p2x0) objM62843h;
        if (p2x0Var == null || (nw80Var = (nw80) p2x0Var.m68970c()) == null || (str = (String) nw80Var.f159053g.get("reactions_detail")) == null) {
            return null;
        }
        try {
            ae50<ReactionListDisplay> ae50VarM19453n = ListReactionsResponse.m19452o(Base64.decode(str, 0)).m19453n();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM19453n, 10));
            for (ReactionListDisplay reactionListDisplay : ae50VarM19453n) {
                arrayList.add(new ddu0(reactionListDisplay.m19455o(), reactionListDisplay.m19454n(), new cdu0(reactionListDisplay.m19456p().getUsername())));
            }
            return arrayList;
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            return lau.f131415a;
        }
    }
}
