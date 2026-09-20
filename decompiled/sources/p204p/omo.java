package p204p;

import android.content.Context;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class omo extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f167068b;

    public /* synthetic */ omo(Context context, int i) {
        this.f167067a = i;
        this.f167068b = context;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f167067a) {
            case 0:
                return new SimpleDateFormat("d MMMM yyyy", bga.m29060C(this.f167068b.getResources().getConfiguration()).m53164b(0));
            case 1:
                return new SimpleDateFormat("MMM' 'dd", bga.m29060C(this.f167068b.getResources().getConfiguration()).m53164b(0));
            default:
                return new SimpleDateFormat("yyyy", bga.m29060C(this.f167068b.getResources().getConfiguration()).m53164b(0));
        }
    }
}
