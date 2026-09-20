package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import p204p.ase0;
import p204p.bue0;
import p204p.cue0;
import p204p.hue0;
import p204p.lau;
import p204p.m3q;
import p204p.ure0;
import p204p.vya;
import p204p.wre0;
import p204p.wxa;
import p204p.ydj;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0976a {

    /* JADX INFO: renamed from: a */
    public final bue0 f5478a;

    public C0976a(bue0 bue0Var) {
        this.f5478a = bue0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ObservableTransformer m15302a() {
        return new ObservableTransformer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl$transformer$1
            @Override // io.reactivex.rxjava3.core.ObservableTransformer
            public final ObservableSource<vya> apply(Observable<wxa> observable) {
                final C0976a c0976a = this.this$0;
                return observable.flatMap(new Function() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl$transformer$1.1
                    @Override // io.reactivex.rxjava3.functions.Function
                    /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
                    public final ObservableSource<? extends vya> mo98394apply(wxa wxaVar) {
                        bue0 bue0Var = c0976a.f5478a;
                        TriggerType triggerType = TriggerType.CLIENT_EVENT;
                        DynamicTagsMetadata dynamicTagsMetadata = new DynamicTagsMetadata(null, null, null, null, 15, null);
                        ConflictResolutionStrategy conflictResolutionStrategy = ConflictResolutionStrategy.DISCARD_SELF;
                        ase0 ase0Var = new ase0(new wre0(false), ure0.f233341a);
                        hue0 hue0Var = (hue0) bue0Var;
                        String strM80436n = hue0Var.f95394d.m80436n();
                        lau lauVar = lau.f131415a;
                        Maybe<T> maybeOnErrorComplete = Single.defer(new cue0(lauVar, new MessageRequest("spotify:internal:cacheRefresh", triggerType, lauVar, null, "", m3q.f139697a, dynamicTagsMetadata, conflictResolutionStrategy, ase0Var), strM80436n, hue0Var)).doOnError(new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.CacheRefreshRequestEffectHandlerImpl.transformer.1.1.1
                            @Override // io.reactivex.rxjava3.functions.Consumer
                            public final void accept(Throwable th) {
                                ydj.m93454m("Error requesting refresh cache message ", th.getMessage());
                            }
                        }).onErrorComplete();
                        maybeOnErrorComplete.getClass();
                        return new MaybeIgnoreElementCompletable(maybeOnErrorComplete).m23307y();
                    }
                });
            }
        };
    }
}
