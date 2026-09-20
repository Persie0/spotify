package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class tvz implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f224276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f224277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f224278d;

    public /* synthetic */ tvz(int i, Object obj, String str, boolean z) {
        this.f224275a = i;
        this.f224278d = obj;
        this.f224276b = str;
        this.f224277c = z;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f224275a) {
            case 0:
                x4b x4bVar = (x4b) this.f224278d;
                xwz xwzVar = (xwz) x4bVar.f258038c;
                String str = this.f224276b;
                uuz uuzVarM92311c = xwzVar.m92311c(str);
                if (uuzVarM92311c != null) {
                    boolean z = uuzVarM92311c.f234301b;
                    boolean z2 = this.f224277c;
                    if (z != z2) {
                        ((xwz) x4bVar.f258038c).m92317j(str, z2);
                    }
                } else {
                    ((xwz) x4bVar.f258038c).m92309a(new uuz(0, 0, this.f224276b, this.f224277c, false));
                }
                break;
            default:
                ((bw11) this.f224278d).f31498e.onNext(new pqm0(this.f224276b, Boolean.valueOf(this.f224277c)));
                break;
        }
    }
}
