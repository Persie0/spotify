package p204p;

import android.content.Context;
import com.spotify.ondemandtrials.configimpl.OnDemandTrialFetchEndWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class uml0 implements iml0 {

    /* JADX INFO: renamed from: a */
    public final Context f231902a;

    /* JADX INFO: renamed from: b */
    public final nc4 f231903b;

    /* JADX INFO: renamed from: c */
    public final fal0 f231904c;

    /* JADX INFO: renamed from: d */
    public final v9l0 f231905d;

    /* JADX INFO: renamed from: e */
    public final vf91 f231906e;

    /* JADX INFO: renamed from: f */
    public final xre f231907f;

    /* JADX INFO: renamed from: g */
    public Boolean f231908g;

    public uml0(Context context, nc4 nc4Var, fal0 fal0Var, v9l0 v9l0Var, vf91 vf91Var, xre xreVar) {
        this.f231902a = context;
        this.f231903b = nc4Var;
        this.f231904c = fal0Var;
        this.f231905d = v9l0Var;
        this.f231906e = vf91Var;
        this.f231907f = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (((p204p.kg91) r5).m56321k(false, r0) == r6) goto L26;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83454a(ibk ibkVar) {
        kml0 kml0Var;
        if (ibkVar instanceof kml0) {
            kml0Var = (kml0) ibkVar;
            int i = kml0Var.f124176c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kml0Var.f124176c = i - Integer.MIN_VALUE;
            } else {
                kml0Var = new kml0(this, ibkVar);
            }
        } else {
            kml0Var = new kml0(this, ibkVar);
        }
        Object obj = kml0Var.f124174a;
        int i2 = kml0Var.f124176c;
        vf91 vf91Var = this.f231906e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            kml0Var.f124176c = 1;
            if (((kg91) vf91Var).m56313b(kml0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else if (i2 == 2) {
            bga.m29073P(obj);
            kml0Var.f124176c = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        kml0Var.f124176c = 2;
        if (((kg91) vf91Var).m56312a(kml0Var) != yukVar) {
            kml0Var.f124176c = 3;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m83455b(ibk ibkVar) {
        lml0 lml0Var;
        Object objM84971b;
        jml0 jml0Var;
        tg91 tg91Var;
        pze1 pze1VarM80762a;
        long epochSecond;
        Integer numM80763b;
        if (ibkVar instanceof lml0) {
            lml0Var = (lml0) ibkVar;
            int i = lml0Var.f134989c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lml0Var.f134989c = i - Integer.MIN_VALUE;
            } else {
                lml0Var = new lml0(this, ibkVar);
            }
        } else {
            lml0Var = new lml0(this, ibkVar);
        }
        Object obj = lml0Var.f134987a;
        int i2 = lml0Var.f134989c;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (this.f231903b.m64111c()) {
                lml0Var.f134989c = 1;
                if (((kg91) this.f231906e).m56321k(true, lml0Var) != obj2) {
                }
                return obj2;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            objM84971b = ((s6x0) obj).f206218a;
        }
        jml0Var = null;
        if (objM84971b instanceof c6x0) {
            objM84971b = null;
        }
        tg91Var = (tg91) objM84971b;
        if (tg91Var != null) {
            pze1VarM80762a = tg91Var.m80762a();
            if (pze1VarM80762a != null) {
                epochSecond = pze1VarM80762a.toEpochSecond();
                numM80763b = tg91Var.m80763b();
                if (numM80763b != null) {
                    jml0Var = new jml0(numM80763b.intValue(), epochSecond);
                }
            }
            if (jml0Var != null) {
                lml0Var.f134989c = 3;
                if (m83462i(jml0Var, lml0Var) == obj2) {
                    return obj2;
                }
            }
        }
        return w2a1Var;
        lml0Var.f134989c = 2;
        objM84971b = this.f231905d.m84971b(lml0Var);
        if (objM84971b != obj2) {
            jml0Var = null;
            if (objM84971b instanceof c6x0) {
                objM84971b = null;
            }
            tg91Var = (tg91) objM84971b;
            if (tg91Var != null) {
                pze1VarM80762a = tg91Var.m80762a();
                if (pze1VarM80762a != null) {
                    epochSecond = pze1VarM80762a.toEpochSecond();
                    numM80763b = tg91Var.m80763b();
                    if (numM80763b != null) {
                        jml0Var = new jml0(numM80763b.intValue(), epochSecond);
                    }
                }
                if (jml0Var != null) {
                    lml0Var.f134989c = 3;
                    if (m83462i(jml0Var, lml0Var) == obj2) {
                    }
                }
            }
            return w2a1Var;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m83456c(ibk ibkVar) {
        mml0 mml0Var;
        long j;
        int iIntValue;
        if (ibkVar instanceof mml0) {
            mml0Var = (mml0) ibkVar;
            int i = mml0Var.f145181d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mml0Var.f145181d = i - Integer.MIN_VALUE;
            } else {
                mml0Var = new mml0(this, ibkVar);
            }
        } else {
            mml0Var = new mml0(this, ibkVar);
        }
        Object objM56318h = mml0Var.f145179b;
        int i2 = mml0Var.f145181d;
        vf91 vf91Var = this.f231906e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56318h);
            mml0Var.f145181d = 1;
            objM56318h = ((kg91) vf91Var).m56318h(mml0Var);
            if (objM56318h != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM56318h);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = mml0Var.f145178a;
            bga.m29073P(objM56318h);
        }
        iIntValue = ((Number) objM56318h).intValue();
        if (iIntValue == -1) {
            return null;
        }
        return new jml0(iIntValue, j);
        Long l = (Long) objM56318h;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        mml0Var.f145178a = jLongValue;
        mml0Var.f145181d = 2;
        objM56318h = ((kg91) vf91Var).m56316f(mml0Var);
        if (objM56318h != yukVar) {
            j = jLongValue;
            iIntValue = ((Number) objM56318h).intValue();
            if (iIntValue == -1) {
                return null;
            }
            return new jml0(iIntValue, j);
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (((p204p.kg91) r4).m56321k(true, r0) == r6) goto L26;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83457d(ibk ibkVar) {
        nml0 nml0Var;
        if (ibkVar instanceof nml0) {
            nml0Var = (nml0) ibkVar;
            int i = nml0Var.f155491c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nml0Var.f155491c = i - Integer.MIN_VALUE;
            } else {
                nml0Var = new nml0(this, ibkVar);
            }
        } else {
            nml0Var = new nml0(this, ibkVar);
        }
        Object obj = nml0Var.f155489a;
        int i2 = nml0Var.f155491c;
        vf91 vf91Var = this.f231906e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            nml0Var.f155491c = 1;
            if (((kg91) vf91Var).m56313b(nml0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else if (i2 == 2) {
            bga.m29073P(obj);
            nml0Var.f155491c = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        nml0Var.f155491c = 2;
        if (((kg91) vf91Var).m56312a(nml0Var) != yukVar) {
            nml0Var.f155491c = 3;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m83458e(boolean z, ibk ibkVar) {
        oml0 oml0Var;
        if (ibkVar instanceof oml0) {
            oml0Var = (oml0) ibkVar;
            int i = oml0Var.f167058d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oml0Var.f167058d = i - Integer.MIN_VALUE;
            } else {
                oml0Var = new oml0(this, ibkVar);
            }
        } else {
            oml0Var = new oml0(this, ibkVar);
        }
        Object objM56320j = oml0Var.f167056b;
        int i2 = oml0Var.f167058d;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56320j);
            if (this.f231903b.m64111c()) {
                Boolean bool = this.f231908g;
                this.f231908g = qyg1.m74178H(z);
                if (z && !wj50.m88271j(bool, qyg1.m74178H(true))) {
                    oml0Var.f167055a = z;
                    oml0Var.f167058d = 1;
                    if (m83457d(oml0Var) == obj) {
                        return obj;
                    }
                } else if (!z) {
                    oml0Var.f167055a = z;
                    oml0Var.f167058d = 2;
                    objM56320j = ((kg91) this.f231906e).m56320j(oml0Var);
                    if (objM56320j != obj) {
                    }
                    return obj;
                }
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            bga.m29073P(objM56320j);
            return w2a1Var;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56320j);
            return w2a1Var;
        }
        z = oml0Var.f167055a;
        bga.m29073P(objM56320j);
        if (((Boolean) objM56320j).booleanValue()) {
            oml0Var.f167055a = z;
            oml0Var.f167058d = 3;
            if (m83454a(oml0Var) == obj) {
                return obj;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m83459f(ibk ibkVar) {
        pml0 pml0Var;
        if (ibkVar instanceof pml0) {
            pml0Var = (pml0) ibkVar;
            int i = pml0Var.f179105c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pml0Var.f179105c = i - Integer.MIN_VALUE;
            } else {
                pml0Var = new pml0(this, ibkVar);
            }
        } else {
            pml0Var = new pml0(this, ibkVar);
        }
        Object obj = pml0Var.f179103a;
        int i2 = pml0Var.f179105c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!this.f231903b.m64111c()) {
                return w2a1Var;
            }
            pml0Var.f179105c = 1;
            Object objM83457d = m83457d(pml0Var);
            Object obj2 = yuk.f276404a;
            if (objM83457d == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        e72.m37972F(this.f231902a.getApplicationContext()).m55007t("com.spotify.ondemandtrials.on-demand-trial-fetch-end", 2, (lnl0) ((knl0) new knl0(OnDemandTrialFetchEndWorker.class).m31254a("com.spotify.ondemandtrials.on-demand-trial-fetch-end")).m31255b());
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r7 == r5) goto L27;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83460g(ibk ibkVar) {
        qml0 qml0Var;
        if (ibkVar instanceof qml0) {
            qml0Var = (qml0) ibkVar;
            int i = qml0Var.f190352c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qml0Var.f190352c = i - Integer.MIN_VALUE;
            } else {
                qml0Var = new qml0(this, ibkVar);
            }
        } else {
            qml0Var = new qml0(this, ibkVar);
        }
        Object objM56320j = qml0Var.f190350a;
        int i2 = qml0Var.f190352c;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM56320j);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56320j);
            }
            boolean z = objM56320j == null;
            return qyg1.m74178H(z);
        }
        bga.m29073P(objM56320j);
        if (!this.f231903b.m64111c()) {
            return qyg1.m74178H(false);
        }
        qml0Var.f190352c = 1;
        objM56320j = ((kg91) this.f231906e).m56320j(qml0Var);
        if (objM56320j != obj) {
        }
        return obj;
        if (!((Boolean) objM56320j).booleanValue()) {
            qml0Var.f190352c = 2;
            objM56320j = m83456c(qml0Var);
        }
        return qyg1.m74178H(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (m83454a(r0) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (m83454a(r0) == r7) goto L52;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83461h(ibk ibkVar) {
        rml0 rml0Var;
        if (ibkVar instanceof rml0) {
            rml0Var = (rml0) ibkVar;
            int i = rml0Var.f200590c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rml0Var.f200590c = i - Integer.MIN_VALUE;
            } else {
                rml0Var = new rml0(this, ibkVar);
            }
        } else {
            rml0Var = new rml0(this, ibkVar);
        }
        Object objM83456c = rml0Var.f200588a;
        int i2 = rml0Var.f200590c;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM83456c);
            nc4 nc4Var = this.f231903b;
            if (!nc4Var.m64111c() || !nc4Var.m64112d()) {
                return qyg1.m74178H(false);
            }
            rml0Var.f200590c = 1;
            objM83456c = m83456c(rml0Var);
            if (objM83456c != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM83456c);
                return qyg1.m74178H(false);
            }
            if (i2 == 3) {
                bga.m29073P(objM83456c);
                return qyg1.m74178H(false);
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM83456c);
            return objM83456c;
        }
        bga.m29073P(objM83456c);
        jml0 jml0Var = (jml0) objM83456c;
        if (jml0Var == null) {
            return qyg1.m74178H(false);
        }
        if (jml0Var.m53788b() != 1) {
            rml0Var.f200590c = 2;
        } else {
            ((wy3) this.f231907f).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            if (jml0Var.m53787a() > jCurrentTimeMillis) {
                return qyg1.m74178H(false);
            }
            if (jCurrentTimeMillis > jml0Var.m53787a() + 1209600) {
                rml0Var.f200590c = 3;
            } else {
                rml0Var.f200590c = 4;
                Object objM83463j = m83463j(rml0Var);
                if (objM83463j != obj) {
                    return objM83463j;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (((p204p.kg91) r6).m56321k(false, r0) == r7) goto L26;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83462i(jml0 jml0Var, ibk ibkVar) {
        sml0 sml0Var;
        if (ibkVar instanceof sml0) {
            sml0Var = (sml0) ibkVar;
            int i = sml0Var.f210684d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sml0Var.f210684d = i - Integer.MIN_VALUE;
            } else {
                sml0Var = new sml0(this, ibkVar);
            }
        } else {
            sml0Var = new sml0(this, ibkVar);
        }
        Object obj = sml0Var.f210682b;
        int i2 = sml0Var.f210684d;
        vf91 vf91Var = this.f231906e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            int iM53788b = jml0Var.m53788b();
            sml0Var.f210681a = jml0Var;
            sml0Var.f210684d = 1;
            if (((kg91) vf91Var).m56322l(iM53788b, sml0Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            jml0Var = sml0Var.f210681a;
            bga.m29073P(obj);
        } else if (i2 == 2) {
            bga.m29073P(obj);
            sml0Var.f210681a = null;
            sml0Var.f210684d = 3;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        long jM53787a = jml0Var.m53787a();
        sml0Var.f210681a = null;
        sml0Var.f210684d = 2;
        if (((kg91) vf91Var).m56324n(jM53787a, sml0Var) != yukVar) {
            sml0Var.f210681a = null;
            sml0Var.f210684d = 3;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[PHI: r1
      0x00c0: PHI (r1v7 p.jml0) = (r1v6 p.jml0), (r1v9 p.jml0) binds: [B:49:0x00bd, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (m83454a(r0) == r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        if (m83454a(r0) == r9) goto L62;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83463j(ibk ibkVar) {
        tml0 tml0Var;
        Object objM84971b;
        jml0 jml0Var;
        long jCurrentTimeMillis;
        if (ibkVar instanceof tml0) {
            tml0Var = (tml0) ibkVar;
            int i = tml0Var.f221753d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tml0Var.f221753d = i - Integer.MIN_VALUE;
            } else {
                tml0Var = new tml0(this, ibkVar);
            }
        } else {
            tml0Var = new tml0(this, ibkVar);
        }
        Object objM86755t = tml0Var.f221751b;
        int i2 = tml0Var.f221753d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            tml0Var.f221753d = 1;
            objM84971b = this.f231905d.m84971b(tml0Var);
            if (objM84971b != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jml0Var = tml0Var.f221750a;
                bga.m29073P(objM86755t);
                if (((Boolean) objM86755t).booleanValue()) {
                    return qyg1.m74178H(false);
                }
                tml0Var.f221750a = jml0Var;
                tml0Var.f221753d = 3;
                if (m83462i(jml0Var, tml0Var) != obj) {
                    if (jml0Var.m53788b() != 1) {
                        tml0Var.f221750a = null;
                        tml0Var.f221753d = 4;
                    } else {
                        ((wy3) this.f231907f).getClass();
                        jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                        if (jCurrentTimeMillis <= jml0Var.m53787a() + 1209600) {
                            return qyg1.m74178H(jml0Var.m53787a() <= jCurrentTimeMillis);
                        }
                        tml0Var.f221750a = null;
                        tml0Var.f221753d = 5;
                    }
                }
                return obj;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    bga.m29073P(objM86755t);
                    return qyg1.m74178H(false);
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
                return qyg1.m74178H(false);
            }
            jml0Var = tml0Var.f221750a;
            bga.m29073P(objM86755t);
            if (jml0Var.m53788b() != 1) {
                tml0Var.f221750a = null;
                tml0Var.f221753d = 4;
            } else {
                ((wy3) this.f231907f).getClass();
                jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                if (jCurrentTimeMillis <= jml0Var.m53787a() + 1209600) {
                    return qyg1.m74178H(jml0Var.m53787a() <= jCurrentTimeMillis);
                }
                tml0Var.f221750a = null;
                tml0Var.f221753d = 5;
            }
            return obj;
        }
        bga.m29073P(objM86755t);
        objM84971b = ((s6x0) objM86755t).f206218a;
        if (objM84971b instanceof c6x0) {
            objM84971b = null;
        }
        tg91 tg91Var = (tg91) objM84971b;
        if (tg91Var == null) {
            return qyg1.m74178H(false);
        }
        pze1 pze1VarM80762a = tg91Var.m80762a();
        if (pze1VarM80762a != null) {
            long epochSecond = pze1VarM80762a.toEpochSecond();
            Integer numM80763b = tg91Var.m80763b();
            if (numM80763b != null) {
                jml0Var = new jml0(numM80763b.intValue(), epochSecond);
            } else {
                jml0Var = null;
            }
        } else {
            jml0Var = null;
        }
        if (jml0Var == null) {
            return qyg1.m74178H(false);
        }
        fiz fizVarM41188h = this.f231904c.m41188h();
        tml0Var.f221750a = jml0Var;
        tml0Var.f221753d = 2;
        objM86755t = vyf1.m86755t(fizVarM41188h, tml0Var);
        if (objM86755t != obj) {
            if (((Boolean) objM86755t).booleanValue()) {
                return qyg1.m74178H(false);
            }
            tml0Var.f221750a = jml0Var;
            tml0Var.f221753d = 3;
            if (m83462i(jml0Var, tml0Var) != obj) {
                if (jml0Var.m53788b() != 1) {
                    tml0Var.f221750a = null;
                    tml0Var.f221753d = 4;
                } else {
                    ((wy3) this.f231907f).getClass();
                    jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                    if (jCurrentTimeMillis <= jml0Var.m53787a() + 1209600) {
                        return qyg1.m74178H(jml0Var.m53787a() <= jCurrentTimeMillis);
                    }
                    tml0Var.f221750a = null;
                    tml0Var.f221753d = 5;
                }
            }
        }
        return obj;
    }
}
