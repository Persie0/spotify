package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class onc extends enc {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f167225d;

    /* JADX INFO: renamed from: e */
    public final Object f167226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onc(Object obj, juk jukVar, int i, int i2, int i3) {
        super(jukVar, i, i2);
        this.f167225d = i3;
        this.f167226e = obj;
    }

    @Override // p204p.enc, p204p.fiz
    public Object collect(niz nizVar, fbk fbkVar) {
        switch (this.f167225d) {
            case 1:
                juk context = fbkVar.getContext();
                boolean zM88271j = wj50.m88271j(dyu.m37393y(context, this.f61128a), context);
                yuk yukVar = yuk.f276404a;
                if (zM88271j) {
                    Object objM67404l = m67404l(nizVar, fbkVar);
                    if (objM67404l == yukVar) {
                        return objM67404l;
                    }
                } else {
                    Object objCollect = super.collect(nizVar, fbkVar);
                    if (objCollect == yukVar) {
                        return objCollect;
                    }
                }
                return w2a1.f247311a;
            default:
                return super.collect(nizVar, fbkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.enc
    /* JADX INFO: renamed from: g */
    public final Object mo39486g(sir0 sir0Var, fbk fbkVar) {
        switch (this.f167225d) {
            case 0:
                gsz0 gsz0Var = new gsz0(sir0Var);
                Iterator it = ((Iterable) this.f167226e).iterator();
                while (it.hasNext()) {
                    x0h1.m89578u(sir0Var, null, 0, new b6b((fiz) it.next(), gsz0Var, (fbk) null, 10), 3);
                }
                return w2a1.f247311a;
            default:
                juk jukVar = ((AbstractC2522w6) sir0Var).f248218c;
                Object objM67404l = m67404l(new gsz0(sir0Var.mo71315c()), fbkVar);
                return objM67404l == yuk.f276404a ? objM67404l : w2a1.f247311a;
        }
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: h */
    public final enc mo39487h(juk jukVar, int i, int i2) {
        switch (this.f167225d) {
            case 0:
                return new onc((Iterable) this.f167226e, jukVar, i, i2, 0);
            default:
                return new onc((i7t0) this.f167226e, jukVar, i, i2, 1);
        }
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: j */
    public nzu0 mo39489j(xuk xukVar) {
        switch (this.f167225d) {
            case 0:
                th00 b6bVar = new b6b(this, null, 8);
                rir0 rir0Var = new rir0(dyu.m37394z(xukVar, this.f61128a), xtm0.m92080a(this.f61129b, 1, 4));
                rir0Var.m87264y0(1, rir0Var, b6bVar);
                return rir0Var;
            default:
                return super.mo39489j(xukVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0035, B:39:0x00a8, B:25:0x0070, B:36:0x0092, B:41:0x00b3, B:43:0x00b7, B:44:0x00be, B:45:0x00c1, B:20:0x004c), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r13.emit(r0, r2) == r10) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8, types: [p.emu0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a5 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m67404l(niz nizVar, fbk fbkVar) {
        k7t0 k7t0Var;
        emu0 emu0Var;
        long j;
        niz nizVar2;
        niz nizVar3;
        emu0 emu0Var2;
        ot51 ot51Var;
        Object objM39463a;
        if (fbkVar instanceof k7t0) {
            k7t0Var = (k7t0) fbkVar;
            int i = k7t0Var.f120193f;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7t0Var.f120193f = i - Integer.MIN_VALUE;
            } else {
                k7t0Var = new k7t0(this, fbkVar);
            }
        } else {
            k7t0Var = new k7t0(this, fbkVar);
        }
        Object obj = k7t0Var.f120191d;
        emu0 emu0Var3 = k7t0Var.f120193f;
        yuk yukVar = yuk.f276404a;
        try {
            if (emu0Var3 == 0) {
                bga.m29073P(obj);
                emu0 emu0Var4 = new emu0(this.f61129b, m67405m(), this.f61130c);
                i7t0 i7t0Var = (i7t0) this.f167226e;
                d0k[] d0kVarArr = bmu0.f28619a;
                if (d0kVarArr.length > 0) {
                    d0k d0kVar = d0kVarArr[0];
                    throw null;
                }
                i7t0Var.subscribe(emu0Var4);
                emu0Var = emu0Var4;
                j = 0;
                nizVar2 = nizVar;
                k7t0Var.f120188a = nizVar2;
                k7t0Var.f120189b = emu0Var;
                k7t0Var.f120190c = j;
                k7t0Var.f120193f = 1;
                objM39463a = emu0Var.m39463a(k7t0Var);
                if (objM39463a != yukVar) {
                    nizVar3 = nizVar2;
                    obj = objM39463a;
                    if (obj == null) {
                        ot51Var = emu0Var2.f60998b;
                        if (ot51Var != null) {
                            emu0Var2 = emu0Var;
                            ot51Var.cancel();
                            return w2a1.f247311a;
                        }
                        emu0Var2 = emu0Var;
                        wj50.m88260d0("subscription");
                        throw null;
                    }
                    qlg1.m73220y(k7t0Var.getContext());
                    k7t0Var.f120188a = nizVar3;
                    k7t0Var.f120189b = emu0Var2;
                    k7t0Var.f120190c = j;
                    k7t0Var.f120193f = 2;
                }
                emu0Var2 = emu0Var;
                emu0Var3 = emu0Var2;
                return yukVar;
            }
            if (emu0Var3 == 1) {
                j = k7t0Var.f120190c;
                emu0 emu0Var5 = k7t0Var.f120189b;
                nizVar3 = k7t0Var.f120188a;
                bga.m29073P(obj);
                emu0Var2 = emu0Var5;
                if (obj == null) {
                    ot51Var = emu0Var2.f60998b;
                    if (ot51Var != null) {
                        emu0Var2 = emu0Var;
                        ot51Var.cancel();
                        return w2a1.f247311a;
                    }
                    emu0Var2 = emu0Var;
                    wj50.m88260d0("subscription");
                    throw null;
                }
                qlg1.m73220y(k7t0Var.getContext());
                k7t0Var.f120188a = nizVar3;
                k7t0Var.f120189b = emu0Var2;
                k7t0Var.f120190c = j;
                k7t0Var.f120193f = 2;
            } else {
                if (emu0Var3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = k7t0Var.f120190c;
                emu0 emu0Var6 = k7t0Var.f120189b;
                nizVar3 = k7t0Var.f120188a;
                bga.m29073P(obj);
                emu0Var3 = emu0Var6;
            }
            emu0Var2 = emu0Var;
            emu0Var3 = emu0Var2;
            nizVar2 = nizVar3;
            j++;
            emu0Var = emu0Var3;
            if (j == m67405m()) {
                ot51 ot51Var2 = emu0Var3.f60998b;
                if (ot51Var2 == null) {
                    wj50.m88260d0("subscription");
                    throw null;
                }
                ot51Var2.request(emu0Var3.f60997a);
                j = 0;
                emu0Var = emu0Var3;
            }
            k7t0Var.f120188a = nizVar2;
            k7t0Var.f120189b = emu0Var;
            k7t0Var.f120190c = j;
            k7t0Var.f120193f = 1;
            objM39463a = emu0Var.m39463a(k7t0Var);
            if (objM39463a != yukVar) {
                nizVar3 = nizVar2;
                obj = objM39463a;
                if (obj == null) {
                    ot51Var = emu0Var2.f60998b;
                    if (ot51Var != null) {
                        emu0Var2 = emu0Var;
                        ot51Var.cancel();
                        return w2a1.f247311a;
                    }
                    emu0Var2 = emu0Var;
                    wj50.m88260d0("subscription");
                    throw null;
                }
                qlg1.m73220y(k7t0Var.getContext());
                k7t0Var.f120188a = nizVar3;
                k7t0Var.f120189b = emu0Var2;
                k7t0Var.f120190c = j;
                k7t0Var.f120193f = 2;
            }
            emu0Var2 = emu0Var;
            emu0Var3 = emu0Var2;
            return yukVar;
        } catch (Throwable th) {
            ot51 ot51Var3 = emu0Var3.f60998b;
            if (ot51Var3 != null) {
                ot51Var3.cancel();
                throw th;
            }
            wj50.m88260d0("subscription");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public long m67405m() {
        if (this.f61130c != 1) {
            return Long.MAX_VALUE;
        }
        int i = this.f61129b;
        if (i == -2) {
            omc.f167012w.getClass();
            return jmc.f113818b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onc(i7t0 i7t0Var) {
        this(i7t0Var, dau.f47107a, -2, 1, 1);
        this.f167225d = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onc(Iterable iterable) {
        this(iterable, dau.f47107a, -2, 1, 0);
        this.f167225d = 0;
    }
}
