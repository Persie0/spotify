package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.GifMedia;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.PopularResponse;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchRequest;
import com.spotify.campfire.chatcontentpickerpage.gifs.proto.SearchResponse;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class gpj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ md10 f83205a;

    public gpj(md10 md10Var) {
        this.f83205a = md10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        if (r9.mo30229d(r1, r0) == r5) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        fpj fpjVar;
        Object sojVar;
        ooj oojVar;
        ooj oojVar2;
        ae50<GifMedia> ae50VarM4206n;
        ooj oojVar3;
        if (ibkVar instanceof fpj) {
            fpjVar = (fpj) ibkVar;
            int i = fpjVar.f71884b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpjVar.f71884b = i - Integer.MIN_VALUE;
            } else {
                fpjVar = new fpj(this, ibkVar);
            }
        } else {
            fpjVar = new fpj(this, ibkVar);
        }
        Object objM61503b = fpjVar.f71883a;
        int i2 = fpjVar.f71884b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ooj oojVar4 = fpjVar.f71887e;
                    bqz0Var = fpjVar.f71886d;
                    bga.m29073P(objM61503b);
                    oojVar2 = oojVar4;
                    oojVar2 = oojVar;
                    ae50VarM4206n = ((PopularResponse) objM61503b).m4206n();
                    obj = oojVar2;
                } else if (i2 == 2) {
                    ooj oojVar5 = fpjVar.f71887e;
                    bqz0Var = fpjVar.f71886d;
                    bga.m29073P(objM61503b);
                    oojVar3 = oojVar5;
                    oojVar3 = oojVar;
                    ae50VarM4206n = ((SearchResponse) objM61503b).m4211n();
                    obj = oojVar3;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM61503b);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM61503b);
            oojVar = (ooj) obj;
            String str = oojVar.f167644a;
            int i3 = oojVar.f167645b;
            boolean zM88460J0 = wl51.m88460J0(str);
            md10 md10Var = this.f83205a;
            if (zM88460J0) {
                y9q0 y9q0VarM4205p = PopularRequest.m4205p();
                y9q0VarM4205p.m93157m();
                y9q0VarM4205p.m93158q(i3);
                PopularRequest popularRequest = (PopularRequest) y9q0VarM4205p.build();
                fpjVar.f71886d = bqz0Var;
                fpjVar.f71887e = oojVar;
                fpjVar.f71884b = 1;
                objM61503b = md10Var.m61502a(popularRequest, fpjVar);
                if (objM61503b == yukVar) {
                    oojVar2 = oojVar;
                } else {
                    oojVar2 = oojVar;
                    ae50VarM4206n = ((PopularResponse) objM61503b).m4206n();
                    obj = oojVar2;
                }
            } else {
                mzy0 mzy0VarM4210q = SearchRequest.m4210q();
                mzy0VarM4210q.m63271r(oojVar.f167644a);
                mzy0VarM4210q.m63269m();
                mzy0VarM4210q.m63270q(i3);
                SearchRequest searchRequest = (SearchRequest) mzy0VarM4210q.build();
                fpjVar.f71886d = bqz0Var;
                fpjVar.f71887e = oojVar;
                fpjVar.f71884b = 2;
                objM61503b = md10Var.m61503b(searchRequest, fpjVar);
                if (objM61503b == yukVar) {
                    oojVar3 = oojVar;
                } else {
                    oojVar3 = oojVar;
                    ae50VarM4206n = ((SearchResponse) objM61503b).m4211n();
                    obj = oojVar3;
                }
            }
            return yukVar;
            wj50.m88279p(ae50VarM4206n);
            ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM4206n, 10));
            for (GifMedia gifMedia : ae50VarM4206n) {
                wj50.m88279p(gifMedia);
                arrayList.add(qqg1.m73554x(gifMedia));
            }
            sojVar = new soj(opo.m67574x(arrayList));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, edb.m38564m("ChatContentPicker: Failed to load more gifs for query: ", obj.f167644a), new Object[0]);
            sojVar = uoj.f232448a;
        }
        fpjVar.f71886d = null;
        fpjVar.f71887e = null;
        fpjVar.f71884b = 3;
    }
}
