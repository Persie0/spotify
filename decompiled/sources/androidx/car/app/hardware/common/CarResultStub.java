package androidx.car.app.hardware.common;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.AbstractC0042f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p204p.fr2;
import p204p.jzb;
import p204p.l7l0;
import p204p.pra;
import p204p.szb;

/* JADX INFO: loaded from: classes3.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final pra mBundle;
    private final jzb mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<l7l0, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, pra praVar, boolean z, T t, jzb jzbVar) {
        Objects.requireNonNull(jzbVar);
        this.mHostDispatcher = jzbVar;
        this.mResultType = i;
        this.mBundle = praVar;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(pra praVar) {
        return (T) praVar.m70706c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, pra praVar) {
        notifyResults(z, praVar);
        return null;
    }

    private void notifyResults(boolean z, pra praVar) {
        T tConvertAndRecast = z ? convertAndRecast(praVar) : this.mUnsupportedValue;
        for (Map.Entry<l7l0, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new fr2(27, entry, tConvertAndRecast));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, l7l0 l7l0Var) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(l7l0Var);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, pra praVar, IBinder iBinder) {
        AbstractC0042f.m245b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new szb(this, z, praVar));
    }

    public boolean removeListener(l7l0 l7l0Var) {
        Map<l7l0, Executor> map = this.mListeners;
        Objects.requireNonNull(l7l0Var);
        map.remove(l7l0Var);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        jzb jzbVar = this.mHostDispatcher;
        int i = this.mResultType;
        pra praVar = this.mBundle;
        jzbVar.getClass();
        try {
            try {
                Log.isLoggable("CarApp", 3);
                jzbVar.m54878a().unsubscribeCarHardwareResult(i, praVar);
                return true;
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException("Remote unsubscribeCarHardwareResult call failed", e2);
            }
        } catch (RemoteException unused) {
            return true;
        }
    }
}
