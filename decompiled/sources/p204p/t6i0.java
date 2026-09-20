package p204p;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes3.dex */
public final class t6i0 extends RemoteCallbackList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f217564a;

    public t6i0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f217564a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f217564a.f1304b.remove((Integer) obj);
    }
}
