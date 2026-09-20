package p204p;

import android.content.DialogInterface;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: classes9.dex */
public final class mor0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleSubject f145735b;

    public /* synthetic */ mor0(SingleSubject singleSubject, int i) {
        this.f145734a = i;
        this.f145735b = singleSubject;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f145734a) {
            case 0:
                this.f145735b.onSuccess(wor0.f253563a);
                break;
            default:
                this.f145735b.onSuccess(vor0.f243524a);
                break;
        }
    }
}
