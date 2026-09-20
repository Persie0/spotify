package p204p;

import com.spotify.adsinternal.adscore.model.Format;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class q4u implements s4u {

    /* JADX INFO: renamed from: a */
    public final e940 f185346a;

    /* JADX INFO: renamed from: b */
    public final he50 f185347b;

    /* JADX INFO: renamed from: c */
    public final om0 f185348c;

    public q4u(e940 e940Var, he50 he50Var, om0 om0Var) {
        this.f185346a = e940Var;
        this.f185347b = he50Var;
        this.f185348c = om0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.s4u
    /* JADX INFO: renamed from: a */
    public final Object mo43764a(fh0 fh0Var, fbk fbkVar) {
        p4u p4uVar;
        Object c6x0Var;
        if (fbkVar instanceof p4u) {
            p4uVar = (p4u) fbkVar;
            int i = p4uVar.f174010d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p4uVar.f174010d = i - Integer.MIN_VALUE;
            } else {
                p4uVar = new p4u(this, (ibk) fbkVar);
            }
        } else {
            p4uVar = new p4u(this, (ibk) fbkVar);
        }
        Object obj = p4uVar.f174008b;
        int i2 = p4uVar.f174010d;
        Object obj2 = w2a1.f247311a;
        int i3 = 1;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                String strM92096q = xtm0.m92096q(fh0Var.f69513g.f24219a);
                if (strM92096q == null || strM92096q.length() == 0) {
                    i3 = 3;
                } else {
                    CompletableCreate completableCreateM60189o = this.f185346a.mo24613j(strM92096q).m60189o();
                    p4uVar.f174007a = fh0Var;
                    p4uVar.f174010d = 1;
                    Object objM96565n = zn91.m96565n(completableCreateM60189o, p4uVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM96565n == yukVar) {
                        return yukVar;
                    }
                }
                c6x0 c6x0Var2 = new c6x0(new IllegalStateException("Display Ad Failed to Prerender"));
                om0.m67310a(this.f185348c, qm0.ERROR, fh0Var.f69506a, null, AbstractC0000a.m7f(i3), null, 116);
                return c6x0Var2;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fh0Var = p4uVar.f174007a;
            bga.m29073P(obj);
            c6x0Var = obj2;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (!(c6x0Var instanceof c6x0)) {
            return obj2;
        }
        c6x0 c6x0Var3 = new c6x0(new IllegalStateException("Display Ad Failed to Prerender"));
        om0.m67310a(this.f185348c, qm0.ERROR, fh0Var.f69506a, null, AbstractC0000a.m7f(i3), null, 116);
        return c6x0Var3;
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: b */
    public final vh00 mo43765b() {
        return new svr(this, 16);
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: c */
    public final boolean mo43766c(fh0 fh0Var) {
        return fh0Var.f69504Z == Format.BANNER;
    }

    @Override // p204p.s4u
    /* JADX INFO: renamed from: d */
    public final boolean mo72179d() {
        return true;
    }
}
