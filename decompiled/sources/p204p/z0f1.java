package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: classes.dex */
public final class z0f1 extends c1f1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f278097c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ev61 f278098d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ d1f1 f278099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0f1(d1f1 d1f1Var, ev61 ev61Var, long j, ev61 ev61Var2) {
        super(d1f1Var, ev61Var);
        this.f278097c = j;
        this.f278098d = ev61Var2;
        this.f278099e = d1f1Var;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: b */
    public final void mo24430b() {
        ev61 ev61Var = this.f278098d;
        long j = this.f278097c;
        d1f1 d1f1Var = this.f278099e;
        if (d1f1.m34634d(d1f1Var)) {
            mo31263a(new StandardIntegrityException(-2, null));
            return;
        }
        if (d1f1.m34633c(d1f1Var)) {
            mo31263a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            v2f1 v2f1Var = d1f1Var.f44259e.f64645n;
            Bundle bundleM34632b = d1f1.m34632b(d1f1Var, j);
            b1f1 b1f1Var = new b1f1(d1f1Var, ev61Var, 1);
            r2f1 r2f1Var = (r2f1) v2f1Var;
            r2f1Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = k1f1.f118314a;
            parcelObtain.writeInt(1);
            bundleM34632b.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(b1f1Var);
            try {
                r2f1Var.f195135a.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            d1f1Var.f44255a.m31381a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            ev61Var.m40098c(new StandardIntegrityException(-100, e));
        }
    }
}
