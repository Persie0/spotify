package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;
import p204p.abc0;
import p204p.eya;
import p204p.geg1;
import p204p.jwa;
import p204p.nsf1;
import p204p.ro80;
import p204p.uj91;
import p204p.vve0;
import p204p.vya;
import p204p.xxa;
import p204p.zwa;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C0991p {

    /* JADX INFO: renamed from: a */
    public final zwa f5505a;

    /* JADX INFO: renamed from: b */
    public final jwa f5506b;

    public C0991p(zwa zwaVar, jwa jwaVar) {
        this.f5505a = zwaVar;
        this.f5506b = jwaVar;
    }

    /* JADX INFO: renamed from: a */
    public final ObservableTransformer m15317a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<vya> apply(Observable<xxa> observable) {
                final C0991p c0991p = this.this$0;
                return observable.map(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final vya mo98394apply(xxa xxaVar) {
                        zwa zwaVar = c0991p.f5505a;
                        Map map = xxaVar.f266926b;
                        ro80 ro80VarM44508o = geg1.m44508o();
                        for (Map.Entry entry : map.entrySet()) {
                            for (Message message : (Iterable) entry.getValue()) {
                                ro80VarM44508o.add(new uj91((String) entry.getKey(), message instanceof Message.CreativeMessage ? ((Message.CreativeMessage) message).getLoggingData().getMessageId() : -1L, message));
                            }
                        }
                        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
                        vve0 vve0Var = zwaVar.f286953a;
                        nsf1.m65528n(vve0Var.f245221a, false, true, new abc0(19, vve0Var, ro80VarM44506m));
                        jwa jwaVar = c0991p.f5506b;
                        CacheState cacheState = CacheState.LOADED;
                        jwaVar.f116611a.onNext(cacheState);
                        return new eya(cacheState);
                    }
                }).onErrorResumeNext(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.SaveMessagesToCacheEffectHandlerImpl$transformer$1.2
                    @Override // io.reactivex.rxjava3.functions.Function
                    /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final ObservableSource<? extends vya> mo98394apply(Throwable th) {
                        return Observable.just(new eya(CacheState.UPDATE_FAILED));
                    }
                });
            }
        };
    }
}
