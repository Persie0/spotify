package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public interface e600 extends anm0, zfy {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    default i500 mo32198e() {
        i500 i500Var = this instanceof i500 ? (i500) this : null;
        if (i500Var != null) {
            return i500Var;
        }
        throw new AssertionError("FragmentIdentifier is not implemented by a Fragment.");
    }

    /* JADX INFO: renamed from: j */
    String mo24331j();

    /* JADX INFO: renamed from: k */
    String mo24332k(Context context);
}
