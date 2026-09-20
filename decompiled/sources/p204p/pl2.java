package p204p;

import com.spotify.agentgateway.p016v1.CreateConversationRequest;
import com.spotify.agentgateway.p016v1.CreateConversationResponse;
import com.spotify.agentgateway.p016v1.CreatePlaylistFromListRequest;
import com.spotify.agentgateway.p016v1.CreatePlaylistFromListResponse;
import com.spotify.agentgateway.p016v1.DeleteConversationRequest;
import com.spotify.agentgateway.p016v1.GetConversationListRequest;
import com.spotify.agentgateway.p016v1.GetConversationListResponse;
import com.spotify.agentgateway.p016v1.GetConversationRequest;
import com.spotify.agentgateway.p016v1.GetConversationResponse;
import com.spotify.agentgateway.p016v1.GetConversationStartersRequest;
import com.spotify.agentgateway.p016v1.GetConversationStartersResponse;
import com.spotify.agentgateway.p016v1.GetProgressStagesRequest;
import com.spotify.agentgateway.p016v1.GetProgressStagesResponse;
import com.spotify.agentgateway.p016v1.RecordEventInConversationRequest;
import com.spotify.agentgateway.p016v1.SendMessageInConversationRequest;
import com.spotify.agentgateway.p016v1.SendMessageResponse;
import com.spotify.agentgateway.p016v1.SendMessageWithImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public final class pl2 implements el2 {

    /* JADX INFO: renamed from: c */
    public static final ArrayList f178611c = d3h1.m34835A(um2.m83418a());

    /* JADX INFO: renamed from: a */
    public final cn2 f178612a;

    /* JADX INFO: renamed from: b */
    public final String f178613b;

    public pl2(cn2 cn2Var, wf4 wf4Var) {
        this.f178612a = cn2Var;
        this.f178613b = wf4Var.m87943a() ? "agent-engine" : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70240a(bn2 bn2Var, String str, boolean z, String str2, ibk ibkVar) {
        fl2 fl2Var;
        if (ibkVar instanceof fl2) {
            fl2Var = (fl2) ibkVar;
            int i = fl2Var.f70668c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fl2Var.f70668c = i - Integer.MIN_VALUE;
            } else {
                fl2Var = new fl2(this, ibkVar);
            }
        } else {
            fl2Var = new fl2(this, ibkVar);
        }
        Object objM33429g = fl2Var.f70666a;
        int i2 = fl2Var.f70668c;
        if (i2 == 0) {
            bga.m29073P(objM33429g);
            if (str2 == null) {
                str2 = this.f178613b;
            }
            v5l v5lVarM2894t = CreateConversationRequest.m2894t();
            v5lVarM2894t.m84733q(str);
            v5lVarM2894t.m84735s(d3h1.m34862z(bn2Var));
            v5lVarM2894t.m84732m(f178611c);
            v5lVarM2894t.m84734r(z);
            if (str2 != null) {
                v5lVarM2894t.m84736t(str2);
            }
            CreateConversationRequest createConversationRequest = (CreateConversationRequest) v5lVarM2894t.build();
            fl2Var.f70668c = 1;
            objM33429g = this.f178612a.m33429g(createConversationRequest, fl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33429g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33429g);
        }
        return d3h1.m34853q((CreateConversationResponse) objM33429g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70241b(String str, ibk ibkVar) {
        gl2 gl2Var;
        if (ibkVar instanceof gl2) {
            gl2Var = (gl2) ibkVar;
            int i = gl2Var.f80980c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl2Var.f80980c = i - Integer.MIN_VALUE;
            } else {
                gl2Var = new gl2(this, ibkVar);
            }
        } else {
            gl2Var = new gl2(this, ibkVar);
        }
        Object objM33433k = gl2Var.f80978a;
        int i2 = gl2Var.f80980c;
        if (i2 == 0) {
            bga.m29073P(objM33433k);
            abl ablVarM2903p = CreatePlaylistFromListRequest.m2903p();
            ablVarM2903p.m25362m(str);
            CreatePlaylistFromListRequest createPlaylistFromListRequest = (CreatePlaylistFromListRequest) ablVarM2903p.build();
            wj50.m88279p(createPlaylistFromListRequest);
            gl2Var.f80980c = 1;
            objM33433k = this.f178612a.m33433k(createPlaylistFromListRequest, gl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33433k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33433k);
        }
        return new am2(((CreatePlaylistFromListResponse) objM33433k).getPlaylistUri());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70242c(String str, ibk ibkVar) {
        hl2 hl2Var;
        if (ibkVar instanceof hl2) {
            hl2Var = (hl2) ibkVar;
            int i = hl2Var.f92588c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl2Var.f92588c = i - Integer.MIN_VALUE;
            } else {
                hl2Var = new hl2(this, ibkVar);
            }
        } else {
            hl2Var = new hl2(this, ibkVar);
        }
        Object objM33424b = hl2Var.f92586a;
        int i2 = hl2Var.f92588c;
        if (i2 == 0) {
            bga.m29073P(objM33424b);
            nnq nnqVarM2908p = DeleteConversationRequest.m2908p();
            nnqVarM2908p.m65217m(str);
            DeleteConversationRequest deleteConversationRequest = (DeleteConversationRequest) nnqVarM2908p.build();
            wj50.m88279p(deleteConversationRequest);
            hl2Var.f92588c = 1;
            objM33424b = this.f178612a.m33424b(deleteConversationRequest, hl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33424b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33424b);
        }
        o2x0 o2x0Var = (o2x0) objM33424b;
        if (o2x0Var.f161171a.f149852O0) {
            return w2a1.f247311a;
        }
        throw new HttpException(o2x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m70243d(String str, String str2, ibk ibkVar) {
        il2 il2Var;
        if (ibkVar instanceof il2) {
            il2Var = (il2) ibkVar;
            int i = il2Var.f103270c;
            if ((i & Integer.MIN_VALUE) != 0) {
                il2Var.f103270c = i - Integer.MIN_VALUE;
            } else {
                il2Var = new il2(this, ibkVar);
            }
        } else {
            il2Var = new il2(this, ibkVar);
        }
        Object objM33432j = il2Var.f103268a;
        int i2 = il2Var.f103270c;
        if (i2 == 0) {
            bga.m29073P(objM33432j);
            v710 v710VarM2916q = GetConversationRequest.m2916q();
            v710VarM2916q.m84820m(str);
            if (str2 != null) {
                v710VarM2916q.m84821q(str2);
            }
            GetConversationRequest getConversationRequest = (GetConversationRequest) v710VarM2916q.build();
            il2Var.f103270c = 1;
            objM33432j = this.f178612a.m33432j(getConversationRequest, il2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33432j == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33432j);
        }
        return d3h1.m34855s((GetConversationResponse) objM33432j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m70244e(String str, ibk ibkVar) {
        jl2 jl2Var;
        if (ibkVar instanceof jl2) {
            jl2Var = (jl2) ibkVar;
            int i = jl2Var.f113465c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jl2Var.f113465c = i - Integer.MIN_VALUE;
            } else {
                jl2Var = new jl2(this, ibkVar);
            }
        } else {
            jl2Var = new jl2(this, ibkVar);
        }
        Object objM33425c = jl2Var.f113463a;
        int i2 = jl2Var.f113465c;
        if (i2 == 0) {
            bga.m29073P(objM33425c);
            u710 u710VarM2911o = GetConversationListRequest.m2911o();
            if (str != null) {
                u710VarM2911o.m82481m(str);
            }
            duw0 duw0VarM73140a = ql2.m73140a(u710VarM2911o.build());
            jl2Var.f113465c = 1;
            objM33425c = this.f178612a.m33425c(duw0VarM73140a, jl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33425c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33425c);
        }
        return d3h1.m34854r((GetConversationListResponse) objM33425c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m70245f(wm2 wm2Var, String str, String str2, boolean z, ibk ibkVar) {
        kl2 kl2Var;
        if (ibkVar instanceof kl2) {
            kl2Var = (kl2) ibkVar;
            int i = kl2Var.f123779c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kl2Var.f123779c = i - Integer.MIN_VALUE;
            } else {
                kl2Var = new kl2(this, ibkVar);
            }
        } else {
            kl2Var = new kl2(this, ibkVar);
        }
        Object objM33426d = kl2Var.f123777a;
        int i2 = kl2Var.f123779c;
        if (i2 == 0) {
            bga.m29073P(objM33426d);
            if (str2 == null) {
                str2 = this.f178613b;
            }
            w710 w710VarM2923s = GetConversationStartersRequest.m2923s();
            if (wm2Var != null) {
                w710VarM2923s.m87312r(d3h1.m34861y(wm2Var));
            }
            if (str != null) {
                w710VarM2923s.m87310m(str);
            }
            if (str2 != null) {
                w710VarM2923s.m87313s(str2);
            }
            w710VarM2923s.m87311q(z);
            GetConversationStartersRequest getConversationStartersRequest = (GetConversationStartersRequest) w710VarM2923s.build();
            kl2Var.f123779c = 1;
            objM33426d = this.f178612a.m33426d(getConversationStartersRequest, kl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33426d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33426d);
        }
        return d3h1.m34856t((GetConversationStartersResponse) objM33426d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m70246g(bn2 bn2Var, String str, String str2, ibk ibkVar) {
        ll2 ll2Var;
        if (ibkVar instanceof ll2) {
            ll2Var = (ll2) ibkVar;
            int i = ll2Var.f134514c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll2Var.f134514c = i - Integer.MIN_VALUE;
            } else {
                ll2Var = new ll2(this, ibkVar);
            }
        } else {
            ll2Var = new ll2(this, ibkVar);
        }
        Object objM33427e = ll2Var.f134512a;
        int i2 = ll2Var.f134514c;
        if (i2 == 0) {
            bga.m29073P(objM33427e);
            ka10 ka10VarM2935r = GetProgressStagesRequest.m2935r();
            ka10VarM2935r.m55857r(d3h1.m34862z(bn2Var));
            ka10VarM2935r.m55856q(str);
            if (str2 != null) {
                ka10VarM2935r.m55855m(str2);
            }
            GetProgressStagesRequest getProgressStagesRequest = (GetProgressStagesRequest) ka10VarM2935r.build();
            ll2Var.f134514c = 1;
            objM33427e = this.f178612a.m33427e(getProgressStagesRequest, ll2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33427e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33427e);
        }
        return d3h1.m34857u((GetProgressStagesResponse) objM33427e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m70247h(String str, vl2 vl2Var, ibk ibkVar) {
        ml2 ml2Var;
        if (ibkVar instanceof ml2) {
            ml2Var = (ml2) ibkVar;
            int i = ml2Var.f144743c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml2Var.f144743c = i - Integer.MIN_VALUE;
            } else {
                ml2Var = new ml2(this, ibkVar);
            }
        } else {
            ml2Var = new ml2(this, ibkVar);
        }
        Object objM33430h = ml2Var.f144741a;
        int i2 = ml2Var.f144743c;
        if (i2 == 0) {
            bga.m29073P(objM33430h);
            ygv0 ygv0VarM2965p = RecordEventInConversationRequest.m2965p();
            ygv0VarM2965p.m93609m(str);
            ygv0VarM2965p.m93610q(d3h1.m34859w(vl2Var));
            RecordEventInConversationRequest recordEventInConversationRequest = (RecordEventInConversationRequest) ygv0VarM2965p.build();
            wj50.m88279p(recordEventInConversationRequest);
            ml2Var.f144743c = 1;
            objM33430h = this.f178612a.m33430h(recordEventInConversationRequest, ml2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33430h == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33430h);
        }
        o2x0 o2x0Var = (o2x0) objM33430h;
        if (o2x0Var.f161171a.f149852O0) {
            return w2a1.f247311a;
        }
        throw new HttpException(o2x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m70248i(String str, bn2 bn2Var, String str2, String str3, ibk ibkVar) {
        nl2 nl2Var;
        if (ibkVar instanceof nl2) {
            nl2Var = (nl2) ibkVar;
            int i = nl2Var.f154993c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nl2Var.f154993c = i - Integer.MIN_VALUE;
            } else {
                nl2Var = new nl2(this, ibkVar);
            }
        } else {
            nl2Var = new nl2(this, ibkVar);
        }
        Object objM33423a = nl2Var.f154991a;
        int i2 = nl2Var.f154993c;
        if (i2 == 0) {
            bga.m29073P(objM33423a);
            if (str3 == null) {
                str3 = this.f178613b;
            }
            nrz0 nrz0VarM2972t = SendMessageInConversationRequest.m2972t();
            nrz0VarM2972t.m65497q(str);
            nrz0VarM2972t.m65499s(d3h1.m34862z(bn2Var));
            nrz0VarM2972t.m65498r(str2);
            nrz0VarM2972t.m65496m(f178611c);
            if (str3 != null) {
                nrz0VarM2972t.m65500t(str3);
            }
            SendMessageInConversationRequest sendMessageInConversationRequest = (SendMessageInConversationRequest) nrz0VarM2972t.build();
            nl2Var.f154993c = 1;
            objM33423a = this.f178612a.m33423a(sendMessageInConversationRequest, nl2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33423a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33423a);
        }
        return d3h1.m34858v((SendMessageResponse) objM33423a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m70249j(String str, bn2 bn2Var, List list, String str2, String str3, ibk ibkVar) {
        ol2 ol2Var;
        if (ibkVar instanceof ol2) {
            ol2Var = (ol2) ibkVar;
            int i = ol2Var.f166732c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ol2Var.f166732c = i - Integer.MIN_VALUE;
            } else {
                ol2Var = new ol2(this, ibkVar);
            }
        } else {
            ol2Var = new ol2(this, ibkVar);
        }
        Object objM33431i = ol2Var.f166730a;
        int i2 = ol2Var.f166732c;
        if (i2 == 0) {
            bga.m29073P(objM33431i);
            if (list.isEmpty()) {
                throw new IllegalArgumentException("imageAttachments must not be empty");
            }
            if (str3 == null) {
                str3 = this.f178613b;
            }
            prz0 prz0VarM2984u = SendMessageWithImageRequest.m2984u();
            prz0VarM2984u.m70745r(str);
            prz0VarM2984u.m70747t(d3h1.m34862z(bn2Var));
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d3h1.m34860x((hm2) it.next()));
            }
            prz0VarM2984u.m70743m(arrayList);
            prz0VarM2984u.m70746s(str2);
            prz0VarM2984u.m70744q(f178611c);
            if (str3 != null) {
                prz0VarM2984u.m70748u(str3);
            }
            SendMessageWithImageRequest sendMessageWithImageRequest = (SendMessageWithImageRequest) prz0VarM2984u.build();
            ol2Var.f166732c = 1;
            objM33431i = this.f178612a.m33431i(sendMessageWithImageRequest, ol2Var);
            yuk yukVar = yuk.f276404a;
            if (objM33431i == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM33431i);
        }
        return d3h1.m34858v((SendMessageResponse) objM33431i);
    }
}
