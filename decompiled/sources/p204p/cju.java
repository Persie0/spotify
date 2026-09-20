package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class cju implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u7q f38688b;

    public /* synthetic */ cju(u7q u7qVar, int i) {
        this.f38687a = i;
        this.f38688b = u7qVar;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f38687a) {
            case 0:
                return new wup((Context) this.f38688b.f227741b, 4);
            case 1:
                if (hwfVar == null) {
                    return new z5q((Context) this.f38688b.f227741b);
                }
                throw new ClassCastException();
            case 2:
                return new xzo((Context) this.f38688b.f227741b, 20);
            case 3:
                niv0 niv0Var = (niv0) hwfVar;
                u7q u7qVar = this.f38688b;
                e940 e940Var = (e940) u7qVar.f227742c;
                Context context = (Context) u7qVar.f227741b;
                if (niv0Var instanceof liv0) {
                    return new f6q(context, e940Var, true, false);
                }
                return niv0Var instanceof miv0 ? new f6q(context, e940Var, false, true) : new f6q(context, e940Var, false, false);
            case 4:
                if (hwfVar == null) {
                    return new wup((Context) this.f38688b.f227741b, 6);
                }
                throw new ClassCastException();
            default:
                if (hwfVar == null) {
                    return new g1p((Context) this.f38688b.f227741b, 7);
                }
                throw new ClassCastException();
        }
    }
}
