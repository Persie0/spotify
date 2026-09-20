package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u110 extends a210 {

    /* JADX INFO: renamed from: a */
    public final luy f225643a;

    public u110() {
        this.f225643a = new luy();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m82138g() {
        ov21 ov21Var = this.f225643a.f137172a;
        for (int i = 0; i < ov21Var.f170407b.size(); i++) {
            if (!luy.m60035e((Map.Entry) ov21Var.f170407b.get(i))) {
                return false;
            }
        }
        Iterator it = ov21Var.m68112c().iterator();
        while (it.hasNext()) {
            if (!luy.m60035e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final int m82139h() {
        ov21 ov21Var = this.f225643a.f137172a;
        int iM60034d = 0;
        for (int i = 0; i < ov21Var.f170407b.size(); i++) {
            Map.Entry entry = (Map.Entry) ov21Var.f170407b.get(i);
            iM60034d += luy.m60034d((v110) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : ov21Var.m68112c()) {
            iM60034d += luy.m60034d((v110) entry2.getKey(), entry2.getValue());
        }
        return iM60034d;
    }

    /* JADX INFO: renamed from: i */
    public final Object m82140i(x110 x110Var) {
        m82144m(x110Var);
        v110 v110Var = x110Var.f257030d;
        Object obj = this.f225643a.f137172a.get(v110Var);
        if (obj == null) {
            return x110Var.f257028b;
        }
        if (!v110Var.f236219c) {
            return x110Var.m89616a(obj);
        }
        if (v110Var.f236218b.f256273a != zyd1.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(x110Var.m89616a(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m82141j(x110 x110Var) {
        m82144m(x110Var);
        v110 v110Var = x110Var.f257030d;
        luy luyVar = this.f225643a;
        luyVar.getClass();
        if (v110Var.f236219c) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return luyVar.f137172a.get(v110Var) != null;
    }

    /* JADX INFO: renamed from: k */
    public final void m82142k() {
        this.f225643a.m60041f();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    /* JADX INFO: renamed from: l */
    public final boolean m82143l(pwe pweVar, w780 w780Var, bux buxVar, int i) throws InvalidProtocolBufferException {
        boolean z;
        boolean z2;
        Object objMo26645b;
        AbstractC2155n8 abstractC2155n8;
        int i2 = i & 7;
        x110 x110Var = (x110) buxVar.f31230a.get(new wtx(getDefaultInstanceForType(), i >>> 3));
        if (x110Var == null) {
            z2 = true;
            z = false;
        } else {
            v110 v110Var = x110Var.f257030d;
            wyd1 wyd1Var = v110Var.f236218b;
            luy luyVar = luy.f137171c;
            if (i2 == wyd1Var.f256274b) {
                z2 = false;
                z = false;
            } else if (v110Var.f236219c && wyd1Var.mo65873a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return pweVar.m71252r(i, w780Var);
        }
        n110 n110VarMo24391b = null;
        luy luyVar2 = this.f225643a;
        if (z) {
            int iM71239e = pweVar.m71239e(pweVar.m71246l());
            v110 v110Var2 = x110Var.f257030d;
            if (v110Var2.f236218b != wyd1.f256271g) {
                while (pweVar.m71237c() > 0) {
                    luyVar2.m60039a(v110Var2, luy.m60036h(pweVar, v110Var2.f236218b));
                }
            } else if (pweVar.m71237c() > 0) {
                pweVar.m71246l();
                throw null;
            }
            pweVar.m71238d(iM71239e);
            return true;
        }
        v110 v110Var3 = x110Var.f257030d;
        wyd1 wyd1Var2 = v110Var3.f236218b;
        boolean z3 = v110Var3.f236219c;
        int iOrdinal = wyd1Var2.f256273a.ordinal();
        if (iOrdinal == 7) {
            pweVar.m71246l();
            throw null;
        }
        if (iOrdinal != 8) {
            objMo26645b = luy.m60036h(pweVar, wyd1Var2);
        } else {
            if (!z3 && (abstractC2155n8 = (AbstractC2155n8) luyVar2.f137172a.get(v110Var3)) != null) {
                n110VarMo24391b = abstractC2155n8.mo24392c();
            }
            if (n110VarMo24391b == null) {
                n110VarMo24391b = x110Var.f257029c.mo24391b();
            }
            if (wyd1Var2 == wyd1.f256269e) {
                int i3 = v110Var3.f236217a;
                pweVar.m71236b();
                pweVar.f182005i++;
                n110VarMo24391b.mo26646c(pweVar, buxVar);
                pweVar.m71235a((i3 << 3) | 4);
                pweVar.f182005i--;
            } else {
                int iM71246l = pweVar.m71246l();
                pweVar.m71236b();
                int iM71239e2 = pweVar.m71239e(iM71246l);
                pweVar.f182005i++;
                n110VarMo24391b.mo26646c(pweVar, buxVar);
                pweVar.m71235a(0);
                pweVar.f182005i--;
                pweVar.m71238d(iM71239e2);
            }
            objMo26645b = n110VarMo24391b.mo26645b();
        }
        if (z3) {
            luyVar2.m60039a(v110Var3, x110Var.m89617b(objMo26645b));
            return true;
        }
        luyVar2.m60043i(v110Var3, x110Var.m89617b(objMo26645b));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m82144m(x110 x110Var) {
        if (x110Var.f257027a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public u110(t110 t110Var) {
        t110Var.f216049b.m60041f();
        t110Var.f216050c = false;
        this.f225643a = t110Var.f216049b;
    }
}
