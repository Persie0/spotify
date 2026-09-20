package com.spotify.mobius.coroutines;

import com.spotify.mobius.runners.WorkRunner;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p204p.bga;
import p204p.c9k;
import p204p.fbk;
import p204p.juk;
import p204p.kk40;
import p204p.kpo;
import p204p.mb61;
import p204p.th00;
import p204p.w2a1;
import p204p.x0h1;
import p204p.xuk;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/mobius/coroutines/DispatcherWorker;", "Lcom/spotify/mobius/runners/WorkRunner;", "mobius-coroutines"}, m24213k = 1, m24214mv = {1, 9, 0}, m24216xi = 48)
public final class DispatcherWorker implements WorkRunner {

    /* JADX INFO: renamed from: a */
    public final c9k f5710a;

    /* JADX INFO: renamed from: com.spotify.mobius.coroutines.DispatcherWorker$post$1 */
    @kpo(m57054c = "com.spotify.mobius.coroutines.DispatcherWorker$post$1", m57055f = "DispatcherWorker.kt", m57056l = {}, m57057m = "invokeSuspend")
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m24212d2 = {"Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
    final class C10411 extends mb61 implements th00 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f5712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10411(Runnable runnable, fbk fbkVar) {
            super(2, fbkVar);
            this.f5712b = runnable;
        }

        @Override // p204p.ly8
        public final fbk create(Object obj, fbk fbkVar) {
            return DispatcherWorker.this.new C10411(this.f5712b, fbkVar);
        }

        @Override // p204p.th00
        public final Object invoke(Object obj, Object obj2) {
            C10411 c10411 = (C10411) create((xuk) obj, (fbk) obj2);
            w2a1 w2a1Var = w2a1.f247311a;
            c10411.invokeSuspend(w2a1Var);
            return w2a1Var;
        }

        @Override // p204p.ly8
        public final Object invokeSuspend(Object obj) {
            bga.m29073P(obj);
            if (kk40.m56650L(DispatcherWorker.this.f5710a)) {
                this.f5712b.run();
            }
            return w2a1.f247311a;
        }
    }

    public DispatcherWorker(juk jukVar) {
        this.f5710a = kk40.m56661c(jukVar);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        kk40.m56680v(this.f5710a, new CancellationException("DispatcherWorker disposed"));
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        x0h1.m89578u(this.f5710a, null, 0, new C10411(runnable, null), 3);
    }
}
