package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.StandardIntegrityException;

/* JADX INFO: loaded from: classes.dex */
public final class a1f1 extends c1f1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s2f1 f11405c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f11406d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f11407e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ev61 f11408f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ d1f1 f11409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1f1(d1f1 d1f1Var, ev61 ev61Var, s2f1 s2f1Var, long j, long j2, ev61 ev61Var2) {
        super(d1f1Var, ev61Var);
        this.f11405c = s2f1Var;
        this.f11406d = j;
        this.f11407e = j2;
        this.f11408f = ev61Var2;
        this.f11409g = d1f1Var;
    }

    @Override // p204p.d3f1
    /* JADX INFO: renamed from: b */
    public final void mo24430b() {
        s2f1 s2f1Var = this.f11405c;
        ev61 ev61Var = this.f11408f;
        d1f1 d1f1Var = this.f11409g;
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
            Bundle bundleM34631a = d1f1.m34631a(d1f1Var, s2f1Var, this.f11406d, this.f11407e);
            b1f1 b1f1Var = new b1f1(d1f1Var, ev61Var, 0);
            r2f1 r2f1Var = (r2f1) v2f1Var;
            r2f1Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = k1f1.f118314a;
            parcelObtain.writeInt(1);
            bundleM34631a.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(b1f1Var);
            try {
                r2f1Var.f195135a.transact(3, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            d1f1Var.f44255a.m31381a(e, "requestExpressIntegrityToken(%s, %s, %s)", s2f1Var.f205001a, s2f1Var.f205002b, Long.valueOf(this.f11406d));
            ev61Var.m40098c(new StandardIntegrityException(-100, e));
        }
    }
}
