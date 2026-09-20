package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes9.dex */
public final class ahf implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ chf f15686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f15687c;

    public /* synthetic */ ahf(chf chfVar, String str, int i) {
        this.f15685a = i;
        this.f15686b = chfVar;
        this.f15687c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f15685a) {
            case 0:
                chf.m32764a(this.f15686b, this.f15687c, 0L);
                break;
            default:
                chf.m32764a(this.f15686b, this.f15687c, 0L);
                break;
        }
    }
}
