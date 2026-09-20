package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class vov {

    /* JADX INFO: renamed from: a */
    public final btv0 f243544a;

    public vov(btv0 btv0Var) {
        this.f243544a = btv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final q19 m86103a(ViewGroup viewGroup, zxv zxvVar) {
        whc1 whc1Var = (whc1) this.f243544a.get(zxvVar);
        if (whc1Var != null) {
            return whc1Var.mo39664a(viewGroup);
        }
        throw new IllegalStateException(("No ViewHolderFactory provider provider for entity type " + zxvVar).toString());
    }
}
