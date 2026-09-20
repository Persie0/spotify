package p204p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes7.dex */
public final class pcx0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f176278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SingleSubject f176279c;

    public /* synthetic */ pcx0(int i, SingleSubject singleSubject, gh00 gh00Var, qcx0 qcx0Var) {
        this.f176277a = i;
        this.f176278b = gh00Var;
        this.f176279c = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f176277a) {
            case 0:
                this.f176278b.invoke(lcx0.f132003a);
                this.f176279c.onSuccess(mcx0.f142262a);
                break;
            default:
                this.f176278b.invoke(lcx0.f132004b);
                this.f176279c.onSuccess(mcx0.f142263b);
                break;
        }
    }
}
