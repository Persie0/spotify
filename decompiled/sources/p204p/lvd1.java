package p204p;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lvd1 implements jvd1 {

    /* JADX INFO: renamed from: a */
    public final View f137287a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f137288b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public kvd1 f137289c;

    public lvd1(View view) {
        this.f137287a = view;
    }

    @Override // p204p.jvd1
    /* JADX INFO: renamed from: a */
    public final void mo54375a(ivd1 ivd1Var) {
        ArrayList arrayList = this.f137288b;
        arrayList.add(ivd1Var);
        if (arrayList.isEmpty() || this.f137289c != null) {
            return;
        }
        kvd1 kvd1Var = new kvd1(this);
        this.f137289c = kvd1Var;
        this.f137287a.setOnApplyWindowInsetsListener(kvd1Var);
    }

    @Override // p204p.jvd1
    /* JADX INFO: renamed from: b */
    public final void mo54376b(kz60 kz60Var) {
        ArrayList arrayList = this.f137288b;
        arrayList.remove(kz60Var);
        if (!arrayList.isEmpty() || this.f137289c == null) {
            return;
        }
        this.f137287a.setOnApplyWindowInsetsListener(null);
        this.f137289c = null;
    }
}
