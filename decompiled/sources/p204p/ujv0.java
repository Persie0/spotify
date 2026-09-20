package p204p;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ujv0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f231154a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public int f231155b = 0;

    /* JADX INFO: renamed from: c */
    public final Set f231156c = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: a */
    public final tjv0 m83293a(int i) {
        SparseArray sparseArray = this.f231154a;
        tjv0 tjv0Var = (tjv0) sparseArray.get(i);
        if (tjv0Var != null) {
            return tjv0Var;
        }
        tjv0 tjv0Var2 = new tjv0();
        sparseArray.put(i, tjv0Var2);
        return tjv0Var2;
    }

    /* JADX INFO: renamed from: b */
    public final void m83294b(int i, int i2) {
        tjv0 tjv0VarM83293a = m83293a(i);
        tjv0VarM83293a.f221020b = i2;
        ArrayList arrayList = tjv0VarM83293a.f221019a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
