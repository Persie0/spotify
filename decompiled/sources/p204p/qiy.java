package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class qiy implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189088a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f189089b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f189090c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f189091d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f189092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f189093f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f189094g;

    public /* synthetic */ qiy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f189088a = i;
        this.f189089b = obj;
        this.f189090c = obj2;
        this.f189091d = obj3;
        this.f189092e = obj4;
        this.f189093f = obj5;
        this.f189094g = obj6;
    }

    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9, types: [p.fbk, p.fiz, p.niz, p.vhe0] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        iy80 iy80Var;
        niz nizVar;
        int i;
        vhe0 vhe0Var;
        int i2;
        fbk fbkVar2;
        Object v78Var;
        fbk fbkVar3;
        fiz fizVar;
        int i3;
        niz nizVar2;
        ?? r7;
        zux zuxVar;
        switch (this.f189088a) {
            case 0:
                ncd1 ncd1Var = (ncd1) obj;
                kqi0 kqi0Var = (kqi0) this.f189094g;
                kqi0 kqi0Var2 = (kqi0) this.f189093f;
                kqi0 kqi0Var3 = (kqi0) this.f189092e;
                kqi0 kqi0Var4 = (kqi0) this.f189091d;
                piy piyVar = (piy) this.f189089b;
                kqi0 kqi0Var5 = (kqi0) this.f189090c;
                if (ncd1Var instanceof lcd1) {
                    vwf vwfVar = piyVar.f178077a;
                    ll20 ll20Var = ((lcd1) ncd1Var).f131908a;
                    vwf vwfVar2 = ll20Var.f134515a;
                    if (vwfVar2 != null) {
                        vwfVar = vwfVar2;
                    }
                    kqi0Var5.setValue(vwfVar);
                    kqi0Var4.setValue(Boolean.valueOf(ll20Var.f134517c));
                    kqi0Var3.setValue(Boolean.FALSE);
                    Integer num = ll20Var.f134516b;
                    kqi0Var2.setValue(num != null ? new n6f(rfg1.m75432b(num.intValue())) : null);
                    kqi0Var.setValue(null);
                } else {
                    if (!(ncd1Var instanceof mcd1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kqi0Var5.setValue(piyVar.f178077a);
                    Boolean bool = Boolean.FALSE;
                    kqi0Var4.setValue(bool);
                    kqi0Var3.setValue(bool);
                    kqi0Var2.setValue(null);
                    kqi0Var.setValue(null);
                }
                return w2a1.f247311a;
            default:
                ago agoVar = (ago) this.f189094g;
                oy80 oy80Var = (oy80) this.f189093f;
                if (fbkVar instanceof iy80) {
                    iy80Var = (iy80) fbkVar;
                    int i4 = iy80Var.f106899b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        iy80Var.f106899b = i4 - Integer.MIN_VALUE;
                    } else {
                        iy80Var = new iy80(this, fbkVar);
                    }
                } else {
                    iy80Var = new iy80(this, fbkVar);
                }
                Object obj2 = iy80Var.f106898a;
                int i5 = iy80Var.f106899b;
                int i6 = 3;
                yuk yukVar = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i = iy80Var.f106905h;
                        int i7 = iy80Var.f106901d;
                        vhe0 vhe0Var2 = iy80Var.f106903f;
                        nizVar = iy80Var.f106900c;
                        bga.m29073P(obj2);
                        i2 = i7;
                        vhe0Var = vhe0Var2;
                    } else if (i5 == 2) {
                        i3 = iy80Var.f106901d;
                        fizVar = iy80Var.f106904g;
                        nizVar2 = iy80Var.f106900c;
                        bga.m29073P(obj2);
                        r7 = 0;
                        zuxVar = new zux(fizVar, (fiz) obj2, new bm70(i6, 4, (fbk) r7), 1);
                        iy80Var.f106900c = r7;
                        iy80Var.f106903f = r7;
                        iy80Var.f106904g = r7;
                        iy80Var.f106901d = i3;
                        iy80Var.f106899b = 3;
                        if (nizVar2.emit(zuxVar, iy80Var) == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj2);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj2);
                niz nizVar3 = (niz) this.f189089b;
                eq80 eq80Var = (eq80) this.f189090c;
                vhe0 vhe0Var3 = new vhe0((String) this.f189091d, eq80Var.f61809b, (String) this.f189092e, (hz80) obj, eq80Var.f61810c, eq80Var.f61811d);
                iy80Var.f106900c = nizVar3;
                iy80Var.f106903f = vhe0Var3;
                iy80Var.f106901d = 0;
                iy80Var.f106905h = 0;
                iy80Var.f106899b = 1;
                Object objM68414a = oy80.m68414a(oy80Var, vhe0Var3, agoVar, iy80Var);
                if (objM68414a == yukVar) {
                    return yukVar;
                }
                nizVar = nizVar3;
                obj2 = objM68414a;
                i = 0;
                vhe0Var = vhe0Var3;
                i2 = 0;
                fiz fizVar2 = (fiz) obj2;
                iy80Var.f106900c = nizVar;
                iy80Var.f106903f = null;
                iy80Var.f106904g = fizVar2;
                iy80Var.f106901d = i2;
                iy80Var.f106905h = i;
                iy80Var.f106899b = 2;
                List list = oy80Var.f171693d;
                if (list.isEmpty()) {
                    v78Var = new ysk(lau.f131415a, 27);
                    fbkVar2 = null;
                } else if (oy80Var.f171694e.m56158c()) {
                    vhe0 vhe0Var4 = vhe0Var;
                    fbkVar3 = null;
                    v78Var = new nzx0(new gnq(oy80Var, vhe0Var4, agoVar, fbkVar3, 16));
                } else {
                    vhe0 vhe0Var5 = vhe0Var;
                    fbkVar2 = null;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((o5k) it.next()).mo28140a(vhe0Var5, agoVar));
                    }
                    v78Var = new v78((fiz[]) g6f.m43728j1(arrayList).toArray(new fiz[0]), 19);
                }
                if (v78Var == yukVar) {
                    fbkVar2 = fbkVar3;
                    return yukVar;
                }
                fbkVar2 = fbkVar3;
                Object obj3 = v78Var;
                fizVar = fizVar2;
                obj2 = obj3;
                i3 = i2;
                nizVar2 = nizVar;
                r7 = fbkVar2;
                zuxVar = new zux(fizVar, (fiz) obj2, new bm70(i6, 4, (fbk) r7), 1);
                iy80Var.f106900c = r7;
                iy80Var.f106903f = r7;
                iy80Var.f106904g = r7;
                iy80Var.f106901d = i3;
                iy80Var.f106899b = 3;
                if (nizVar2.emit(zuxVar, iy80Var) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
        }
    }
}
