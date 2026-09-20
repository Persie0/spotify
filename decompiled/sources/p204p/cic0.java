package p204p;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cic0 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ajc0 f38280b;

    public /* synthetic */ cic0(ajc0 ajc0Var, int i) {
        this.f38279a = i;
        this.f38280b = ajc0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f38279a) {
            case 0:
                this.f38280b.clear();
                break;
            default:
                this.f38280b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        ajc0 ajc0Var;
        Object obj2;
        switch (this.f38279a) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (ajc0Var = this.f38280b).get(key)) != null && ajc0Var.f16236f.mo24400b().mo47631a().m28859c(entry.getValue(), obj2);
            default:
                return this.f38280b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f38279a) {
            case 0:
                break;
        }
        return this.f38280b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f38279a) {
            case 0:
                return new bic0(this.f38280b, 0);
            default:
                return new bic0(this.f38280b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        switch (this.f38279a) {
            case 0:
                return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f38280b.remove(key, entry.getValue());
            default:
                return this.f38280b.remove(obj) != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f38279a) {
            case 0:
                break;
        }
        return this.f38280b.size();
    }
}
