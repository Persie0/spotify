package p204p;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rw31 implements rr60 {

    /* JADX INFO: renamed from: a */
    public final rr60 f203245a;

    /* JADX INFO: renamed from: b */
    public final ktz0 f203246b;

    public rw31(rr60 rr60Var) {
        rr60 rr60VarSerializer = qw31.Companion.serializer(rr60Var);
        this.f203245a = rr60VarSerializer;
        this.f203246b = rr60VarSerializer.getDescriptor();
    }

    @Override // p204p.rr60
    public final Object deserialize(fro froVar) {
        qw31 qw31Var = (qw31) froVar.mo42504Y(this.f203245a);
        List list = qw31Var.f193159a;
        int size = list.size();
        List list2 = qw31Var.f193160b;
        if (size != list2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray sparseArray = new SparseArray(list.size());
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            sparseArray.append(((Number) list.get(i)).intValue(), list2.get(i));
        }
        return sparseArray;
    }

    @Override // p204p.rr60
    public final ktz0 getDescriptor() {
        return this.f203246b;
    }

    @Override // p204p.rr60
    public final void serialize(deu deuVar, Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        int size = sparseArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        int size2 = sparseArray.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(sparseArray.valueAt(i2));
        }
        deuVar.mo35825i(this.f203245a, new qw31(arrayList, arrayList2));
    }
}
