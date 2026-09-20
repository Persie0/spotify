package p204p;

import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class lov implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f135551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bov f135552c;

    public /* synthetic */ lov(niz nizVar, pov povVar, bov bovVar, int i) {
        this.f135550a = i;
        this.f135551b = nizVar;
        this.f135552c = bovVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        kov kovVar;
        nov novVar;
        d4l0 d4l0VarM34925s6;
        String str;
        int i = this.f135550a;
        w2a1 w2a1Var = w2a1.f247311a;
        bov bovVar = this.f135552c;
        niz nizVar = this.f135551b;
        yuk yukVar = yuk.f276404a;
        switch (i) {
            case 0:
                if (fbkVar instanceof kov) {
                    kovVar = (kov) fbkVar;
                    int i2 = kovVar.f124915b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kovVar.f124915b = i2 - Integer.MIN_VALUE;
                    } else {
                        kovVar = new kov(this, fbkVar);
                    }
                } else {
                    kovVar = new kov(this, fbkVar);
                }
                Object obj2 = kovVar.f124914a;
                int i3 = kovVar.f124915b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1Var;
                }
                bga.m29073P(obj2);
                znv znvVarM70491g = pov.m70491g(bovVar, (qho) obj, btj.f30877a, ov00.f170384a, bso0.f30364c);
                kovVar.f124915b = 1;
                return nizVar.emit(znvVarM70491g, kovVar) == yukVar ? yukVar : w2a1Var;
            default:
                if (fbkVar instanceof nov) {
                    novVar = (nov) fbkVar;
                    int i4 = novVar.f156799b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        novVar.f156799b = i4 - Integer.MIN_VALUE;
                    } else {
                        novVar = new nov(this, fbkVar);
                    }
                } else {
                    novVar = new nov(this, fbkVar);
                }
                Object obj3 = novVar.f156798a;
                int i5 = novVar.f156799b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                    return w2a1Var;
                }
                bga.m29073P(obj3);
                qho qhoVar = (qho) obj;
                boolean z = qhoVar instanceof oho;
                unv unvVar = null;
                oho ohoVar = z ? (oho) qhoVar : null;
                uei ueiVar = ohoVar != null ? (uei) ohoVar.f165512a : null;
                luh luhVar = ueiVar != null ? ueiVar.f229542a : null;
                pfa0 pfa0Var = ueiVar != null ? ueiVar.f229543b : null;
                if (luhVar != null) {
                    foo fooVar = luhVar.f137092c.f240988a;
                    tjo tjoVar = rov.f201355a;
                    lba0 lba0VarM58644y6 = lba0.m58644y6(fooVar.f71574a, bno.f28901j);
                    hze1 hze1Var = hze1.f96907f;
                    lba0VarM58644y6.getClass();
                    d4l0VarM34925s6 = new d4l0(lba0VarM58644y6, hze1Var).m34925s6(fooVar.f71575b);
                } else {
                    d4l0VarM34925s6 = null;
                }
                String str2 = bovVar.f29255a;
                String str3 = luhVar != null ? luhVar.f137091b : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (pfa0Var != null) {
                    tjo tjoVar2 = rov.f201355a;
                    t3r t3rVar = pfa0Var.f177017b;
                    String strM56834f = pfa0Var.f177016a;
                    s3r s3rVar = t3rVar instanceof s3r ? (s3r) t3rVar : null;
                    String str5 = s3rVar != null ? s3rVar.f205320a : null;
                    if (str5 != null) {
                        strM56834f = klh.m56834f(strM56834f, ", ", str5);
                    }
                    str = strM56834f;
                } else {
                    str = null;
                }
                boolean z2 = !z;
                if (d4l0VarM34925s6 != null) {
                    tjo tjoVar3 = rov.f201355a;
                    unvVar = new unv(d4l0VarM34925s6.f45197d.m58653r6().m40313f(hf71.f90619c, Locale.getDefault()), String.valueOf(d4l0VarM34925s6.m34923n6()));
                }
                znv znvVar = new znv(str2, str4, str, null, false, z2, btj.f30877a, ov00.f170384a, bso0.f30364c, unvVar);
                novVar.f156799b = 1;
                return nizVar.emit(znvVar, novVar) == yukVar ? yukVar : w2a1Var;
        }
    }
}
