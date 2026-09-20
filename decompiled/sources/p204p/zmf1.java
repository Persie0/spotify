package p204p;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zmf1 extends jlf1 implements Set {

    /* JADX INFO: renamed from: b */
    public transient tlf1 f284272b;

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: e */
    public tlf1 mo26588e() {
        tlf1 tlf1Var = this.f284272b;
        if (tlf1Var != null) {
            return tlf1Var;
        }
        tlf1 tlf1VarMo88596j = mo88596j();
        this.f284272b = tlf1VarMo88596j;
        return tlf1VarMo88596j;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public tlf1 mo88596j() {
        Object[] array = toArray(jlf1.f113617a);
        mlf1 mlf1Var = tlf1.f221461b;
        return tlf1.m81056l(array.length, array);
    }
}
