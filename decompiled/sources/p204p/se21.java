package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class se21 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public Object f208172a;

    /* JADX INFO: renamed from: b */
    public lsi0 f208173b;

    /* JADX INFO: renamed from: c */
    public ue21 f208174c;

    /* JADX INFO: renamed from: d */
    public int f208175d;

    /* JADX INFO: renamed from: e */
    public int f208176e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f208177f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ue21 f208178g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f208179h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f208180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se21(boolean z, ue21 ue21Var, int i, int i2, fbk fbkVar) {
        super(2, fbkVar);
        this.f208177f = z;
        this.f208178g = ue21Var;
        this.f208179h = i;
        this.f208180i = i2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new se21(this.f208177f, this.f208178g, this.f208179h, this.f208180i, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((se21) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:29:0x007c, B:31:0x0080, B:33:0x0084, B:34:0x0086, B:36:0x008e, B:38:0x0096), top: B:61:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:29:0x007c, B:31:0x0080, B:33:0x0084, B:34:0x0086, B:36:0x008e, B:38:0x0096), top: B:61:0x007c }] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        ue21 ue21Var;
        lsi0 lsi0Var;
        Throwable th;
        int i;
        ue21 ue21Var2;
        lsi0 lsi0Var2;
        int i2;
        Object obj2;
        ojp ojpVar;
        gh00 gh00Var;
        yuk yukVar = yuk.f276404a;
        int i3 = this.f208176e;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                if (this.f208177f) {
                    ry71 ry71Var = this.f208178g.f229379a;
                    int i4 = this.f208179h;
                    this.f208176e = 1;
                    obj = ry71Var.mo76694f(i4, this);
                    if (obj == yukVar) {
                    }
                } else {
                    ry71 ry71Var2 = this.f208178g.f229379a;
                    int i5 = this.f208179h;
                    this.f208176e = 2;
                    obj = ry71Var2.mo50034b(i5);
                    if (obj != yukVar) {
                    }
                }
                return yukVar;
            }
            if (i3 == 1 || i3 == 2) {
                bga.m29073P(obj);
            } else {
                if (i3 == 3) {
                    i = this.f208175d;
                    ue21Var = this.f208174c;
                    lsi0Var = this.f208173b;
                    th = (Throwable) this.f208172a;
                    bga.m29073P(obj);
                    try {
                        ojp ojpVar2 = ue21Var.f229388j;
                        if (ojpVar2 != null && ojpVar2.f166108b == i) {
                            ue21Var.f229388j = null;
                        }
                        throw th;
                    } finally {
                        lsi0Var.mo54249c(null);
                    }
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.f208175d;
                ue21Var2 = this.f208174c;
                lsi0Var2 = this.f208173b;
                obj2 = this.f208172a;
                bga.m29073P(obj);
            }
            try {
                ojpVar = ue21Var2.f229388j;
                if (ojpVar != null && ojpVar.f166108b == i2) {
                    ue21Var2.f229388j = null;
                }
                if (ue21Var2.f229385g.get() == i2) {
                    ue21Var2.f229384f = obj2;
                    ue21Var2.f229386h = i2;
                    gh00Var = ue21Var2.f229382d;
                    if (gh00Var != null) {
                        gh00Var.invoke(obj2);
                    }
                }
                return obj2;
            } finally {
                lsi0Var2.mo54249c(null);
            }
            ue21Var2 = this.f208178g;
            lsi0 lsi0Var3 = ue21Var2.f229387i;
            int i6 = this.f208180i;
            this.f208172a = obj;
            this.f208173b = lsi0Var3;
            this.f208174c = ue21Var2;
            this.f208175d = i6;
            this.f208176e = 4;
            if (lsi0Var3.mo54248a(this) != yukVar) {
                lsi0Var2 = lsi0Var3;
                i2 = i6;
                obj2 = obj;
                ojpVar = ue21Var2.f229388j;
                if (ojpVar != null) {
                    ue21Var2.f229388j = null;
                }
                if (ue21Var2.f229385g.get() == i2) {
                    ue21Var2.f229384f = obj2;
                    ue21Var2.f229386h = i2;
                    gh00Var = ue21Var2.f229382d;
                    if (gh00Var != null) {
                        gh00Var.invoke(obj2);
                    }
                }
                return obj2;
            }
        } catch (Throwable th2) {
            ue21Var = this.f208178g;
            lsi0Var = ue21Var.f229387i;
            int i7 = this.f208180i;
            this.f208172a = th2;
            this.f208173b = lsi0Var;
            this.f208174c = ue21Var;
            this.f208175d = i7;
            this.f208176e = 3;
            if (lsi0Var.mo54248a(this) != yukVar) {
                th = th2;
                i = i7;
            }
            return yukVar;
        }
        return yukVar;
    }
}
