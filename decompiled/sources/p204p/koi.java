package p204p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes9.dex */
public final class koi implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f124801b;

    /* JADX WARN: Multi-variable type inference failed */
    public koi(int i, eh00 eh00Var) {
        this.f124800a = i;
        switch (i) {
            case 1:
                this.f124801b = (qe70) eh00Var;
                break;
            case 2:
            default:
                this.f124801b = (qe70) eh00Var;
                break;
            case 3:
                this.f124801b = (qe70) eh00Var;
                break;
            case 4:
                this.f124801b = (qe70) eh00Var;
                break;
            case 5:
                this.f124801b = (qe70) eh00Var;
                break;
            case 6:
                this.f124801b = (qe70) eh00Var;
                break;
            case 7:
                this.f124801b = (qe70) eh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v7, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v8, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v9, types: [p.eh00, p.qe70] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f124800a) {
            case 0:
                this.f124801b.invoke();
                break;
            case 1:
                this.f124801b.invoke();
                break;
            case 2:
                this.f124801b.invoke(kwz.f127274b);
                break;
            case 3:
                this.f124801b.invoke();
                break;
            case 4:
                this.f124801b.invoke();
                break;
            case 5:
                this.f124801b.invoke();
                break;
            case 6:
                this.f124801b.invoke();
                break;
            default:
                this.f124801b.invoke();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public koi(gh00 gh00Var) {
        this.f124800a = 2;
        this.f124801b = (qe70) gh00Var;
    }
}
