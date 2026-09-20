package p204p;

import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class tb2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public static final tb2 f218729a = new tb2(1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        pb2 pb2Var = Build.VERSION.SDK_INT >= 33 ? (pb2) bundle.getParcelable("ageEntryElementState", pb2.class) : (pb2) bundle.getParcelable("ageEntryElementState");
        return pb2Var == null ? new pb2() : pb2Var;
    }
}
