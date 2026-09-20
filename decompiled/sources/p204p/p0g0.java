package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;

/* JADX INFO: loaded from: classes9.dex */
public final class p0g0 {

    /* JADX INFO: renamed from: a */
    public final wrf0 f172672a;

    /* JADX INFO: renamed from: b */
    public final wt80 f172673b;

    /* JADX INFO: renamed from: c */
    public final fjf0 f172674c;

    /* JADX INFO: renamed from: d */
    public final hzf0 f172675d;

    /* JADX INFO: renamed from: e */
    public final zre1 f172676e;

    /* JADX INFO: renamed from: f */
    public final YourLibraryRequest f172677f;

    /* JADX INFO: renamed from: g */
    public final PlaylistRequestDecorationPolicy f172678g;

    public p0g0(wrf0 wrf0Var, wt80 wt80Var, fjf0 fjf0Var, hzf0 hzf0Var, zre1 zre1Var) {
        this.f172672a = wrf0Var;
        this.f172673b = wt80Var;
        this.f172674c = fjf0Var;
        this.f172675d = hzf0Var;
        this.f172676e = zre1Var;
        jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
        kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
        aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
        aoe1VarM98214r.m26586q(boe1.PLAYLIST);
        aoe1VarM98214r.m26586q(boe1.IS_MIXED);
        aoe1VarM98214r.m26586q(boe1.BY_YOU);
        kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
        kqe1VarM98179G.m57103q(true);
        kqe1VarM98179G.m57101K();
        kqe1VarM98179G.m57093C(1);
        jqe1VarM98173q.m54085m(kqe1VarM98179G);
        this.f172677f = (YourLibraryRequest) jqe1VarM98173q.build();
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        bjp0VarM18365h0.m29511W();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        this.f172678g = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final Object m68697a(String str, ibk ibkVar) {
        o0g0 o0g0Var;
        String str2;
        qu80 qu80Var;
        Object objM49274b;
        qu80 qu80Var2;
        Object obj;
        blw0 blw0Var;
        if (ibkVar instanceof o0g0) {
            o0g0Var = (o0g0) ibkVar;
            int i = o0g0Var.f160387e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0g0Var.f160387e = i - Integer.MIN_VALUE;
            } else {
                o0g0Var = new o0g0(this, ibkVar);
            }
        } else {
            o0g0Var = new o0g0(this, ibkVar);
        }
        Object objM86755t = o0g0Var.f160385c;
        int i2 = o0g0Var.f160387e;
        fjf0 fjf0Var = this.f172674c;
        Object[] objArr = 0;
        int i3 = 3;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            if (!fjf0Var.f70275t) {
                return Boolean.FALSE;
            }
            fiz fizVarM62953p = mvl0.m62953p(new vjz(new rop(this.f172676e.m96762c(this.f172677f), 4), new th80(i3, 7, objArr == true ? 1 : 0), 2));
            str2 = str;
            o0g0Var.f160383a = str2;
            o0g0Var.f160387e = 1;
            objM86755t = vyf1.m86755t(fizVarM62953p, o0g0Var);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            str2 = o0g0Var.f160383a;
            bga.m29073P(objM86755t);
        } else {
            if (i2 == 2) {
                str2 = o0g0Var.f160383a;
                bga.m29073P(objM86755t);
                qu80Var = (qu80) ((p2x0) objM86755t).m68971d();
                if (!qu80Var.f192599e.f271265j) {
                    return Boolean.FALSE;
                }
                o0g0Var.f160383a = null;
                o0g0Var.f160384b = qu80Var;
                o0g0Var.f160387e = 3;
                objM49274b = this.f172675d.m49274b(str2, lau.f131415a, o0g0Var);
                if (objM49274b != yukVar) {
                    qu80Var2 = qu80Var;
                    obj = objM49274b;
                }
                return yukVar;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qu80Var2 = o0g0Var.f160384b;
            bga.m29073P(objM86755t);
            obj = ((s6x0) objM86755t).f206218a;
        }
        blw0Var = (blw0) (obj instanceof c6x0 ? null : obj);
        if (blw0Var == null) {
            return Boolean.FALSE;
        }
        if (qu80Var2.f192598d.size() - blw0Var.f28297a.size() >= fjf0Var.f70215B) {
            return Boolean.FALSE;
        }
        Map map = qu80Var2.f192599e.f271272q;
        this.f172672a.getClass();
        return Boolean.parseBoolean((String) map.get("has-custom-transitions")) ? Boolean.FALSE : Boolean.TRUE;
        if (!((Boolean) objM86755t).booleanValue()) {
            return Boolean.FALSE;
        }
        st80 st80Var = new st80(this.f172678g, null, null, false, q0g0.f184008a, a5u0.f12598a, null, 0, null, 462);
        o0g0Var.f160383a = str2;
        o0g0Var.f160387e = 2;
        objM86755t = ((mu80) this.f172673b).m62841f(str2, st80Var, o0g0Var);
        if (objM86755t != yukVar) {
            qu80Var = (qu80) ((p2x0) objM86755t).m68971d();
            if (!qu80Var.f192599e.f271265j) {
                return Boolean.FALSE;
            }
            o0g0Var.f160383a = null;
            o0g0Var.f160384b = qu80Var;
            o0g0Var.f160387e = 3;
            objM49274b = this.f172675d.m49274b(str2, lau.f131415a, o0g0Var);
            if (objM49274b != yukVar) {
                qu80Var2 = qu80Var;
                obj = objM49274b;
                blw0Var = (blw0) (obj instanceof c6x0 ? null : obj);
                if (blw0Var == null) {
                    return Boolean.FALSE;
                }
                if (qu80Var2.f192598d.size() - blw0Var.f28297a.size() >= fjf0Var.f70215B) {
                    return Boolean.FALSE;
                }
                Map map2 = qu80Var2.f192599e.f271272q;
                this.f172672a.getClass();
                if (Boolean.parseBoolean((String) map2.get("has-custom-transitions"))) {
                }
            }
        }
        return yukVar;
    }
}
