package p204p;

import com.spotify.offline_esperanto.proto.C1091c;
import com.spotify.offline_esperanto.proto.C1092d;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfo;
import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vfp0 {

    /* JADX INFO: renamed from: a */
    public static final PlaylistRequestDecorationPolicy f241009a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81216x(bjp0VarM18365h0);
        f241009a = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public static final Object m85380a(String str, wt80 wt80Var, kr00 kr00Var, ibk ibkVar) {
        tfp0 tfp0Var;
        String str2 = str;
        kr00 kr00Var2 = kr00Var;
        if (ibkVar instanceof tfp0) {
            tfp0Var = (tfp0) ibkVar;
            int i = tfp0Var.f220035d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfp0Var.f220035d = i - Integer.MIN_VALUE;
            } else {
                tfp0Var = new tfp0(ibkVar);
            }
        } else {
            tfp0Var = new tfp0(ibkVar);
        }
        Object objM62841f = tfp0Var.f220034c;
        int i2 = tfp0Var.f220035d;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            if (!wj50.m88271j(kr00Var2.f125486a.get(str2), Boolean.FALSE)) {
                st80 st80Var = new st80(f241009a, null, null, false, null, c5u0.f34291a, null, 0, null, 478);
                tfp0Var.f220032a = str2;
                tfp0Var.f220033b = kr00Var2;
                tfp0Var.f220035d = 1;
                objM62841f = ((mu80) wt80Var).m62841f(str2, st80Var, tfp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM62841f == yukVar) {
                    return yukVar;
                }
            }
            return nge.f153686a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kr00 kr00Var3 = tfp0Var.f220033b;
        String str3 = tfp0Var.f220032a;
        bga.m29073P(objM62841f);
        kr00Var2 = kr00Var3;
        str2 = str3;
        p2x0 p2x0Var = (p2x0) objM62841f;
        if (p2x0Var instanceof k2x0) {
            return mge.f143450a;
        }
        if (!(p2x0Var instanceof m2x0)) {
            throw new NoWhenBranchMatchedException();
        }
        Map map = ((qu80) ((m2x0) p2x0Var).f139474a).f192599e.f271272q;
        boolean z = map.get("workout.type") != null;
        kr00Var2.f125486a.put(str2, Boolean.valueOf(z));
        if (z) {
            String str4 = (String) map.get("workout.cue.voice");
            if (str4 == null) {
                str4 = "voice2";
            }
            String str5 = (String) map.get("workout.cue.provider");
            if (str5 == null) {
                str5 = "sonantic_large";
            }
            return new oge(new z3l0(str4, str5));
        }
        return nge.f153686a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Serializable m85381b(String str, fwk0 fwk0Var, ibk ibkVar) {
        ufp0 ufp0Var;
        if (ibkVar instanceof ufp0) {
            ufp0Var = (ufp0) ibkVar;
            int i = ufp0Var.f229854b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufp0Var.f229854b = i - Integer.MIN_VALUE;
            } else {
                ufp0Var = new ufp0(ibkVar);
            }
        } else {
            ufp0Var = new ufp0(ibkVar);
        }
        Object objM96567o = ufp0Var.f229853a;
        int i2 = ufp0Var.f229854b;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                C1091c c1091cM16137t = EsOffline$GetContextsRequest.m16137t();
                xlw xlwVarM16098o = EsOffline$ContextInfoPolicy.m16098o();
                xlwVarM16098o.m91443m(false);
                c1091cM16137t.m16217t(xlwVarM16098o);
                C1092d c1092dM16141q = EsOffline$GetContextsRequest.Filtering.m16141q();
                c1092dM16141q.m16219q(str);
                c1091cM16137t.m16216s(c1092dM16141q);
                EsOffline$GetContextsRequest esOffline$GetContextsRequest = (EsOffline$GetContextsRequest) c1091cM16137t.build();
                wj50.m88279p(esOffline$GetContextsRequest);
                Single singleM42968b = fwk0Var.m42968b(esOffline$GetContextsRequest);
                ufp0Var.f229854b = 1;
                objM96567o = zn91.m96567o(singleM42968b, ufp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            EsOffline$GetContextsResponse esOffline$GetContextsResponse = (EsOffline$GetContextsResponse) objM96567o;
            wj50.m88279p(esOffline$GetContextsResponse);
            if (esOffline$GetContextsResponse.m16146q() != 0) {
                return null;
            }
            ae50 ae50VarM16145p = esOffline$GetContextsResponse.m16145p();
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM16145p, 10));
            Iterator<E> it = ae50VarM16145p.iterator();
            while (it.hasNext()) {
                arrayList.add(((EsOffline$ContextInfo) it.next()).m16096o().getUri());
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }
}
