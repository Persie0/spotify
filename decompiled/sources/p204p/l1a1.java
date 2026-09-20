package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l1a1 {

    /* JADX INFO: renamed from: a */
    public final int f128676a;

    /* JADX INFO: renamed from: b */
    public final gb31 f128677b;

    /* JADX INFO: renamed from: c */
    public final gb31 f128678c;

    public l1a1(int i, List list, List list2) {
        this.f128676a = i;
        if (!(i >= 0)) {
            pt40.m70891a("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            pt40.m70891a("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        gb31 gb31Var = new gb31();
        gb31Var.addAll(list);
        this.f128677b = gb31Var;
        gb31 gb31Var2 = new gb31();
        gb31Var2.addAll(list2);
        this.f128678c = gb31Var2;
    }
}
