package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dpz0 {

    /* JADX INFO: renamed from: a */
    public final voz0 f51767a;

    /* JADX INFO: renamed from: b */
    public final uoi0 f51768b;

    public dpz0(cpz0 cpz0Var, w350 w350Var) {
        this.f51767a = cpz0Var.f40689d;
        List listM33569j = cpz0.m33569j(4, cpz0Var);
        this.f51768b = new uoi0(listM33569j.size());
        int size = listM33569j.size();
        for (int i = 0; i < size; i++) {
            cpz0 cpz0Var2 = (cpz0) listM33569j.get(i);
            if (w350Var.m87102a(cpz0Var2.f40691f)) {
                this.f51768b.m83620a(cpz0Var2.f40691f);
            }
        }
    }
}
