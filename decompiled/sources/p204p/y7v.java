package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y7v implements p7v {

    /* JADX INFO: renamed from: a */
    public final mpk f270137a;

    /* JADX INFO: renamed from: b */
    public final h7u f270138b;

    public y7v(mpk mpkVar, vb5 vb5Var, h7u h7uVar) {
        this.f270137a = mpkVar;
        this.f270138b = h7uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r6 == r4) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93006a(ibk ibkVar) throws Throwable {
        q7v q7vVar;
        if (ibkVar instanceof q7v) {
            q7vVar = (q7v) ibkVar;
            int i = q7vVar.f186174c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q7vVar.f186174c = i - Integer.MIN_VALUE;
            } else {
                q7vVar = new q7v(this, ibkVar);
            }
        } else {
            q7vVar = new q7v(this, ibkVar);
        }
        Object objM46793F = q7vVar.f186172a;
        int i2 = q7vVar.f186174c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            q7vVar.f186174c = 1;
            objM46793F = this.f270138b.m46793F(q7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM46793F);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7v h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        q7vVar.f186174c = 2;
        mzx0 mzx0Var = new mzx0(seg1.m77914f(q7vVar));
        h7vVar.f88557a.m42926p().mo1510b(new b5p(mzx0Var, 23));
        Object objM63268a = mzx0Var.m63268a();
        if (objM63268a != yukVar) {
            objM63268a = w2a1.f247311a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r6 == r4) goto L28;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93007b(ibk ibkVar) throws Throwable {
        r7v r7vVar;
        if (ibkVar instanceof r7v) {
            r7vVar = (r7v) ibkVar;
            int i = r7vVar.f196653c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r7vVar.f196653c = i - Integer.MIN_VALUE;
            } else {
                r7vVar = new r7v(this, ibkVar);
            }
        } else {
            r7vVar = new r7v(this, ibkVar);
        }
        Object objM46793F = r7vVar.f196651a;
        int i2 = r7vVar.f196653c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            r7vVar.f196653c = 1;
            objM46793F = this.f270138b.m46793F(r7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM46793F);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7v h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        r7vVar.f196653c = 2;
        mzx0 mzx0Var = new mzx0(seg1.m77914f(r7vVar));
        h7vVar.f88557a.m42927q().mo1510b(new k9u(mzx0Var, 2));
        Object objM63268a = mzx0Var.m63268a();
        if (objM63268a != yukVar) {
            objM63268a = w2a1.f247311a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r6 == r4) goto L28;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93008c(fbk fbkVar) throws Throwable {
        s7v s7vVar;
        if (fbkVar instanceof s7v) {
            s7vVar = (s7v) fbkVar;
            int i = s7vVar.f206481c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s7vVar.f206481c = i - Integer.MIN_VALUE;
            } else {
                s7vVar = new s7v(this, fbkVar);
            }
        } else {
            s7vVar = new s7v(this, fbkVar);
        }
        Object objM46793F = s7vVar.f206479a;
        int i2 = s7vVar.f206481c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            s7vVar.f206481c = 1;
            objM46793F = this.f270138b.m46793F(s7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM46793F);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7v h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        s7vVar.f206481c = 2;
        mzx0 mzx0Var = new mzx0(seg1.m77914f(s7vVar));
        h7vVar.f88557a.m42928r().mo1510b(new i2v(mzx0Var, 1));
        Object objM63268a = mzx0Var.m63268a();
        if (objM63268a != yukVar) {
            objM63268a = w2a1.f247311a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m93009d(ibk ibkVar) {
        t7v t7vVar;
        if (ibkVar instanceof t7v) {
            t7vVar = (t7v) ibkVar;
            int i = t7vVar.f217903c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t7vVar.f217903c = i - Integer.MIN_VALUE;
            } else {
                t7vVar = new t7v(this, ibkVar);
            }
        } else {
            t7vVar = new t7v(this, ibkVar);
        }
        Object objM46793F = t7vVar.f217901a;
        int i2 = t7vVar.f217903c;
        boolean z = false;
        try {
            if (i2 == 0) {
                bga.m29073P(objM46793F);
                h7u h7uVar = this.f270138b;
                t7vVar.f217903c = 1;
                objM46793F = h7uVar.m46793F(t7vVar);
                yuk yukVar = yuk.f276404a;
                if (objM46793F == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46793F);
            }
            if (objM46793F != null) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return qyg1.m74178H(z);
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m93010e(AbstractC1895gf abstractC1895gf) {
        List listMo44552h = abstractC1895gf.mo44552h();
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo44552h.iterator();
        while (it.hasNext()) {
            Object objM62494a = this.f270137a.m62494a((axx) it.next(), abstractC1895gf.m44550f());
            Throwable thM77348a = s6x0.m77348a(objM62494a);
            if (thM77348a != null) {
                Logger.m3974j(thM77348a, "Error mapping item", new Object[0]);
                objM62494a = null;
            }
            acv acvVar = (acv) objM62494a;
            if (acvVar != null) {
                arrayList.add(acvVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:0: B:33:0x008d->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (r8 == r5) goto L43;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93011f(gh00 gh00Var, ibk ibkVar) throws Throwable {
        u7v u7vVar;
        h7v h7vVar;
        y7v y7vVar;
        ArrayList arrayListM93010e;
        it9 it9Var;
        Iterator it;
        hbk hbkVarM51617d;
        Object objM63268a;
        if (ibkVar instanceof u7v) {
            u7vVar = (u7v) ibkVar;
            int i = u7vVar.f227759f;
            if ((i & Integer.MIN_VALUE) != 0) {
                u7vVar.f227759f = i - Integer.MIN_VALUE;
            } else {
                u7vVar = new u7v(this, ibkVar);
            }
        } else {
            u7vVar = new u7v(this, ibkVar);
        }
        Object objM46793F = u7vVar.f227757d;
        int i2 = u7vVar.f227759f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            u7vVar.f227754a = gh00Var;
            u7vVar.f227759f = 1;
            objM46793F = this.f270138b.m46793F(u7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            gh00Var = (gh00) u7vVar.f227754a;
            bga.m29073P(objM46793F);
        } else if (i2 == 2) {
            y7vVar = u7vVar.f227756c;
            h7vVar = u7vVar.f227755b;
            bga.m29073P(objM46793F);
            arrayListM93010e = y7vVar.m93010e((y6v) objM46793F);
            if (arrayListM93010e.isEmpty()) {
                hbkVarM51617d = null;
            } else {
                it9Var = new it9(18);
                it = arrayListM93010e.iterator();
                while (it.hasNext()) {
                    it9Var.m51616b((acv) it.next());
                }
                hbkVarM51617d = it9Var.m51617d();
            }
            if (hbkVarM51617d != null) {
                u7vVar.f227754a = null;
                u7vVar.f227755b = null;
                u7vVar.f227756c = null;
                u7vVar.f227759f = 3;
                h7vVar.getClass();
                mzx0 mzx0Var = new mzx0(seg1.m77914f(u7vVar));
                fw40 fw40Var = h7vVar.f88557a;
                wel0 wel0Var = new wel0(25);
                wel0Var.m87895f(hbkVarM51617d);
                fw40Var.m42915B(wel0Var.m87891a()).mo1510b(new d9p(mzx0Var, 24));
                objM63268a = mzx0Var.m63268a();
                if (objM63268a != yukVar) {
                    objM63268a = w2a1.f247311a;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        u7vVar.f227754a = null;
        u7vVar.f227755b = h7vVar;
        u7vVar.f227756c = this;
        u7vVar.f227759f = 2;
        objM46793F = gh00Var.invoke(u7vVar);
        if (objM46793F != yukVar) {
            y7vVar = this;
            arrayListM93010e = y7vVar.m93010e((y6v) objM46793F);
            if (arrayListM93010e.isEmpty()) {
                hbkVarM51617d = null;
            } else {
                it9Var = new it9(18);
                it = arrayListM93010e.iterator();
                while (it.hasNext()) {
                    it9Var.m51616b((acv) it.next());
                }
                hbkVarM51617d = it9Var.m51617d();
            }
            if (hbkVarM51617d != null) {
                u7vVar.f227754a = null;
                u7vVar.f227755b = null;
                u7vVar.f227756c = null;
                u7vVar.f227759f = 3;
                h7vVar.getClass();
                mzx0 mzx0Var2 = new mzx0(seg1.m77914f(u7vVar));
                fw40 fw40Var2 = h7vVar.f88557a;
                wel0 wel0Var2 = new wel0(25);
                wel0Var2.m87895f(hbkVarM51617d);
                fw40Var2.m42915B(wel0Var2.m87891a()).mo1510b(new d9p(mzx0Var2, 24));
                objM63268a = mzx0Var2.m63268a();
                if (objM63268a != yukVar) {
                    objM63268a = w2a1.f247311a;
                }
            }
            return j6x0.f109420a;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130 A[LOOP:3: B:51:0x012a->B:53:0x0130, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x016f A[LOOP:4: B:60:0x0169->B:62:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        if (r14 == r4) goto L68;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93012g(vas vasVar, ibk ibkVar) throws Throwable {
        v7v v7vVar;
        h7v h7vVar;
        y7v y7vVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        pqk0 pqk0Var;
        Iterator it;
        Object objM63268a;
        ArrayList arrayListM93010e;
        cxq0 cxq0Var;
        Iterator it2;
        bav0 bav0VarM34330i;
        ArrayList arrayList3;
        if (ibkVar instanceof v7v) {
            v7vVar = (v7v) ibkVar;
            int i = v7vVar.f238324f;
            if ((i & Integer.MIN_VALUE) != 0) {
                v7vVar.f238324f = i - Integer.MIN_VALUE;
            } else {
                v7vVar = new v7v(this, ibkVar);
            }
        } else {
            v7vVar = new v7v(this, ibkVar);
        }
        Object objM46793F = v7vVar.f238322d;
        int i2 = v7vVar.f238324f;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            v7vVar.f238319a = vasVar;
            v7vVar.f238324f = 1;
            objM46793F = this.f270138b.m46793F(v7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            vasVar = v7vVar.f238319a;
            bga.m29073P(objM46793F);
        } else if (i2 == 2) {
            y7vVar = v7vVar.f238321c;
            h7vVar = v7vVar.f238320b;
            bga.m29073P(objM46793F);
            y7vVar.getClass();
            arrayList = new ArrayList();
            for (z6v z6vVar : (List) objM46793F) {
                arrayList3 = new ArrayList();
                for (axx axxVar : z6vVar.mo44552h()) {
                    if (axxVar.m27438c() != 0 || axxVar.m27438c() == 5) {
                        Logger.m3974j(new IllegalArgumentException(axxVar.m27439d() + " has unknown type: " + j4x.m52423u(axxVar.m27438c())), "Error mapping item", new Object[0]);
                    } else {
                        arrayList3.add(axxVar);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(z6v.m95516t(z6vVar, arrayList3));
                }
            }
            List<z6v> listM43728j1 = g6f.m43728j1(arrayList);
            arrayList2 = new ArrayList();
            for (z6v z6vVar2 : listM43728j1) {
                arrayListM93010e = y7vVar.m93010e(z6vVar2);
                if (arrayListM93010e.isEmpty()) {
                    bav0VarM34330i = null;
                } else {
                    cxq0Var = new cxq0(16);
                    cxq0Var.m34333m(z6vVar2.m95517u());
                    it2 = arrayListM93010e.iterator();
                    while (it2.hasNext()) {
                        cxq0Var.m34329g((acv) it2.next());
                    }
                    bav0VarM34330i = cxq0Var.m34330i();
                }
                if (bav0VarM34330i != null) {
                    arrayList2.add(bav0VarM34330i);
                }
            }
            if (!arrayList2.isEmpty()) {
                v7vVar.f238319a = null;
                v7vVar.f238320b = null;
                v7vVar.f238321c = null;
                v7vVar.f238324f = 3;
                h7vVar.getClass();
                mzx0 mzx0Var = new mzx0(seg1.m77914f(v7vVar));
                fw40 fw40Var = h7vVar.f88557a;
                pqk0Var = new pqk0();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    pqk0Var.m70655b((bav0) it.next());
                }
                fw40Var.m42916C(pqk0Var.m70656c()).mo1510b(new jwo(mzx0Var, 25));
                objM63268a = mzx0Var.m63268a();
                if (objM63268a != yukVar) {
                    objM63268a = w2a1.f247311a;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        v7vVar.f238319a = null;
        v7vVar.f238320b = h7vVar;
        v7vVar.f238321c = this;
        v7vVar.f238324f = 2;
        objM46793F = vasVar.invoke(v7vVar);
        if (objM46793F != yukVar) {
            y7vVar = this;
            y7vVar.getClass();
            arrayList = new ArrayList();
            while (r15.hasNext()) {
                arrayList3 = new ArrayList();
                while (r8.hasNext()) {
                    if (axxVar.m27438c() != 0) {
                    }
                    Logger.m3974j(new IllegalArgumentException(axxVar.m27439d() + " has unknown type: " + j4x.m52423u(axxVar.m27438c())), "Error mapping item", new Object[0]);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(z6v.m95516t(z6vVar, arrayList3));
                }
            }
            List<z6v> listM43728j2 = g6f.m43728j1(arrayList);
            arrayList2 = new ArrayList();
            while (r15.hasNext()) {
                arrayListM93010e = y7vVar.m93010e(z6vVar2);
                if (arrayListM93010e.isEmpty()) {
                    bav0VarM34330i = null;
                } else {
                    cxq0Var = new cxq0(16);
                    cxq0Var.m34333m(z6vVar2.m95517u());
                    it2 = arrayListM93010e.iterator();
                    while (it2.hasNext()) {
                        cxq0Var.m34329g((acv) it2.next());
                    }
                    bav0VarM34330i = cxq0Var.m34330i();
                }
                if (bav0VarM34330i != null) {
                    arrayList2.add(bav0VarM34330i);
                }
            }
            if (!arrayList2.isEmpty()) {
                v7vVar.f238319a = null;
                v7vVar.f238320b = null;
                v7vVar.f238321c = null;
                v7vVar.f238324f = 3;
                h7vVar.getClass();
                mzx0 mzx0Var2 = new mzx0(seg1.m77914f(v7vVar));
                fw40 fw40Var2 = h7vVar.f88557a;
                pqk0Var = new pqk0();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    pqk0Var.m70655b((bav0) it.next());
                }
                fw40Var2.m42916C(pqk0Var.m70656c()).mo1510b(new jwo(mzx0Var2, 25));
                objM63268a = mzx0Var2.m63268a();
                if (objM63268a != yukVar) {
                    objM63268a = w2a1.f247311a;
                }
            }
            return j6x0.f109420a;
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r7 == r4) goto L28;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93013h(fbk fbkVar) throws Throwable {
        w7v w7vVar;
        if (fbkVar instanceof w7v) {
            w7vVar = (w7v) fbkVar;
            int i = w7vVar.f248790c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7vVar.f248790c = i - Integer.MIN_VALUE;
            } else {
                w7vVar = new w7v(this, fbkVar);
            }
        } else {
            w7vVar = new w7v(this, fbkVar);
        }
        Object objM46793F = w7vVar.f248788a;
        int i2 = w7vVar.f248790c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM46793F);
            w7vVar.f248790c = 1;
            objM46793F = this.f270138b.m46793F(w7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM46793F);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7v h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        vr11 vr11Var = new vr11(1);
        vr11Var.m86264h(vb5.m85119r("https://open.spotify.com", "spotify-engage-sdk-sign-in"));
        a021 a021VarM86259b = vr11Var.m86259b();
        w7vVar.f248790c = 2;
        mzx0 mzx0Var = new mzx0(seg1.m77914f(w7vVar));
        fw40 fw40Var = h7vVar.f88557a;
        m8p0 m8p0Var = new m8p0();
        m8p0Var.m61133n(a021VarM86259b);
        fw40Var.m42917D(m8p0Var.m61130k()).mo1510b(new g7v(mzx0Var));
        Object objM63268a = mzx0Var.m63268a();
        if (objM63268a != yukVar) {
            objM63268a = w2a1.f247311a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r6 == r4) goto L28;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93014i(int i, fbk fbkVar) throws Throwable {
        x7v x7vVar;
        if (fbkVar instanceof x7v) {
            x7vVar = (x7v) fbkVar;
            int i2 = x7vVar.f258995d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x7vVar.f258995d = i2 - Integer.MIN_VALUE;
            } else {
                x7vVar = new x7v(this, fbkVar);
            }
        } else {
            x7vVar = new x7v(this, fbkVar);
        }
        Object objM46793F = x7vVar.f258993b;
        int i3 = x7vVar.f258995d;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM46793F);
            x7vVar.f258992a = i;
            x7vVar.f258995d = 1;
            objM46793F = this.f270138b.m46793F(x7vVar);
            if (objM46793F != yukVar) {
            }
            return yukVar;
        }
        if (i3 == 1) {
            i = x7vVar.f258992a;
            bga.m29073P(objM46793F);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM46793F);
        }
        return j6x0.f109420a;
        h7v h7vVar = (h7v) objM46793F;
        if (h7vVar == null) {
            return g6x0.f77139a;
        }
        x7vVar.f258992a = i;
        x7vVar.f258995d = 2;
        mzx0 mzx0Var = new mzx0(seg1.m77914f(x7vVar));
        fw40 fw40Var = h7vVar.f88557a;
        zz11 zz11Var = new zz11(26);
        zz11Var.m97260r(i);
        fw40Var.m42920G(zz11Var.m97252e()).mo1510b(new j3p(mzx0Var, 24));
        Object objM63268a = mzx0Var.m63268a();
        if (objM63268a != yukVar) {
            objM63268a = w2a1.f247311a;
        }
    }
}
