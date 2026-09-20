package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.r8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2329r8 implements eai0 {

    /* JADX INFO: renamed from: a */
    public transient Collection f196681a;

    /* JADX INFO: renamed from: b */
    public transient Set f196682b;

    /* JADX INFO: renamed from: c */
    public transient Collection f196683c;

    /* JADX INFO: renamed from: d */
    public transient Map f196684d;

    @Override // p204p.eai0
    /* JADX INFO: renamed from: a */
    public Collection mo38299a() {
        Collection collection = this.f196681a;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo43932f = mo43932f();
        this.f196681a = collectionMo43932f;
        return collectionMo43932f;
    }

    @Override // p204p.eai0
    /* JADX INFO: renamed from: b */
    public Map mo38300b() {
        Map map = this.f196684d;
        if (map != null) {
            return map;
        }
        Map mapMo43931e = mo43931e();
        this.f196684d = mapMo43931e;
        return mapMo43931e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74959c(Object obj, Object obj2) {
        Collection collection = (Collection) mo38300b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo74960d(Object obj) {
        Iterator it = mo38300b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract Map mo43931e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eai0) {
            return mo38300b().equals(((eai0) obj).mo38300b());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract Collection mo43932f();

    /* JADX INFO: renamed from: g */
    public abstract Set mo43933g();

    /* JADX INFO: renamed from: h */
    public abstract Iterator mo43934h();

    public final int hashCode() {
        return mo38300b().hashCode();
    }

    @Override // p204p.eai0
    public Set keySet() {
        Set set = this.f196682b;
        if (set != null) {
            return set;
        }
        Set setMo43933g = mo43933g();
        this.f196682b = setMo43933g;
        return setMo43933g;
    }

    @Override // p204p.eai0
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) mo38300b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return mo38300b().toString();
    }
}
