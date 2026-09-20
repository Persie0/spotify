package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zrf0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xik f285648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zrf0(xik xikVar, int i) {
        super(1);
        this.f285647a = i;
        this.f285648b = xikVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f285647a) {
            case 0:
                return new iz80(this.f285648b.f261887b);
            default:
                vco vcoVar = (vco) obj;
                String str = this.f285648b.f261887b;
                s5a0 s5a0Var = vcoVar.f240176g;
                q5a0 q5a0Var = s5a0Var instanceof q5a0 ? (q5a0) s5a0Var : null;
                rco rcoVar = vcoVar.f240174e;
                if (q5a0Var != null) {
                    nw80 nw80Var = q5a0Var.f185487a;
                    if (rcoVar != null) {
                        msf0 msf0Var = new msf0(nw80Var.f159049c, nw80Var.f159047a, nw80Var.m65756g(), nw80Var.f159053g);
                        String str2 = rcoVar.f197901a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = rcoVar.f197902b;
                        return new osf0(new msf0(str2, str3 != null ? str3 : "", rcoVar.f197903c, rcoVar.f197904d), msf0Var, str, vcoVar.f240175f.f103502c);
                    }
                }
                nau nauVar = nau.f152117a;
                return new osf0(new msf0("", "", false, nauVar), new msf0("", "", false, nauVar), str, nauVar);
        }
    }
}
