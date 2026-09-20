package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ry2 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203798a;

    /* JADX INFO: renamed from: b */
    public int f203799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f203800c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry2(gh00 gh00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f203798a = i;
        this.f203800c = gh00Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f203798a) {
            case 0:
                return new ry2(this.f203800c, fbkVar, 0);
            case 1:
                return new ry2(this.f203800c, fbkVar, 1);
            case 2:
                return new ry2(this.f203800c, fbkVar, 2);
            case 3:
                return new ry2(this.f203800c, fbkVar, 3);
            case 4:
                return new ry2(this.f203800c, fbkVar, 4);
            case 5:
                return new ry2(this.f203800c, fbkVar, 5);
            case 6:
                return new ry2(this.f203800c, fbkVar, 6);
            case 7:
                return new ry2(this.f203800c, fbkVar, 7);
            case 8:
                return new ry2(this.f203800c, fbkVar, 8);
            case 9:
                return new ry2(this.f203800c, fbkVar, 9);
            default:
                return new ry2(this.f203800c, fbkVar, 10);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f203798a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((ry2) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f203798a) {
            case 0:
                int i = this.f203799b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke = this.f203800c.invoke(this);
                yuk yukVar = yuk.f276404a;
                return objInvoke == yukVar ? yukVar : objInvoke;
            case 1:
                int i2 = this.f203799b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke2 = this.f203800c.invoke(this);
                yuk yukVar2 = yuk.f276404a;
                return objInvoke2 == yukVar2 ? yukVar2 : objInvoke2;
            case 2:
                int i3 = this.f203799b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f203799b = 1;
                    Object objInvoke3 = this.f203800c.invoke(this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objInvoke3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 3:
                int i4 = this.f203799b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    this.f203799b = 1;
                    Object objInvoke4 = this.f203800c.invoke(this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objInvoke4 == yukVar4) {
                        return yukVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 4:
                int i5 = this.f203799b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke5 = this.f203800c.invoke(this);
                yuk yukVar5 = yuk.f276404a;
                return objInvoke5 == yukVar5 ? yukVar5 : objInvoke5;
            case 5:
                int i6 = this.f203799b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke6 = this.f203800c.invoke(this);
                yuk yukVar6 = yuk.f276404a;
                return objInvoke6 == yukVar6 ? yukVar6 : objInvoke6;
            case 6:
                int i7 = this.f203799b;
                if (i7 == 0) {
                    bga.m29073P(obj);
                    this.f203799b = 1;
                    obj = this.f203800c.invoke(this);
                    yuk yukVar7 = yuk.f276404a;
                    if (obj == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                yev0 yev0Var = (yev0) obj;
                List listSubList = yev0Var.f272067a;
                if (listSubList.size() > 9) {
                    listSubList = listSubList.subList(0, 9);
                }
                return new yev0(yev0Var.f272068b, listSubList);
            case 7:
                int i8 = this.f203799b;
                if (i8 == 0) {
                    bga.m29073P(obj);
                    this.f203799b = 1;
                    Object objInvoke7 = this.f203800c.invoke(this);
                    yuk yukVar8 = yuk.f276404a;
                    if (objInvoke7 == yukVar8) {
                        return yukVar8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 8:
                int i9 = this.f203799b;
                if (i9 == 0) {
                    bga.m29073P(obj);
                    this.f203799b = 1;
                    Object objInvoke8 = this.f203800c.invoke(this);
                    yuk yukVar9 = yuk.f276404a;
                    if (objInvoke8 == yukVar9) {
                        return yukVar9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 9:
                int i10 = this.f203799b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke9 = this.f203800c.invoke(this);
                yuk yukVar10 = yuk.f276404a;
                return objInvoke9 == yukVar10 ? yukVar10 : objInvoke9;
            default:
                int i11 = this.f203799b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                this.f203799b = 1;
                Object objInvoke10 = this.f203800c.invoke(this);
                yuk yukVar11 = yuk.f276404a;
                return objInvoke10 == yukVar11 ? yukVar11 : objInvoke10;
        }
    }
}
