package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class qs30 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f191977a = new ArrayList(5);

    /* JADX INFO: renamed from: b */
    public final int f191978b = 5;

    /* JADX INFO: renamed from: a */
    public final lt30 m73673a() {
        ArrayList arrayList = this.f191977a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (lt30) arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: b */
    public final void m73674b(lt30 lt30Var) {
        lt30Var.getClass();
        ArrayList arrayList = this.f191977a;
        if (arrayList.size() < this.f191978b) {
            arrayList.add(lt30Var);
        }
    }
}
