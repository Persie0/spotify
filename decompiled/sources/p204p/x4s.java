package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x4s implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f258191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t4s f258192c;

    public /* synthetic */ x4s(niz nizVar, t4s t4sVar, int i) {
        this.f258190a = i;
        this.f258191b = nizVar;
        this.f258192c = t4sVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        w4s w4sVar;
        z4s z4sVar;
        switch (this.f258190a) {
            case 0:
                if (fbkVar instanceof w4s) {
                    w4sVar = (w4s) fbkVar;
                    int i = w4sVar.f247877b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w4sVar.f247877b = i - Integer.MIN_VALUE;
                    } else {
                        w4sVar = new w4s(this, fbkVar);
                    }
                } else {
                    w4sVar = new w4s(this, fbkVar);
                }
                Object obj2 = w4sVar.f247876a;
                int i2 = w4sVar.f247877b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Object obj3 = ((tas) obj).f218667a.get(this.f258192c.f217061a);
                    w4sVar.f247877b = 1;
                    Object objEmit = this.f258191b.emit(obj3, w4sVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof z4s) {
                    z4sVar = (z4s) fbkVar;
                    int i3 = z4sVar.f279333b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z4sVar.f279333b = i3 - Integer.MIN_VALUE;
                    } else {
                        z4sVar = new z4s(this, fbkVar);
                    }
                } else {
                    z4sVar = new z4s(this, fbkVar);
                }
                Object obj4 = z4sVar.f279332a;
                int i4 = z4sVar.f279333b;
                if (i4 == 0) {
                    bga.m29073P(obj4);
                    Object obj5 = ((yql0) obj).f275260a.get(this.f258192c.f217061a);
                    z4sVar.f279333b = 1;
                    Object objEmit2 = this.f258191b.emit(obj5, z4sVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1.f247311a;
        }
    }
}
