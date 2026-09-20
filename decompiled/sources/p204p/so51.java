package p204p;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes10.dex */
public final class so51 implements fwz0 {

    /* JADX INFO: renamed from: X */
    public final nuu0 f211097X;

    /* JADX INFO: renamed from: a */
    public final gcu0 f211098a;

    /* JADX INFO: renamed from: b */
    public final di40 f211099b;

    /* JADX INFO: renamed from: c */
    public final boolean f211100c;

    /* JADX INFO: renamed from: d */
    public final c9k f211101d;

    /* JADX INFO: renamed from: e */
    public final bqa f211102e;

    /* JADX INFO: renamed from: f */
    public final hb11 f211103f;

    /* JADX INFO: renamed from: g */
    public final lsi0 f211104g;

    /* JADX INFO: renamed from: h */
    public final pte f211105h;

    /* JADX INFO: renamed from: i */
    public final zv41 f211106i;

    /* JADX INFO: renamed from: t */
    public final ConcurrentHashMap f211107t;

    public so51(Context context, h1d0 h1d0Var, wt80 wt80Var, yz80 yz80Var, ud80 ud80Var, gcu0 gcu0Var, aq51 aq51Var, vpx vpxVar, di40 di40Var, lo51 lo51Var, luk lukVar) {
        this.f211098a = gcu0Var;
        this.f211099b = di40Var;
        this.f211100c = lo51Var.f135307e;
        c9k c9kVarM16o = AbstractC0000a.m16o(lukVar);
        this.f211101d = c9kVarM16o;
        this.f211102e = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        this.f211103f = j0g1.m52092t(0, 1, 2, 1);
        this.f211104g = msi0.m62770a();
        new AtomicLong(0L);
        this.f211105h = new pte(h1d0Var, yz80Var, aq51Var);
        zv41 zv41VarM52819d = jag1.m52819d(new yh50(false, 2, false, false, 0, 0, null, Long.MIN_VALUE, false, false, 0L, null));
        this.f211106i = zv41VarM52819d;
        this.f211107t = new ConcurrentHashMap();
        this.f211097X = bzf1.m31029u(new ou8(zv41VarM52819d, 15), c9kVarM16o, hf11.f90581a, zo51.f284697a);
        fbk fbkVar = null;
        x0h1.m89578u(c9kVarM16o, null, 0, new mo51(this, fbkVar, 0), 3);
        x0h1.m89578u(c9kVarM16o, null, 0, new mo51(this, fbkVar, 1), 3);
        x0h1.m89578u(c9kVarM16o, null, 0, new cj40(this, fbkVar, 29), 3);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:70:0x015b, B:15:0x003c, B:21:0x004c, B:22:0x0054, B:24:0x005b, B:26:0x0064, B:27:0x0065, B:28:0x006a, B:45:0x00c1, B:47:0x00c5, B:48:0x00db, B:49:0x00dc, B:50:0x00e1), top: B:83:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:70:0x015b, B:15:0x003c, B:21:0x004c, B:22:0x0054, B:24:0x005b, B:26:0x0064, B:27:0x0065, B:28:0x006a, B:45:0x00c1, B:47:0x00c5, B:48:0x00db, B:49:0x00dc, B:50:0x00e1), top: B:83:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00b2: MOVE (r1 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:179), block:B:41:0x00b2 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00b3: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:180), block:B:41:0x00b2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: b */
    public static final Object m78618b(so51 so51Var, ibk ibkVar) throws Throwable {
        qo51 qo51Var;
        Object obj;
        upa upaVar;
        upa upaVar2;
        Object c6x0Var;
        rlv0 rlv0Var;
        upa upaVar3;
        Throwable thM77348a;
        upa upaVar4;
        upa upaVar5;
        Object objM83652a;
        yuk yukVar;
        int i;
        byte[] bArr;
        so51 so51Var2;
        rlv0 rlv0Var2;
        long j;
        long j2;
        upa upaVar6;
        if (ibkVar instanceof qo51) {
            qo51Var = (qo51) ibkVar;
            int i2 = qo51Var.f190793X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qo51Var.f190793X = i2 - Integer.MIN_VALUE;
            } else {
                qo51Var = new qo51(so51Var, ibkVar);
            }
        } else {
            qo51Var = new qo51(so51Var, ibkVar);
        }
        Object obj2 = qo51Var.f190802i;
        ?? r1 = qo51Var.f190793X;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            try {
                switch (r1) {
                    case 0:
                        bga.m29073P(obj2);
                        bqa bqaVar = so51Var.f211102e;
                        bqaVar.getClass();
                        upaVar5 = new upa(bqaVar);
                        qo51Var.f190794a = upaVar5;
                        qo51Var.f190795b = null;
                        qo51Var.f190796c = null;
                        qo51Var.f190797d = null;
                        qo51Var.f190798e = null;
                        qo51Var.f190793X = 1;
                        objM83652a = upaVar5.m83652a(qo51Var);
                        yukVar = yuk.f276404a;
                        if (objM83652a == yukVar) {
                            return yukVar;
                        }
                        upaVar4 = upaVar5;
                        obj2 = objM83652a;
                        if (!((Boolean) obj2).booleanValue()) {
                            return w2a1Var;
                        }
                        if (upaVar4.m83653c() != null) {
                            throw new ClassCastException();
                        }
                        new rlv0().f200373a = null;
                        throw null;
                    case 1:
                        upa upaVar7 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        upaVar4 = upaVar7;
                        if (!((Boolean) obj2).booleanValue()) {
                            return w2a1Var;
                        }
                        if (upaVar4.m83653c() != null) {
                            throw new ClassCastException();
                        }
                        new rlv0().f200373a = null;
                        throw null;
                    case 2:
                        long j3 = qo51Var.f190801h;
                        long j4 = qo51Var.f190800g;
                        int i3 = qo51Var.f190799f;
                        rlv0 rlv0Var3 = qo51Var.f190798e;
                        byte[] bArr2 = qo51Var.f190797d;
                        so51 so51Var3 = qo51Var.f190796c;
                        rlv0 rlv0Var4 = qo51Var.f190795b;
                        upa upaVar8 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        rlv0Var3.f200373a = obj2;
                        if (rlv0Var4.f200373a != null) {
                            throw new ClassCastException();
                        }
                        qo51Var.f190794a = upaVar8;
                        qo51Var.f190795b = rlv0Var4;
                        qo51Var.f190796c = so51Var3;
                        qo51Var.f190797d = bArr2;
                        qo51Var.f190798e = rlv0Var4;
                        qo51Var.f190799f = i3;
                        qo51Var.f190800g = j4;
                        qo51Var.f190801h = j3;
                        qo51Var.f190793X = 3;
                        so51Var3.m78622f(qo51Var);
                        throw null;
                    case 3:
                        long j5 = qo51Var.f190801h;
                        long j6 = qo51Var.f190800g;
                        i = qo51Var.f190799f;
                        rlv0 rlv0Var5 = qo51Var.f190798e;
                        bArr = qo51Var.f190797d;
                        so51 so51Var4 = qo51Var.f190796c;
                        rlv0 rlv0Var6 = qo51Var.f190795b;
                        upa upaVar9 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        rlv0Var5.f200373a = obj2;
                        if (((yh50) so51Var4.f211106i.getValue()).f272744l == null) {
                            if (rlv0Var6.f200373a == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                        so51Var2 = so51Var4;
                        rlv0Var2 = rlv0Var6;
                        j = j6;
                        j2 = j5;
                        upaVar6 = upaVar9;
                        if (rlv0Var2.f200373a == null) {
                            throw new ClassCastException();
                        }
                        qo51Var.f190794a = upaVar6;
                        qo51Var.f190795b = rlv0Var2;
                        qo51Var.f190796c = so51Var2;
                        qo51Var.f190797d = bArr;
                        qo51Var.f190798e = rlv0Var2;
                        qo51Var.f190799f = i;
                        qo51Var.f190800g = j;
                        qo51Var.f190801h = j2;
                        qo51Var.f190793X = 5;
                        so51Var2.m78620d(qo51Var);
                        throw null;
                    case 4:
                        long j7 = qo51Var.f190801h;
                        long j8 = qo51Var.f190800g;
                        i = qo51Var.f190799f;
                        byte[] bArr3 = qo51Var.f190797d;
                        so51 so51Var5 = qo51Var.f190796c;
                        rlv0 rlv0Var7 = qo51Var.f190795b;
                        upa upaVar10 = qo51Var.f190794a;
                        try {
                            bga.m29073P(obj2);
                            so51Var2 = so51Var5;
                            bArr = bArr3;
                            rlv0Var2 = rlv0Var7;
                            upaVar6 = upaVar10;
                            j = j8;
                            j2 = j7;
                            if (rlv0Var2.f200373a == null) {
                                throw new ClassCastException();
                            }
                            qo51Var.f190794a = upaVar6;
                            qo51Var.f190795b = rlv0Var2;
                            qo51Var.f190796c = so51Var2;
                            qo51Var.f190797d = bArr;
                            qo51Var.f190798e = rlv0Var2;
                            qo51Var.f190799f = i;
                            qo51Var.f190800g = j;
                            qo51Var.f190801h = j2;
                            qo51Var.f190793X = 5;
                            so51Var2.m78620d(qo51Var);
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            r1 = rlv0Var7;
                            upaVar2 = upaVar10;
                            c6x0Var = new c6x0(th);
                            rlv0Var = r1;
                            upaVar3 = upaVar2;
                            thM77348a = s6x0.m77348a(c6x0Var);
                            if (thM77348a == null) {
                                Logger.m3966b(ei6.m39073j("STS: upload failed: ", thM77348a), new Object[0]);
                                throw ei6.m39072i(rlv0Var.f200373a);
                            }
                            if (!(c6x0Var instanceof c6x0)) {
                                throw ei6.m39072i(rlv0Var.f200373a);
                            }
                            upaVar5 = upaVar3;
                            qo51Var.f190794a = upaVar5;
                            qo51Var.f190795b = null;
                            qo51Var.f190796c = null;
                            qo51Var.f190797d = null;
                            qo51Var.f190798e = null;
                            qo51Var.f190793X = 1;
                            objM83652a = upaVar5.m83652a(qo51Var);
                            yukVar = yuk.f276404a;
                            if (objM83652a == yukVar) {
                                return yukVar;
                            }
                            upaVar4 = upaVar5;
                            obj2 = objM83652a;
                            if (!((Boolean) obj2).booleanValue()) {
                                return w2a1Var;
                            }
                            if (upaVar4.m83653c() != null) {
                                throw new ClassCastException();
                            }
                            new rlv0().f200373a = null;
                            throw null;
                        }
                    case 5:
                        rlv0 rlv0Var8 = qo51Var.f190798e;
                        rlv0 rlv0Var9 = qo51Var.f190795b;
                        upa upaVar11 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        rlv0Var8.f200373a = obj2;
                        if (rlv0Var9.f200373a == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    case 6:
                        rlv0 rlv0Var10 = qo51Var.f190795b;
                        upa upaVar12 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        ((Boolean) obj2).getClass();
                        throw null;
                    case 7:
                        rlv0 rlv0Var11 = qo51Var.f190798e;
                        rlv0 rlv0Var12 = qo51Var.f190795b;
                        upaVar2 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        rlv0Var11.f200373a = obj2;
                        c6x0Var = w2a1Var;
                        rlv0Var = rlv0Var12;
                        upaVar3 = upaVar2;
                        thM77348a = s6x0.m77348a(c6x0Var);
                        if (thM77348a == null) {
                            Logger.m3966b(ei6.m39073j("STS: upload failed: ", thM77348a), new Object[0]);
                            throw ei6.m39072i(rlv0Var.f200373a);
                        }
                        if (!(c6x0Var instanceof c6x0)) {
                            throw ei6.m39072i(rlv0Var.f200373a);
                        }
                        upaVar5 = upaVar3;
                        qo51Var.f190794a = upaVar5;
                        qo51Var.f190795b = null;
                        qo51Var.f190796c = null;
                        qo51Var.f190797d = null;
                        qo51Var.f190798e = null;
                        qo51Var.f190793X = 1;
                        objM83652a = upaVar5.m83652a(qo51Var);
                        yukVar = yuk.f276404a;
                        if (objM83652a == yukVar) {
                            return yukVar;
                        }
                        upaVar4 = upaVar5;
                        obj2 = objM83652a;
                        if (!((Boolean) obj2).booleanValue()) {
                            return w2a1Var;
                        }
                        if (upaVar4.m83653c() != null) {
                            throw new ClassCastException();
                        }
                        new rlv0().f200373a = null;
                        throw null;
                    case 8:
                        upaVar3 = qo51Var.f190794a;
                        bga.m29073P(obj2);
                        upaVar5 = upaVar3;
                        qo51Var.f190794a = upaVar5;
                        qo51Var.f190795b = null;
                        qo51Var.f190796c = null;
                        qo51Var.f190797d = null;
                        qo51Var.f190798e = null;
                        qo51Var.f190793X = 1;
                        objM83652a = upaVar5.m83652a(qo51Var);
                        yukVar = yuk.f276404a;
                        if (objM83652a == yukVar) {
                            return yukVar;
                        }
                        upaVar4 = upaVar5;
                        obj2 = objM83652a;
                        if (!((Boolean) obj2).booleanValue()) {
                            return w2a1Var;
                        }
                        if (upaVar4.m83653c() != null) {
                            throw new ClassCastException();
                        }
                        new rlv0().f200373a = null;
                        throw null;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = obj;
                upaVar2 = upaVar;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m78619c() {
        zv41 zv41Var;
        Object value;
        yh50 yh50VarM93624a;
        this.f211103f.mo46962a(w2a1.f247311a);
        do {
            zv41Var = this.f211106i;
            value = zv41Var.getValue();
            yh50VarM93624a = (yh50) value;
            if (yh50VarM93624a.f272739g != null && yh50VarM93624a.f272737e - yh50VarM93624a.f272738f == 0) {
                yh50VarM93624a = yh50.m93624a(yh50VarM93624a, false, false, 0L, null, 255231);
            }
        } while (!zv41Var.m97089k(value, yh50VarM93624a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final void m78620d(ibk ibkVar) {
        no51 no51Var;
        if (ibkVar instanceof no51) {
            no51Var = (no51) ibkVar;
            int i = no51Var.f156594c;
            if ((i & Integer.MIN_VALUE) != 0) {
                no51Var.f156594c = i - Integer.MIN_VALUE;
            } else {
                no51Var = new no51(this, ibkVar);
            }
        } else {
            no51Var = new no51(this, ibkVar);
        }
        Object obj = no51Var.f156592a;
        int i2 = no51Var.f156594c;
        if (i2 == 0) {
            bga.m29073P(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        if (((b6l) obj) != null) {
            throw null;
        }
        throw new IllegalStateException(("Episode creation exceeded " + cks.m33200s(to51.f222187b)).toString());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:47:0x00a6, B:49:0x00b5, B:54:0x00c1, B:55:0x00cd), top: B:67:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0034, B:47:0x00a6, B:49:0x00b5, B:54:0x00c1, B:55:0x00cd), top: B:67:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m78621e(ibk ibkVar) throws Throwable {
        oo51 oo51Var;
        jsi0 jsi0Var;
        int i;
        jsi0 jsi0Var2;
        yo51 yo51Var;
        Object value;
        yh50 yh50VarM93624a;
        boolean z;
        if (ibkVar instanceof oo51) {
            oo51Var = (oo51) ibkVar;
            int i2 = oo51Var.f167472f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oo51Var.f167472f = i2 - Integer.MIN_VALUE;
            } else {
                oo51Var = new oo51(this, ibkVar);
            }
        } else {
            oo51Var = new oo51(this, ibkVar);
        }
        Object obj = oo51Var.f167470d;
        int i3 = oo51Var.f167472f;
        zv41 zv41Var = this.f211106i;
        w2a1 w2a1Var = w2a1.f247311a;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                lsi0 lsi0Var = this.f211104g;
                oo51Var.f167467a = lsi0Var;
                oo51Var.f167469c = 0;
                oo51Var.f167472f = 1;
                if (lsi0Var.mo54248a(oo51Var) != yukVar) {
                    jsi0Var = lsi0Var;
                    i = 0;
                }
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yo51Var = oo51Var.f167468b;
                jsi0Var2 = oo51Var.f167467a;
                try {
                    bga.m29073P(obj);
                    do {
                        value = zv41Var.getValue();
                        yh50VarM93624a = (yh50) value;
                        if (wj50.m88271j(yh50VarM93624a.f272739g, yo51Var)) {
                            if (yh50VarM93624a.f272737e - yh50VarM93624a.f272738f == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                yh50VarM93624a = yh50.m93624a(yh50VarM93624a, false, false, 0L, null, 255231);
                            }
                        }
                    } while (!zv41Var.m97089k(value, yh50VarM93624a));
                    jsi0Var2.mo54249c(null);
                    return w2a1Var;
                } catch (Throwable th) {
                    th = th;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            i = oo51Var.f167469c;
            jsi0Var = oo51Var.f167467a;
            bga.m29073P(obj);
            yh50 yh50Var = (yh50) zv41Var.getValue();
            int i4 = yh50Var.f272737e;
            int i5 = yh50Var.f272738f;
            if (!(i4 - i5 == 0) || yh50Var.f272733a || yh50Var.f272735c || yh50Var.f272736d) {
                jsi0Var.mo54249c(null);
                return w2a1Var;
            }
            if (i5 == 0) {
                jsi0Var.mo54249c(null);
                return w2a1Var;
            }
            yo51 yo51Var2 = yh50Var.f272739g;
            if (yo51Var2 == null) {
                jsi0Var.mo54249c(null);
                return w2a1Var;
            }
            long j = to51.f222186a;
            mo51 mo51Var = new mo51(this, fbkVar, 4);
            oo51Var.f167467a = jsi0Var;
            oo51Var.f167468b = yo51Var2;
            oo51Var.f167469c = i;
            oo51Var.f167472f = 2;
            if (s1h1.m76981v(j, mo51Var, oo51Var) != yukVar) {
                yo51Var = yo51Var2;
                jsi0Var2 = jsi0Var;
                do {
                    value = zv41Var.getValue();
                    yh50VarM93624a = (yh50) value;
                    if (wj50.m88271j(yh50VarM93624a.f272739g, yo51Var)) {
                        if (yh50VarM93624a.f272737e - yh50VarM93624a.f272738f == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            yh50VarM93624a = yh50.m93624a(yh50VarM93624a, false, false, 0L, null, 255231);
                        }
                    }
                } while (!zv41Var.m97089k(value, yh50VarM93624a));
                jsi0Var2.mo54249c(null);
                return w2a1Var;
            }
            return yukVar;
        } catch (Throwable th2) {
            th = th2;
            jsi0Var2 = jsi0Var;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final void m78622f(ibk ibkVar) {
        po51 po51Var;
        if (ibkVar instanceof po51) {
            po51Var = (po51) ibkVar;
            int i = po51Var.f179608c;
            if ((i & Integer.MIN_VALUE) != 0) {
                po51Var.f179608c = i - Integer.MIN_VALUE;
            } else {
                po51Var = new po51(this, ibkVar);
            }
        } else {
            po51Var = new po51(this, ibkVar);
        }
        Object obj = po51Var.f179606a;
        int i2 = po51Var.f179608c;
        if (i2 == 0) {
            bga.m29073P(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        String str = ((m0x0) obj).f138771a;
        throw null;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f211102e.mo30210A(null);
        kk40.m56680v(this.f211101d, null);
        ((ei40) this.f211099b).f59787a.dispose();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
