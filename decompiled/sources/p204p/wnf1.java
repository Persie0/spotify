package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wnf1 extends zmf1 {

    /* JADX INFO: renamed from: c */
    public final transient zgf1 f253171c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f253172d;

    /* JADX INFO: renamed from: e */
    public final transient int f253173e;

    public wnf1(zgf1 zgf1Var, Object[] objArr, int i) {
        this.f253171c = zgf1Var;
        this.f253172d = objArr;
        this.f253173e = i;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: a */
    public final int mo26587a(Object[] objArr) {
        return mo26588e().mo26587a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f253171c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo26588e().listIterator(0);
    }

    @Override // p204p.zmf1
    /* JADX INFO: renamed from: j */
    public final tlf1 mo88596j() {
        return new rnf1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f253173e;
    }
}
