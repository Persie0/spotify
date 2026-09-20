package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PresentationOperation;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import p204p.adl0;
import p204p.edb;
import p204p.hwa;
import p204p.jal0;
import p204p.jxa;
import p204p.mwh0;
import p204p.q3x0;
import p204p.rve0;
import p204p.sve0;
import p204p.sza;
import p204p.w9h1;

/* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0984i {

    /* JADX INFO: renamed from: a */
    public final hwa f5488a;

    /* JADX INFO: renamed from: b */
    public final sza f5489b;

    /* JADX INFO: renamed from: c */
    public final adl0 f5490c;

    /* JADX INFO: renamed from: d */
    public final jal0 f5491d;

    public C0984i(hwa hwaVar, sza szaVar, adl0 adl0Var, jal0 jal0Var) {
        this.f5488a = hwaVar;
        this.f5489b = szaVar;
        this.f5490c = adl0Var;
        this.f5491d = jal0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Consumer m15310a() {
        return new Consumer() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.DispatchMessageViewResponseEffectHandlerImpl$consumer$1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(jxa jxaVar) {
                w9h1 w9h1Var = jxaVar.f117080b;
                if (w9h1Var instanceof rve0) {
                    rve0 rve0Var = (rve0) w9h1Var;
                    this.this$0.f5491d.m52842a(mwh0.m63060q(rve0Var.m76479D()), rve0Var.m76478C(), rve0Var.m76477B());
                    return;
                }
                if (!(w9h1Var instanceof sve0)) {
                    throw new NoWhenBranchMatchedException();
                }
                hwa hwaVar = this.this$0.f5488a;
                sve0 sve0Var = (sve0) w9h1Var;
                hwaVar.f95894a.put(sve0Var.m79441C().f204102a, new WeakReference(sve0Var.m79440B()));
                sza szaVar = this.this$0.f5489b;
                q3x0 q3x0Var = (q3x0) szaVar.f215440a.get(sve0Var.m79441C().f204102a);
                if (q3x0Var == null) {
                    Logger.m3973i(edb.m38564m("CMP: Response context not found while in ViewDispatched state for requestId ", sve0Var.m79441C().f204102a), new Object[0]);
                    return;
                }
                ((ReplaySubject) q3x0Var.m72131a()).onNext(new PresentationOperation.Present(sve0Var.m79440B(), this.this$0.f5490c));
            }
        };
    }
}
