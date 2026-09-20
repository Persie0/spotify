package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class vf40 {

    /* JADX INFO: renamed from: a */
    public Object[] f240893a;

    /* JADX INFO: renamed from: b */
    public int f240894b = 0;

    /* JADX INFO: renamed from: c */
    public uf40 f240895c;

    public vf40(int i) {
        this.f240893a = new Object[i * 2];
    }

    /* JADX INFO: renamed from: a */
    public xf40 mo85341a() {
        return m85342b(true);
    }

    /* JADX INFO: renamed from: b */
    public final btv0 m85342b(boolean z) {
        uf40 uf40Var;
        uf40 uf40Var2;
        if (z && (uf40Var2 = this.f240895c) != null) {
            throw uf40Var2.m82952a();
        }
        btv0 btv0VarM30469q = btv0.m30469q(this.f240894b, this.f240893a, this);
        if (!z || (uf40Var = this.f240895c) == null) {
            return btv0VarM30469q;
        }
        throw uf40Var.m82952a();
    }

    /* JADX INFO: renamed from: c */
    public xf40 mo85343c() {
        return m85342b(false);
    }

    /* JADX INFO: renamed from: d */
    public xf40 mo85344d() {
        return m85342b(true);
    }

    /* JADX INFO: renamed from: e */
    public vf40 mo85345e(Object obj, Object obj2) {
        int i = (this.f240894b + 1) * 2;
        Object[] objArr = this.f240893a;
        if (i > objArr.length) {
            this.f240893a = Arrays.copyOf(objArr, cf40.m32617b(objArr.length, i));
        }
        ddg1.m35735f(obj, obj2);
        Object[] objArr2 = this.f240893a;
        int i2 = this.f240894b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f240894b = i2 + 1;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public vf40 mo85346f(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f240894b) * 2;
            Object[] objArr = this.f240893a;
            if (size > objArr.length) {
                this.f240893a = Arrays.copyOf(objArr, cf40.m32617b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo85345e(entry.getKey(), entry.getValue());
        }
        return this;
    }
}
