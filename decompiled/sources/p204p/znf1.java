package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class znf1 extends rkf1 {

    /* JADX INFO: renamed from: h */
    public final transient jof1 f284488h;

    /* JADX INFO: renamed from: i */
    public final transient Object[] f284489i;

    /* JADX INFO: renamed from: t */
    public final transient int f284490t;

    public znf1(jof1 jof1Var, Object[] objArr) {
        super(3);
        this.f284488h = jof1Var;
        this.f284489i = objArr;
        this.f284490t = 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f284488h.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        dkf1 vnf1Var = this.f200066g;
        if (vnf1Var == null) {
            vnf1Var = new vnf1(this);
            this.f200066g = vnf1Var;
        }
        return vnf1Var.mo35478f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        dkf1 vnf1Var = this.f200066g;
        if (vnf1Var == null) {
            vnf1Var = new vnf1(this);
            this.f200066g = vnf1Var;
        }
        return vnf1Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f284490t;
    }
}
