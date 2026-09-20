package p204p;

import android.content.Context;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class lkp {

    /* JADX INFO: renamed from: a */
    public final Context f134413a;

    /* JADX INFO: renamed from: b */
    public final vqi f134414b;

    /* JADX INFO: renamed from: g */
    public fx30 f134419g;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f134415c = new PublishSubject();

    /* JADX INFO: renamed from: d */
    public final PublishSubject f134416d = new PublishSubject();

    /* JADX INFO: renamed from: e */
    public final PublishSubject f134417e = new PublishSubject();

    /* JADX INFO: renamed from: f */
    public final Object f134418f = new Object();

    /* JADX INFO: renamed from: h */
    public final PublishSubject f134420h = new PublishSubject();

    /* JADX INFO: renamed from: i */
    public final PublishSubject f134421i = new PublishSubject();

    /* JADX INFO: renamed from: j */
    public final iwr f134422j = new iwr();

    public lkp(Context context, vqi vqiVar) {
        this.f134413a = context;
        this.f134414b = vqiVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m59288a(fx30 fx30Var) {
        int iM38547C = edb.m38547C(fx30Var.m42987c());
        if (iM38547C == 0) {
            int i = IPLDialogsHostActivity.f4655h1;
            pzb0.m71727y(this.f134413a, fx30Var);
            return;
        }
        if (iM38547C == 1) {
            this.f134417e.onNext(fx30Var);
            return;
        }
        if (iM38547C != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal = bvg1.m30612M(this.f134414b.f243953a.f37779a).ordinal();
        if (iOrdinal == 2 || iOrdinal == 14) {
            this.f134417e.onNext(fx30Var);
            return;
        }
        synchronized (this.f134418f) {
            try {
                if (this.f134416d.mo23797a()) {
                    this.f134416d.onNext(new mx30(fx30Var));
                } else {
                    this.f134419g = fx30Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
