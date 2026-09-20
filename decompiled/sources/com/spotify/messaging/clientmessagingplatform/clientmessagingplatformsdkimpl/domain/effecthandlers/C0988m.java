package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingKey;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p204p.dq60;
import p204p.dya;
import p204p.gpc0;
import p204p.lau;
import p204p.ln9;
import p204p.n0e1;
import p204p.nau;
import p204p.nxa;
import p204p.pft0;
import p204p.pqm0;
import p204p.q0f1;
import p204p.r101;
import p204p.vve0;
import p204p.vya;
import p204p.zwa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0988m {

    /* JADX INFO: renamed from: a */
    public final zwa f5500a;

    /* JADX INFO: renamed from: b */
    public final ln9 f5501b;

    public C0988m(zwa zwaVar, ln9 ln9Var) {
        this.f5500a = zwaVar;
        this.f5501b = ln9Var;
    }

    /* JADX INFO: renamed from: a */
    public final ObservableTransformer m15314a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<vya> apply(Observable<nxa> observable) {
                final C0988m c0988m = this.this$0;
                return observable.flatMap(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final ObservableSource<? extends vya> mo98394apply(final nxa nxaVar) {
                        zwa zwaVar = c0988m.f5500a;
                        Set set = nxaVar.f159421c;
                        vve0 vve0Var = zwaVar.f286953a;
                        StringBuilder sbM36620t = dq60.m36620t("SELECT * FROM messages WHERE `trigger` IN (");
                        n0e1.m63421b(set.size(), sbM36620t);
                        sbM36620t.append(")");
                        Flowable flowableM23375n = q0f1.m71845y(vve0Var.f245221a, new gpc0(sbM36620t.toString(), set, vve0Var, 10)).m23369g(r101.f194677i).m23375n();
                        Flowable flowableM23375n2 = c0988m.f5501b.m59477g().m23375n();
                        c0988m.getClass();
                        return new ObservableFromPublisher(new FlowableSwitchIfEmpty(flowableM23375n.m23347c0(flowableM23375n2, new BiFunction() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$loadMessagesAndCapping$1
                            @Override // io.reactivex.rxjava3.functions.BiFunction
                            public final pqm0 apply(List<? extends Message> list, Map<CappingKey, CappingState> map) {
                                return pft0.m69840u(list, map);
                            }
                        }).m23331J(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.LoadMessagesEffectHandlerImpl$loadMessagesAndCapping$2
                            @Override // io.reactivex.rxjava3.functions.Function
                            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
                            public final dya mo98394apply(pqm0 pqm0Var) {
                                List list = (List) pqm0Var.f180350a;
                                Map map = (Map) pqm0Var.f180351b;
                                nxa nxaVar2 = nxaVar;
                                return new dya(nxaVar2.f159421c, nxaVar2.f159420b, list, map);
                            }
                        }), Flowable.m23313I(new dya(set, nxaVar.f159420b, lau.f131415a, nau.f152117a))));
                    }
                });
            }
        };
    }
}
