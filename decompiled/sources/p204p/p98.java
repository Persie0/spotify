package p204p;

import com.spotify.pamviewservice.p119v1.proto.PremiumPlanRow;

/* JADX INFO: loaded from: classes9.dex */
public final class p98 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ di41 f175179b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sir0 f175180c;

    public /* synthetic */ p98(di41 di41Var, sir0 sir0Var, int i) {
        this.f175178a = i;
        this.f175179b = di41Var;
        this.f175180c = sir0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r5.f175180c.mo30229d(r6, r0) == r4) goto L28;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m69364b(PremiumPlanRow premiumPlanRow, fbk fbkVar) {
        o98 o98Var;
        if (fbkVar instanceof o98) {
            o98Var = (o98) fbkVar;
            int i = o98Var.f162959d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o98Var.f162959d = i - Integer.MIN_VALUE;
            } else {
                o98Var = new o98(this, fbkVar);
            }
        } else {
            o98Var = new o98(this, fbkVar);
        }
        Object obj = o98Var.f162957b;
        int i2 = o98Var.f162959d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            o98Var.f162956a = premiumPlanRow;
            o98Var.f162959d = 1;
            if (qlg1.m73213r(this.f175179b, o98Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            premiumPlanRow = o98Var.f162956a;
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        String title = premiumPlanRow.m16598o().getTitle();
        Boolean boolValueOf = Boolean.valueOf(!(title == null || wl51.m88460J0(title)));
        o98Var.f162956a = null;
        o98Var.f162959d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        vq40 vq40Var;
        switch (this.f175178a) {
            case 0:
                return m69364b((PremiumPlanRow) obj, fbkVar);
            default:
                if (fbkVar instanceof vq40) {
                    vq40Var = (vq40) fbkVar;
                    int i = vq40Var.f243873d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vq40Var.f243873d = i - Integer.MIN_VALUE;
                    } else {
                        vq40Var = new vq40(this, fbkVar);
                    }
                } else {
                    vq40Var = new vq40(this, fbkVar);
                }
                Object obj2 = vq40Var.f243871b;
                int i2 = vq40Var.f243873d;
                yuk yukVar = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        obj = vq40Var.f243870a;
                        bga.m29073P(obj2);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj2);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj2);
                vq40Var.f243870a = obj;
                vq40Var.f243873d = 1;
                if (qlg1.m73213r(this.f175179b, vq40Var) == yukVar) {
                    return yukVar;
                }
                vq40Var.f243870a = null;
                vq40Var.f243873d = 2;
                if (this.f175180c.mo30229d(obj, vq40Var) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
        }
    }
}
