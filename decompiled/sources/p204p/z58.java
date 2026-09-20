package p204p;

import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: loaded from: classes.dex */
public final class z58 extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final z58 f279512a = new z58();

    /* JADX INFO: renamed from: a */
    public final void m95452a(ex3 ex3Var) {
        ex3Var.m40158a().registerCallback(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m95453b(ex3 ex3Var) {
        ex3Var.m40158a().unregisterCallback(this);
    }
}
