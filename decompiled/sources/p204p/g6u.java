package p204p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.base.java.logging.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g6u implements s4u {

    /* JADX INFO: renamed from: h */
    public static lt0 f77113h;

    /* JADX INFO: renamed from: a */
    public final ra9 f77114a;

    /* JADX INFO: renamed from: b */
    public final gt0 f77115b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f77116c;

    /* JADX INFO: renamed from: d */
    public final List f77117d;

    /* JADX INFO: renamed from: e */
    public final s2o f77118e;

    /* JADX INFO: renamed from: f */
    public final xst f77119f;

    /* JADX INFO: renamed from: g */
    public final tgq f77120g;

    public g6u(ra9 ra9Var, gt0 gt0Var, h4t0 h4t0Var, List list, s2o s2oVar, xst xstVar, tgq tgqVar) {
        this.f77114a = ra9Var;
        this.f77115b = gt0Var;
        this.f77116c = h4t0Var;
        this.f77117d = list;
        this.f77118e = s2oVar;
        this.f77119f = xstVar;
        this.f77120g = tgqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p204p.s4u
    /* JADX INFO: renamed from: a */
    public final Object mo43764a(fh0 fh0Var, fbk fbkVar) {
        f6u f6uVar;
        if (fbkVar instanceof f6u) {
            f6uVar = (f6u) fbkVar;
            int i = f6uVar.f66503d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6uVar.f66503d = i - Integer.MIN_VALUE;
            } else {
                f6uVar = new f6u(this, (ibk) fbkVar);
            }
        } else {
            f6uVar = new f6u(this, (ibk) fbkVar);
        }
        Object objM89557A = f6uVar.f66501b;
        int i2 = f6uVar.f66503d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                lt0 lt0Var = f77113h;
                if (lt0Var == null) {
                    Object obj = this.f77116c.get();
                    f77113h = (lt0) obj;
                    lt0Var = (lt0) obj;
                }
                lt0 lt0Var2 = lt0Var;
                ra9 ra9Var = this.f77114a;
                List list = this.f77117d;
                gt0 gt0Var = this.f77115b;
                wj50.m88279p(lt0Var2);
                be41 be41Var = new be41(ra9Var, list, gt0Var, lt0Var2, 14);
                f6uVar.f66500a = fh0Var;
                f6uVar.f66503d = 1;
                n5q n5qVar = xsr.f265651a;
                objM89557A = x0h1.m89557A(pvb0.f181680a, new yw41(be41Var, fh0Var, null, 2), f6uVar);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fh0Var = f6uVar.f66500a;
                bga.m29073P(objM89557A);
            }
            ifq0 ifq0Var = (ifq0) objM89557A;
            if (ifq0Var != null) {
                return ifq0Var;
            }
            throw new IllegalStateException("Prebuffering failed for ad " + so0.m78599d(fh0Var.f69506a));
        } catch (Exception e) {
            qlg1.m73220y(f6uVar.getContext());
            Logger.m3973i(e.getMessage(), e);
            return new c6x0(e);
        }
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: b */
    public final vh00 mo43765b() {
        return new svr(this, 18);
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: c */
    public final boolean mo43766c(fh0 fh0Var) {
        return fh0Var.f69504Z == Format.VIDEO;
    }
}
