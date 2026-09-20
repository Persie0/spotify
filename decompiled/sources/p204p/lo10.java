package p204p;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybePeek;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lo10 {

    /* JADX INFO: renamed from: i */
    public static final Object f135270i = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f135271a;

    /* JADX INFO: renamed from: b */
    public final Object f135272b;

    /* JADX INFO: renamed from: c */
    public final Object f135273c;

    /* JADX INFO: renamed from: d */
    public final Object f135274d;

    /* JADX INFO: renamed from: e */
    public Object f135275e;

    /* JADX INFO: renamed from: f */
    public Object f135276f;

    /* JADX INFO: renamed from: g */
    public Object f135277g;

    /* JADX INFO: renamed from: h */
    public Object f135278h;

    public lo10(Context context, er70 er70Var) {
        this.f135272b = context;
        this.f135273c = er70Var;
        this.f135274d = new PublishSubject();
        this.f135277g = BehaviorSubject.m23795f();
        this.f135278h = BehaviorSubject.m23795f();
    }

    /* JADX INFO: renamed from: a */
    public MaybeIgnoreElementCompletable m59515a(hrg1 hrg1Var, kvg1 kvg1Var) {
        u790 qe40Var;
        Logger.m3965a("[LiveSharing] Beginning live-sharing as a " + hrg1Var + ".", new Object[0]);
        try {
            qe40Var = ((mv1) ((er70) this.f135273c).get()).newSessionBuilder(new h7u(this, 19)).withCoDoing(new io10(this), kvg1Var != null ? Optional.of(kvg1Var) : Optional.empty()).verifyRecordingInfo().begin((Context) this.f135272b);
            wj50.m88279p(qe40Var);
        } catch (Exception e) {
            qe40Var = new qe40(e);
        }
        return new MaybeIgnoreElementCompletable(gjg1.m44905C(qe40Var).m23368e(new ho10(hrg1Var, this)).m23367d(new ho10(this, hrg1Var)).m23371i());
    }

    /* JADX INFO: renamed from: b */
    public Completable m59516b(tv1 tv1Var) {
        u790 u790VarEndSession;
        Logger.m3965a("[LiveSharing] Ending live-sharing session with reason: " + tv1Var + ".", new Object[0]);
        uv1 uv1Var = (uv1) this.f135276f;
        if (uv1Var == null || (u790VarEndSession = uv1Var.endSession(tv1Var)) == null) {
            return CompletableEmpty.f7437a;
        }
        MaybeCreate maybeCreateM44905C = gjg1.m44905C(u790VarEndSession);
        frz frzVar = frz.f72685M0;
        Consumer consumer = Functions.f7228d;
        Action action = Functions.f7227c;
        return new MaybeIgnoreElementCompletable(new MaybePeek(maybeCreateM44905C, frzVar, consumer, consumer, action, action, action).m23367d(new p8v(this, 19)).m23371i()).m23295g(new jo10(this, 0));
    }

    /* JADX INFO: renamed from: c */
    public void m59517c(String str, IllegalStateException illegalStateException) {
        na6.m63957e("[This only crashes in internal builds] " + str + " a meeting status listener in " + this + " threw unexpectedly. This usually happens when two instances of " + lo10.class + " are loaded, sharing the same instance of " + ((er70) this.f135273c).get().getClass() + ":\n" + illegalStateException.getMessage());
    }

    /* JADX INFO: renamed from: d */
    public FileInputStream m59518d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m59519e(int i, Serializable serializable) {
        ((Executor) this.f135272b).execute(new scb(this, i, serializable, 6));
    }

    /* JADX INFO: renamed from: f */
    public void m59520f(qp90 qp90Var) {
        synchronized (f135270i) {
            this.f135275e = qp90Var;
            PublishSubject publishSubject = (PublishSubject) this.f135274d;
            if (qp90Var == null) {
                wj50.m88260d0("state");
                throw null;
            }
            publishSubject.onNext(qp90Var);
        }
    }

    public lo10(AssetManager assetManager, Executor executor, hxr0 hxr0Var, String str, File file) {
        byte[] bArr;
        this.f135271a = false;
        this.f135272b = executor;
        this.f135273c = hxr0Var;
        this.f135276f = str;
        this.f135275e = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = axf1.f20848a;
        } else {
            switch (i) {
                case 24:
                case 25:
                    bArr = axf1.f20852e;
                    break;
                case 26:
                    bArr = axf1.f20851d;
                    break;
                case 27:
                    bArr = axf1.f20850c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = axf1.f20849b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f135274d = bArr;
    }
}
