package p204p;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes11.dex */
public final class vy70 extends AbstractList implements RandomAccess, zy70 {

    /* JADX INFO: renamed from: b */
    public static final s3a1 f245998b = new s3a1(new vy70());

    /* JADX INFO: renamed from: a */
    public final ArrayList f245999a;

    public vy70() {
        this.f245999a = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f245999a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f245999a.size(), collection);
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: c */
    public final List mo77119c() {
        return Collections.unmodifiableList(this.f245999a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f245999a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: f1 */
    public final void mo77120f1(xj90 xj90Var) {
        this.f245999a.add(xj90Var);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: g */
    public final s3a1 mo77121g() {
        return new s3a1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f245999a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof hva) {
            hva hvaVar = (hva) obj;
            String strM48773q = hvaVar.m48773q();
            if (hvaVar.mo48768j()) {
                arrayList.set(i, strM48773q);
            }
            return strM48773q;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = fe50.f68685a;
        try {
            String str = new String(bArr, "UTF-8");
            if (ebg1.m38386o(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // p204p.zy70
    /* JADX INFO: renamed from: q0 */
    public final hva mo77122q0(int i) {
        hva xj90Var;
        ArrayList arrayList = this.f245999a;
        Object obj = arrayList.get(i);
        if (obj instanceof hva) {
            xj90Var = (hva) obj;
        } else if (obj instanceof String) {
            try {
                xj90Var = new xj90(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            xj90Var = new xj90(bArr2);
        }
        if (xj90Var != obj) {
            arrayList.set(i, xj90Var);
        }
        return xj90Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f245999a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof hva) {
            return ((hva) objRemove).m48773q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = fe50.f68685a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f245999a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof hva) {
            return ((hva) obj2).m48773q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = fe50.f68685a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f245999a.size();
    }

    public vy70(zy70 zy70Var) {
        this.f245999a = new ArrayList(zy70Var.size());
        addAll(zy70Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof zy70) {
            collection = ((zy70) collection).mo77119c();
        }
        boolean zAddAll = this.f245999a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
