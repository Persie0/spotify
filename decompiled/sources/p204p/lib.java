package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes5.dex */
public final class lib extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f133757a;

    /* JADX INFO: renamed from: b */
    public int f133758b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Intent f133759c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rib f133760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lib(rib ribVar, fbk fbkVar, int i) {
        super(3, fbkVar);
        this.f133757a = i;
        this.f133760d = ribVar;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        Intent intent = (Intent) obj;
        fbk fbkVar = (fbk) obj3;
        switch (this.f133757a) {
            case 0:
                lib libVar = new lib(this.f133760d, fbkVar, 0);
                libVar.f133759c = intent;
                return libVar.invokeSuspend(w2a1.f247311a);
            default:
                lib libVar2 = new lib(this.f133760d, fbkVar, 1);
                libVar2.f133759c = intent;
                return libVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f133757a) {
            case 0:
                Intent intent = this.f133759c;
                int i = this.f133758b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f133759c = null;
                this.f133758b = 1;
                Object objM75583c = rib.m75583c(this.f133760d, intent, this);
                yuk yukVar = yuk.f276404a;
                return objM75583c == yukVar ? yukVar : objM75583c;
            default:
                Intent intent2 = this.f133759c;
                int i2 = this.f133758b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f133759c = null;
                this.f133758b = 1;
                Object objM75582b = rib.m75582b(this.f133760d, intent2, this);
                yuk yukVar2 = yuk.f276404a;
                return objM75582b == yukVar2 ? yukVar2 : objM75582b;
        }
    }
}
