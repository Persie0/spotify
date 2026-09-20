package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;

/* JADX INFO: loaded from: classes7.dex */
public final class t9c extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218240a;

    /* JADX INFO: renamed from: b */
    public int f218241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ojq f218242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9c(ojq ojqVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f218240a = i;
        this.f218242c = ojqVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f218240a) {
            case 0:
                return new t9c(this.f218242c, fbkVar, 0);
            case 1:
                return new t9c(this.f218242c, fbkVar, 1);
            case 2:
                return new t9c(this.f218242c, fbkVar, 2);
            default:
                return new t9c(this.f218242c, fbkVar, 3);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f218240a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((t9c) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f218240a) {
            case 0:
                int i = this.f218241b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f218241b = 1;
                    obj = this.f218242c.mo26597I(this);
                    yuk yukVar = yuk.f276404a;
                    if (obj == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                o2x0 o2x0Var = (o2x0) obj;
                if ((o2x0Var != null ? (ResolvedHome) o2x0Var.f161172b : null) != null) {
                    return obj;
                }
                return null;
            case 1:
                int i2 = this.f218241b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f218241b = 1;
                Object objMo26597I = this.f218242c.mo26597I(this);
                yuk yukVar2 = yuk.f276404a;
                return objMo26597I == yukVar2 ? yukVar2 : objMo26597I;
            case 2:
                int i3 = this.f218241b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f218241b = 1;
                Object objMo26597I2 = this.f218242c.mo26597I(this);
                yuk yukVar3 = yuk.f276404a;
                return objMo26597I2 == yukVar3 ? yukVar3 : objMo26597I2;
            default:
                int i4 = this.f218241b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f218241b = 1;
                Object objMo26597I3 = this.f218242c.mo26597I(this);
                yuk yukVar4 = yuk.f276404a;
                return objMo26597I3 == yukVar4 ? yukVar4 : objMo26597I3;
        }
    }
}
