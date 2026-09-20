package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uwg1 extends tvg1 {

    /* JADX INFO: renamed from: d */
    public final transient cxg1 f234655d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f234656e;

    /* JADX INFO: renamed from: f */
    public final transient int f234657f;

    public uwg1(cxg1 cxg1Var, Object[] objArr, int i) {
        this.f234655d = cxg1Var;
        this.f234656e = objArr;
        this.f234657f = i;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: a */
    public final o0f1 mo43014a() {
        return m81610l().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f234655d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: f */
    public final boolean mo43018f() {
        return true;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: i */
    public final int mo43019i(Object[] objArr) {
        return m81610l().mo43019i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m81610l().listIterator(0);
    }

    @Override // p204p.tvg1
    /* JADX INFO: renamed from: m */
    public final vug1 mo43020m() {
        return new swg1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f234657f;
    }
}
