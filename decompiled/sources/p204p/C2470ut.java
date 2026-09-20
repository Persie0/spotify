package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.ut */
/* JADX INFO: loaded from: classes4.dex */
public final class C2470ut implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sir0 f233731b;

    public /* synthetic */ C2470ut(sir0 sir0Var, int i) {
        this.f233730a = i;
        this.f233731b = sir0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        raf rafVar;
        mjz mjzVar;
        njz njzVar;
        switch (this.f233730a) {
            case 0:
                Object objMo30229d = this.f233731b.mo30229d((List) obj, fbkVar);
                return objMo30229d == yuk.f276404a ? objMo30229d : w2a1.f247311a;
            case 1:
                Object objMo30229d2 = this.f233731b.mo30229d(obj, fbkVar);
                return objMo30229d2 == yuk.f276404a ? objMo30229d2 : w2a1.f247311a;
            case 2:
                if (fbkVar instanceof raf) {
                    rafVar = (raf) fbkVar;
                    int i = rafVar.f197300c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rafVar.f197300c = i - Integer.MIN_VALUE;
                    } else {
                        rafVar = new raf(this, fbkVar);
                    }
                } else {
                    rafVar = new raf(this, fbkVar);
                }
                Object obj2 = rafVar.f197298a;
                int i2 = rafVar.f197300c;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    bqz0 bqz0VarMo71315c = this.f233731b.mo71315c();
                    if (obj == null) {
                        obj = qkf1.f189548a;
                    }
                    rafVar.f197300c = 1;
                    Object objMo30229d3 = bqz0VarMo71315c.mo30229d(obj, rafVar);
                    yuk yukVar = yuk.f276404a;
                    if (objMo30229d3 == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            case 3:
                Object objMo30229d4 = this.f233731b.mo30229d((a7x0) obj, fbkVar);
                return objMo30229d4 == yuk.f276404a ? objMo30229d4 : w2a1.f247311a;
            case 4:
                Object objMo30229d5 = this.f233731b.mo30229d((vda1) obj, fbkVar);
                return objMo30229d5 == yuk.f276404a ? objMo30229d5 : w2a1.f247311a;
            case 5:
                Object objMo30229d6 = this.f233731b.mo30229d(new ed01(Boolean.valueOf(((a5j) obj) == a5j.f12526c)), fbkVar);
                return objMo30229d6 == yuk.f276404a ? objMo30229d6 : w2a1.f247311a;
            case 6:
                if (fbkVar instanceof mjz) {
                    mjzVar = (mjz) fbkVar;
                    int i3 = mjzVar.f144431c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mjzVar.f144431c = i3 - Integer.MIN_VALUE;
                    } else {
                        mjzVar = new mjz(this, fbkVar);
                    }
                } else {
                    mjzVar = new mjz(this, fbkVar);
                }
                Object obj3 = mjzVar.f144429a;
                int i4 = mjzVar.f144431c;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    if (obj == null) {
                        obj = qkf1.f189548a;
                    }
                    mjzVar.f144431c = 1;
                    Object objMo30229d7 = this.f233731b.mo30229d(obj, mjzVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objMo30229d7 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
            case 7:
                if (fbkVar instanceof njz) {
                    njzVar = (njz) fbkVar;
                    int i5 = njzVar.f154707c;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        njzVar.f154707c = i5 - Integer.MIN_VALUE;
                    } else {
                        njzVar = new njz(this, fbkVar);
                    }
                } else {
                    njzVar = new njz(this, fbkVar);
                }
                Object obj4 = njzVar.f154705a;
                int i6 = njzVar.f154707c;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    if (obj == null) {
                        obj = qkf1.f189548a;
                    }
                    njzVar.f154707c = 1;
                    Object objMo30229d8 = this.f233731b.mo30229d(obj, njzVar);
                    yuk yukVar3 = yuk.f276404a;
                    if (objMo30229d8 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
            case 8:
                Object objMo30229d9 = this.f233731b.mo30229d((fxx) obj, fbkVar);
                return objMo30229d9 == yuk.f276404a ? objMo30229d9 : w2a1.f247311a;
            case 9:
                Object objMo30229d10 = this.f233731b.mo30229d((fxx) obj, fbkVar);
                return objMo30229d10 == yuk.f276404a ? objMo30229d10 : w2a1.f247311a;
            case 10:
                this.f233731b.mo30231j((p5n0) obj);
                return w2a1.f247311a;
            case 11:
                Object objMo30229d11 = this.f233731b.mo30229d((fd01) obj, fbkVar);
                return objMo30229d11 == yuk.f276404a ? objMo30229d11 : w2a1.f247311a;
            default:
                Object objMo30229d12 = this.f233731b.mo30229d((p2x0) obj, fbkVar);
                return objMo30229d12 == yuk.f276404a ? objMo30229d12 : w2a1.f247311a;
        }
    }
}
