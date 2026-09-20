package p204p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b6h1 extends kv30 implements d6h1 {
    /* JADX INFO: renamed from: c2 */
    public static d6h1 m28299c2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof d6h1 ? (d6h1) iInterfaceQueryLocalInterface : new y5h1(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 4);
    }
}
