package p204p;

/* JADX INFO: renamed from: p.xs */
/* JADX INFO: loaded from: classes4.dex */
public final class C2587xs implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f265435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f265436b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2065kt f265437c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2188ns f265438d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2226os f265439e;

    public /* synthetic */ C2587xs(niz nizVar, C2065kt c2065kt, InterfaceC2188ns interfaceC2188ns, C2226os c2226os, int i) {
        this.f265435a = i;
        this.f265436b = nizVar;
        this.f265437c = c2065kt;
        this.f265438d = interfaceC2188ns;
        this.f265439e = c2226os;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        C2546ws c2546ws;
        C2661zs c2661zs;
        switch (this.f265435a) {
            case 0:
                if (fbkVar instanceof C2546ws) {
                    c2546ws = (C2546ws) fbkVar;
                    int i = c2546ws.f254470b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c2546ws.f254470b = i - Integer.MIN_VALUE;
                    } else {
                        c2546ws = new C2546ws(this, fbkVar);
                    }
                } else {
                    c2546ws = new C2546ws(this, fbkVar);
                }
                Object obj2 = c2546ws.f254469a;
                int i2 = c2546ws.f254470b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    InterfaceC2426ts interfaceC2426tsM57262B = C2065kt.m57262B(this.f265437c, (C2138ms) this.f265438d, this.f265439e, zBooleanValue);
                    c2546ws.f254470b = 1;
                    Object objEmit = this.f265436b.emit(interfaceC2426tsM57262B, c2546ws);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof C2661zs) {
                    c2661zs = (C2661zs) fbkVar;
                    int i3 = c2661zs.f285792b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c2661zs.f285792b = i3 - Integer.MIN_VALUE;
                    } else {
                        c2661zs = new C2661zs(this, fbkVar);
                    }
                } else {
                    c2661zs = new C2661zs(this, fbkVar);
                }
                Object obj3 = c2661zs.f285791a;
                int i4 = c2661zs.f285792b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    InterfaceC2426ts interfaceC2426tsM57261A = C2065kt.m57261A(this.f265437c, (C2101ls) this.f265438d, this.f265439e, zBooleanValue2);
                    c2661zs.f285792b = 1;
                    Object objEmit2 = this.f265436b.emit(interfaceC2426tsM57261A, c2661zs);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
