package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bzi implements yyi {

    /* JADX INFO: renamed from: a */
    public final e9q0 f32502a;

    /* JADX INFO: renamed from: b */
    public final e9q0 f32503b;

    /* JADX INFO: renamed from: c */
    public final e45 f32504c = new e45(4);

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f32505d = new ThreadLocal();

    /* JADX INFO: renamed from: e */
    public volatile boolean f32506e;

    /* JADX INFO: renamed from: f */
    public final long f32507f;

    /* JADX INFO: renamed from: g */
    public final int f32508g;

    public bzi(c97 c97Var) {
        hvi0 hvi0Var = cks.f39079b;
        this.f32507f = jwg1.m54449D(30, ils.SECONDS);
        this.f32508g = 2;
        e9q0 e9q0Var = new e9q0(1, new mo4(c97Var, 13));
        this.f32502a = e9q0Var;
        this.f32503b = e9q0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f32506e) {
            return;
        }
        this.f32506e = true;
        this.f32502a.m38254c();
        this.f32503b.m38254c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x0143 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x0122, B:69:0x0138, B:71:0x0143, B:86:0x019f, B:87:0x01a6), top: B:113:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f A[Catch: all -> 0x019b, TRY_ENTER, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x0122, B:69:0x0138, B:71:0x0143, B:86:0x019f, B:87:0x01a6), top: B:113:0x0122 }] */
    @Override // p204p.yyi
    /* JADX INFO: renamed from: j0 */
    public final Object mo31033j0(boolean z, th00 th00Var, ibk ibkVar) throws Throwable {
        azi aziVar;
        rlv0 rlv0Var;
        Throwable th;
        e9q0 e9q0Var;
        th00 th00Var2;
        juk jukVar;
        e45 e45Var;
        e9q0 e9q0Var2;
        rlv0 rlv0Var2;
        boolean z2;
        Object obj;
        rlv0 rlv0Var3;
        n9q0 n9q0Var;
        boolean z3 = z;
        if (ibkVar instanceof azi) {
            aziVar = (azi) ibkVar;
            int i = aziVar.f21617t;
            if ((i & Integer.MIN_VALUE) != 0) {
                aziVar.f21617t = i - Integer.MIN_VALUE;
            } else {
                aziVar = new azi(this, ibkVar);
            }
        } else {
            aziVar = new azi(this, ibkVar);
        }
        Object objM89557A = aziVar.f21615h;
        yuk yukVar = yuk.f276404a;
        int i2 = aziVar.f21617t;
        fbk fbkVar = null;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM89557A);
                return objM89557A;
            }
            if (i2 == 2) {
                bga.m29073P(objM89557A);
                return objM89557A;
            }
            if (i2 == 3) {
                z3 = aziVar.f21608a;
                e45Var = aziVar.f21614g;
                rlv0 rlv0Var4 = aziVar.f21613f;
                jukVar = aziVar.f21612e;
                rlv0 rlv0Var5 = aziVar.f21611d;
                e9q0Var2 = (e9q0) aziVar.f21610c;
                th00Var2 = (th00) aziVar.f21609b;
                try {
                    bga.m29073P(objM89557A);
                    rlv0Var2 = rlv0Var4;
                    rlv0Var = rlv0Var5;
                    try {
                        n0j n0jVar = (n0j) objM89557A;
                        n0jVar.f149099c = jukVar;
                        n0jVar.f149100d = new Throwable();
                        if (this.f32502a == this.f32503b && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        rlv0Var2.f200373a = new n9q0(e45Var, n0jVar, z2);
                        obj = rlv0Var.f200373a;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        n9q0 n9q0Var2 = (n9q0) obj;
                        juk jukVarM67570t = opo.m67570t(new uxi(this.f32504c, n9q0Var2), new rg71(n9q0Var2, this.f32505d));
                        qri qriVar = new qri(th00Var2, rlv0Var, fbkVar, 3);
                        aziVar.f21609b = e9q0Var2;
                        aziVar.f21610c = rlv0Var;
                        aziVar.f21611d = null;
                        aziVar.f21612e = null;
                        aziVar.f21613f = null;
                        aziVar.f21614g = null;
                        aziVar.f21617t = 4;
                        objM89557A = x0h1.m89557A(jukVarM67570t, qriVar, aziVar);
                        if (objM89557A != yukVar) {
                            rlv0Var3 = rlv0Var;
                            e9q0Var = e9q0Var2;
                        }
                        return yukVar;
                    } catch (Throwable th2) {
                        th = th2;
                        e9q0Var = e9q0Var2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    rlv0Var = rlv0Var5;
                    e9q0Var = e9q0Var2;
                    throw th;
                }
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0Var3 = (rlv0) aziVar.f21610c;
            e9q0Var = (e9q0) aziVar.f21609b;
            try {
                bga.m29073P(objM89557A);
            } catch (Throwable th4) {
                rlv0Var = rlv0Var3;
                th = th4;
            }
            n9q0Var = (n9q0) rlv0Var3.f200373a;
            if (n9q0Var != null) {
                if (!n9q0Var.f151850e) {
                    n9q0Var.f151850e = true;
                    if (n9q0Var.f151847b.f149097a.mo63456w()) {
                        mif1.m61880o(n9q0Var.f151847b, "ROLLBACK TRANSACTION");
                    }
                }
                n0j n0jVar2 = n9q0Var.f151847b;
                n0jVar2.f149099c = null;
                n0jVar2.f149100d = null;
                e9q0Var.m38256e(n0jVar2);
            }
            return objM89557A;
        }
        bga.m29073P(objM89557A);
        if (this.f32506e) {
            mif1.m61859L(21, "Connection pool is closed");
            throw null;
        }
        n9q0 n9q0Var3 = (n9q0) this.f32505d.get();
        if (n9q0Var3 == null) {
            uxi uxiVar = (uxi) aziVar.getContext().mo26595B(this.f32504c);
            n9q0Var3 = uxiVar != null ? uxiVar.f234931b : null;
        }
        if (n9q0Var3 == null) {
            e9q0 e9q0Var3 = z3 ? this.f32502a : this.f32503b;
            rlv0Var = new rlv0();
            try {
                juk context = aziVar.getContext();
                e45 e45Var2 = this.f32504c;
                long j = this.f32507f;
                t29 t29Var = new t29(this, z3, 1);
                aziVar.f21609b = th00Var;
                aziVar.f21610c = e9q0Var3;
                aziVar.f21611d = rlv0Var;
                aziVar.f21612e = context;
                aziVar.f21613f = rlv0Var;
                aziVar.f21614g = e45Var2;
                aziVar.f21608a = z3;
                aziVar.f21617t = 3;
                Object objM38253b = e9q0Var3.m38253b(j, t29Var, aziVar);
                if (objM38253b != yukVar) {
                    th00Var2 = th00Var;
                    jukVar = context;
                    e45Var = e45Var2;
                    e9q0Var2 = e9q0Var3;
                    objM89557A = objM38253b;
                    rlv0Var2 = rlv0Var;
                    n0j n0jVar3 = (n0j) objM89557A;
                    n0jVar3.f149099c = jukVar;
                    n0jVar3.f149100d = new Throwable();
                    if (this.f32502a == this.f32503b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    rlv0Var2.f200373a = new n9q0(e45Var, n0jVar3, z2);
                    obj = rlv0Var.f200373a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    n9q0 n9q0Var4 = (n9q0) obj;
                    juk jukVarM67570t2 = opo.m67570t(new uxi(this.f32504c, n9q0Var4), new rg71(n9q0Var4, this.f32505d));
                    qri qriVar2 = new qri(th00Var2, rlv0Var, fbkVar, 3);
                    aziVar.f21609b = e9q0Var2;
                    aziVar.f21610c = rlv0Var;
                    aziVar.f21611d = null;
                    aziVar.f21612e = null;
                    aziVar.f21613f = null;
                    aziVar.f21614g = null;
                    aziVar.f21617t = 4;
                    objM89557A = x0h1.m89557A(jukVarM67570t2, qriVar2, aziVar);
                    if (objM89557A != yukVar) {
                        rlv0Var3 = rlv0Var;
                        e9q0Var = e9q0Var2;
                        n9q0Var = (n9q0) rlv0Var3.f200373a;
                        if (n9q0Var != null) {
                            if (!n9q0Var.f151850e) {
                                n9q0Var.f151850e = true;
                                if (n9q0Var.f151847b.f149097a.mo63456w()) {
                                    mif1.m61880o(n9q0Var.f151847b, "ROLLBACK TRANSACTION");
                                }
                            }
                            n0j n0jVar4 = n9q0Var.f151847b;
                            n0jVar4.f149099c = null;
                            n0jVar4.f149100d = null;
                            e9q0Var.m38256e(n0jVar4);
                        }
                        return objM89557A;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                e9q0Var = e9q0Var3;
            }
        } else {
            if (!z3 && n9q0Var3.f151848c) {
                mif1.m61859L(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (aziVar.getContext().mo26595B(this.f32504c) == null) {
                juk jukVarM67570t3 = opo.m67570t(new uxi(this.f32504c, n9q0Var3), new rg71(n9q0Var3, this.f32505d));
                qri qriVar3 = new qri(th00Var, n9q0Var3, fbkVar, 2);
                aziVar.f21617t = 1;
                Object objM89557A2 = x0h1.m89557A(jukVarM67570t3, qriVar3, aziVar);
                if (objM89557A2 != yukVar) {
                    return objM89557A2;
                }
            } else {
                aziVar.f21617t = 2;
                Object objInvoke = th00Var.invoke(n9q0Var3, aziVar);
                if (objInvoke != yukVar) {
                    return objInvoke;
                }
            }
        }
        return yukVar;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                n9q0 n9q0Var5 = (n9q0) rlv0Var.f200373a;
                if (n9q0Var5 == null) {
                    throw th6;
                }
                if (!n9q0Var5.f151850e) {
                    n9q0Var5.f151850e = true;
                    if (n9q0Var5.f151847b.f149097a.mo63456w()) {
                        mif1.m61880o(n9q0Var5.f151847b, "ROLLBACK TRANSACTION");
                    }
                }
                n0j n0jVar5 = n9q0Var5.f151847b;
                n0jVar5.f149099c = null;
                n0jVar5.f149100d = null;
                e9q0Var.m38256e(n0jVar5);
                throw th6;
            } catch (Throwable th7) {
                y85.m93061f(th, th7);
                throw th6;
            }
        }
    }

    public bzi(final c97 c97Var, final String str, int i) {
        hvi0 hvi0Var = cks.f39079b;
        this.f32507f = jwg1.m54449D(30, ils.SECONDS);
        this.f32508g = 2;
        if (i > 0) {
            final int i2 = 0;
            this.f32502a = new e9q0(i, new eh00() { // from class: p.zyi
                @Override // p204p.eh00
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            yyx0 yyx0VarMo31885g = c97Var.mo31885g(str);
                            mif1.m61880o(yyx0VarMo31885g, "PRAGMA query_only = 1");
                            return yyx0VarMo31885g;
                        default:
                            return c97Var.mo31885g(str);
                    }
                }
            });
            final int i3 = 1;
            this.f32503b = new e9q0(1, new eh00() { // from class: p.zyi
                @Override // p204p.eh00
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            yyx0 yyx0VarMo31885g = c97Var.mo31885g(str);
                            mif1.m61880o(yyx0VarMo31885g, "PRAGMA query_only = 1");
                            return yyx0VarMo31885g;
                        default:
                            return c97Var.mo31885g(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
