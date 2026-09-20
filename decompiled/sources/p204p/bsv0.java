package p204p;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class bsv0 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final Messenger f30401a;

    /* JADX INFO: renamed from: b */
    public final cd5 f30402b;

    /* JADX INFO: renamed from: c */
    public final Messenger f30403c;

    /* JADX INFO: renamed from: f */
    public int f30406f;

    /* JADX INFO: renamed from: g */
    public int f30407g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gsv0 f30409i;

    /* JADX INFO: renamed from: d */
    public int f30404d = 1;

    /* JADX INFO: renamed from: e */
    public int f30405e = 1;

    /* JADX INFO: renamed from: h */
    public final SparseArray f30408h = new SparseArray();

    public bsv0(gsv0 gsv0Var, Messenger messenger) {
        this.f30409i = gsv0Var;
        this.f30401a = messenger;
        cd5 cd5Var = new cd5(this);
        this.f30402b = cd5Var;
        this.f30403c = new Messenger(cd5Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m30445a(int i) {
        int i2 = this.f30404d;
        this.f30404d = i2 + 1;
        m30446b(5, i2, i, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30446b(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f30403c;
        try {
            this.f30401a.send(messageObtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f30409i.f84029t.post(new asv0(this, 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m30447c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f30404d;
        this.f30404d = i3 + 1;
        m30446b(7, i3, i, null, bundle);
    }

    /* JADX INFO: renamed from: d */
    public final void m30448d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.f30404d;
        this.f30404d = i3 + 1;
        m30446b(8, i3, i, null, bundle);
    }
}
