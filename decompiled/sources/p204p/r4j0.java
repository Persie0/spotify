package p204p;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class r4j0 implements p4j0 {

    /* JADX INFO: renamed from: a */
    public final Set f195796a;

    /* JADX INFO: renamed from: b */
    public final List f195797b;

    public r4j0(List list, Set set) {
        this.f195796a = set;
        this.f195797b = list;
    }

    @Override // p204p.evb0
    /* JADX INFO: renamed from: a */
    public final void mo37838a(Intent intent) {
        List list = this.f195797b;
        list.clear();
        Set set = this.f195796a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ivb0 ivb0VarM64816a = ((nmf) it.next()).m64816a(intent);
            if (ivb0VarM64816a != null) {
                arrayList.add(ivb0VarM64816a);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.p4j0
    /* JADX INFO: renamed from: b */
    public final Object mo69110b(fbk fbkVar) {
        q4j0 q4j0Var;
        int i;
        Iterator it;
        if (fbkVar instanceof q4j0) {
            q4j0Var = (q4j0) fbkVar;
            int i2 = q4j0Var.f185203e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q4j0Var.f185203e = i2 - Integer.MIN_VALUE;
            } else {
                q4j0Var = new q4j0(this, fbkVar);
            }
        } else {
            q4j0Var = new q4j0(this, fbkVar);
        }
        Object obj = q4j0Var.f185201c;
        int i3 = q4j0Var.f185203e;
        List list = this.f195797b;
        if (i3 == 0) {
            bga.m29073P(obj);
            i = 0;
            it = list.iterator();
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = q4j0Var.f185200b;
            it = q4j0Var.f185199a;
            bga.m29073P(obj);
        }
        while (it.hasNext()) {
            ivb0 ivb0Var = (ivb0) it.next();
            q4j0Var.f185199a = it;
            q4j0Var.f185200b = i;
            q4j0Var.f185203e = 1;
            Object objMo35046a = ivb0Var.mo35046a(q4j0Var);
            yuk yukVar = yuk.f276404a;
            if (objMo35046a == yukVar) {
                return yukVar;
            }
        }
        list.clear();
        return w2a1.f247311a;
    }
}
