package p204p;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class p4f1 {

    /* JADX INFO: renamed from: a */
    public final int f173916a;

    public p4f1(int i) {
        this.f173916a = i;
    }

    /* JADX INFO: renamed from: e */
    public static Status m69107e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo43529a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo43530b(Exception exc);

    /* JADX INFO: renamed from: c */
    public abstract void mo43531c(yya1 yya1Var, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo43532d(p3f1 p3f1Var);
}
