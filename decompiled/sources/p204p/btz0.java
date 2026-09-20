package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btz0 extends g0b1 {
    /* JADX INFO: renamed from: A */
    public static qsz0 m30477A(Iterator it) {
        return m30478B(new ek5(it, 4));
    }

    /* JADX INFO: renamed from: B */
    public static qsz0 m30478B(qsz0 qsz0Var) {
        return qsz0Var instanceof b6j ? qsz0Var : new b6j(qsz0Var);
    }

    /* JADX INFO: renamed from: C */
    public static qsz0 m30479C(qsz0 qsz0Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return qsz0Var;
        }
        return qsz0Var instanceof zhs ? ((zhs) qsz0Var).mo41264a(i) : new ths(qsz0Var, i, 0);
    }

    /* JADX INFO: renamed from: D */
    public static a7z m30480D(gh00 gh00Var, qsz0 qsz0Var) {
        return new a7z(qsz0Var, true, gh00Var);
    }

    /* JADX INFO: renamed from: E */
    public static a7z m30481E(gh00 gh00Var, qsz0 qsz0Var) {
        return new a7z(qsz0Var, false, gh00Var);
    }

    /* JADX INFO: renamed from: F */
    public static Object m30482F(a7z a7zVar) {
        z6z z6zVar = new z6z(a7zVar);
        if (z6zVar.hasNext()) {
            return z6zVar.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: G */
    public static egz m30483G(gh00 gh00Var, qsz0 qsz0Var) {
        return new egz(qsz0Var, gh00Var, etz0.f62828h);
    }

    /* JADX INFO: renamed from: H */
    public static egz m30484H(gh00 gh00Var, qsz0 qsz0Var) {
        return new egz(qsz0Var, gh00Var, dtz0.f52922h);
    }

    /* JADX INFO: renamed from: I */
    public static final egz m30485I(qsz0 qsz0Var) {
        q5s0 q5s0Var = new q5s0(18);
        if (!(qsz0Var instanceof j691)) {
            return new egz(qsz0Var, new nm6(8), q5s0Var);
        }
        j691 j691Var = (j691) qsz0Var;
        return new egz(j691Var.f109257a, j691Var.f109258b, q5s0Var);
    }

    /* JADX INFO: renamed from: J */
    public static k310 m30486J(C2570xf c2570xf) {
        return new k310(0, c2570xf, trv0.f223138h);
    }

    /* JADX INFO: renamed from: K */
    public static qsz0 m30487K(Object obj, gh00 gh00Var) {
        if (obj == null) {
            return fbu.f67898a;
        }
        return new k310(0, new ew40(obj, 20), gh00Var);
    }

    /* JADX INFO: renamed from: L */
    public static qsz0 m30488L(eh00 eh00Var) {
        return m30478B(new k310(0, eh00Var, new t45(7, eh00Var)));
    }

    /* JADX INFO: renamed from: M */
    public static String m30489M(qsz0 qsz0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : qsz0Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            q0f1.m71839n(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public static Object m30490N(qsz0 qsz0Var) {
        Iterator it = qsz0Var.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: O */
    public static a7z m30491O(gh00 gh00Var, qsz0 qsz0Var) {
        return m30481E(new q5s0(20), new j691(gh00Var, qsz0Var));
    }

    /* JADX INFO: renamed from: P */
    public static Object m30492P(a7z a7zVar, Comparator comparator) {
        z6z z6zVar = new z6z(a7zVar);
        if (!z6zVar.hasNext()) {
            return null;
        }
        Object next = z6zVar.next();
        while (z6zVar.hasNext()) {
            Object next2 = z6zVar.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX INFO: renamed from: Q */
    public static ek5 m30493Q(Object obj) {
        return new ek5(obj, 5);
    }

    /* JADX INFO: renamed from: R */
    public static qsz0 m30494R(Object... objArr) {
        return bk5.m29613h0(objArr);
    }

    /* JADX INFO: renamed from: S */
    public static qsz0 m30495S(qsz0 qsz0Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38563l("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return fbu.f67898a;
        }
        return qsz0Var instanceof zhs ? ((zhs) qsz0Var).mo41265b(i) : new ths(qsz0Var, i, 1);
    }

    /* JADX INFO: renamed from: T */
    public static List m30496T(qsz0 qsz0Var) {
        Iterator it = qsz0Var.iterator();
        if (!it.hasNext()) {
            return lau.f131415a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return geg1.m44518y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public static ArrayList m30497U(qsz0 qsz0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = qsz0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static Set m30498V(qsz0 qsz0Var) {
        Iterator it = qsz0Var.iterator();
        if (!it.hasNext()) {
            return gbu.f78413a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: W */
    public static ek5 m30499W(ek5 ek5Var) {
        return new ek5(new ids(ek5Var, new xaf(26), null, 2));
    }
}
