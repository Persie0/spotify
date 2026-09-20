package p204p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class g4h1 implements c4h1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f76423a;

    public g4h1(Context context, z3h1 z3h1Var) {
        ArrayList arrayList = new ArrayList();
        this.f76423a = arrayList;
        z3h1Var.getClass();
        arrayList.add(new j5h1(context, z3h1Var));
    }

    @Override // p204p.c4h1
    /* JADX INFO: renamed from: a */
    public final void mo31443a(ob31 ob31Var) {
        Iterator it = this.f76423a.iterator();
        while (it.hasNext()) {
            ((c4h1) it.next()).mo31443a(ob31Var);
        }
    }
}
