package p204p;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vqm0 {

    /* JADX INFO: renamed from: f */
    public static final z1b1 f243962f = new z1b1(1);

    /* JADX INFO: renamed from: a */
    public final List f243963a;

    /* JADX INFO: renamed from: b */
    public final List f243964b;

    /* JADX INFO: renamed from: e */
    public final uqm0 f243967e;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f243966d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c */
    public final uj5 f243965c = new uj5(0);

    public vqm0(ArrayList arrayList, List list) {
        this.f243963a = list;
        this.f243964b = arrayList;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        uqm0 uqm0Var = null;
        for (int i2 = 0; i2 < size; i2++) {
            uqm0 uqm0Var2 = (uqm0) list.get(i2);
            int i3 = uqm0Var2.f233082e;
            if (i3 > i) {
                uqm0Var = uqm0Var2;
                i = i3;
            }
        }
        this.f243967e = uqm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m86254a(ku61 ku61Var, int i) {
        uqm0 uqm0VarM86255b = m86255b(ku61Var);
        return uqm0VarM86255b != null ? uqm0VarM86255b.f233081d : i;
    }

    /* JADX INFO: renamed from: b */
    public final uqm0 m86255b(ku61 ku61Var) {
        return (uqm0) this.f243965c.get(ku61Var);
    }
}
