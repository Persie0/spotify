package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class i8z {

    /* JADX INFO: renamed from: a */
    public final wt80 f99875a;

    public i8z(wt80 wt80Var, r991 r991Var) {
        this.f99875a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r10 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r10 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0088 -> B:32:0x008b). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m49964a(String str, b791 b791Var, ibk ibkVar) {
        z791 z791Var;
        String str2;
        b791 b791Var2;
        Iterator it;
        int i;
        if (ibkVar instanceof z791) {
            z791Var = (z791) ibkVar;
            int i2 = z791Var.f280143g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z791Var.f280143g = i2 - Integer.MIN_VALUE;
            } else {
                z791Var = new z791(this, ibkVar);
            }
        } else {
            z791Var = new z791(this, ibkVar);
        }
        Object objM49967d = z791Var.f280141e;
        int i3 = z791Var.f280143g;
        boolean z = true;
        Object obj = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objM49967d);
            String str3 = b791Var.f24196b.f204174a;
            z791Var.f280137a = str;
            z791Var.f280138b = b791Var;
            z791Var.f280143g = 1;
            objM49967d = m49967d(str, str3, z791Var);
        } else if (i3 == 1) {
            b791Var = z791Var.f280138b;
            str = z791Var.f280137a;
            bga.m29073P(objM49967d);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = z791Var.f280140d;
            it = z791Var.f280139c;
            b791Var2 = z791Var.f280138b;
            str2 = z791Var.f280137a;
            bga.m29073P(objM49967d);
        }
        List list = (List) objM49967d;
        if (list == null) {
            return Boolean.FALSE;
        }
        if (list.isEmpty()) {
            z = false;
        } else {
            str2 = str;
            b791Var2 = b791Var;
            it = list.iterator();
            i = 0;
            if (it.hasNext()) {
                ut80 ut80Var = (ut80) it.next();
                z791Var.f280137a = str2;
                z791Var.f280138b = b791Var2;
                z791Var.f280139c = it;
                z791Var.f280140d = i;
                z791Var.f280143g = 2;
                objM49967d = m49968e(str2, ut80Var, b791Var2, z791Var);
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m49965b(int i, String str, ibk ibkVar) {
        a891 a891Var;
        if (ibkVar instanceof a891) {
            a891Var = (a891) ibkVar;
            int i2 = a891Var.f13231c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a891Var.f13231c = i2 - Integer.MIN_VALUE;
            } else {
                a891Var = new a891(this, ibkVar);
            }
        } else {
            a891Var = new a891(this, ibkVar);
        }
        Object objM62844i = a891Var.f13229a;
        int i3 = a891Var.f13231c;
        if (i3 == 0) {
            bga.m29073P(objM62844i);
            ex80 ex80Var = new ex80(str, null, null, new b5u0(i, 2), 6);
            a891Var.f13231c = 1;
            objM62844i = ((mu80) this.f99875a).m62844i(ex80Var, a891Var);
            yuk yukVar = yuk.f276404a;
            if (objM62844i == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62844i);
        }
        p2x0 p2x0Var = (p2x0) objM62844i;
        if (p2x0Var instanceof m2x0) {
            return (List) ((m2x0) p2x0Var).f139474a;
        }
        if (p2x0Var instanceof k2x0) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r12 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r12 == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0099 -> B:29:0x009c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m49966c(String str, b791 b791Var, ibk ibkVar) {
        b891 b891Var;
        String str2;
        b791 b791Var2;
        Collection arrayList;
        int i;
        int i2;
        int i3;
        Iterator it;
        if (ibkVar instanceof b891) {
            b891Var = (b891) ibkVar;
            int i4 = b891Var.f24535t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                b891Var.f24535t = i4 - Integer.MIN_VALUE;
            } else {
                b891Var = new b891(this, ibkVar);
            }
        } else {
            b891Var = new b891(this, ibkVar);
        }
        Object objM49967d = b891Var.f24533h;
        int i5 = b891Var.f24535t;
        Object obj = yuk.f276404a;
        if (i5 != 0) {
            if (i5 == 1) {
                b791Var = b891Var.f24527b;
                str = b891Var.f24526a;
                bga.m29073P(objM49967d);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = b891Var.f24532g;
                i2 = b891Var.f24531f;
                i3 = b891Var.f24530e;
                it = b891Var.f24529d;
                arrayList = b891Var.f24528c;
                b791Var2 = b891Var.f24527b;
                str2 = b891Var.f24526a;
                bga.m29073P(objM49967d);
            }
            p891 p891Var = (p891) objM49967d;
            if (p891Var != null) {
                arrayList.add(p891Var);
            }
            if (it.hasNext()) {
                return (List) arrayList;
            }
            ut80 ut80Var = (ut80) it.next();
            b891Var.f24526a = str2;
            b891Var.f24527b = b791Var2;
            b891Var.f24528c = arrayList;
            b891Var.f24529d = it;
            b891Var.f24530e = i3;
            b891Var.f24531f = i2;
            b891Var.f24532g = i;
            b891Var.f24535t = 2;
            objM49967d = m49968e(str2, ut80Var, b791Var2, b891Var);
        } else {
            bga.m29073P(objM49967d);
            String str3 = b791Var.f24196b.f204174a;
            b891Var.f24526a = str;
            b891Var.f24527b = b791Var;
            b891Var.f24535t = 1;
            objM49967d = m49967d(str, str3, b891Var);
        }
        List list = (List) objM49967d;
        if (list == null) {
            return lau.f131415a;
        }
        str2 = str;
        b791Var2 = b791Var;
        arrayList = new ArrayList();
        i = 0;
        i2 = 0;
        i3 = 0;
        it = list.iterator();
        if (it.hasNext()) {
            return (List) arrayList;
        }
        ut80 ut80Var2 = (ut80) it.next();
        b891Var.f24526a = str2;
        b891Var.f24527b = b791Var2;
        b891Var.f24528c = arrayList;
        b891Var.f24529d = it;
        b891Var.f24530e = i3;
        b891Var.f24531f = i2;
        b891Var.f24532g = i;
        b891Var.f24535t = 2;
        objM49967d = m49968e(str2, ut80Var2, b791Var2, b891Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m49967d(String str, String str2, ibk ibkVar) throws Throwable {
        c891 c891Var;
        if (ibkVar instanceof c891) {
            c891Var = (c891) ibkVar;
            int i = c891Var.f35148c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c891Var.f35148c = i - Integer.MIN_VALUE;
            } else {
                c891Var = new c891(this, ibkVar);
            }
        } else {
            c891Var = new c891(this, ibkVar);
        }
        Object objM89557A = c891Var.f35146a;
        int i2 = c891Var.f35148c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            c891Var.f35148c = 1;
            mu80 mu80Var = (mu80) this.f99875a;
            objM89557A = x0h1.m89557A(mu80Var.f147269c, new zt80(mu80Var, str, str2, fbkVar, 1), c891Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        p2x0 p2x0Var = (p2x0) objM89557A;
        if (p2x0Var != null) {
            if (p2x0Var instanceof m2x0) {
                return (List) ((m2x0) p2x0Var).f139474a;
            }
            if (!(p2x0Var instanceof k2x0)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m49968e(String str, ut80 ut80Var, b791 b791Var, ibk ibkVar) {
        d891 d891Var;
        if (ibkVar instanceof d891) {
            d891Var = (d891) ibkVar;
            int i = d891Var.f46413d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d891Var.f46413d = i - Integer.MIN_VALUE;
            } else {
                d891Var = new d891(this, ibkVar);
            }
        } else {
            d891Var = new d891(this, ibkVar);
        }
        Object objM49965b = d891Var.f46411b;
        int i2 = d891Var.f46413d;
        if (i2 == 0) {
            bga.m29073P(objM49965b);
            int i3 = ut80Var.f233842b;
            if (i3 < 0) {
                return null;
            }
            d891Var.f46410a = b791Var;
            d891Var.f46413d = 1;
            objM49965b = m49965b(i3, str, d891Var);
            Object obj = yuk.f276404a;
            if (objM49965b == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b791Var = d891Var.f46410a;
            bga.m29073P(objM49965b);
        }
        List list = (List) objM49965b;
        if (list == null || list.size() < 2) {
            return null;
        }
        dx80 dx80Var = (dx80) list.get(0);
        dx80 dx80Var2 = (dx80) list.get(1);
        if (!wj50.m88271j(dx80Var2.f53899c, b791Var.f24196b.f204175b)) {
            return null;
        }
        b791 b791VarM75017b = r991.m75017b(dx80Var.f53902f);
        if (b791VarM75017b != null) {
            if (!wj50.m88271j(b791Var.f24195a, b791VarM75017b.f24195a) || b791Var.f24197c != b791VarM75017b.f24197c || b791Var.f24198d != b791VarM75017b.f24198d) {
                return null;
            }
            rzl0 rzl0Var = b791Var.f24196b;
            rzl0 rzl0Var2 = b791VarM75017b.f24196b;
            if (!wj50.m88271j(rzl0Var.f204174a, rzl0Var2.f204174a) || !wj50.m88271j(rzl0Var.f204175b, rzl0Var2.f204175b) || !wj50.m88271j(rzl0Var.f204176c, rzl0Var2.f204176c) || !wj50.m88271j(rzl0Var.f204177d, rzl0Var2.f204177d) || !wj50.m88271j(rzl0Var.f204178e, rzl0Var2.f204178e) || !wj50.m88271j(rzl0Var.f204179f, rzl0Var2.f204179f) || rzl0Var.f204182i != rzl0Var2.f204182i || rzl0Var.f204183t != rzl0Var2.f204183t || rzl0Var.f204171X != rzl0Var2.f204171X) {
                return null;
            }
            Float f = rzl0Var.f204172Y;
            Float f2 = rzl0Var2.f204172Y;
            if (f == null) {
                if (f2 != null) {
                    return null;
                }
            } else if (f2 == null || f.floatValue() != f2.floatValue()) {
                return null;
            }
            Float f3 = rzl0Var.f204173Z;
            Float f4 = rzl0Var2.f204173Z;
            if (f3 == null) {
                if (f4 != null) {
                    return null;
                }
            } else if (f4 == null || f3.floatValue() != f4.floatValue()) {
                return null;
            }
            if (!wj50.m88271j(rzl0Var.f204165L0, rzl0Var2.f204165L0) || rzl0Var.f204166M0 != rzl0Var2.f204166M0 || rzl0Var.f204167N0 != rzl0Var2.f204167N0 || rzl0Var.f204168O0 != rzl0Var2.f204168O0 || rzl0Var.f204169P0 != rzl0Var2.f204169P0 || rzl0Var.f204170Q0 != rzl0Var2.f204170Q0) {
                return null;
            }
        }
        return new p891(dx80Var.f53897a, dx80Var2.f53897a);
    }

    public i8z(wt80 wt80Var) {
        this.f99875a = wt80Var;
    }
}
