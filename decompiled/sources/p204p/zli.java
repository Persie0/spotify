package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class zli extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final cmi f284017d;

    /* JADX INFO: renamed from: e */
    public final eoi f284018e;

    /* JADX INFO: renamed from: f */
    public final a3j f284019f;

    /* JADX INFO: renamed from: g */
    public bmi f284020g;

    /* JADX INFO: renamed from: h */
    public final c9k f284021h;

    /* JADX INFO: renamed from: i */
    public di41 f284022i;

    public zli(cmi cmiVar, eoi eoiVar, a3j a3jVar, luk lukVar) {
        this.f284017d = cmiVar;
        this.f284018e = eoiVar;
        this.f284019f = a3jVar;
        this.f284021h = kk40.m56661c(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129 A[LOOP:3: B:60:0x0123->B:62:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c A[EDGE_INSN: B:83:0x017c->B:84:0x017d BREAK  A[LOOP:0: B:70:0x0149->B:102:0x0149]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX INFO: renamed from: k */
    public static final Object m96381k(zli zliVar, ibk ibkVar) {
        xli xliVar;
        qf40 qf40Var;
        qf40 qf40Var2;
        List list;
        qf40 qf40VarM33922v;
        ArrayList arrayList;
        Iterator it;
        ig40 ig40VarM67576z;
        emi emiVar;
        ig40 ig40Var;
        boolean z;
        eea eeaVar;
        boolean z2;
        cmi cmiVar = zliVar.f284017d;
        if (ibkVar instanceof xli) {
            xliVar = (xli) ibkVar;
            int i = xliVar.f263152d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xliVar.f263152d = i - Integer.MIN_VALUE;
            } else {
                xliVar = new xli(zliVar, ibkVar);
            }
        } else {
            xliVar = new xli(zliVar, ibkVar);
        }
        Object objM65707s = xliVar.f263150b;
        int i2 = xliVar.f263152d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM65707s);
            List list2 = cmiVar.f39686c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                jmi jmiVar = ((gmi) it2.next()).f81409a;
                imi imiVar = jmiVar instanceof imi ? (imi) jmiVar : null;
                String str = imiVar != null ? imiVar.f103708a : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            List list3 = cmiVar.f39686c;
            ArrayList<hmi> arrayList3 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                jmi jmiVar2 = ((gmi) it3.next()).f81409a;
                hmi hmiVar = jmiVar2 instanceof hmi ? (hmi) jmiVar2 : null;
                if (hmiVar != null) {
                    arrayList3.add(hmiVar);
                }
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
            for (hmi hmiVar2 : arrayList3) {
                arrayList4.add(new b7o0(hmiVar2.f92985a, hmiVar2.f92988d, hmiVar2.f92986b, hmiVar2.f92987c));
            }
            eoi eoiVar = zliVar.f284018e;
            xliVar.f263152d = 1;
            objM65707s = nug1.m65707s(eoiVar, arrayList2, arrayList4, xliVar);
            if (objM65707s != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM65707s);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qf40 qf40Var3 = xliVar.f263149a;
            bga.m29073P(objM65707s);
            qf40Var = qf40Var3;
        }
        qf40Var2 = (qf40) objM65707s;
        List list4 = cmiVar.f39692i;
        list = cmiVar.f39693t;
        qf40VarM33922v = cuf1.m33922v(opo.m67574x(list4), qf40Var2);
        if (list != null) {
            ig40VarM67576z = opo.m67576z(list);
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : qf40VarM33922v) {
                emiVar = (emi) obj2;
                if (!emiVar.f60921b && emiVar.f60922c) {
                    arrayList5.add(obj2);
                }
            }
            arrayList = new ArrayList(i6f.m49804T(arrayList5, 10));
            it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList.add(((emi) it.next()).f60920a);
            }
            ig40VarM67576z = opo.m67576z(arrayList);
        }
        ig40Var = ig40VarM67576z;
        if (list != null || (qf40VarM33922v != null && qf40VarM33922v.isEmpty())) {
            z = false;
            break;
        }
        Iterator<E> it4 = qf40VarM33922v.iterator();
        loop0: while (true) {
            if (!it4.hasNext()) {
                z = false;
                break;
            }
            emi emiVar2 = (emi) it4.next();
            if (!emiVar2.f60921b && !qf40Var2.isEmpty()) {
                Iterator<E> it5 = qf40Var2.iterator();
                while (it5.hasNext()) {
                    if (wj50.m88271j(((x1j) it5.next()).f257206a, emiVar2.f60920a)) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        if (!((AbstractC2282q6) qf40Var).isEmpty()) {
            throw new IllegalStateException("No show metadata could be resolved");
        }
        String str2 = cmiVar.f39684a;
        dmi dmiVar = cmiVar.f39685b;
        kmi kmiVar = cmiVar.f39687d;
        fmi fmiVar = cmiVar.f39688e;
        dp11 dp11Var = (dp11) g6f.m43741q0(qf40Var);
        String str3 = cmiVar.f39689f;
        String str4 = cmiVar.f39690g;
        boolean z3 = cmiVar.f39691h;
        boolean zM33915o = cuf1.m33915o(cmiVar.f39688e);
        if (z) {
            eeaVar = eea.f58725d;
        } else {
            eeaVar = eea.f58722a;
        }
        eea eeaVar2 = eeaVar;
        if (list != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        zliVar.f284020g = new bmi(str2, dmiVar, qf40Var, kmiVar, fmiVar, dp11Var, str3, null, str4, false, false, z3, zM33915o, eeaVar2, lga1.f133191a, null, false, null, s8c.f206624a, 0, null, qf40VarM33922v, ig40Var, orn0.f168627d, z2, qf40Var2, cmiVar.f39681X, cmiVar.f39682Y, cmiVar.f39683Z);
        return w2a1.f247311a;
        qf40 qf40Var4 = (qf40) objM65707s;
        xliVar.f263149a = qf40Var4;
        xliVar.f263152d = 2;
        Object objM96382l = zliVar.m96382l(xliVar);
        if (objM96382l != obj) {
            qf40Var = qf40Var4;
            objM65707s = objM96382l;
            qf40Var2 = (qf40) objM65707s;
            List list5 = cmiVar.f39692i;
            list = cmiVar.f39693t;
            qf40VarM33922v = cuf1.m33922v(opo.m67574x(list5), qf40Var2);
            if (list != null) {
                ig40VarM67576z = opo.m67576z(list);
            } else {
                ArrayList arrayList6 = new ArrayList();
                while (r6.hasNext()) {
                    emiVar = (emi) obj2;
                    if (!emiVar.f60921b) {
                    }
                }
                arrayList = new ArrayList(i6f.m49804T(arrayList6, 10));
                it = arrayList6.iterator();
                while (it.hasNext()) {
                    arrayList.add(((emi) it.next()).f60920a);
                }
                ig40VarM67576z = opo.m67576z(arrayList);
            }
            ig40Var = ig40VarM67576z;
            if (list != null) {
                z = false;
                break;
            }
            z = false;
            break;
            if (!((AbstractC2282q6) qf40Var).isEmpty()) {
                throw new IllegalStateException("No show metadata could be resolved");
            }
            String str5 = cmiVar.f39684a;
            dmi dmiVar2 = cmiVar.f39685b;
            kmi kmiVar2 = cmiVar.f39687d;
            fmi fmiVar2 = cmiVar.f39688e;
            dp11 dp11Var2 = (dp11) g6f.m43741q0(qf40Var);
            String str6 = cmiVar.f39689f;
            String str7 = cmiVar.f39690g;
            boolean z4 = cmiVar.f39691h;
            boolean zM33915o2 = cuf1.m33915o(cmiVar.f39688e);
            if (z) {
                eeaVar = eea.f58725d;
            } else {
                eeaVar = eea.f58722a;
            }
            eea eeaVar3 = eeaVar;
            if (list != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            zliVar.f284020g = new bmi(str5, dmiVar2, qf40Var, kmiVar2, fmiVar2, dp11Var2, str6, null, str7, false, false, z4, zM33915o2, eeaVar3, lga1.f133191a, null, false, null, s8c.f206624a, 0, null, qf40VarM33922v, ig40Var, orn0.f168627d, z2, qf40Var2, cmiVar.f39681X, cmiVar.f39682Y, cmiVar.f39683Z);
            return w2a1.f247311a;
        }
        return obj;
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        cmi cmiVar = this.f284017d;
        if (wl51.m88460J0(cmiVar.f39684a)) {
            m35105h(new IllegalArgumentException("generationId must not be blank"));
            return;
        }
        if (wl51.m88460J0(cmiVar.f39687d.f124165a)) {
            m35105h(new IllegalArgumentException("voice.voiceId must not be blank"));
            return;
        }
        m35107j();
        this.f284022i = x0h1.m89578u(this.f284021h, null, 0, new rrd(this, (fbk) null, 8), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        di41 di41Var = this.f284022i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m96382l(ibk ibkVar) {
        yli yliVar;
        if (ibkVar instanceof yli) {
            yliVar = (yli) ibkVar;
            int i = yliVar.f274031c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yliVar.f274031c = i - Integer.MIN_VALUE;
            } else {
                yliVar = new yli(this, ibkVar);
            }
        } else {
            yliVar = new yli(this, ibkVar);
        }
        Object objM24630a = yliVar.f274029a;
        int i2 = yliVar.f274031c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM24630a);
                if (!this.f284017d.f39692i.isEmpty()) {
                    a3j a3jVar = this.f284019f;
                    yliVar.f274031c = 1;
                    objM24630a = a3jVar.m24630a(yliVar);
                    Object obj = yuk.f276404a;
                    if (objM24630a == obj) {
                        return obj;
                    }
                }
                return lv21.f137205b;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM24630a);
            return opo.m67574x((Iterable) objM24630a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
