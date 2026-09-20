package p204p;

import android.content.Context;
import com.spotify.bluejay.data.api.GenerationServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ut9 implements lk5, j9a1 {

    /* JADX INFO: renamed from: a */
    public final x210 f233846a;

    /* JADX INFO: renamed from: b */
    public final raa1 f233847b;

    /* JADX INFO: renamed from: c */
    public final pt9 f233848c;

    /* JADX INFO: renamed from: d */
    public final xgq0 f233849d;

    /* JADX INFO: renamed from: e */
    public final v1k0 f233850e;

    /* JADX INFO: renamed from: f */
    public final Context f233851f;

    /* JADX INFO: renamed from: g */
    public final luk f233852g;

    public ut9(x210 x210Var, raa1 raa1Var, pt9 pt9Var, xgq0 xgq0Var, v1k0 v1k0Var, Context context, luk lukVar) {
        this.f233846a = x210Var;
        this.f233847b = raa1Var;
        this.f233848c = pt9Var;
        this.f233849d = xgq0Var;
        this.f233850e = v1k0Var;
        this.f233851f = context;
        this.f233852g = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p204p.lk5
    /* JADX INFO: renamed from: a */
    public final Object mo59216a(y210 y210Var, ibk ibkVar) {
        rt9 rt9Var;
        qt9 qt9Var;
        if (ibkVar instanceof rt9) {
            rt9Var = (rt9) ibkVar;
            int i = rt9Var.f202517d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt9Var.f202517d = i - Integer.MIN_VALUE;
            } else {
                rt9Var = new rt9(this, ibkVar);
            }
        } else {
            rt9Var = new rt9(this, ibkVar);
        }
        Object obj = rt9Var.f202515b;
        int i2 = rt9Var.f202517d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                qt9 qt9Var2 = (qt9) y210Var;
                x210 x210Var = this.f233846a;
                d6l d6lVar = new d6l(qt9Var2.f192324a, qt9Var2.f192327d, qt9Var2.f192326c, (ney0) null, 24);
                rt9Var.f202514a = qt9Var2;
                rt9Var.f202517d = 1;
                Object objM89699b = x210Var.m89699b(d6lVar, rt9Var);
                yuk yukVar = yuk.f276404a;
                if (objM89699b == yukVar) {
                    return yukVar;
                }
                qt9Var = qt9Var2;
                obj = objM89699b;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qt9Var = rt9Var.f202514a;
                bga.m29073P(obj);
            }
            e6l e6lVar = (e6l) obj;
            String str = xoc1.f264085f6.f243453a;
            String str2 = e6lVar.f56655a;
            e4r0 e4r0Var = e6lVar.f56656b;
            dmi dmiVar = new dmi(e4r0Var.f56168a, e4r0Var.f56169b);
            ArrayList arrayListM48658c = hug1.m48658c(e6lVar.f56657c);
            dsc1 dsc1Var = e6lVar.f56658d;
            kmi kmiVar = new kmi(dsc1Var.f52536a, dsc1Var.f52537b);
            fmi fmiVarM59990G = lug1.m59990G(e6lVar.f56659e);
            String str3 = (String) g6f.m43745s0(qt9Var.f192326c);
            String str4 = qt9Var.f192324a;
            boolean z = e6lVar.f56660f;
            ArrayList arrayList = e6lVar.f56661g;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ogv0 ogv0Var = (ogv0) it.next();
                arrayList2.add(new emi(ogv0Var.f165278a, ogv0Var.f165279b, ogv0Var.f165282e, ogv0Var.f165280c));
                it = it;
                str2 = str2;
            }
            return new ok5(new s7j0(str, 2, new pni(new cmi(str2, dmiVar, arrayListM48658c, kmiVar, fmiVarM59990G, str3, str4, z, arrayList2, e6lVar.f56662h, e6lVar.f56663i, qt9Var.f192334k, 8704))), qt9Var.f192325b);
        } catch (GenerationServiceException e) {
            return e.f3104b == 5 ? nk5.f154791a : new mk5(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new mk5(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // p204p.j9a1
    /* JADX INFO: renamed from: b */
    public final Object mo52739b(y210 y210Var, ibk ibkVar) {
        tt9 tt9Var;
        qt9 qt9Var;
        String str;
        ney0 ney0Var;
        ?? r15;
        if (ibkVar instanceof tt9) {
            tt9Var = (tt9) ibkVar;
            int i = tt9Var.f223560e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tt9Var.f223560e = i - Integer.MIN_VALUE;
            } else {
                tt9Var = new tt9(this, ibkVar);
            }
        } else {
            tt9Var = new tt9(this, ibkVar);
        }
        Object objM75106c = tt9Var.f223558c;
        int i2 = tt9Var.f223560e;
        boolean z = true;
        String str2 = null;
        ?? r3 = 0;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75106c);
                qt9 qt9Var2 = (qt9) y210Var;
                String str3 = qt9Var2.f192328e;
                if (str3 == null) {
                    return new mk5(new IllegalStateException("No URI provided for episode update"));
                }
                String str4 = qt9Var2.f192329f;
                if (str4 == null) {
                    return new mk5(new IllegalStateException("No schedule ID provided for episode update"));
                }
                vda1 vda1Var = qt9Var2.f192330g;
                xfy0 xfy0Var = (vda1Var == null || (ney0Var = qt9Var2.f192331h) == null) ? new xfy0(3, (Boolean) (r3 == true ? 1 : 0)) : gxf1.m46075e(vda1Var, ney0Var, qt9Var2.f192332i);
                raa1 raa1Var = this.f233847b;
                ney0 ney0Var2 = xfy0Var.f261121a;
                String str5 = qt9Var2.f192335l ? qt9Var2.f192324a : null;
                String str6 = qt9Var2.f192336m ? qt9Var2.f192327d : null;
                Boolean bool = xfy0Var.f261122b;
                Set set = qt9Var2.f192333j;
                pda1 pda1Var = new pda1(str3, str4, ney0Var2, str5, str6, bool, set != null ? new g081(g6f.m43710X0(set)) : null, qt9Var2.f192337n ? qt9Var2.f192334k : null);
                tt9Var.f223556a = qt9Var2;
                tt9Var.f223557b = str3;
                tt9Var.f223560e = 1;
                objM75106c = raa1Var.m75106c(pda1Var, tt9Var);
                yuk yukVar = yuk.f276404a;
                if (objM75106c == yukVar) {
                    return yukVar;
                }
                qt9Var = qt9Var2;
                str = str3;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = tt9Var.f223557b;
                qt9Var = tt9Var.f223556a;
                bga.m29073P(objM75106c);
            }
            String str7 = ((qda1) objM75106c).f187528a;
            if (str7 != null) {
                Set set2 = dd41.f47702f;
                if ((r46.m74726U(str7).f47709c == gn80.SHOW_SHOW) == false) {
                    str7 = null;
                }
                if (str7 == null) {
                    Set set3 = dd41.f47702f;
                    if (r46.m74726U(str).f47709c == gn80.SHOW_SHOW) {
                        r15 = true;
                    } else {
                        r15 = false;
                    }
                    if (r15 != false) {
                        str2 = str;
                    }
                } else {
                    str2 = str7;
                }
            } else {
                Set set4 = dd41.f47702f;
                if (r46.m74726U(str).f47709c == gn80.SHOW_SHOW) {
                    r15 = true;
                } else {
                    r15 = false;
                }
                if (r15 != false) {
                    str2 = str;
                }
            }
            boolean z2 = qt9Var.f192335l;
            boolean z3 = qt9Var.f192337n;
            boolean z4 = qt9Var.f192336m;
            ?? r5 = z2 || z4 || z3;
            String str8 = qt9Var.f192325b;
            if (r5 == true && str2 != null) {
                return new pk5(str2, xoc1.f264045a6.f243453a + "?config=BLUEJAY_EDIT_SUCCESS", str8);
            }
            if (!z2 && !z4 && !z3) {
                z = false;
            }
            if (z) {
                return new mk5(new IllegalStateException("No show URI returned for episode update"));
            }
            return new ok5(new s7j0(xoc1.f264045a6.f243453a + "?config=BLUEJAY_EDIT_SUCCESS", 4), str8);
        } catch (GenerationServiceException e) {
            return e.f3104b == 5 ? nk5.f154791a : new mk5(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new mk5(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r8 == r5) goto L32;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83925c(ik91 ik91Var, ibk ibkVar) throws Throwable {
        st9 st9Var;
        String str;
        if (ibkVar instanceof st9) {
            st9Var = (st9) ibkVar;
            int i = st9Var.f213860c;
            if ((i & Integer.MIN_VALUE) != 0) {
                st9Var.f213860c = i - Integer.MIN_VALUE;
            } else {
                st9Var = new st9(this, ibkVar);
            }
        } else {
            st9Var = new st9(this, ibkVar);
        }
        Object objM89557A = st9Var.f213858a;
        int i2 = st9Var.f213860c;
        Object fk91Var = ek91.f60416a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM89557A);
                if (this.f233848c.m70916a()) {
                    return fk91Var;
                }
                raa1 raa1Var = this.f233847b;
                kk91 kk91Var = new kk91(ik91Var.f103076a);
                st9Var.f213860c = 1;
                if (raa1Var.m75105b(kk91Var, st9Var) == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            if (((Boolean) objM89557A).booleanValue()) {
                str = xoc1.f264045a6.f243453a + "?config=BLUEJAY_CONFIRMED_NOTIFICATIONS";
            } else {
                str = xoc1.f264045a6.f243453a + "?config=BLUEJAY_REQUEST_NOTIFICATIONS";
            }
            return new gk91(new s7j0(str, 4));
            st9Var.f213860c = 2;
            objM89557A = x0h1.m89557A(this.f233852g, new cg5(this, (fbk) null, 12), st9Var);
        } catch (GenerationServiceException e) {
            if (e.f3104b != 5) {
                fk91Var = new fk91(e);
            }
            return fk91Var;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new fk91(e3);
        }
    }
}
