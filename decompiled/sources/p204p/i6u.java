package p204p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class i6u implements s4u {

    /* JADX INFO: renamed from: a */
    public final zon f99329a;

    /* JADX INFO: renamed from: b */
    public final gt0 f99330b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f99331c;

    /* JADX INFO: renamed from: d */
    public final ie50 f99332d;

    /* JADX INFO: renamed from: e */
    public final q6u f99333e;

    public i6u(zon zonVar, gt0 gt0Var, h4t0 h4t0Var, ie50 ie50Var, q6u q6uVar) {
        this.f99329a = zonVar;
        this.f99330b = gt0Var;
        this.f99331c = h4t0Var;
        this.f99332d = ie50Var;
        this.f99333e = q6uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p204p.s4u
    /* JADX INFO: renamed from: a */
    public final Object mo43764a(fh0 fh0Var, fbk fbkVar) {
        h6u h6uVar;
        if (fbkVar instanceof h6u) {
            h6uVar = (h6u) fbkVar;
            int i = h6uVar.f88255d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6uVar.f88255d = i - Integer.MIN_VALUE;
            } else {
                h6uVar = new h6u(this, (ibk) fbkVar);
            }
        } else {
            h6uVar = new h6u(this, (ibk) fbkVar);
        }
        Object objM89557A = h6uVar.f88253b;
        int i2 = h6uVar.f88255d;
        int i3 = 1;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                a531 a531Var = new a531(this.f99329a.m96631a("embedded-npv-video"), this.f99330b, (lt0) this.f99331c.get());
                h6uVar.f88252a = fh0Var;
                h6uVar.f88255d = 1;
                n5q n5qVar = xsr.f265651a;
                objM89557A = x0h1.m89557A(pvb0.f181680a, new yw41(a531Var, fh0Var, null, i3), h6uVar);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fh0Var = h6uVar.f88252a;
                bga.m29073P(objM89557A);
            }
            ifq0 ifq0Var = (ifq0) objM89557A;
            if (ifq0Var != null) {
                return ifq0Var;
            }
            throw new IllegalStateException("Prebuffering failed for ad " + so0.m78599d(fh0Var.f69506a));
        } catch (Exception e) {
            qlg1.m73220y(h6uVar.getContext());
            Logger.m3973i(e.getMessage(), e);
            return new c6x0(e);
        }
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: b */
    public final vh00 mo43765b() {
        return new svr(this, 19);
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: c */
    public final boolean mo43766c(fh0 fh0Var) {
        return fh0Var.f69504Z == Format.VIDEO;
    }
}
