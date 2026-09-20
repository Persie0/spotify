package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;

/* JADX INFO: loaded from: classes5.dex */
public final class nz90 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public int f160040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pz90 f160041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BrowseEffect.Load f160042c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f160043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz90(pz90 pz90Var, BrowseEffect.Load load, boolean z, fbk fbkVar) {
        super(2, fbkVar);
        this.f160041b = pz90Var;
        this.f160042c = load;
        this.f160043d = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new nz90(this.f160041b, this.f160042c, this.f160043d, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((nz90) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f160040a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        boa boaVar = this.f160041b.f183640b;
        laa0 loadingStrategy = this.f160042c.getLoadingStrategy();
        this.f160040a = 1;
        Object objMo30074c = boaVar.mo30074c(loadingStrategy, this.f160043d, this);
        yuk yukVar = yuk.f276404a;
        return objMo30074c == yukVar ? yukVar : objMo30074c;
    }
}
