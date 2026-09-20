package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vj5 extends AbstractC1804e7 {

    /* JADX INFO: renamed from: c */
    public int f241872c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wj5 f241873d;

    public vj5(wj5 wj5Var) {
        this.f241873d = wj5Var;
    }

    @Override // p204p.AbstractC1804e7
    /* JADX INFO: renamed from: a */
    public final void mo37275a() {
        int i;
        Object[] objArr;
        do {
            i = this.f241872c + 1;
            this.f241872c = i;
            objArr = this.f241873d.f251847a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f56782a = 2;
        } else {
            this.f56783b = objArr[i];
            this.f56782a = 1;
        }
    }
}
