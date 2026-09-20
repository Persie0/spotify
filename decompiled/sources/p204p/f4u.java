package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f4u extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65839a;

    /* JADX INFO: renamed from: b */
    public int f65840b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ niz f65841c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f65842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4u(int i, int i2, fbk fbkVar) {
        super(i, fbkVar);
        this.f65839a = i2;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        int i = this.f65839a;
        niz nizVar = (niz) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        fbk fbkVar = (fbk) obj3;
        switch (i) {
            case 0:
                f4u f4uVar = new f4u(3, 0, fbkVar);
                f4uVar.f65841c = nizVar;
                f4uVar.f65842d = zBooleanValue;
                return f4uVar.invokeSuspend(w2a1.f247311a);
            default:
                f4u f4uVar2 = new f4u(3, 1, fbkVar);
                f4uVar2.f65841c = nizVar;
                f4uVar2.f65842d = zBooleanValue;
                return f4uVar2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f65839a) {
            case 0:
                niz nizVar = this.f65841c;
                boolean z = this.f65842d;
                int i = this.f65840b;
                if (i == 0) {
                    bga.m29073P(obj);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.f65841c = null;
                    this.f65842d = z;
                    this.f65840b = 1;
                    Object objEmit = nizVar.emit(boolValueOf, this);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return Boolean.valueOf(z);
            default:
                niz nizVar2 = this.f65841c;
                boolean z2 = this.f65842d;
                int i2 = this.f65840b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                    this.f65841c = null;
                    this.f65842d = z2;
                    this.f65840b = 1;
                    Object objEmit2 = nizVar2.emit(boolValueOf2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return Boolean.valueOf(z2);
        }
    }
}
