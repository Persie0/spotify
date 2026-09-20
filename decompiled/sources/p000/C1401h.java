package p000;

import p204p.bga;
import p204p.fbk;
import p204p.mb61;
import p204p.th00;
import p204p.w2a1;
import p204p.wf11;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes9.dex */
public final class C1401h extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7150a;

    /* JADX INFO: renamed from: b */
    public int f7151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wf11 f7152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1401h(wf11 wf11Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f7150a = i;
        this.f7152c = wf11Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f7150a) {
            case 0:
                return new C1401h(this.f7152c, fbkVar, 0);
            case 1:
                return new C1401h(this.f7152c, fbkVar, 1);
            case 2:
                return new C1401h(this.f7152c, fbkVar, 2);
            case 3:
                return new C1401h(this.f7152c, fbkVar, 3);
            case 4:
                return new C1401h(this.f7152c, fbkVar, 4);
            case 5:
                return new C1401h(this.f7152c, fbkVar, 5);
            case 6:
                return new C1401h(this.f7152c, fbkVar, 6);
            case 7:
                return new C1401h(this.f7152c, fbkVar, 7);
            case 8:
                return new C1401h(this.f7152c, fbkVar, 8);
            case 9:
                return new C1401h(this.f7152c, fbkVar, 9);
            case 10:
                return new C1401h(this.f7152c, fbkVar, 10);
            case 11:
                return new C1401h(this.f7152c, fbkVar, 11);
            case 12:
                return new C1401h(this.f7152c, fbkVar, 12);
            case 13:
                return new C1401h(this.f7152c, fbkVar, 13);
            case 14:
                return new C1401h(this.f7152c, fbkVar, 14);
            case 15:
                return new C1401h(this.f7152c, fbkVar, 15);
            case 16:
                return new C1401h(this.f7152c, fbkVar, 16);
            case 17:
                return new C1401h(this.f7152c, fbkVar, 17);
            case 18:
                return new C1401h(this.f7152c, fbkVar, 18);
            case 19:
                return new C1401h(this.f7152c, fbkVar, 19);
            case 20:
                return new C1401h(this.f7152c, fbkVar, 20);
            case 21:
                return new C1401h(this.f7152c, fbkVar, 21);
            case 22:
                return new C1401h(this.f7152c, fbkVar, 22);
            case 23:
                return new C1401h(this.f7152c, fbkVar, 23);
            default:
                return new C1401h(this.f7152c, fbkVar, 24);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f7150a) {
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
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
        }
        return ((C1401h) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f7150a) {
            case 0:
                int i = this.f7151b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h = this.f7152c.m87926h(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM87926h == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i2 = this.f7151b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h2 = this.f7152c.m87926h(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM87926h2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 2:
                int i3 = this.f7151b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h3 = this.f7152c.m87926h(this);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM87926h3 == yukVar3) {
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
                int i4 = this.f7151b;
                if (i4 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87929k = this.f7152c.m87929k(this);
                    yuk yukVar4 = yuk.f276404a;
                    if (objM87929k == yukVar4) {
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
                int i5 = this.f7151b;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h4 = this.f7152c.m87926h(this);
                    yuk yukVar5 = yuk.f276404a;
                    if (objM87926h4 == yukVar5) {
                        return yukVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 5:
                int i6 = this.f7151b;
                if (i6 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h5 = this.f7152c.m87926h(this);
                    yuk yukVar6 = yuk.f276404a;
                    if (objM87926h5 == yukVar6) {
                        return yukVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 6:
                int i7 = this.f7151b;
                if (i7 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h6 = this.f7152c.m87926h(this);
                    yuk yukVar7 = yuk.f276404a;
                    if (objM87926h6 == yukVar7) {
                        return yukVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 7:
                int i8 = this.f7151b;
                if (i8 == 0) {
                    bga.m29073P(obj);
                    wf11 wf11Var = this.f7152c;
                    boolean z = wf11Var.f250666c;
                    yuk yukVar8 = yuk.f276404a;
                    if (z) {
                        this.f7151b = 2;
                        if (wf11Var.m87928j(this) == yukVar8) {
                            return yukVar8;
                        }
                    } else {
                        this.f7151b = 1;
                        if (wf11Var.m87926h(this) == yukVar8) {
                            return yukVar8;
                        }
                    }
                } else {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 8:
                int i9 = this.f7151b;
                if (i9 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87920b = this.f7152c.m87920b(this);
                    yuk yukVar9 = yuk.f276404a;
                    if (objM87920b == yukVar9) {
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
                int i10 = this.f7151b;
                if (i10 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87929k2 = this.f7152c.m87929k(this);
                    yuk yukVar10 = yuk.f276404a;
                    if (objM87929k2 == yukVar10) {
                        return yukVar10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 10:
                int i11 = this.f7151b;
                if (i11 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87920b2 = this.f7152c.m87920b(this);
                    yuk yukVar11 = yuk.f276404a;
                    if (objM87920b2 == yukVar11) {
                        return yukVar11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 11:
                int i12 = this.f7151b;
                if (i12 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87928j = this.f7152c.m87928j(this);
                    yuk yukVar12 = yuk.f276404a;
                    if (objM87928j == yukVar12) {
                        return yukVar12;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 12:
                int i13 = this.f7151b;
                if (i13 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h7 = this.f7152c.m87926h(this);
                    yuk yukVar13 = yuk.f276404a;
                    if (objM87926h7 == yukVar13) {
                        return yukVar13;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 13:
                int i14 = this.f7151b;
                if (i14 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h8 = this.f7152c.m87926h(this);
                    yuk yukVar14 = yuk.f276404a;
                    if (objM87926h8 == yukVar14) {
                        return yukVar14;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 14:
                int i15 = this.f7151b;
                if (i15 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87928j2 = this.f7152c.m87928j(this);
                    yuk yukVar15 = yuk.f276404a;
                    if (objM87928j2 == yukVar15) {
                        return yukVar15;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 15:
                int i16 = this.f7151b;
                if (i16 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h9 = this.f7152c.m87926h(this);
                    yuk yukVar16 = yuk.f276404a;
                    if (objM87926h9 == yukVar16) {
                        return yukVar16;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 16:
                int i17 = this.f7151b;
                if (i17 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87929k3 = this.f7152c.m87929k(this);
                    yuk yukVar17 = yuk.f276404a;
                    if (objM87929k3 == yukVar17) {
                        return yukVar17;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 17:
                int i18 = this.f7151b;
                if (i18 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h10 = this.f7152c.m87926h(this);
                    yuk yukVar18 = yuk.f276404a;
                    if (objM87926h10 == yukVar18) {
                        return yukVar18;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 18:
                int i19 = this.f7151b;
                if (i19 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87920b3 = this.f7152c.m87920b(this);
                    yuk yukVar19 = yuk.f276404a;
                    if (objM87920b3 == yukVar19) {
                        return yukVar19;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 19:
                int i20 = this.f7151b;
                if (i20 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87929k4 = this.f7152c.m87929k(this);
                    yuk yukVar20 = yuk.f276404a;
                    if (objM87929k4 == yukVar20) {
                        return yukVar20;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 20:
                int i21 = this.f7151b;
                if (i21 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87920b4 = this.f7152c.m87920b(this);
                    yuk yukVar21 = yuk.f276404a;
                    if (objM87920b4 == yukVar21) {
                        return yukVar21;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 21:
                int i22 = this.f7151b;
                if (i22 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87928j3 = this.f7152c.m87928j(this);
                    yuk yukVar22 = yuk.f276404a;
                    if (objM87928j3 == yukVar22) {
                        return yukVar22;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 22:
                int i23 = this.f7151b;
                if (i23 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87929k5 = this.f7152c.m87929k(this);
                    yuk yukVar23 = yuk.f276404a;
                    if (objM87929k5 == yukVar23) {
                        return yukVar23;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 23:
                int i24 = this.f7151b;
                if (i24 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h11 = this.f7152c.m87926h(this);
                    yuk yukVar24 = yuk.f276404a;
                    if (objM87926h11 == yukVar24) {
                        return yukVar24;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i25 = this.f7151b;
                if (i25 == 0) {
                    bga.m29073P(obj);
                    this.f7151b = 1;
                    Object objM87926h12 = this.f7152c.m87926h(this);
                    yuk yukVar25 = yuk.f276404a;
                    if (objM87926h12 == yukVar25) {
                        return yukVar25;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
