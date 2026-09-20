package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class mlz extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144977a;

    /* JADX INFO: renamed from: b */
    public niz f144978b;

    /* JADX INFO: renamed from: c */
    public int f144979c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ niz f144980d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object[] f144981e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f144982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlz(fbk fbkVar, ai00 ai00Var, int i) {
        super(3, fbkVar);
        this.f144977a = i;
        this.f144982f = ai00Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p.ai00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p.ai00] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, p.ai00] */
    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        niz nizVar = (niz) obj;
        Object[] objArr = (Object[]) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f144977a) {
            case 0:
                mlz mlzVar = new mlz(fbkVar, this.f144982f, 0);
                mlzVar.f144980d = nizVar;
                mlzVar.f144981e = objArr;
                return mlzVar.invokeSuspend(w2a1.f247311a);
            case 1:
                mlz mlzVar2 = new mlz(fbkVar, this.f144982f, 1);
                mlzVar2.f144980d = nizVar;
                mlzVar2.f144981e = objArr;
                return mlzVar2.invokeSuspend(w2a1.f247311a);
            default:
                mlz mlzVar3 = new mlz(fbkVar, this.f144982f, 2);
                mlzVar3.f144980d = nizVar;
                mlzVar3.f144981e = objArr;
                return mlzVar3.invokeSuspend(w2a1.f247311a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, p.xh00] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, p.zh00] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, p.bi00] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        mlz mlzVar;
        switch (this.f144977a) {
            case 0:
                niz nizVar = this.f144980d;
                Object[] objArr = this.f144981e;
                int i = this.f144979c;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        nizVar = this.f144978b;
                        bga.m29073P(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f144980d = null;
                this.f144981e = null;
                this.f144978b = nizVar;
                this.f144979c = 1;
                obj = this.f144982f.mo24818M(obj2, obj3, obj4, this);
                if (obj == yukVar) {
                    return yukVar;
                }
                this.f144980d = null;
                this.f144981e = null;
                this.f144978b = null;
                this.f144979c = 2;
                if (nizVar.emit(obj, this) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            case 1:
                niz nizVar2 = this.f144980d;
                Object[] objArr2 = this.f144981e;
                int i2 = this.f144979c;
                yuk yukVar2 = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        nizVar2 = this.f144978b;
                        bga.m29073P(obj);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Object obj5 = objArr2[0];
                Object obj6 = objArr2[1];
                Object obj7 = objArr2[2];
                Object obj8 = objArr2[3];
                this.f144980d = null;
                this.f144981e = null;
                this.f144978b = nizVar2;
                this.f144979c = 1;
                obj = this.f144982f.mo25195e1(obj5, obj6, obj7, obj8, this);
                if (obj == yukVar2) {
                    return yukVar2;
                }
                this.f144980d = null;
                this.f144981e = null;
                this.f144978b = null;
                this.f144979c = 2;
                if (nizVar2.emit(obj, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            default:
                niz nizVar3 = this.f144980d;
                Object[] objArr3 = this.f144981e;
                int i3 = this.f144979c;
                yuk yukVar3 = yuk.f276404a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        nizVar3 = this.f144978b;
                        bga.m29073P(obj);
                        mlzVar = this;
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                Object obj9 = objArr3[0];
                Object obj10 = objArr3[1];
                Object obj11 = objArr3[2];
                Object obj12 = objArr3[3];
                Object obj13 = objArr3[4];
                this.f144980d = null;
                this.f144981e = null;
                this.f144978b = nizVar3;
                this.f144979c = 1;
                obj = this.f144982f.mo27353c0(obj9, obj10, obj11, obj12, obj13, this);
                mlzVar = this;
                if (obj == yukVar3) {
                    return yukVar3;
                }
                mlzVar.f144980d = null;
                mlzVar.f144981e = null;
                mlzVar.f144978b = null;
                mlzVar.f144979c = 2;
                if (nizVar3.emit(obj, this) == yukVar3) {
                    return yukVar3;
                }
                return w2a1.f247311a;
        }
    }
}
