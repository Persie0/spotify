package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class mvv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q2c f147654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zkq f147655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b411 f147656c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sev f147657d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u4l0 f147658e;

    public mvv(og6 og6Var, q2c q2cVar, zkq zkqVar, b411 b411Var, sev sevVar, u4l0 u4l0Var) {
        this.f147654a = q2cVar;
        this.f147655b = zkqVar;
        this.f147656c = b411Var;
        this.f147657d = sevVar;
        this.f147658e = u4l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010d A[PHI: r1 r3 r6
      0x010d: PHI (r1v16 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:35:0x010a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r3v7 p.bqz0) = (r3v4 p.bqz0), (r3v10 p.bqz0) binds: [B:35:0x010a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x010d: PHI (r6v5 ??) = (r6v3 ??), (r6v7 ??) binds: [B:35:0x010a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if (r3.mo30229d(r1, r2) == r9) goto L39;
     */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.bqz0, p.fvv, p.hwv] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lvv lvvVar;
        fvv fvvVar;
        hwv hwvVar;
        int i;
        bqz0 bqz0Var2;
        int i2;
        hwv hwvVar2;
        bqz0 bqz0Var3;
        hwv hwvVar3;
        fvv fvvVar2;
        bqz0 bqz0Var4;
        ?? r6;
        if (ibkVar instanceof lvv) {
            lvvVar = (lvv) ibkVar;
            int i3 = lvvVar.f137401b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lvvVar.f137401b = i3 - Integer.MIN_VALUE;
            } else {
                lvvVar = new lvv(this, ibkVar);
            }
        } else {
            lvvVar = new lvv(this, ibkVar);
        }
        Object objM28059a = lvvVar.f137400a;
        int i4 = lvvVar.f137401b;
        yuk yukVar = yuk.f276404a;
        if (i4 != 0) {
            if (i4 == 1) {
                i = lvvVar.f137406g;
                hwvVar = lvvVar.f137405f;
                fvvVar = lvvVar.f137404e;
                bqz0Var2 = lvvVar.f137403d;
                bga.m29073P(objM28059a);
            } else {
                if (i4 == 2) {
                    i = lvvVar.f137406g;
                    hwvVar3 = lvvVar.f137405f;
                    fvvVar2 = lvvVar.f137404e;
                    bqz0Var4 = lvvVar.f137403d;
                    bga.m29073P(objM28059a);
                    i2 = i;
                    hwvVar2 = hwvVar3;
                    fvvVar = fvvVar2;
                    bqz0Var3 = bqz0Var4;
                    xr01 xr01Var = fvvVar.f73874d.f213201a.f201919b;
                    wnb wnbVar = new wnb(fvvVar, xr01Var, this.f147657d, hwvVar2, this.f147658e, this.f147654a, null, 3);
                    lvvVar.f137403d = bqz0Var3;
                    r6 = 0;
                    lvvVar.f137404e = null;
                    lvvVar.f137405f = null;
                    lvvVar.f137406g = i2;
                    lvvVar.f137401b = 3;
                    objM28059a = this.f147656c.m28059a("sharing.entity_share_format_loading", xr01Var, wnbVar, lvvVar);
                    if (objM28059a != yukVar) {
                        lvvVar.f137403d = r6;
                        lvvVar.f137404e = r6;
                        lvvVar.f137405f = r6;
                        lvvVar.f137401b = 4;
                    }
                    return yukVar;
                }
                if (i4 == 3) {
                    bqz0Var3 = lvvVar.f137403d;
                    bga.m29073P(objM28059a);
                    r6 = 0;
                    lvvVar.f137403d = r6;
                    lvvVar.f137404e = r6;
                    lvvVar.f137405f = r6;
                    lvvVar.f137401b = 4;
                } else {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM28059a);
                }
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28059a);
        fvvVar = (fvv) obj;
        hwvVar = (hwv) fvvVar.f73874d.m78984g();
        i = 0;
        if (hwvVar.f96061f == null) {
            g2c g2cVar = new g2c(bvg1.m30621i(hwvVar));
            bqz0Var2 = bqz0Var;
            lvvVar.f137403d = bqz0Var2;
            lvvVar.f137404e = fvvVar;
            lvvVar.f137405f = hwvVar;
            lvvVar.f137406g = 0;
            lvvVar.f137401b = 1;
            if (this.f147654a.m71995a(g2cVar, lvvVar) != yukVar) {
            }
            return yukVar;
        }
        bqz0Var2 = bqz0Var;
        if (fvvVar.f73876f) {
            zkq zkqVar = this.f147655b;
            long j = zkqVar.f283804b;
            zkqVar.f283804b = (long) (Math.pow(2.0d, zkqVar.f283803a) * ((double) 200));
            zkqVar.f283803a++;
            lvvVar.f137403d = bqz0Var2;
            lvvVar.f137404e = fvvVar;
            lvvVar.f137405f = hwvVar;
            lvvVar.f137406g = i;
            lvvVar.f137401b = 2;
            if (njg1.m64619l(j, lvvVar) != yukVar) {
                hwvVar3 = hwvVar;
                fvvVar2 = fvvVar;
                bqz0Var4 = bqz0Var2;
                i2 = i;
                hwvVar2 = hwvVar3;
                fvvVar = fvvVar2;
                bqz0Var3 = bqz0Var4;
                xr01 xr01Var2 = fvvVar.f73874d.f213201a.f201919b;
                wnb wnbVar2 = new wnb(fvvVar, xr01Var2, this.f147657d, hwvVar2, this.f147658e, this.f147654a, null, 3);
                lvvVar.f137403d = bqz0Var3;
                r6 = 0;
                lvvVar.f137404e = null;
                lvvVar.f137405f = null;
                lvvVar.f137406g = i2;
                lvvVar.f137401b = 3;
                objM28059a = this.f147656c.m28059a("sharing.entity_share_format_loading", xr01Var2, wnbVar2, lvvVar);
                if (objM28059a != yukVar) {
                    lvvVar.f137403d = r6;
                    lvvVar.f137404e = r6;
                    lvvVar.f137405f = r6;
                    lvvVar.f137401b = 4;
                }
            }
        } else {
            i2 = i;
            hwvVar2 = hwvVar;
            bqz0Var3 = bqz0Var2;
            xr01 xr01Var3 = fvvVar.f73874d.f213201a.f201919b;
            wnb wnbVar3 = new wnb(fvvVar, xr01Var3, this.f147657d, hwvVar2, this.f147658e, this.f147654a, null, 3);
            lvvVar.f137403d = bqz0Var3;
            r6 = 0;
            lvvVar.f137404e = null;
            lvvVar.f137405f = null;
            lvvVar.f137406g = i2;
            lvvVar.f137401b = 3;
            objM28059a = this.f147656c.m28059a("sharing.entity_share_format_loading", xr01Var3, wnbVar3, lvvVar);
            if (objM28059a != yukVar) {
                lvvVar.f137403d = r6;
                lvvVar.f137404e = r6;
                lvvVar.f137405f = r6;
                lvvVar.f137401b = 4;
            }
        }
        return yukVar;
    }
}
