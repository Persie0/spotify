package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class xf40 implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public transient hg40 f260829a;

    /* JADX INFO: renamed from: b */
    public transient hg40 f260830b;

    /* JADX INFO: renamed from: c */
    public transient ef40 f260831c;

    /* JADX INFO: renamed from: a */
    public static vf40 m90449a() {
        return new vf40(4);
    }

    /* JADX INFO: renamed from: b */
    public static vf40 m90450b(int i) {
        ddg1.m35736g(i, "expectedSize");
        return new vf40(i);
    }

    /* JADX INFO: renamed from: c */
    public static xf40 m90451c(Map map) {
        if ((map instanceof xf40) && !(map instanceof SortedMap)) {
            xf40 xf40Var = (xf40) map;
            if (!xf40Var.mo30475h()) {
                return xf40Var;
            }
        }
        Set setEntrySet = map.entrySet();
        vf40 vf40Var = new vf40(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        vf40Var.mo85346f(setEntrySet);
        return vf40Var.m85342b(true);
    }

    /* JADX INFO: renamed from: j */
    public static btv0 m90452j(Serializable serializable, Object obj) {
        ddg1.m35735f(serializable, obj);
        return btv0.m30469q(1, new Object[]{serializable, obj}, null);
    }

    /* JADX INFO: renamed from: k */
    public static btv0 m90453k(Serializable serializable, Object obj, Serializable serializable2, Object obj2, Serializable serializable3, Object obj3) {
        ddg1.m35735f(serializable2, obj2);
        return btv0.m30469q(3, new Object[]{serializable, obj, serializable2, obj2, serializable3, obj3}, null);
    }

    /* JADX INFO: renamed from: l */
    public static btv0 m90454l(Serializable serializable, Object obj, Serializable serializable2, Object obj2, Serializable serializable3, Object obj3, Serializable serializable4, Object obj4, Serializable serializable5, Object obj5) {
        return btv0.m30469q(5, new Object[]{serializable, obj, serializable2, obj2, serializable3, obj3, serializable4, obj4, serializable5, obj5}, null);
    }

    /* JADX INFO: renamed from: n */
    public static btv0 m90455n(Object obj, Object obj2, Object obj3, Object obj4) {
        ddg1.m35735f(obj, obj2);
        ddg1.m35735f(obj3, obj4);
        return btv0.m30469q(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    /* JADX INFO: renamed from: o */
    public static btv0 m90456o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ddg1.m35735f(obj, obj2);
        ddg1.m35735f(obj3, obj4);
        ddg1.m35735f(obj5, obj6);
        ddg1.m35735f(obj7, obj8);
        return btv0.m30469q(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract hg40 mo30472d();

    /* JADX INFO: renamed from: e */
    public abstract hg40 mo30473e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return y85.m93065j(obj, this);
    }

    /* JADX INFO: renamed from: f */
    public abstract ef40 mo30474f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public hg40 entrySet() {
        hg40 hg40Var = this.f260829a;
        if (hg40Var != null) {
            return hg40Var;
        }
        hg40 hg40VarMo30472d = mo30472d();
        this.f260829a = hg40VarMo30472d;
        return hg40VarMo30472d;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo30475h();

    @Override // java.util.Map
    public final int hashCode() {
        return gmg1.m45263y(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public hg40 keySet() {
        hg40 hg40Var = this.f260830b;
        if (hg40Var != null) {
            return hg40Var;
        }
        hg40 hg40VarMo30473e = mo30473e();
        this.f260830b = hg40VarMo30473e;
        return hg40VarMo30473e;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ef40 values() {
        ef40 ef40Var = this.f260831c;
        if (ef40Var != null) {
            return ef40Var;
        }
        ef40 ef40VarMo30474f = mo30474f();
        this.f260831c = ef40VarMo30474f;
        return ef40VarMo30474f;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return y85.m93051H(this);
    }

    public Object writeReplace() {
        return new wf40(this);
    }
}
