package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class mcg1 extends jbg1 {

    /* JADX INFO: renamed from: h */
    public final transient zgf1 f142152h;

    /* JADX INFO: renamed from: i */
    public final transient Object[] f142153i;

    /* JADX INFO: renamed from: t */
    public final transient int f142154t;

    public mcg1(zgf1 zgf1Var, Object[] objArr, int i) {
        super(4);
        this.f142152h = zgf1Var;
        this.f142153i = objArr;
        this.f142154t = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f142152h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        yag1 yag1VarM61463t = this.f110798g;
        if (yag1VarM61463t == null) {
            yag1VarM61463t = m61463t();
            this.f110798g = yag1VarM61463t;
        }
        return yag1VarM61463t.listIterator(0);
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: o */
    public final int mo28836o(Object[] objArr) {
        yag1 yag1VarM61463t = this.f110798g;
        if (yag1VarM61463t == null) {
            yag1VarM61463t = m61463t();
            this.f110798g = yag1VarM61463t;
        }
        return yag1VarM61463t.mo28836o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f142154t;
    }

    /* JADX INFO: renamed from: t */
    public final yag1 m61463t() {
        return new icg1(this);
    }
}
