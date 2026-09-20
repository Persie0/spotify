package p204p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class uzx0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public qzx0 f235652a;

    /* JADX INFO: renamed from: b */
    public qzx0 f235653b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f235654c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public int f235655d = 0;

    /* JADX INFO: renamed from: a */
    public qzx0 mo84312a(Object obj) {
        qzx0 qzx0Var = this.f235652a;
        while (qzx0Var != null && !qzx0Var.f194328a.equals(obj)) {
            qzx0Var = qzx0Var.f194330c;
        }
        return qzx0Var;
    }

    /* JADX INFO: renamed from: b */
    public Object mo84313b(Object obj) {
        qzx0 qzx0VarMo84312a = mo84312a(obj);
        if (qzx0VarMo84312a == null) {
            return null;
        }
        this.f235655d--;
        WeakHashMap weakHashMap = this.f235654c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((tzx0) it.next()).mo76837a(qzx0VarMo84312a);
            }
        }
        qzx0 qzx0Var = qzx0VarMo84312a.f194331d;
        if (qzx0Var != null) {
            qzx0Var.f194330c = qzx0VarMo84312a.f194330c;
        } else {
            this.f235652a = qzx0VarMo84312a.f194330c;
        }
        qzx0 qzx0Var2 = qzx0VarMo84312a.f194330c;
        if (qzx0Var2 != null) {
            qzx0Var2.f194331d = qzx0Var;
        } else {
            this.f235653b = qzx0Var;
        }
        qzx0VarMo84312a.f194330c = null;
        qzx0VarMo84312a.f194331d = null;
        return qzx0VarMo84312a.f194329b;
    }

    public final boolean equals(Object obj) {
        szx0 szx0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uzx0)) {
            return false;
        }
        uzx0 uzx0Var = (uzx0) obj;
        if (this.f235655d != uzx0Var.f235655d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = uzx0Var.iterator();
        while (true) {
            szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                break;
            }
            szx0 szx0Var2 = (szx0) it2;
            if (!szx0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) szx0Var.next();
            Object next = szx0Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (szx0Var.hasNext() || ((szx0) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            szx0 szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) szx0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ozx0 ozx0Var = new ozx0(this.f235652a, this.f235653b);
        this.f235654c.put(ozx0Var, Boolean.FALSE);
        return ozx0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            szx0 szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) szx0Var.next()).toString());
            if (szx0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
