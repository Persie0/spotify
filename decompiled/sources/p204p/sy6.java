package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sy6 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f215158a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f215159b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f215160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy6(fbk fbkVar, gh00 gh00Var, int i) {
        super(2, fbkVar);
        this.f215158a = i;
        this.f215160c = gh00Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f215158a) {
            case 0:
                sy6 sy6Var = new sy6(this.f215160c, fbkVar, 0);
                sy6Var.f215159b = obj;
                return sy6Var;
            case 1:
                sy6 sy6Var2 = new sy6(fbkVar, this.f215160c, 1);
                sy6Var2.f215159b = obj;
                return sy6Var2;
            case 2:
                sy6 sy6Var3 = new sy6(fbkVar, this.f215160c, 2);
                sy6Var3.f215159b = obj;
                return sy6Var3;
            case 3:
                sy6 sy6Var4 = new sy6(this.f215160c, fbkVar, 3);
                sy6Var4.f215159b = obj;
                return sy6Var4;
            case 4:
                sy6 sy6Var5 = new sy6(this.f215160c, fbkVar, 4);
                sy6Var5.f215159b = obj;
                return sy6Var5;
            case 5:
                sy6 sy6Var6 = new sy6(this.f215160c, fbkVar, 5);
                sy6Var6.f215159b = obj;
                return sy6Var6;
            case 6:
                sy6 sy6Var7 = new sy6(this.f215160c, fbkVar, 6);
                sy6Var7.f215159b = obj;
                return sy6Var7;
            case 7:
                sy6 sy6Var8 = new sy6(this.f215160c, fbkVar, 7);
                sy6Var8.f215159b = obj;
                return sy6Var8;
            default:
                sy6 sy6Var9 = new sy6(this.f215160c, fbkVar, 8);
                sy6Var9.f215159b = obj;
                return sy6Var9;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f215158a) {
            case 0:
                sy6 sy6Var = (sy6) create((ry6) obj, (fbk) obj2);
                w2a1 w2a1Var = w2a1.f247311a;
                sy6Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                return ((sy6) create((ey81) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 2:
                return ((sy6) create((ey81) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
            case 3:
                sy6 sy6Var2 = (sy6) create((qpi0) obj, (fbk) obj2);
                w2a1 w2a1Var2 = w2a1.f247311a;
                sy6Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 4:
                sy6 sy6Var3 = (sy6) create((CharSequence) obj, (fbk) obj2);
                w2a1 w2a1Var3 = w2a1.f247311a;
                sy6Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 5:
                sy6 sy6Var4 = (sy6) create((String) obj, (fbk) obj2);
                w2a1 w2a1Var4 = w2a1.f247311a;
                sy6Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            case 6:
                sy6 sy6Var5 = (sy6) create((String) obj, (fbk) obj2);
                w2a1 w2a1Var5 = w2a1.f247311a;
                sy6Var5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
            case 7:
                sy6 sy6Var6 = (sy6) create((xx51) obj, (fbk) obj2);
                w2a1 w2a1Var6 = w2a1.f247311a;
                sy6Var6.invokeSuspend(w2a1Var6);
                return w2a1Var6;
            default:
                sy6 sy6Var7 = (sy6) create((d181) obj, (fbk) obj2);
                w2a1 w2a1Var7 = w2a1.f247311a;
                sy6Var7.invokeSuspend(w2a1Var7);
                return w2a1Var7;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f215158a) {
            case 0:
                ry6 ry6Var = (ry6) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(ry6Var);
                return w2a1.f247311a;
            case 1:
                bga.m29073P(obj);
                return this.f215160c.invoke(((abu0) ((ey81) this.f215159b)).mo25389b());
            case 2:
                bga.m29073P(obj);
                return this.f215160c.invoke(((abu0) ((ey81) this.f215159b)).mo25389b());
            case 3:
                qpi0 qpi0Var = (qpi0) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(qpi0Var);
                return w2a1.f247311a;
            case 4:
                CharSequence charSequence = (CharSequence) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(charSequence.toString());
                return w2a1.f247311a;
            case 5:
                String str = (String) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(new fvy0(str));
                return w2a1.f247311a;
            case 6:
                String str2 = (String) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(new fvy0(str2));
                return w2a1.f247311a;
            case 7:
                xx51 xx51Var = (xx51) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(xx51Var);
                return w2a1.f247311a;
            default:
                d181 d181Var = (d181) this.f215159b;
                bga.m29073P(obj);
                this.f215160c.invoke(d181Var);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy6(gh00 gh00Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f215158a = i;
        this.f215160c = gh00Var;
    }
}
