package p204p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class hog1 implements dog1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f93539a;

    public hog1(Context context, yng1 yng1Var) {
        ArrayList arrayList = new ArrayList();
        this.f93539a = arrayList;
        yng1Var.getClass();
        arrayList.add(new bpg1(context, yng1Var));
    }

    @Override // p204p.dog1
    /* JADX INFO: renamed from: a */
    public final void mo30116a(red1 red1Var) {
        Iterator it = this.f93539a.iterator();
        while (it.hasNext()) {
            ((dog1) it.next()).mo30116a(red1Var);
        }
    }
}
