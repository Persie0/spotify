package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public final class hsu0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f94807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsu0(int i, Activity activity) {
        super(1);
        this.f94806a = i;
        this.f94807b = activity;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f94806a) {
            case 0:
                return new gsu0(0, this.f94807b);
            default:
                Activity activity = this.f94807b;
                activity.getWindow().addFlags(8192);
                return new gsu0(1, activity);
        }
    }
}
