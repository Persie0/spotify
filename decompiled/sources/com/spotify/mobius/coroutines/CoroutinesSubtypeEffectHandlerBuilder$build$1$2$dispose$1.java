package com.spotify.mobius.coroutines;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p204p.bga;
import p204p.fbk;
import p204p.kpo;
import p204p.lsi0;
import p204p.mb61;
import p204p.omc;
import p204p.th00;
import p204p.w2a1;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: loaded from: classes8.dex */
@kpo(m57054c = "com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1", m57055f = "CoroutinesSubtypeEffectHandlerBuilder.kt", m57056l = {391}, m57057m = "invokeSuspend")
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m24212d2 = {"", "F", "E", "Lp/xuk;", "Lp/w2a1;", "<anonymous>", "(Lp/xuk;)V"}, m24213k = 3, m24214mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public lsi0 f5705a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f5706b;

    /* JADX INFO: renamed from: c */
    public int f5707c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lsi0 f5708d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LinkedHashMap f5709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1(lsi0 lsi0Var, LinkedHashMap linkedHashMap, fbk fbkVar) {
        super(2, fbkVar);
        this.f5708d = lsi0Var;
        this.f5709e = linkedHashMap;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1(this.f5708d, this.f5709e, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        lsi0 lsi0Var;
        int i = this.f5707c;
        if (i == 0) {
            bga.m29073P(obj);
            lsi0 lsi0Var2 = this.f5708d;
            this.f5705a = lsi0Var2;
            linkedHashMap = this.f5709e;
            this.f5706b = linkedHashMap;
            this.f5707c = 1;
            Object objMo54248a = lsi0Var2.mo54248a(this);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
            lsi0Var = lsi0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = this.f5706b;
            lsi0Var = this.f5705a;
            bga.m29073P(obj);
        }
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((omc) it.next()).mo30210A(null);
            }
            linkedHashMap.clear();
            return w2a1.f247311a;
        } finally {
            lsi0Var.mo54249c(null);
        }
    }
}
