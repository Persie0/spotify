package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cv60 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42316a;

    /* JADX INFO: renamed from: b */
    public int f42317b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d731 f42318c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f42319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv60(d731 d731Var, String str, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f42316a = i;
        this.f42318c = d731Var;
        this.f42319d = str;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f42316a) {
            case 0:
                return new cv60(this.f42318c, this.f42319d, fbkVar, 0);
            case 1:
                return new cv60(this.f42318c, this.f42319d, fbkVar, 1);
            default:
                return new cv60(this.f42318c, this.f42319d, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f42316a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((cv60) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f42316a) {
            case 0:
                int i = this.f42317b;
                if (i == 0) {
                    bga.m29073P(obj);
                    d731 d731Var = this.f42318c;
                    y631 y631VarM35173a = d731Var.m35173a();
                    if (y631VarM35173a != null) {
                        y631VarM35173a.m92858a();
                    }
                    this.f42317b = 1;
                    Object objM35172c = d731.m35172c(d731Var, this.f42319d, this, 14);
                    yuk yukVar = yuk.f276404a;
                    if (objM35172c == yukVar) {
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
                int i2 = this.f42317b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    d731 d731Var2 = this.f42318c;
                    y631 y631VarM35173a2 = d731Var2.m35173a();
                    if (y631VarM35173a2 != null) {
                        y631VarM35173a2.m92858a();
                    }
                    this.f42317b = 1;
                    Object objM35172c2 = d731.m35172c(d731Var2, this.f42319d, this, 14);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM35172c2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i3 = this.f42317b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    this.f42317b = 1;
                    Object objM35172c3 = d731.m35172c(this.f42318c, this.f42319d, this, 6);
                    yuk yukVar3 = yuk.f276404a;
                    if (objM35172c3 == yukVar3) {
                        return yukVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
