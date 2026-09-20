package p204p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public final class qr10 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f191703b;

    public /* synthetic */ qr10(int i, Activity activity) {
        this.f191702a = i;
        this.f191703b = activity;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f191702a) {
            case 0:
                this.f191703b.finishAffinity();
                break;
            case 1:
                this.f191703b.finishAffinity();
                break;
            case 2:
                this.f191703b.finishAffinity();
                break;
            case 3:
                this.f191703b.finishAffinity();
                break;
            default:
                this.f191703b.finishAffinity();
                break;
        }
    }
}
