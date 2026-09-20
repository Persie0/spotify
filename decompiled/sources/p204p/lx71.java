package p204p;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: loaded from: classes2.dex */
public final class lx71 {

    /* JADX INFO: renamed from: a */
    public final Context f137751a;

    public lx71(Context context) {
        this.f137751a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m60171a(int i, Object... objArr) {
        int length = objArr.length;
        Context context = this.f137751a;
        (length > 0 ? Toast.makeText(context, context.getString(i, objArr), 1) : Toast.makeText(context, i, 1)).show();
    }
}
